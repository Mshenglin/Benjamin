package com.thoughtCoding.alarm.mapper;

import com.thoughtCoding.alarm.model.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    int deleteByPrimaryKey(Short userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    User selectByPrimaryKey(Short userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Oct 17 17:21:00 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据手机号和密码查找用户,用于用户登录校验
     * @param user 封装的user对象,需要填充phone和password字段
     * @return 查找成功返回true,否则返回false
     */
    User findByPhoneAndPassword(User user);

    /**
     * 根据手机号查询用户
     * @param phone 要进行查询的手机号
     * @return 查找到返回user对象,否则返回null
     */
    User findByPhone(String phone);
}