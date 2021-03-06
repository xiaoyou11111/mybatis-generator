package com.mybatis.generator.entity.test;

import java.util.Date;

/**
 * Database Table Remarks:
 *   密码模板
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_password_template
 */
public class SysPasswordTemplate {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   密码模板名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.template_name
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String templateName;

    /**
     * Database Column Remarks:
     *   密码模板标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.template_type
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String templateType;

    /**
     * Database Column Remarks:
     *   模板描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String description;

    /**
     * Database Column Remarks:
     *   角色名称串
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.user_roles
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private String userRoles;

    /**
     * Database Column Remarks:
     *   是否有效 1有效 0无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Boolean validFlag;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   更新用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long updatedBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Date creationDate;

    /**
     * Database Column Remarks:
     *   创建用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Long createdBy;

    /**
     * Database Column Remarks:
     *   版本
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_password_template.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.id
     *
     * @return the value of sys_password_template.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.id
     *
     * @param id the value for sys_password_template.id
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.template_name
     *
     * @return the value of sys_password_template.template_name
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.template_name
     *
     * @param templateName the value for sys_password_template.template_name
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.template_type
     *
     * @return the value of sys_password_template.template_type
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.template_type
     *
     * @param templateType the value for sys_password_template.template_type
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.description
     *
     * @return the value of sys_password_template.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.description
     *
     * @param description the value for sys_password_template.description
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.user_roles
     *
     * @return the value of sys_password_template.user_roles
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public String getUserRoles() {
        return userRoles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.user_roles
     *
     * @param userRoles the value for sys_password_template.user_roles
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.valid_flag
     *
     * @return the value of sys_password_template.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Boolean getValidFlag() {
        return validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.valid_flag
     *
     * @param validFlag the value for sys_password_template.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setValidFlag(Boolean validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.update_date
     *
     * @return the value of sys_password_template.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.update_date
     *
     * @param updateDate the value for sys_password_template.update_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.updated_by
     *
     * @return the value of sys_password_template.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.updated_by
     *
     * @param updatedBy the value for sys_password_template.updated_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.creation_date
     *
     * @return the value of sys_password_template.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.creation_date
     *
     * @param creationDate the value for sys_password_template.creation_date
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.created_by
     *
     * @return the value of sys_password_template.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.created_by
     *
     * @param createdBy the value for sys_password_template.created_by
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_password_template.version
     *
     * @return the value of sys_password_template.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_password_template.version
     *
     * @param version the value for sys_password_template.version
     *
     * @mbg.generated Mon Dec 23 16:39:02 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}