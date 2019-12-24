package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysUserRole;
import com.mybatis.generator.entity.test.SysUserRoleKey;
import com.treach.platform.base.BaseMapper;

public interface SysUserRoleMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(SysUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysUserRole selectByPrimaryKey(SysUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysUserRole record);
}