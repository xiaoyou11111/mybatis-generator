package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysGroupRelationCache;
import com.treach.platform.base.BaseMapper;

public interface SysGroupRelationCacheMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysGroupRelationCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysGroupRelationCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysGroupRelationCache selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysGroupRelationCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_group_relation
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysGroupRelationCache record);
}