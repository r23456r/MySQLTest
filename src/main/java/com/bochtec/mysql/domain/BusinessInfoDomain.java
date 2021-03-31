package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessInfoDomain implements Serializable {
    private Integer businessId;

    private String merId;

    private String businessName;

    private String shopName;

    private String businessType;

    private String nature;

    private String businessContact;

    private String contactIdNo;

    private String contactNumber;

    private String contactAddress;

    private String contactMail;

    private String legalPerson;

    private String corporateIdentityType;

    private String corporateIdentity;

    private String corporateIdentityTime;

    private String businessLicense;

    private String organizationCode;

    private String registeredCapital;

    private String businessLicenseTime;

    private String registeredAddress;

    private String businessCategory;

    private String businessAddress;

    private String accountName;

    private String identityCard;

    private String accountType;

    private Date openingTime;

    private String bankAccount;

    private String branchNo;

    private String branch;

    private String accountNumber;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getBusinessContact() {
        return businessContact;
    }

    public void setBusinessContact(String businessContact) {
        this.businessContact = businessContact;
    }

    public String getContactIdNo() {
        return contactIdNo;
    }

    public void setContactIdNo(String contactIdNo) {
        this.contactIdNo = contactIdNo;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getCorporateIdentityType() {
        return corporateIdentityType;
    }

    public void setCorporateIdentityType(String corporateIdentityType) {
        this.corporateIdentityType = corporateIdentityType;
    }

    public String getCorporateIdentity() {
        return corporateIdentity;
    }

    public void setCorporateIdentity(String corporateIdentity) {
        this.corporateIdentity = corporateIdentity;
    }

    public String getCorporateIdentityTime() {
        return corporateIdentityTime;
    }

    public void setCorporateIdentityTime(String corporateIdentityTime) {
        this.corporateIdentityTime = corporateIdentityTime;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getBusinessLicenseTime() {
        return businessLicenseTime;
    }

    public void setBusinessLicenseTime(String businessLicenseTime) {
        this.businessLicenseTime = businessLicenseTime;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        BusinessInfoDomain other = (BusinessInfoDomain) that;
        return (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getMerId() == null ? other.getMerId() == null : this.getMerId().equals(other.getMerId()))
            && (this.getBusinessName() == null ? other.getBusinessName() == null : this.getBusinessName().equals(other.getBusinessName()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getNature() == null ? other.getNature() == null : this.getNature().equals(other.getNature()))
            && (this.getBusinessContact() == null ? other.getBusinessContact() == null : this.getBusinessContact().equals(other.getBusinessContact()))
            && (this.getContactIdNo() == null ? other.getContactIdNo() == null : this.getContactIdNo().equals(other.getContactIdNo()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getContactAddress() == null ? other.getContactAddress() == null : this.getContactAddress().equals(other.getContactAddress()))
            && (this.getContactMail() == null ? other.getContactMail() == null : this.getContactMail().equals(other.getContactMail()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getCorporateIdentityType() == null ? other.getCorporateIdentityType() == null : this.getCorporateIdentityType().equals(other.getCorporateIdentityType()))
            && (this.getCorporateIdentity() == null ? other.getCorporateIdentity() == null : this.getCorporateIdentity().equals(other.getCorporateIdentity()))
            && (this.getCorporateIdentityTime() == null ? other.getCorporateIdentityTime() == null : this.getCorporateIdentityTime().equals(other.getCorporateIdentityTime()))
            && (this.getBusinessLicense() == null ? other.getBusinessLicense() == null : this.getBusinessLicense().equals(other.getBusinessLicense()))
            && (this.getOrganizationCode() == null ? other.getOrganizationCode() == null : this.getOrganizationCode().equals(other.getOrganizationCode()))
            && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
            && (this.getBusinessLicenseTime() == null ? other.getBusinessLicenseTime() == null : this.getBusinessLicenseTime().equals(other.getBusinessLicenseTime()))
            && (this.getRegisteredAddress() == null ? other.getRegisteredAddress() == null : this.getRegisteredAddress().equals(other.getRegisteredAddress()))
            && (this.getBusinessCategory() == null ? other.getBusinessCategory() == null : this.getBusinessCategory().equals(other.getBusinessCategory()))
            && (this.getBusinessAddress() == null ? other.getBusinessAddress() == null : this.getBusinessAddress().equals(other.getBusinessAddress()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getIdentityCard() == null ? other.getIdentityCard() == null : this.getIdentityCard().equals(other.getIdentityCard()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getOpeningTime() == null ? other.getOpeningTime() == null : this.getOpeningTime().equals(other.getOpeningTime()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getBranchNo() == null ? other.getBranchNo() == null : this.getBranchNo().equals(other.getBranchNo()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getAccountNumber() == null ? other.getAccountNumber() == null : this.getAccountNumber().equals(other.getAccountNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getMerId() == null) ? 0 : getMerId().hashCode());
        result = prime * result + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getNature() == null) ? 0 : getNature().hashCode());
        result = prime * result + ((getBusinessContact() == null) ? 0 : getBusinessContact().hashCode());
        result = prime * result + ((getContactIdNo() == null) ? 0 : getContactIdNo().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getContactAddress() == null) ? 0 : getContactAddress().hashCode());
        result = prime * result + ((getContactMail() == null) ? 0 : getContactMail().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getCorporateIdentityType() == null) ? 0 : getCorporateIdentityType().hashCode());
        result = prime * result + ((getCorporateIdentity() == null) ? 0 : getCorporateIdentity().hashCode());
        result = prime * result + ((getCorporateIdentityTime() == null) ? 0 : getCorporateIdentityTime().hashCode());
        result = prime * result + ((getBusinessLicense() == null) ? 0 : getBusinessLicense().hashCode());
        result = prime * result + ((getOrganizationCode() == null) ? 0 : getOrganizationCode().hashCode());
        result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
        result = prime * result + ((getBusinessLicenseTime() == null) ? 0 : getBusinessLicenseTime().hashCode());
        result = prime * result + ((getRegisteredAddress() == null) ? 0 : getRegisteredAddress().hashCode());
        result = prime * result + ((getBusinessCategory() == null) ? 0 : getBusinessCategory().hashCode());
        result = prime * result + ((getBusinessAddress() == null) ? 0 : getBusinessAddress().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getIdentityCard() == null) ? 0 : getIdentityCard().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getOpeningTime() == null) ? 0 : getOpeningTime().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getBranchNo() == null) ? 0 : getBranchNo().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getAccountNumber() == null) ? 0 : getAccountNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessId=").append(businessId);
        sb.append(", merId=").append(merId);
        sb.append(", businessName=").append(businessName);
        sb.append(", shopName=").append(shopName);
        sb.append(", businessType=").append(businessType);
        sb.append(", nature=").append(nature);
        sb.append(", businessContact=").append(businessContact);
        sb.append(", contactIdNo=").append(contactIdNo);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", contactMail=").append(contactMail);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", corporateIdentityType=").append(corporateIdentityType);
        sb.append(", corporateIdentity=").append(corporateIdentity);
        sb.append(", corporateIdentityTime=").append(corporateIdentityTime);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", organizationCode=").append(organizationCode);
        sb.append(", registeredCapital=").append(registeredCapital);
        sb.append(", businessLicenseTime=").append(businessLicenseTime);
        sb.append(", registeredAddress=").append(registeredAddress);
        sb.append(", businessCategory=").append(businessCategory);
        sb.append(", businessAddress=").append(businessAddress);
        sb.append(", accountName=").append(accountName);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", accountType=").append(accountType);
        sb.append(", openingTime=").append(openingTime);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", branchNo=").append(branchNo);
        sb.append(", branch=").append(branch);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}