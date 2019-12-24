package com.mybatis.generator.entity.test;

import java.util.Date;

/**
 * Database Table Remarks:
 *   密码模板
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_password_template_item
 */
public class SysPasswordTemplateItem {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   密码模板id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.password_template_id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long passwordTemplateId;

    /**
     * Database Column Remarks:
     *   密码规则描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String description;

    /**
     * Database Column Remarks:
     *   密码规则key
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.rule_key
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String ruleKey;

    /**
     * Database Column Remarks:
     *   密码规则value
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.rule_value
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Integer ruleValue;

    /**
     * Database Column Remarks:
     *   是否有效 1有效 0无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Boolean validFlag;

    /**
     * Database Column Remarks:
     *   序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Integer sequenceNo;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   更新用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long updatedBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Date creationDate;

    /**
     * Database Column Remarks:
     *   创建用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long createdBy;

    /**
     * Database Column Remarks:
     *   版本
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template_item.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.id
     *
     * @return the value of sys_password_template_item.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.id
     *
     * @param id the value for sys_password_template_item.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.password_template_id
     *
     * @return the value of sys_password_template_item.password_template_id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getPasswordTemplateId() {
        return passwordTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.password_template_id
     *
     * @param passwordTemplateId the value for sys_password_template_item.password_template_id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setPasswordTemplateId(Long passwordTemplateId) {
        this.passwordTemplateId = passwordTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.description
     *
     * @return the value of sys_password_template_item.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.description
     *
     * @param description the value for sys_password_template_item.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.rule_key
     *
     * @return the value of sys_password_template_item.rule_key
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getRuleKey() {
        return ruleKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.rule_key
     *
     * @param ruleKey the value for sys_password_template_item.rule_key
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.rule_value
     *
     * @return the value of sys_password_template_item.rule_value
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Integer getRuleValue() {
        return ruleValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.rule_value
     *
     * @param ruleValue the value for sys_password_template_item.rule_value
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setRuleValue(Integer ruleValue) {
        this.ruleValue = ruleValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.valid_flag
     *
     * @return the value of sys_password_template_item.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Boolean getValidFlag() {
        return validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.valid_flag
     *
     * @param validFlag the value for sys_password_template_item.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setValidFlag(Boolean validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.sequence_no
     *
     * @return the value of sys_password_template_item.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.sequence_no
     *
     * @param sequenceNo the value for sys_password_template_item.sequence_no
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.update_date
     *
     * @return the value of sys_password_template_item.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.update_date
     *
     * @param updateDate the value for sys_password_template_item.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.updated_by
     *
     * @return the value of sys_password_template_item.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.updated_by
     *
     * @param updatedBy the value for sys_password_template_item.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.creation_date
     *
     * @return the value of sys_password_template_item.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.creation_date
     *
     * @param creationDate the value for sys_password_template_item.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.created_by
     *
     * @return the value of sys_password_template_item.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.created_by
     *
     * @param createdBy the value for sys_password_template_item.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template_item.version
     *
     * @return the value of sys_password_template_item.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template_item.version
     *
     * @param version the value for sys_password_template_item.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}