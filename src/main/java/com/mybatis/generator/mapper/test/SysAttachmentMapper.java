package com.mybatis.generator.mapper.test;

import com.mybatis.generator.entity.test.SysAttachment;
import com.treach.platform.base.BaseMapper;

public interface SysAttachmentMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insert(SysAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int insertSelective(SysAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    SysAttachment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(SysAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(SysAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_attachment
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    int updateByPrimaryKey(SysAttachment record);
}