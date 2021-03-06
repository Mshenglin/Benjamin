package com.Benjamin.p2p.model.loan;

import java.io.Serializable;
import java.util.Date;

/**
 * 收益记录实体
 */
public class IncomeRecord implements Serializable {

    /**
     * 实现Serializable接口作用：可以将对象存放到字节流中，然后再恢复
     * 由于项目属于分布式，需要通过网络传输，网络传输就得将对象转换为字节流，
     * 所以分布式项目必须把对象进行序列化。如果不是分布式，那就不必
     */
    private static final long serialVersionUID = -6559517411098414556L;

    /**
     * 收益记录标识
     */
    private Integer id;

    /**
     * 用户标识
     */
    private Integer uid;

    /**
     * 产品标识
     */
    private Integer loanId;

    /**
     * 投资记录标识
     */
    private Integer bidId;

    /**
     * 投资金额
     */
    private Double bidMoney;

    /**
     * 收益时间
     */
    private Date incomeDate;

    /**
     * 收益金额
     */
    private Double incomeMoney;

    /**
     * 收益状态
     *      * 0：未返还收益
     *      * 1：已返还收益
     */
    private Integer incomeStatus;

    /**
     * 产品信息
     */
    private LoanInfo loanInfo;

    public LoanInfo getLoanInfo() {
        return loanInfo;
    }

    public void setLoanInfo(LoanInfo loanInfo) {
        this.loanInfo = loanInfo;
    }

    public Integer getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Double getBidMoney() {
        return bidMoney;
    }

    public void setBidMoney(Double bidMoney) {
        this.bidMoney = bidMoney;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public Double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(Double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public Integer getIncomeStatus() {
        return incomeStatus;
    }

    public void setIncomeStatus(Integer incomeStatus) {
        this.incomeStatus = incomeStatus;
    }
}