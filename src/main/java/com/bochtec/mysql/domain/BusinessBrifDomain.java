package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessBrifDomain implements Serializable {
    private Integer businessBrifId;

    private String merId;

    private String branch;

    private Date startTime;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessBrifId() {
        return businessBrifId;
    }

    public void setBusinessBrifId(Integer businessBrifId) {
        this.businessBrifId = businessBrifId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
        BusinessBrifDomain other = (BusinessBrifDomain) that;
        return (this.getBusinessBrifId() == null ? other.getBusinessBrifId() == null : this.getBusinessBrifId().equals(other.getBusinessBrifId()))
            && (this.getMerId() == null ? other.getMerId() == null : this.getMerId().equals(other.getMerId()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessBrifId() == null) ? 0 : getBusinessBrifId().hashCode());
        result = prime * result + ((getMerId() == null) ? 0 : getMerId().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessBrifId=").append(businessBrifId);
        sb.append(", merId=").append(merId);
        sb.append(", branch=").append(branch);
        sb.append(", startTime=").append(startTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}