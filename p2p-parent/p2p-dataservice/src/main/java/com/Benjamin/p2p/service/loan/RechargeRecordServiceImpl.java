package com.Benjamin.p2p.service.loan;

import com.Benjamin.p2p.mapper.loan.RechargeRecordMapper;
import com.Benjamin.p2p.mapper.user.FinanceAccountMapper;
import com.Benjamin.p2p.model.loan.RechargeRecord;
import com.Benjamin.p2p.model.vo.PaginatinoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author:Benjamin
 * date:2019.8.4
 */
@Service
public class RechargeRecordServiceImpl implements RechargeRecordService {

    @Autowired
    private FinanceAccountMapper financeAccountMapper;

    @Autowired
    private RechargeRecordMapper rechargeRecordMapper;

    @Override
    public List<RechargeRecord> queryRechargeByUidOrderByTime(Integer userId) {
        //封装参数
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userId", userId);
        //分页查询每页3条数据,查询第一页
        paramMap.put("currentPage", 1);
        paramMap.put("pageSize", 3);

        return rechargeRecordMapper.selectRechargeByUidOrderByTime(paramMap);
    }

    @Override
    public PaginatinoVo<RechargeRecord> queryRechargeByPage(Map<String, Object> paramMap) {
        PaginatinoVo<RechargeRecord> paginatinoVo = new PaginatinoVo<>();
        Integer userId = (Integer) paramMap.get("userId");

        //先查询总记录数
        Long total = rechargeRecordMapper.selectTotalByUid(userId);
        paginatinoVo.setTotal(total);

        //查询数据列表
        List<RechargeRecord> rechargeRecordList = rechargeRecordMapper.selectRechargeByPage(paramMap);
        paginatinoVo.setDataList(rechargeRecordList);

        return paginatinoVo;
    }

    @Override
    public Integer addRechargeRecord(RechargeRecord rechargeRecord) {
        return rechargeRecordMapper.insertSelective(rechargeRecord);
    }

    @Override
    public Integer modifyRechargeRecordByRechargeNo(RechargeRecord updateRechargeRecord) {
        return rechargeRecordMapper.updateRechargeRecordByRechargeRecordNo(updateRechargeRecord);
    }

    @Override
    public Integer recharge(Map<String, Object> paramMap) {
        //更新账户余额
        Integer updateCount = financeAccountMapper.updateFinanceAccountByRecharge(paramMap);

        if (updateCount > 0){
            //更改充值记录的状态
            RechargeRecord updateRechargeRecord = new RechargeRecord();
            updateRechargeRecord.setRechargeNo((String) paramMap.get("rechargeNo"));
            updateRechargeRecord.setRechargeStatus("1");
            Integer updateCount2 = rechargeRecordMapper.updateRechargeRecordByRechargeRecordNo(updateRechargeRecord);
            if (updateCount2 > 0){
                return 1;
            }else {
                return 0;
            }
        }else{
            return 0;
        }
    }
}
