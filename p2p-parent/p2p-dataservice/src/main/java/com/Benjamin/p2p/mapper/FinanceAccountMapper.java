package com.Benjamin.p2p.mapper;

import com.Benjamin.p2p.model.user.FinanceAccount;

public interface FinanceAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    int insert(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    int insertSelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    FinanceAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    int updateByPrimaryKeySelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbggenerated Wed Jul 24 20:22:31 CST 2019
     */
    int updateByPrimaryKey(FinanceAccount record);
}