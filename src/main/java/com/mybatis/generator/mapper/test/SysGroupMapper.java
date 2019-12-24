package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysGroup;
import com.treach.platform.base.BaseMapper;

public interface SysGroupMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysGroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysGroup record);
}