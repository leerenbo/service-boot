package com.yibaijin.service.boot.dao.model.mysql.sys;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_role_function_association
 *
 * @mbg.generated do_not_delete_during_merge 2018-05-24 05:35:55
 */
public class SysRoleFunctionAssociationGPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.sys_role_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long sysRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.sys_function_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long sysFunctionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.ctime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.utime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long utime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_function_association.uid
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    private Long uid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.id
     *
     * @return the value of sys_role_function_association.id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.id
     *
     * @param id the value for sys_role_function_association.id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.sys_role_id
     *
     * @return the value of sys_role_function_association.sys_role_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getSysRoleId() {
        return sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withSysRoleId(Long sysRoleId) {
        this.setSysRoleId(sysRoleId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.sys_role_id
     *
     * @param sysRoleId the value for sys_role_function_association.sys_role_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.sys_function_id
     *
     * @return the value of sys_role_function_association.sys_function_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getSysFunctionId() {
        return sysFunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withSysFunctionId(Long sysFunctionId) {
        this.setSysFunctionId(sysFunctionId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.sys_function_id
     *
     * @param sysFunctionId the value for sys_role_function_association.sys_function_id
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setSysFunctionId(Long sysFunctionId) {
        this.sysFunctionId = sysFunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.ctime
     *
     * @return the value of sys_role_function_association.ctime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withCtime(Long ctime) {
        this.setCtime(ctime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.ctime
     *
     * @param ctime the value for sys_role_function_association.ctime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.utime
     *
     * @return the value of sys_role_function_association.utime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withUtime(Long utime) {
        this.setUtime(utime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.utime
     *
     * @param utime the value for sys_role_function_association.utime
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setUtime(Long utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_function_association.uid
     *
     * @return the value of sys_role_function_association.uid
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public SysRoleFunctionAssociationGPO withUid(Long uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_function_association.uid
     *
     * @param uid the value for sys_role_function_association.uid
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysRoleFunctionAssociationGPO other = (SysRoleFunctionAssociationGPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysRoleId() == null ? other.getSysRoleId() == null : this.getSysRoleId().equals(other.getSysRoleId()))
            && (this.getSysFunctionId() == null ? other.getSysFunctionId() == null : this.getSysFunctionId().equals(other.getSysFunctionId()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getUtime() == null ? other.getUtime() == null : this.getUtime().equals(other.getUtime()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysRoleId() == null) ? 0 : getSysRoleId().hashCode());
        result = prime * result + ((getSysFunctionId() == null) ? 0 : getSysFunctionId().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUtime() == null) ? 0 : getUtime().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_function_association
     *
     * @mbg.generated 2018-05-24 05:35:55
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append(", sysFunctionId=").append(sysFunctionId);
        sb.append(", ctime=").append(ctime);
        sb.append(", utime=").append(utime);
        sb.append(", uid=").append(uid);
        sb.append("]");
        return sb.toString();
    }
}