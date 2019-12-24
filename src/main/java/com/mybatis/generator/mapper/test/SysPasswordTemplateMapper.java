package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysPasswordTemplate;
import com.treach.platform.base.BaseMapper;

public interface SysPasswordTemplateMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    int insert(SysPasswordTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    int insertSelective(SysPasswordTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    SysPasswordTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    int updateByPrimaryKeySelective(SysPasswordTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_password_template
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    int updateByPrimaryKey(SysPasswordTemplate record);
}