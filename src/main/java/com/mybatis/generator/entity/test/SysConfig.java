package com.mybatis.generator.entity.test;

import java.util.Date;

/**
 * Database Table Remarks:
 *   参数配置表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_config
 */
public class SysConfig {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.param_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String paramName;

    /**
     * Database Column Remarks:
     *   编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.param_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String paramCode;

    /**
     * Database Column Remarks:
     *   使用级别 1：公有 2：私有
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.scope
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String scope;

    /**
     * Database Column Remarks:
     *   是否有效 1：有效 0：无效
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Byte validFlag;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.remark
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Date updateDate;

    /**
     * Database Column Remarks:
     *   更新用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long updatedBy;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Date creationDate;

    /**
     * Database Column Remarks:
     *   创建用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long createdBy;

    /**
     * Database Column Remarks:
     *   版本
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.id
     *
     * @return the value of sys_config.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.id
     *
     * @param id the value for sys_config.id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.param_name
     *
     * @return the value of sys_config.param_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.param_name
     *
     * @param paramName the value for sys_config.param_name
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.param_code
     *
     * @return the value of sys_config.param_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getParamCode() {
        return paramCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.param_code
     *
     * @param paramCode the value for sys_config.param_code
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.scope
     *
     * @return the value of sys_config.scope
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getScope() {
        return scope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.scope
     *
     * @param scope the value for sys_config.scope
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.valid_flag
     *
     * @return the value of sys_config.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Byte getValidFlag() {
        return validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.valid_flag
     *
     * @param validFlag the value for sys_config.valid_flag
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setValidFlag(Byte validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.remark
     *
     * @return the value of sys_config.remark
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.remark
     *
     * @param remark the value for sys_config.remark
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.update_date
     *
     * @return the value of sys_config.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.update_date
     *
     * @param updateDate the value for sys_config.update_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.updated_by
     *
     * @return the value of sys_config.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.updated_by
     *
     * @param updatedBy the value for sys_config.updated_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.creation_date
     *
     * @return the value of sys_config.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.creation_date
     *
     * @param creationDate the value for sys_config.creation_date
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.created_by
     *
     * @return the value of sys_config.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.created_by
     *
     * @param createdBy the value for sys_config.created_by
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.version
     *
     * @return the value of sys_config.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.version
     *
     * @param version the value for sys_config.version
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}