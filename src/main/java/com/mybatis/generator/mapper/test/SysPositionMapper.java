package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysPosition;
import com.treach.platform.base.BaseMapper;

public interface SysPositionMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysPosition selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_position
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysPosition record);
}