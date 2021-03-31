package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class KeyDomain implements Serializable {
    private Integer id;

    private String keyId;

    private String matrixId;

    private String serviceId;

    private Byte source;

    private Byte status;

    private String purpose;

    private String reason;

    private String env;

    private Integer userId;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer version;

    private Byte deleteMark;

    private Byte enableMark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getMatrixId() {
        return matrixId;
    }

    public void setMatrixId(String matrixId) {
        this.matrixId = matrixId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Byte deleteMark) {
        this.deleteMark = deleteMark;
    }

    public Byte getEnableMark() {
        return enableMark;
    }

    public void setEnableMark(Byte enableMark) {
        this.enableMark = enableMark;
    }

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
        KeyDomain other = (KeyDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKeyId() == null ? other.getKeyId() == null : this.getKeyId().equals(other.getKeyId()))
            && (this.getMatrixId() == null ? other.getMatrixId() == null : this.getMatrixId().equals(other.getMatrixId()))
            && (this.getServiceId() == null ? other.getServiceId() == null : this.getServiceId().equals(other.getServiceId()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPurpose() == null ? other.getPurpose() == null : this.getPurpose().equals(other.getPurpose()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getEnv() == null ? other.getEnv() == null : this.getEnv().equals(other.getEnv()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()))
            && (this.getEnableMark() == null ? other.getEnableMark() == null : this.getEnableMark().equals(other.getEnableMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        result = prime * result + ((getMatrixId() == null) ? 0 : getMatrixId().hashCode());
        result = prime * result + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPurpose() == null) ? 0 : getPurpose().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getEnv() == null) ? 0 : getEnv().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        result = prime * result + ((getEnableMark() == null) ? 0 : getEnableMark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keyId=").append(keyId);
        sb.append(", matrixId=").append(matrixId);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", source=").append(source);
        sb.append(", status=").append(status);
        sb.append(", purpose=").append(purpose);
        sb.append(", reason=").append(reason);
        sb.append(", env=").append(env);
        sb.append(", userId=").append(userId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", enableMark=").append(enableMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}