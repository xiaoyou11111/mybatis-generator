package com.mybatis.generator.entity.test;

import java.util.Date;

/**
 * Database Table Remarks:
 *   字典表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_dict
 */
public class SysDict {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   字典编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String dictCode;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String dictName;

    /**
     * Database Column Remarks:
     *   序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Integer sequenceNo;

    /**
     * Database Column Remarks:
     *   父级字典
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.parent_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long parentId;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_desc
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String dictDesc;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   更新用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long updatedBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Date creationDate;

    /**
     * Database Column Remarks:
     *   创建用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long createdBy;

    /**
     * Database Column Remarks:
     *   版本
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Integer version;

    /**
     * Database Column Remarks:
     *   字典子表是否关联 true：关联 false：不关联（默认不关联）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.child_related_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Byte childRelatedFlag;

    /**
     * Database Column Remarks:
     *   是否有效 true：有效 false：无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Byte validFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.id
     *
     * @return the value of sys_dict.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.id
     *
     * @param id the value for sys_dict.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_code
     *
     * @return the value of sys_dict.dict_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_code
     *
     * @param dictCode the value for sys_dict.dict_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_name
     *
     * @return the value of sys_dict.dict_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_name
     *
     * @param dictName the value for sys_dict.dict_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.sequence_no
     *
     * @return the value of sys_dict.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.sequence_no
     *
     * @param sequenceNo the value for sys_dict.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.parent_id
     *
     * @return the value of sys_dict.parent_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.parent_id
     *
     * @param parentId the value for sys_dict.parent_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_desc
     *
     * @return the value of sys_dict.dict_desc
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getDictDesc() {
        return dictDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_desc
     *
     * @param dictDesc the value for sys_dict.dict_desc
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.update_date
     *
     * @return the value of sys_dict.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.update_date
     *
     * @param updateDate the value for sys_dict.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.updated_by
     *
     * @return the value of sys_dict.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.updated_by
     *
     * @param updatedBy the value for sys_dict.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.creation_date
     *
     * @return the value of sys_dict.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.creation_date
     *
     * @param creationDate the value for sys_dict.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.created_by
     *
     * @return the value of sys_dict.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.created_by
     *
     * @param createdBy the value for sys_dict.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.version
     *
     * @return the value of sys_dict.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.version
     *
     * @param version the value for sys_dict.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.child_related_flag
     *
     * @return the value of sys_dict.child_related_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Byte getChildRelatedFlag() {
        return childRelatedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.child_related_flag
     *
     * @param childRelatedFlag the value for sys_dict.child_related_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setChildRelatedFlag(Byte childRelatedFlag) {
        this.childRelatedFlag = childRelatedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.valid_flag
     *
     * @return the value of sys_dict.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Byte getValidFlag() {
        return validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.valid_flag
     *
     * @param validFlag the value for sys_dict.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setValidFlag(Byte validFlag) {
        this.validFlag = validFlag;
    }
}