package com.bochtec.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class SellerDomain implements Serializable {
    private Integer sellerId;

    private Integer businessId;

    private Integer corpId;

    private String sellerName;

    private String operator;

    private String sex;

    private Integer age;

    private Double creditAmount;

    private String identificationCard;

    private String permanentAddress;

    private String groupName;

    private String industry;

    private String province;

    private String city;

    private String area;

    private String secondArea;

    private Integer branch;

    private String creditCode;

    private Date foundingTime;

    private String bankAccount;

    private Date openingTime;

    private String groupAddress;

    private Float creditScore;

    private Float industryCoefficient;

    private Float atValue;

    private Float lifeValue;

    private Integer sellerAddrId;

    private Integer sellerScaleId;

    private Integer sellerAgeId;

    private Integer sellerAreaId;

    private Integer businessLifeId;

    private Integer residenceValId;

    private Integer industryMaturityId;

    private Integer areaAdvantageId;

    private Integer businessClimateId;

    private Integer accountOpenTimeId;

    private Integer tradeAmountId;

    private Integer avgMonthTradeId;

    private Integer yearTradeMoneyId;

    private Integer avgTradeMoneyId;

    private Integer avgMonthTradeAmountId;

    private String type;

    private Byte active;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Date estimateTime;

    private Integer whetherIoan;

    private Integer managerId;

    private Double creditLimit;

    private Double lowCreditAmount;

    private Byte reason;

    private static final long serialVersionUID = 1L;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCorpId() {
        return corpId;
    }

    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSecondArea() {
        return secondArea;
    }

    public void setSecondArea(String secondArea) {
        this.secondArea = secondArea;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public Date getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(Date foundingTime) {
        this.foundingTime = foundingTime;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public String getGroupAddress() {
        return groupAddress;
    }

    public void setGroupAddress(String groupAddress) {
        this.groupAddress = groupAddress;
    }

    public Float getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Float creditScore) {
        this.creditScore = creditScore;
    }

    public Float getIndustryCoefficient() {
        return industryCoefficient;
    }

    public void setIndustryCoefficient(Float industryCoefficient) {
        this.industryCoefficient = industryCoefficient;
    }

    public Float getAtValue() {
        return atValue;
    }

    public void setAtValue(Float atValue) {
        this.atValue = atValue;
    }

    public Float getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Float lifeValue) {
        this.lifeValue = lifeValue;
    }

    public Integer getSellerAddrId() {
        return sellerAddrId;
    }

    public void setSellerAddrId(Integer sellerAddrId) {
        this.sellerAddrId = sellerAddrId;
    }

    public Integer getSellerScaleId() {
        return sellerScaleId;
    }

    public void setSellerScaleId(Integer sellerScaleId) {
        this.sellerScaleId = sellerScaleId;
    }

    public Integer getSellerAgeId() {
        return sellerAgeId;
    }

    public void setSellerAgeId(Integer sellerAgeId) {
        this.sellerAgeId = sellerAgeId;
    }

    public Integer getSellerAreaId() {
        return sellerAreaId;
    }

    public void setSellerAreaId(Integer sellerAreaId) {
        this.sellerAreaId = sellerAreaId;
    }

    public Integer getBusinessLifeId() {
        return businessLifeId;
    }

    public void setBusinessLifeId(Integer businessLifeId) {
        this.businessLifeId = businessLifeId;
    }

    public Integer getResidenceValId() {
        return residenceValId;
    }

    public void setResidenceValId(Integer residenceValId) {
        this.residenceValId = residenceValId;
    }

    public Integer getIndustryMaturityId() {
        return industryMaturityId;
    }

    public void setIndustryMaturityId(Integer industryMaturityId) {
        this.industryMaturityId = industryMaturityId;
    }

    public Integer getAreaAdvantageId() {
        return areaAdvantageId;
    }

    public void setAreaAdvantageId(Integer areaAdvantageId) {
        this.areaAdvantageId = areaAdvantageId;
    }

    public Integer getBusinessClimateId() {
        return businessClimateId;
    }

    public void setBusinessClimateId(Integer businessClimateId) {
        this.businessClimateId = businessClimateId;
    }

    public Integer getAccountOpenTimeId() {
        return accountOpenTimeId;
    }

    public void setAccountOpenTimeId(Integer accountOpenTimeId) {
        this.accountOpenTimeId = accountOpenTimeId;
    }

    public Integer getTradeAmountId() {
        return tradeAmountId;
    }

    public void setTradeAmountId(Integer tradeAmountId) {
        this.tradeAmountId = tradeAmountId;
    }

    public Integer getAvgMonthTradeId() {
        return avgMonthTradeId;
    }

    public void setAvgMonthTradeId(Integer avgMonthTradeId) {
        this.avgMonthTradeId = avgMonthTradeId;
    }

    public Integer getYearTradeMoneyId() {
        return yearTradeMoneyId;
    }

    public void setYearTradeMoneyId(Integer yearTradeMoneyId) {
        this.yearTradeMoneyId = yearTradeMoneyId;
    }

    public Integer getAvgTradeMoneyId() {
        return avgTradeMoneyId;
    }

    public void setAvgTradeMoneyId(Integer avgTradeMoneyId) {
        this.avgTradeMoneyId = avgTradeMoneyId;
    }

    public Integer getAvgMonthTradeAmountId() {
        return avgMonthTradeAmountId;
    }

    public void setAvgMonthTradeAmountId(Integer avgMonthTradeAmountId) {
        this.avgMonthTradeAmountId = avgMonthTradeAmountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
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

    public Date getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(Date estimateTime) {
        this.estimateTime = estimateTime;
    }

    public Integer getWhetherIoan() {
        return whetherIoan;
    }

    public void setWhetherIoan(Integer whetherIoan) {
        this.whetherIoan = whetherIoan;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getLowCreditAmount() {
        return lowCreditAmount;
    }

    public void setLowCreditAmount(Double lowCreditAmount) {
        this.lowCreditAmount = lowCreditAmount;
    }

    public Byte getReason() {
        return reason;
    }

    public void setReason(Byte reason) {
        this.reason = reason;
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
        SellerDomain other = (SellerDomain) that;
        return (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getCorpId() == null ? other.getCorpId() == null : this.getCorpId().equals(other.getCorpId()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getCreditAmount() == null ? other.getCreditAmount() == null : this.getCreditAmount().equals(other.getCreditAmount()))
            && (this.getIdentificationCard() == null ? other.getIdentificationCard() == null : this.getIdentificationCard().equals(other.getIdentificationCard()))
            && (this.getPermanentAddress() == null ? other.getPermanentAddress() == null : this.getPermanentAddress().equals(other.getPermanentAddress()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getSecondArea() == null ? other.getSecondArea() == null : this.getSecondArea().equals(other.getSecondArea()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getCreditCode() == null ? other.getCreditCode() == null : this.getCreditCode().equals(other.getCreditCode()))
            && (this.getFoundingTime() == null ? other.getFoundingTime() == null : this.getFoundingTime().equals(other.getFoundingTime()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getOpeningTime() == null ? other.getOpeningTime() == null : this.getOpeningTime().equals(other.getOpeningTime()))
            && (this.getGroupAddress() == null ? other.getGroupAddress() == null : this.getGroupAddress().equals(other.getGroupAddress()))
            && (this.getCreditScore() == null ? other.getCreditScore() == null : this.getCreditScore().equals(other.getCreditScore()))
            && (this.getIndustryCoefficient() == null ? other.getIndustryCoefficient() == null : this.getIndustryCoefficient().equals(other.getIndustryCoefficient()))
            && (this.getAtValue() == null ? other.getAtValue() == null : this.getAtValue().equals(other.getAtValue()))
            && (this.getLifeValue() == null ? other.getLifeValue() == null : this.getLifeValue().equals(other.getLifeValue()))
            && (this.getSellerAddrId() == null ? other.getSellerAddrId() == null : this.getSellerAddrId().equals(other.getSellerAddrId()))
            && (this.getSellerScaleId() == null ? other.getSellerScaleId() == null : this.getSellerScaleId().equals(other.getSellerScaleId()))
            && (this.getSellerAgeId() == null ? other.getSellerAgeId() == null : this.getSellerAgeId().equals(other.getSellerAgeId()))
            && (this.getSellerAreaId() == null ? other.getSellerAreaId() == null : this.getSellerAreaId().equals(other.getSellerAreaId()))
            && (this.getBusinessLifeId() == null ? other.getBusinessLifeId() == null : this.getBusinessLifeId().equals(other.getBusinessLifeId()))
            && (this.getResidenceValId() == null ? other.getResidenceValId() == null : this.getResidenceValId().equals(other.getResidenceValId()))
            && (this.getIndustryMaturityId() == null ? other.getIndustryMaturityId() == null : this.getIndustryMaturityId().equals(other.getIndustryMaturityId()))
            && (this.getAreaAdvantageId() == null ? other.getAreaAdvantageId() == null : this.getAreaAdvantageId().equals(other.getAreaAdvantageId()))
            && (this.getBusinessClimateId() == null ? other.getBusinessClimateId() == null : this.getBusinessClimateId().equals(other.getBusinessClimateId()))
            && (this.getAccountOpenTimeId() == null ? other.getAccountOpenTimeId() == null : this.getAccountOpenTimeId().equals(other.getAccountOpenTimeId()))
            && (this.getTradeAmountId() == null ? other.getTradeAmountId() == null : this.getTradeAmountId().equals(other.getTradeAmountId()))
            && (this.getAvgMonthTradeId() == null ? other.getAvgMonthTradeId() == null : this.getAvgMonthTradeId().equals(other.getAvgMonthTradeId()))
            && (this.getYearTradeMoneyId() == null ? other.getYearTradeMoneyId() == null : this.getYearTradeMoneyId().equals(other.getYearTradeMoneyId()))
            && (this.getAvgTradeMoneyId() == null ? other.getAvgTradeMoneyId() == null : this.getAvgTradeMoneyId().equals(other.getAvgTradeMoneyId()))
            && (this.getAvgMonthTradeAmountId() == null ? other.getAvgMonthTradeAmountId() == null : this.getAvgMonthTradeAmountId().equals(other.getAvgMonthTradeAmountId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getEstimateTime() == null ? other.getEstimateTime() == null : this.getEstimateTime().equals(other.getEstimateTime()))
            && (this.getWhetherIoan() == null ? other.getWhetherIoan() == null : this.getWhetherIoan().equals(other.getWhetherIoan()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getCreditLimit() == null ? other.getCreditLimit() == null : this.getCreditLimit().equals(other.getCreditLimit()))
            && (this.getLowCreditAmount() == null ? other.getLowCreditAmount() == null : this.getLowCreditAmount().equals(other.getLowCreditAmount()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getCorpId() == null) ? 0 : getCorpId().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getCreditAmount() == null) ? 0 : getCreditAmount().hashCode());
        result = prime * result + ((getIdentificationCard() == null) ? 0 : getIdentificationCard().hashCode());
        result = prime * result + ((getPermanentAddress() == null) ? 0 : getPermanentAddress().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getSecondArea() == null) ? 0 : getSecondArea().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getCreditCode() == null) ? 0 : getCreditCode().hashCode());
        result = prime * result + ((getFoundingTime() == null) ? 0 : getFoundingTime().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getOpeningTime() == null) ? 0 : getOpeningTime().hashCode());
        result = prime * result + ((getGroupAddress() == null) ? 0 : getGroupAddress().hashCode());
        result = prime * result + ((getCreditScore() == null) ? 0 : getCreditScore().hashCode());
        result = prime * result + ((getIndustryCoefficient() == null) ? 0 : getIndustryCoefficient().hashCode());
        result = prime * result + ((getAtValue() == null) ? 0 : getAtValue().hashCode());
        result = prime * result + ((getLifeValue() == null) ? 0 : getLifeValue().hashCode());
        result = prime * result + ((getSellerAddrId() == null) ? 0 : getSellerAddrId().hashCode());
        result = prime * result + ((getSellerScaleId() == null) ? 0 : getSellerScaleId().hashCode());
        result = prime * result + ((getSellerAgeId() == null) ? 0 : getSellerAgeId().hashCode());
        result = prime * result + ((getSellerAreaId() == null) ? 0 : getSellerAreaId().hashCode());
        result = prime * result + ((getBusinessLifeId() == null) ? 0 : getBusinessLifeId().hashCode());
        result = prime * result + ((getResidenceValId() == null) ? 0 : getResidenceValId().hashCode());
        result = prime * result + ((getIndustryMaturityId() == null) ? 0 : getIndustryMaturityId().hashCode());
        result = prime * result + ((getAreaAdvantageId() == null) ? 0 : getAreaAdvantageId().hashCode());
        result = prime * result + ((getBusinessClimateId() == null) ? 0 : getBusinessClimateId().hashCode());
        result = prime * result + ((getAccountOpenTimeId() == null) ? 0 : getAccountOpenTimeId().hashCode());
        result = prime * result + ((getTradeAmountId() == null) ? 0 : getTradeAmountId().hashCode());
        result = prime * result + ((getAvgMonthTradeId() == null) ? 0 : getAvgMonthTradeId().hashCode());
        result = prime * result + ((getYearTradeMoneyId() == null) ? 0 : getYearTradeMoneyId().hashCode());
        result = prime * result + ((getAvgTradeMoneyId() == null) ? 0 : getAvgTradeMoneyId().hashCode());
        result = prime * result + ((getAvgMonthTradeAmountId() == null) ? 0 : getAvgMonthTradeAmountId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getEstimateTime() == null) ? 0 : getEstimateTime().hashCode());
        result = prime * result + ((getWhetherIoan() == null) ? 0 : getWhetherIoan().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getCreditLimit() == null) ? 0 : getCreditLimit().hashCode());
        result = prime * result + ((getLowCreditAmount() == null) ? 0 : getLowCreditAmount().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellerId=").append(sellerId);
        sb.append(", businessId=").append(businessId);
        sb.append(", corpId=").append(corpId);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", operator=").append(operator);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", identificationCard=").append(identificationCard);
        sb.append(", permanentAddress=").append(permanentAddress);
        sb.append(", groupName=").append(groupName);
        sb.append(", industry=").append(industry);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", secondArea=").append(secondArea);
        sb.append(", branch=").append(branch);
        sb.append(", creditCode=").append(creditCode);
        sb.append(", foundingTime=").append(foundingTime);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", openingTime=").append(openingTime);
        sb.append(", groupAddress=").append(groupAddress);
        sb.append(", creditScore=").append(creditScore);
        sb.append(", industryCoefficient=").append(industryCoefficient);
        sb.append(", atValue=").append(atValue);
        sb.append(", lifeValue=").append(lifeValue);
        sb.append(", sellerAddrId=").append(sellerAddrId);
        sb.append(", sellerScaleId=").append(sellerScaleId);
        sb.append(", sellerAgeId=").append(sellerAgeId);
        sb.append(", sellerAreaId=").append(sellerAreaId);
        sb.append(", businessLifeId=").append(businessLifeId);
        sb.append(", residenceValId=").append(residenceValId);
        sb.append(", industryMaturityId=").append(industryMaturityId);
        sb.append(", areaAdvantageId=").append(areaAdvantageId);
        sb.append(", businessClimateId=").append(businessClimateId);
        sb.append(", accountOpenTimeId=").append(accountOpenTimeId);
        sb.append(", tradeAmountId=").append(tradeAmountId);
        sb.append(", avgMonthTradeId=").append(avgMonthTradeId);
        sb.append(", yearTradeMoneyId=").append(yearTradeMoneyId);
        sb.append(", avgTradeMoneyId=").append(avgTradeMoneyId);
        sb.append(", avgMonthTradeAmountId=").append(avgMonthTradeAmountId);
        sb.append(", type=").append(type);
        sb.append(", active=").append(active);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", estimateTime=").append(estimateTime);
        sb.append(", whetherIoan=").append(whetherIoan);
        sb.append(", managerId=").append(managerId);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append(", lowCreditAmount=").append(lowCreditAmount);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}