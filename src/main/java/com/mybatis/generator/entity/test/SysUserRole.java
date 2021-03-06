package com.mybatis.generator.entity.test;

/**
 * Database Table Remarks:
 *   用户和角色关联表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user_role
 */
public class SysUserRole extends SysUserRoleKey {
    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.user_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.user_id
     *
     * @return the value of sys_user_role.user_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.user_id
     *
     * @param userId the value for sys_user_role.user_id
     *
     * @mbg.generated Mon Dec 23 16:41:38 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}