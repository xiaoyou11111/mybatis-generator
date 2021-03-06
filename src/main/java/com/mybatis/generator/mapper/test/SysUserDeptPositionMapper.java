package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysUserDeptPosition;
import com.treach.platform.base.BaseMapper;

public interface SysUserDeptPositionMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysUserDeptPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysUserDeptPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysUserDeptPosition selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysUserDeptPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_dept_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysUserDeptPosition record);
}