package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessDomain implements Serializable {
    private Integer id;

    private Integer sellerId;

    private String sellerName;

    private String busiPhone;

    private Integer branchId;

    private String businessType;

    private String realAddress;

    private String realAddressLongitude;

    private String realAddressLatitude;

    private String idcardCheckResult;

    private String faceCheckResult;

    private String companyName;

    private String legalPerson;

    private String socialCode;

    private String industry;

    private String address;

    private String establishmentDate;

    private String issuingBank;

    private String bankAccount;

    private String cardExpirationDate;

    private Byte status;

    private String createBy;

    private Date createTime;

    private String approvalBy;

    private Date approvalTime;

    private String approvalOpinion;

    private String updateBy;

    private Date updateTime;

    private String businessNature;

    private String linkman;

    private String mobilePhone;

    private String email;

    private String postalcode;

    private String registeredCapital;

    private Byte accountType;

    private String accountName;

    private Integer version;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getBusiPhone() {
        return busiPhone;
    }

    public void setBusiPhone(String busiPhone) {
        this.busiPhone = busiPhone;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getRealAddress() {
        return realAddress;
    }

    public void setRealAddress(String realAddress) {
        this.realAddress = realAddress;
    }

    public String getRealAddressLongitude() {
        return realAddressLongitude;
    }

    public void setRealAddressLongitude(String realAddressLongitude) {
        this.realAddressLongitude = realAddressLongitude;
    }

    public String getRealAddressLatitude() {
        return realAddressLatitude;
    }

    public void setRealAddressLatitude(String realAddressLatitude) {
        this.realAddressLatitude = realAddressLatitude;
    }

    public String getIdcardCheckResult() {
        return idcardCheckResult;
    }

    public void setIdcardCheckResult(String idcardCheckResult) {
        this.idcardCheckResult = idcardCheckResult;
    }

    public String getFaceCheckResult() {
        return faceCheckResult;
    }

    public void setFaceCheckResult(String faceCheckResult) {
        this.faceCheckResult = faceCheckResult;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getSocialCode() {
        return socialCode;
    }

    public void setSocialCode(String socialCode) {
        this.socialCode = socialCode;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public String getApprovalBy() {
        return approvalBy;
    }

    public void setApprovalBy(String approvalBy) {
        this.approvalBy = approvalBy;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalOpinion() {
        return approvalOpinion;
    }

    public void setApprovalOpinion(String approvalOpinion) {
        this.approvalOpinion = approvalOpinion;
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

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
        BusinessDomain other = (BusinessDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getBusiPhone() == null ? other.getBusiPhone() == null : this.getBusiPhone().equals(other.getBusiPhone()))
            && (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getRealAddress() == null ? other.getRealAddress() == null : this.getRealAddress().equals(other.getRealAddress()))
            && (this.getRealAddressLongitude() == null ? other.getRealAddressLongitude() == null : this.getRealAddressLongitude().equals(other.getRealAddressLongitude()))
            && (this.getRealAddressLatitude() == null ? other.getRealAddressLatitude() == null : this.getRealAddressLatitude().equals(other.getRealAddressLatitude()))
            && (this.getIdcardCheckResult() == null ? other.getIdcardCheckResult() == null : this.getIdcardCheckResult().equals(other.getIdcardCheckResult()))
            && (this.getFaceCheckResult() == null ? other.getFaceCheckResult() == null : this.getFaceCheckResult().equals(other.getFaceCheckResult()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getSocialCode() == null ? other.getSocialCode() == null : this.getSocialCode().equals(other.getSocialCode()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getEstablishmentDate() == null ? other.getEstablishmentDate() == null : this.getEstablishmentDate().equals(other.getEstablishmentDate()))
            && (this.getIssuingBank() == null ? other.getIssuingBank() == null : this.getIssuingBank().equals(other.getIssuingBank()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getCardExpirationDate() == null ? other.getCardExpirationDate() == null : this.getCardExpirationDate().equals(other.getCardExpirationDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getApprovalBy() == null ? other.getApprovalBy() == null : this.getApprovalBy().equals(other.getApprovalBy()))
            && (this.getApprovalTime() == null ? other.getApprovalTime() == null : this.getApprovalTime().equals(other.getApprovalTime()))
            && (this.getApprovalOpinion() == null ? other.getApprovalOpinion() == null : this.getApprovalOpinion().equals(other.getApprovalOpinion()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBusinessNature() == null ? other.getBusinessNature() == null : this.getBusinessNature().equals(other.getBusinessNature()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPostalcode() == null ? other.getPostalcode() == null : this.getPostalcode().equals(other.getPostalcode()))
            && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getBusiPhone() == null) ? 0 : getBusiPhone().hashCode());
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getRealAddress() == null) ? 0 : getRealAddress().hashCode());
        result = prime * result + ((getRealAddressLongitude() == null) ? 0 : getRealAddressLongitude().hashCode());
        result = prime * result + ((getRealAddressLatitude() == null) ? 0 : getRealAddressLatitude().hashCode());
        result = prime * result + ((getIdcardCheckResult() == null) ? 0 : getIdcardCheckResult().hashCode());
        result = prime * result + ((getFaceCheckResult() == null) ? 0 : getFaceCheckResult().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getSocialCode() == null) ? 0 : getSocialCode().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getEstablishmentDate() == null) ? 0 : getEstablishmentDate().hashCode());
        result = prime * result + ((getIssuingBank() == null) ? 0 : getIssuingBank().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getCardExpirationDate() == null) ? 0 : getCardExpirationDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getApprovalBy() == null) ? 0 : getApprovalBy().hashCode());
        result = prime * result + ((getApprovalTime() == null) ? 0 : getApprovalTime().hashCode());
        result = prime * result + ((getApprovalOpinion() == null) ? 0 : getApprovalOpinion().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBusinessNature() == null) ? 0 : getBusinessNature().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPostalcode() == null) ? 0 : getPostalcode().hashCode());
        result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", busiPhone=").append(busiPhone);
        sb.append(", branchId=").append(branchId);
        sb.append(", businessType=").append(businessType);
        sb.append(", realAddress=").append(realAddress);
        sb.append(", realAddressLongitude=").append(realAddressLongitude);
        sb.append(", realAddressLatitude=").append(realAddressLatitude);
        sb.append(", idcardCheckResult=").append(idcardCheckResult);
        sb.append(", faceCheckResult=").append(faceCheckResult);
        sb.append(", companyName=").append(companyName);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", socialCode=").append(socialCode);
        sb.append(", industry=").append(industry);
        sb.append(", address=").append(address);
        sb.append(", establishmentDate=").append(establishmentDate);
        sb.append(", issuingBank=").append(issuingBank);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", cardExpirationDate=").append(cardExpirationDate);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", approvalBy=").append(approvalBy);
        sb.append(", approvalTime=").append(approvalTime);
        sb.append(", approvalOpinion=").append(approvalOpinion);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", businessNature=").append(businessNature);
        sb.append(", linkman=").append(linkman);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", email=").append(email);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", registeredCapital=").append(registeredCapital);
        sb.append(", accountType=").append(accountType);
        sb.append(", accountName=").append(accountName);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}