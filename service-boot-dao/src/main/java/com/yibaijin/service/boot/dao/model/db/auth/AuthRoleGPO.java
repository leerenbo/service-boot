package com.yibaijin.service.boot.dao.model.db.auth;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table auth_role
 *
 * @mbg.generated do_not_delete_during_merge 2018-06-11 10:39:09
 */
public class AuthRoleGPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.id
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   角色名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.name
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.ctime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private Long ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.utime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private Long utime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.uid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role.gid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    private Long gid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.id
     *
     * @return the value of auth_role.id
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.id
     *
     * @param id the value for auth_role.id
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.name
     *
     * @return the value of auth_role.name
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.name
     *
     * @param name the value for auth_role.name
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.ctime
     *
     * @return the value of auth_role.ctime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public Long getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withCtime(Long ctime) {
        this.setCtime(ctime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.ctime
     *
     * @param ctime the value for auth_role.ctime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.utime
     *
     * @return the value of auth_role.utime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public Long getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withUtime(Long utime) {
        this.setUtime(utime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.utime
     *
     * @param utime the value for auth_role.utime
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setUtime(Long utime) {
        this.utime = utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.uid
     *
     * @return the value of auth_role.uid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withUid(Long uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.uid
     *
     * @param uid the value for auth_role.uid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role.gid
     *
     * @return the value of auth_role.gid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public Long getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public AuthRoleGPO withGid(Long gid) {
        this.setGid(gid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role.gid
     *
     * @param gid the value for auth_role.gid
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
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
        AuthRoleGPO other = (AuthRoleGPO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getUtime() == null ? other.getUtime() == null : this.getUtime().equals(other.getUtime()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUtime() == null) ? 0 : getUtime().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role
     *
     * @mbg.generated 2018-06-11 10:39:09
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", ctime=").append(ctime);
        sb.append(", utime=").append(utime);
        sb.append(", uid=").append(uid);
        sb.append(", gid=").append(gid);
        sb.append("]");
        return sb.toString();
    }
}