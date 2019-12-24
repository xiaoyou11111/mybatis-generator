package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysConfig;
import com.treach.platform.base.BaseMapper;

public interface SysConfigMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysConfig record);
}