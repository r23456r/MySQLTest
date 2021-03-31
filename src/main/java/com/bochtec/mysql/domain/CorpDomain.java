package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class CorpDomain implements Serializable {
    private Integer id;

    private String sellerName;

    private String province;

    private String city;

    private String centerArea;

    private String secondArea;

    private String town;

    private String corpName;

    private String socialCode;

    private String legalPerson;

    private String address;

    private String businessStatus;

    private String businessType;

    private Date registerDate;

    private String registerCapital;

    private String contactTel;

    private String registerAuthority;

    private String businessScope;

    private String realAddress;

    private String realAddressLongitude;

    private String realAddressLatitude;

    private String expandStatus;

    private Date expandFinishDate;

    private Integer expandLoanOfficeId;

    private String expandLoanOfficeName;

    private Integer distributeLoanOfficeId;

    private String distributeLoanOfficeName;

    private Byte deleteFalg;

    private Byte expandLogicType;

    private Integer branchId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCenterArea() {
        return centerArea;
    }

    public void setCenterArea(String centerArea) {
        this.centerArea = centerArea;
    }

    public String getSecondArea() {
        return secondArea;
    }

    public void setSecondArea(String secondArea) {
        this.secondArea = secondArea;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getSocialCode() {
        return socialCode;
    }

    public void setSocialCode(String socialCode) {
        this.socialCode = socialCode;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterCapital() {
        return registerCapital;
    }

    public void setRegisterCapital(String registerCapital) {
        this.registerCapital = registerCapital;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getRegisterAuthority() {
        return registerAuthority;
    }

    public void setRegisterAuthority(String registerAuthority) {
        this.registerAuthority = registerAuthority;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
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

    public String getExpandStatus() {
        return expandStatus;
    }

    public void setExpandStatus(String expandStatus) {
        this.expandStatus = expandStatus;
    }

    public Date getExpandFinishDate() {
        return expandFinishDate;
    }

    public void setExpandFinishDate(Date expandFinishDate) {
        this.expandFinishDate = expandFinishDate;
    }

    public Integer getExpandLoanOfficeId() {
        return expandLoanOfficeId;
    }

    public void setExpandLoanOfficeId(Integer expandLoanOfficeId) {
        this.expandLoanOfficeId = expandLoanOfficeId;
    }

    public String getExpandLoanOfficeName() {
        return expandLoanOfficeName;
    }

    public void setExpandLoanOfficeName(String expandLoanOfficeName) {
        this.expandLoanOfficeName = expandLoanOfficeName;
    }

    public Integer getDistributeLoanOfficeId() {
        return distributeLoanOfficeId;
    }

    public void setDistributeLoanOfficeId(Integer distributeLoanOfficeId) {
        this.distributeLoanOfficeId = distributeLoanOfficeId;
    }

    public String getDistributeLoanOfficeName() {
        return distributeLoanOfficeName;
    }

    public void setDistributeLoanOfficeName(String distributeLoanOfficeName) {
        this.distributeLoanOfficeName = distributeLoanOfficeName;
    }

    public Byte getDeleteFalg() {
        return deleteFalg;
    }

    public void setDeleteFalg(Byte deleteFalg) {
        this.deleteFalg = deleteFalg;
    }

    public Byte getExpandLogicType() {
        return expandLogicType;
    }

    public void setExpandLogicType(Byte expandLogicType) {
        this.expandLogicType = expandLogicType;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
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
        CorpDomain other = (CorpDomain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCenterArea() == null ? other.getCenterArea() == null : this.getCenterArea().equals(other.getCenterArea()))
            && (this.getSecondArea() == null ? other.getSecondArea() == null : this.getSecondArea().equals(other.getSecondArea()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getCorpName() == null ? other.getCorpName() == null : this.getCorpName().equals(other.getCorpName()))
            && (this.getSocialCode() == null ? other.getSocialCode() == null : this.getSocialCode().equals(other.getSocialCode()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBusinessStatus() == null ? other.getBusinessStatus() == null : this.getBusinessStatus().equals(other.getBusinessStatus()))
            && (this.getBusinessType() == null ? other.getBusinessType() == null : this.getBusinessType().equals(other.getBusinessType()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getRegisterCapital() == null ? other.getRegisterCapital() == null : this.getRegisterCapital().equals(other.getRegisterCapital()))
            && (this.getContactTel() == null ? other.getContactTel() == null : this.getContactTel().equals(other.getContactTel()))
            && (this.getRegisterAuthority() == null ? other.getRegisterAuthority() == null : this.getRegisterAuthority().equals(other.getRegisterAuthority()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getRealAddress() == null ? other.getRealAddress() == null : this.getRealAddress().equals(other.getRealAddress()))
            && (this.getRealAddressLongitude() == null ? other.getRealAddressLongitude() == null : this.getRealAddressLongitude().equals(other.getRealAddressLongitude()))
            && (this.getRealAddressLatitude() == null ? other.getRealAddressLatitude() == null : this.getRealAddressLatitude().equals(other.getRealAddressLatitude()))
            && (this.getExpandStatus() == null ? other.getExpandStatus() == null : this.getExpandStatus().equals(other.getExpandStatus()))
            && (this.getExpandFinishDate() == null ? other.getExpandFinishDate() == null : this.getExpandFinishDate().equals(other.getExpandFinishDate()))
            && (this.getExpandLoanOfficeId() == null ? other.getExpandLoanOfficeId() == null : this.getExpandLoanOfficeId().equals(other.getExpandLoanOfficeId()))
            && (this.getExpandLoanOfficeName() == null ? other.getExpandLoanOfficeName() == null : this.getExpandLoanOfficeName().equals(other.getExpandLoanOfficeName()))
            && (this.getDistributeLoanOfficeId() == null ? other.getDistributeLoanOfficeId() == null : this.getDistributeLoanOfficeId().equals(other.getDistributeLoanOfficeId()))
            && (this.getDistributeLoanOfficeName() == null ? other.getDistributeLoanOfficeName() == null : this.getDistributeLoanOfficeName().equals(other.getDistributeLoanOfficeName()))
            && (this.getDeleteFalg() == null ? other.getDeleteFalg() == null : this.getDeleteFalg().equals(other.getDeleteFalg()))
            && (this.getExpandLogicType() == null ? other.getExpandLogicType() == null : this.getExpandLogicType().equals(other.getExpandLogicType()))
            && (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCenterArea() == null) ? 0 : getCenterArea().hashCode());
        result = prime * result + ((getSecondArea() == null) ? 0 : getSecondArea().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getCorpName() == null) ? 0 : getCorpName().hashCode());
        result = prime * result + ((getSocialCode() == null) ? 0 : getSocialCode().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBusinessStatus() == null) ? 0 : getBusinessStatus().hashCode());
        result = prime * result + ((getBusinessType() == null) ? 0 : getBusinessType().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getRegisterCapital() == null) ? 0 : getRegisterCapital().hashCode());
        result = prime * result + ((getContactTel() == null) ? 0 : getContactTel().hashCode());
        result = prime * result + ((getRegisterAuthority() == null) ? 0 : getRegisterAuthority().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getRealAddress() == null) ? 0 : getRealAddress().hashCode());
        result = prime * result + ((getRealAddressLongitude() == null) ? 0 : getRealAddressLongitude().hashCode());
        result = prime * result + ((getRealAddressLatitude() == null) ? 0 : getRealAddressLatitude().hashCode());
        result = prime * result + ((getExpandStatus() == null) ? 0 : getExpandStatus().hashCode());
        result = prime * result + ((getExpandFinishDate() == null) ? 0 : getExpandFinishDate().hashCode());
        result = prime * result + ((getExpandLoanOfficeId() == null) ? 0 : getExpandLoanOfficeId().hashCode());
        result = prime * result + ((getExpandLoanOfficeName() == null) ? 0 : getExpandLoanOfficeName().hashCode());
        result = prime * result + ((getDistributeLoanOfficeId() == null) ? 0 : getDistributeLoanOfficeId().hashCode());
        result = prime * result + ((getDistributeLoanOfficeName() == null) ? 0 : getDistributeLoanOfficeName().hashCode());
        result = prime * result + ((getDeleteFalg() == null) ? 0 : getDeleteFalg().hashCode());
        result = prime * result + ((getExpandLogicType() == null) ? 0 : getExpandLogicType().hashCode());
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", centerArea=").append(centerArea);
        sb.append(", secondArea=").append(secondArea);
        sb.append(", town=").append(town);
        sb.append(", corpName=").append(corpName);
        sb.append(", socialCode=").append(socialCode);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", address=").append(address);
        sb.append(", businessStatus=").append(businessStatus);
        sb.append(", businessType=").append(businessType);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", registerCapital=").append(registerCapital);
        sb.append(", contactTel=").append(contactTel);
        sb.append(", registerAuthority=").append(registerAuthority);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", realAddress=").append(realAddress);
        sb.append(", realAddressLongitude=").append(realAddressLongitude);
        sb.append(", realAddressLatitude=").append(realAddressLatitude);
        sb.append(", expandStatus=").append(expandStatus);
        sb.append(", expandFinishDate=").append(expandFinishDate);
        sb.append(", expandLoanOfficeId=").append(expandLoanOfficeId);
        sb.append(", expandLoanOfficeName=").append(expandLoanOfficeName);
        sb.append(", distributeLoanOfficeId=").append(distributeLoanOfficeId);
        sb.append(", distributeLoanOfficeName=").append(distributeLoanOfficeName);
        sb.append(", deleteFalg=").append(deleteFalg);
        sb.append(", expandLogicType=").append(expandLogicType);
        sb.append(", branchId=").append(branchId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}