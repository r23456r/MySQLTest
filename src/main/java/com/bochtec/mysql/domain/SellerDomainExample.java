package com.bochtec.mysql.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerDomainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerDomainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("corp_id is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("corp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(Integer value) {
            addCriterion("corp_id =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(Integer value) {
            addCriterion("corp_id <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(Integer value) {
            addCriterion("corp_id >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("corp_id >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(Integer value) {
            addCriterion("corp_id <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(Integer value) {
            addCriterion("corp_id <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<Integer> values) {
            addCriterion("corp_id in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<Integer> values) {
            addCriterion("corp_id not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(Integer value1, Integer value2) {
            addCriterion("corp_id between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("corp_id not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(Double value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(Double value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(Double value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(Double value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(Double value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<Double> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<Double> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(Double value1, Double value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(Double value1, Double value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardIsNull() {
            addCriterion("identification_card is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardIsNotNull() {
            addCriterion("identification_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardEqualTo(String value) {
            addCriterion("identification_card =", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardNotEqualTo(String value) {
            addCriterion("identification_card <>", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardGreaterThan(String value) {
            addCriterion("identification_card >", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardGreaterThanOrEqualTo(String value) {
            addCriterion("identification_card >=", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardLessThan(String value) {
            addCriterion("identification_card <", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardLessThanOrEqualTo(String value) {
            addCriterion("identification_card <=", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardLike(String value) {
            addCriterion("identification_card like", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardNotLike(String value) {
            addCriterion("identification_card not like", value, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardIn(List<String> values) {
            addCriterion("identification_card in", values, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardNotIn(List<String> values) {
            addCriterion("identification_card not in", values, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardBetween(String value1, String value2) {
            addCriterion("identification_card between", value1, value2, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andIdentificationCardNotBetween(String value1, String value2) {
            addCriterion("identification_card not between", value1, value2, "identificationCard");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIsNull() {
            addCriterion("permanent_address is null");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIsNotNull() {
            addCriterion("permanent_address is not null");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressEqualTo(String value) {
            addCriterion("permanent_address =", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotEqualTo(String value) {
            addCriterion("permanent_address <>", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressGreaterThan(String value) {
            addCriterion("permanent_address >", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("permanent_address >=", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLessThan(String value) {
            addCriterion("permanent_address <", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLessThanOrEqualTo(String value) {
            addCriterion("permanent_address <=", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLike(String value) {
            addCriterion("permanent_address like", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotLike(String value) {
            addCriterion("permanent_address not like", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIn(List<String> values) {
            addCriterion("permanent_address in", values, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotIn(List<String> values) {
            addCriterion("permanent_address not in", values, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressBetween(String value1, String value2) {
            addCriterion("permanent_address between", value1, value2, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotBetween(String value1, String value2) {
            addCriterion("permanent_address not between", value1, value2, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIsNull() {
            addCriterion("second_area is null");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIsNotNull() {
            addCriterion("second_area is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAreaEqualTo(String value) {
            addCriterion("second_area =", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaNotEqualTo(String value) {
            addCriterion("second_area <>", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaGreaterThan(String value) {
            addCriterion("second_area >", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaGreaterThanOrEqualTo(String value) {
            addCriterion("second_area >=", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaLessThan(String value) {
            addCriterion("second_area <", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaLessThanOrEqualTo(String value) {
            addCriterion("second_area <=", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaLike(String value) {
            addCriterion("second_area like", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaNotLike(String value) {
            addCriterion("second_area not like", value, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIn(List<String> values) {
            addCriterion("second_area in", values, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaNotIn(List<String> values) {
            addCriterion("second_area not in", values, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaBetween(String value1, String value2) {
            addCriterion("second_area between", value1, value2, "secondArea");
            return (Criteria) this;
        }

        public Criteria andSecondAreaNotBetween(String value1, String value2) {
            addCriterion("second_area not between", value1, value2, "secondArea");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(Integer value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(Integer value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(Integer value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(Integer value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(Integer value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<Integer> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<Integer> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(Integer value1, Integer value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(Integer value1, Integer value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeIsNull() {
            addCriterion("founding_time is null");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeIsNotNull() {
            addCriterion("founding_time is not null");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeEqualTo(Date value) {
            addCriterion("founding_time =", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeNotEqualTo(Date value) {
            addCriterion("founding_time <>", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeGreaterThan(Date value) {
            addCriterion("founding_time >", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("founding_time >=", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeLessThan(Date value) {
            addCriterion("founding_time <", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeLessThanOrEqualTo(Date value) {
            addCriterion("founding_time <=", value, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeIn(List<Date> values) {
            addCriterion("founding_time in", values, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeNotIn(List<Date> values) {
            addCriterion("founding_time not in", values, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeBetween(Date value1, Date value2) {
            addCriterion("founding_time between", value1, value2, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andFoundingTimeNotBetween(Date value1, Date value2) {
            addCriterion("founding_time not between", value1, value2, "foundingTime");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNull() {
            addCriterion("opening_time is null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIsNotNull() {
            addCriterion("opening_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeEqualTo(Date value) {
            addCriterion("opening_time =", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotEqualTo(Date value) {
            addCriterion("opening_time <>", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThan(Date value) {
            addCriterion("opening_time >", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opening_time >=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThan(Date value) {
            addCriterion("opening_time <", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeLessThanOrEqualTo(Date value) {
            addCriterion("opening_time <=", value, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeIn(List<Date> values) {
            addCriterion("opening_time in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotIn(List<Date> values) {
            addCriterion("opening_time not in", values, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeBetween(Date value1, Date value2) {
            addCriterion("opening_time between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andOpeningTimeNotBetween(Date value1, Date value2) {
            addCriterion("opening_time not between", value1, value2, "openingTime");
            return (Criteria) this;
        }

        public Criteria andGroupAddressIsNull() {
            addCriterion("group_address is null");
            return (Criteria) this;
        }

        public Criteria andGroupAddressIsNotNull() {
            addCriterion("group_address is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAddressEqualTo(String value) {
            addCriterion("group_address =", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressNotEqualTo(String value) {
            addCriterion("group_address <>", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressGreaterThan(String value) {
            addCriterion("group_address >", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressGreaterThanOrEqualTo(String value) {
            addCriterion("group_address >=", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressLessThan(String value) {
            addCriterion("group_address <", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressLessThanOrEqualTo(String value) {
            addCriterion("group_address <=", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressLike(String value) {
            addCriterion("group_address like", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressNotLike(String value) {
            addCriterion("group_address not like", value, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressIn(List<String> values) {
            addCriterion("group_address in", values, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressNotIn(List<String> values) {
            addCriterion("group_address not in", values, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressBetween(String value1, String value2) {
            addCriterion("group_address between", value1, value2, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andGroupAddressNotBetween(String value1, String value2) {
            addCriterion("group_address not between", value1, value2, "groupAddress");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNull() {
            addCriterion("credit_score is null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIsNotNull() {
            addCriterion("credit_score is not null");
            return (Criteria) this;
        }

        public Criteria andCreditScoreEqualTo(Float value) {
            addCriterion("credit_score =", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotEqualTo(Float value) {
            addCriterion("credit_score <>", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThan(Float value) {
            addCriterion("credit_score >", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("credit_score >=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThan(Float value) {
            addCriterion("credit_score <", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreLessThanOrEqualTo(Float value) {
            addCriterion("credit_score <=", value, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreIn(List<Float> values) {
            addCriterion("credit_score in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotIn(List<Float> values) {
            addCriterion("credit_score not in", values, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreBetween(Float value1, Float value2) {
            addCriterion("credit_score between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andCreditScoreNotBetween(Float value1, Float value2) {
            addCriterion("credit_score not between", value1, value2, "creditScore");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientIsNull() {
            addCriterion("industry_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientIsNotNull() {
            addCriterion("industry_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientEqualTo(Float value) {
            addCriterion("industry_coefficient =", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientNotEqualTo(Float value) {
            addCriterion("industry_coefficient <>", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientGreaterThan(Float value) {
            addCriterion("industry_coefficient >", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientGreaterThanOrEqualTo(Float value) {
            addCriterion("industry_coefficient >=", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientLessThan(Float value) {
            addCriterion("industry_coefficient <", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientLessThanOrEqualTo(Float value) {
            addCriterion("industry_coefficient <=", value, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientIn(List<Float> values) {
            addCriterion("industry_coefficient in", values, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientNotIn(List<Float> values) {
            addCriterion("industry_coefficient not in", values, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientBetween(Float value1, Float value2) {
            addCriterion("industry_coefficient between", value1, value2, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andIndustryCoefficientNotBetween(Float value1, Float value2) {
            addCriterion("industry_coefficient not between", value1, value2, "industryCoefficient");
            return (Criteria) this;
        }

        public Criteria andAtValueIsNull() {
            addCriterion("at_value is null");
            return (Criteria) this;
        }

        public Criteria andAtValueIsNotNull() {
            addCriterion("at_value is not null");
            return (Criteria) this;
        }

        public Criteria andAtValueEqualTo(Float value) {
            addCriterion("at_value =", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueNotEqualTo(Float value) {
            addCriterion("at_value <>", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueGreaterThan(Float value) {
            addCriterion("at_value >", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueGreaterThanOrEqualTo(Float value) {
            addCriterion("at_value >=", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueLessThan(Float value) {
            addCriterion("at_value <", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueLessThanOrEqualTo(Float value) {
            addCriterion("at_value <=", value, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueIn(List<Float> values) {
            addCriterion("at_value in", values, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueNotIn(List<Float> values) {
            addCriterion("at_value not in", values, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueBetween(Float value1, Float value2) {
            addCriterion("at_value between", value1, value2, "atValue");
            return (Criteria) this;
        }

        public Criteria andAtValueNotBetween(Float value1, Float value2) {
            addCriterion("at_value not between", value1, value2, "atValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueIsNull() {
            addCriterion("life_value is null");
            return (Criteria) this;
        }

        public Criteria andLifeValueIsNotNull() {
            addCriterion("life_value is not null");
            return (Criteria) this;
        }

        public Criteria andLifeValueEqualTo(Float value) {
            addCriterion("life_value =", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotEqualTo(Float value) {
            addCriterion("life_value <>", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueGreaterThan(Float value) {
            addCriterion("life_value >", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueGreaterThanOrEqualTo(Float value) {
            addCriterion("life_value >=", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueLessThan(Float value) {
            addCriterion("life_value <", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueLessThanOrEqualTo(Float value) {
            addCriterion("life_value <=", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueIn(List<Float> values) {
            addCriterion("life_value in", values, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotIn(List<Float> values) {
            addCriterion("life_value not in", values, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueBetween(Float value1, Float value2) {
            addCriterion("life_value between", value1, value2, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotBetween(Float value1, Float value2) {
            addCriterion("life_value not between", value1, value2, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdIsNull() {
            addCriterion("seller_addr_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdIsNotNull() {
            addCriterion("seller_addr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdEqualTo(Integer value) {
            addCriterion("seller_addr_id =", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdNotEqualTo(Integer value) {
            addCriterion("seller_addr_id <>", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdGreaterThan(Integer value) {
            addCriterion("seller_addr_id >", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_addr_id >=", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdLessThan(Integer value) {
            addCriterion("seller_addr_id <", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_addr_id <=", value, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdIn(List<Integer> values) {
            addCriterion("seller_addr_id in", values, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdNotIn(List<Integer> values) {
            addCriterion("seller_addr_id not in", values, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_addr_id between", value1, value2, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerAddrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_addr_id not between", value1, value2, "sellerAddrId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdIsNull() {
            addCriterion("seller_scale_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdIsNotNull() {
            addCriterion("seller_scale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdEqualTo(Integer value) {
            addCriterion("seller_scale_id =", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdNotEqualTo(Integer value) {
            addCriterion("seller_scale_id <>", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdGreaterThan(Integer value) {
            addCriterion("seller_scale_id >", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_scale_id >=", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdLessThan(Integer value) {
            addCriterion("seller_scale_id <", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_scale_id <=", value, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdIn(List<Integer> values) {
            addCriterion("seller_scale_id in", values, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdNotIn(List<Integer> values) {
            addCriterion("seller_scale_id not in", values, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_scale_id between", value1, value2, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerScaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_scale_id not between", value1, value2, "sellerScaleId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdIsNull() {
            addCriterion("seller_age_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdIsNotNull() {
            addCriterion("seller_age_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdEqualTo(Integer value) {
            addCriterion("seller_age_id =", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdNotEqualTo(Integer value) {
            addCriterion("seller_age_id <>", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdGreaterThan(Integer value) {
            addCriterion("seller_age_id >", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_age_id >=", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdLessThan(Integer value) {
            addCriterion("seller_age_id <", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_age_id <=", value, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdIn(List<Integer> values) {
            addCriterion("seller_age_id in", values, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdNotIn(List<Integer> values) {
            addCriterion("seller_age_id not in", values, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_age_id between", value1, value2, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_age_id not between", value1, value2, "sellerAgeId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdIsNull() {
            addCriterion("seller_area_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdIsNotNull() {
            addCriterion("seller_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdEqualTo(Integer value) {
            addCriterion("seller_area_id =", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdNotEqualTo(Integer value) {
            addCriterion("seller_area_id <>", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdGreaterThan(Integer value) {
            addCriterion("seller_area_id >", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_area_id >=", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdLessThan(Integer value) {
            addCriterion("seller_area_id <", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_area_id <=", value, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdIn(List<Integer> values) {
            addCriterion("seller_area_id in", values, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdNotIn(List<Integer> values) {
            addCriterion("seller_area_id not in", values, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_area_id between", value1, value2, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_area_id not between", value1, value2, "sellerAreaId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdIsNull() {
            addCriterion("business_life_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdIsNotNull() {
            addCriterion("business_life_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdEqualTo(Integer value) {
            addCriterion("business_life_id =", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdNotEqualTo(Integer value) {
            addCriterion("business_life_id <>", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdGreaterThan(Integer value) {
            addCriterion("business_life_id >", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_life_id >=", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdLessThan(Integer value) {
            addCriterion("business_life_id <", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_life_id <=", value, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdIn(List<Integer> values) {
            addCriterion("business_life_id in", values, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdNotIn(List<Integer> values) {
            addCriterion("business_life_id not in", values, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdBetween(Integer value1, Integer value2) {
            addCriterion("business_life_id between", value1, value2, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andBusinessLifeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_life_id not between", value1, value2, "businessLifeId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdIsNull() {
            addCriterion("residence_val_id is null");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdIsNotNull() {
            addCriterion("residence_val_id is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdEqualTo(Integer value) {
            addCriterion("residence_val_id =", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdNotEqualTo(Integer value) {
            addCriterion("residence_val_id <>", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdGreaterThan(Integer value) {
            addCriterion("residence_val_id >", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("residence_val_id >=", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdLessThan(Integer value) {
            addCriterion("residence_val_id <", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdLessThanOrEqualTo(Integer value) {
            addCriterion("residence_val_id <=", value, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdIn(List<Integer> values) {
            addCriterion("residence_val_id in", values, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdNotIn(List<Integer> values) {
            addCriterion("residence_val_id not in", values, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdBetween(Integer value1, Integer value2) {
            addCriterion("residence_val_id between", value1, value2, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andResidenceValIdNotBetween(Integer value1, Integer value2) {
            addCriterion("residence_val_id not between", value1, value2, "residenceValId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdIsNull() {
            addCriterion("industry_maturity_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdIsNotNull() {
            addCriterion("industry_maturity_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdEqualTo(Integer value) {
            addCriterion("industry_maturity_id =", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdNotEqualTo(Integer value) {
            addCriterion("industry_maturity_id <>", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdGreaterThan(Integer value) {
            addCriterion("industry_maturity_id >", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_maturity_id >=", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdLessThan(Integer value) {
            addCriterion("industry_maturity_id <", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_maturity_id <=", value, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdIn(List<Integer> values) {
            addCriterion("industry_maturity_id in", values, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdNotIn(List<Integer> values) {
            addCriterion("industry_maturity_id not in", values, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_maturity_id between", value1, value2, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andIndustryMaturityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_maturity_id not between", value1, value2, "industryMaturityId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdIsNull() {
            addCriterion("area_advantage_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdIsNotNull() {
            addCriterion("area_advantage_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdEqualTo(Integer value) {
            addCriterion("area_advantage_id =", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdNotEqualTo(Integer value) {
            addCriterion("area_advantage_id <>", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdGreaterThan(Integer value) {
            addCriterion("area_advantage_id >", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_advantage_id >=", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdLessThan(Integer value) {
            addCriterion("area_advantage_id <", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_advantage_id <=", value, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdIn(List<Integer> values) {
            addCriterion("area_advantage_id in", values, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdNotIn(List<Integer> values) {
            addCriterion("area_advantage_id not in", values, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdBetween(Integer value1, Integer value2) {
            addCriterion("area_advantage_id between", value1, value2, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andAreaAdvantageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_advantage_id not between", value1, value2, "areaAdvantageId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdIsNull() {
            addCriterion("business_climate_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdIsNotNull() {
            addCriterion("business_climate_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdEqualTo(Integer value) {
            addCriterion("business_climate_id =", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdNotEqualTo(Integer value) {
            addCriterion("business_climate_id <>", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdGreaterThan(Integer value) {
            addCriterion("business_climate_id >", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_climate_id >=", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdLessThan(Integer value) {
            addCriterion("business_climate_id <", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_climate_id <=", value, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdIn(List<Integer> values) {
            addCriterion("business_climate_id in", values, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdNotIn(List<Integer> values) {
            addCriterion("business_climate_id not in", values, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdBetween(Integer value1, Integer value2) {
            addCriterion("business_climate_id between", value1, value2, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andBusinessClimateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_climate_id not between", value1, value2, "businessClimateId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdIsNull() {
            addCriterion("account_open_time_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdIsNotNull() {
            addCriterion("account_open_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdEqualTo(Integer value) {
            addCriterion("account_open_time_id =", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdNotEqualTo(Integer value) {
            addCriterion("account_open_time_id <>", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdGreaterThan(Integer value) {
            addCriterion("account_open_time_id >", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_open_time_id >=", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdLessThan(Integer value) {
            addCriterion("account_open_time_id <", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_open_time_id <=", value, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdIn(List<Integer> values) {
            addCriterion("account_open_time_id in", values, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdNotIn(List<Integer> values) {
            addCriterion("account_open_time_id not in", values, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("account_open_time_id between", value1, value2, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andAccountOpenTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_open_time_id not between", value1, value2, "accountOpenTimeId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdIsNull() {
            addCriterion("trade_amount_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdIsNotNull() {
            addCriterion("trade_amount_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdEqualTo(Integer value) {
            addCriterion("trade_amount_id =", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdNotEqualTo(Integer value) {
            addCriterion("trade_amount_id <>", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdGreaterThan(Integer value) {
            addCriterion("trade_amount_id >", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_amount_id >=", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdLessThan(Integer value) {
            addCriterion("trade_amount_id <", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdLessThanOrEqualTo(Integer value) {
            addCriterion("trade_amount_id <=", value, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdIn(List<Integer> values) {
            addCriterion("trade_amount_id in", values, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdNotIn(List<Integer> values) {
            addCriterion("trade_amount_id not in", values, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdBetween(Integer value1, Integer value2) {
            addCriterion("trade_amount_id between", value1, value2, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_amount_id not between", value1, value2, "tradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdIsNull() {
            addCriterion("avg_month_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdIsNotNull() {
            addCriterion("avg_month_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdEqualTo(Integer value) {
            addCriterion("avg_month_trade_id =", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdNotEqualTo(Integer value) {
            addCriterion("avg_month_trade_id <>", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdGreaterThan(Integer value) {
            addCriterion("avg_month_trade_id >", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_month_trade_id >=", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdLessThan(Integer value) {
            addCriterion("avg_month_trade_id <", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("avg_month_trade_id <=", value, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdIn(List<Integer> values) {
            addCriterion("avg_month_trade_id in", values, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdNotIn(List<Integer> values) {
            addCriterion("avg_month_trade_id not in", values, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdBetween(Integer value1, Integer value2) {
            addCriterion("avg_month_trade_id between", value1, value2, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_month_trade_id not between", value1, value2, "avgMonthTradeId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdIsNull() {
            addCriterion("year_trade_money_id is null");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdIsNotNull() {
            addCriterion("year_trade_money_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdEqualTo(Integer value) {
            addCriterion("year_trade_money_id =", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdNotEqualTo(Integer value) {
            addCriterion("year_trade_money_id <>", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdGreaterThan(Integer value) {
            addCriterion("year_trade_money_id >", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_trade_money_id >=", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdLessThan(Integer value) {
            addCriterion("year_trade_money_id <", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_trade_money_id <=", value, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdIn(List<Integer> values) {
            addCriterion("year_trade_money_id in", values, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdNotIn(List<Integer> values) {
            addCriterion("year_trade_money_id not in", values, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdBetween(Integer value1, Integer value2) {
            addCriterion("year_trade_money_id between", value1, value2, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andYearTradeMoneyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_trade_money_id not between", value1, value2, "yearTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdIsNull() {
            addCriterion("avg_trade_money_id is null");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdIsNotNull() {
            addCriterion("avg_trade_money_id is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdEqualTo(Integer value) {
            addCriterion("avg_trade_money_id =", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdNotEqualTo(Integer value) {
            addCriterion("avg_trade_money_id <>", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdGreaterThan(Integer value) {
            addCriterion("avg_trade_money_id >", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_trade_money_id >=", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdLessThan(Integer value) {
            addCriterion("avg_trade_money_id <", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdLessThanOrEqualTo(Integer value) {
            addCriterion("avg_trade_money_id <=", value, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdIn(List<Integer> values) {
            addCriterion("avg_trade_money_id in", values, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdNotIn(List<Integer> values) {
            addCriterion("avg_trade_money_id not in", values, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdBetween(Integer value1, Integer value2) {
            addCriterion("avg_trade_money_id between", value1, value2, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgTradeMoneyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_trade_money_id not between", value1, value2, "avgTradeMoneyId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdIsNull() {
            addCriterion("avg_month_trade_amount_id is null");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdIsNotNull() {
            addCriterion("avg_month_trade_amount_id is not null");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdEqualTo(Integer value) {
            addCriterion("avg_month_trade_amount_id =", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdNotEqualTo(Integer value) {
            addCriterion("avg_month_trade_amount_id <>", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdGreaterThan(Integer value) {
            addCriterion("avg_month_trade_amount_id >", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_month_trade_amount_id >=", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdLessThan(Integer value) {
            addCriterion("avg_month_trade_amount_id <", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdLessThanOrEqualTo(Integer value) {
            addCriterion("avg_month_trade_amount_id <=", value, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdIn(List<Integer> values) {
            addCriterion("avg_month_trade_amount_id in", values, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdNotIn(List<Integer> values) {
            addCriterion("avg_month_trade_amount_id not in", values, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdBetween(Integer value1, Integer value2) {
            addCriterion("avg_month_trade_amount_id between", value1, value2, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andAvgMonthTradeAmountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_month_trade_amount_id not between", value1, value2, "avgMonthTradeAmountId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeIsNull() {
            addCriterion("estimate_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeIsNotNull() {
            addCriterion("estimate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeEqualTo(Date value) {
            addCriterion("estimate_time =", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeNotEqualTo(Date value) {
            addCriterion("estimate_time <>", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeGreaterThan(Date value) {
            addCriterion("estimate_time >", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estimate_time >=", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeLessThan(Date value) {
            addCriterion("estimate_time <", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeLessThanOrEqualTo(Date value) {
            addCriterion("estimate_time <=", value, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeIn(List<Date> values) {
            addCriterion("estimate_time in", values, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeNotIn(List<Date> values) {
            addCriterion("estimate_time not in", values, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeBetween(Date value1, Date value2) {
            addCriterion("estimate_time between", value1, value2, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andEstimateTimeNotBetween(Date value1, Date value2) {
            addCriterion("estimate_time not between", value1, value2, "estimateTime");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanIsNull() {
            addCriterion("whether_ioan is null");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanIsNotNull() {
            addCriterion("whether_ioan is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanEqualTo(Integer value) {
            addCriterion("whether_ioan =", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanNotEqualTo(Integer value) {
            addCriterion("whether_ioan <>", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanGreaterThan(Integer value) {
            addCriterion("whether_ioan >", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_ioan >=", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanLessThan(Integer value) {
            addCriterion("whether_ioan <", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanLessThanOrEqualTo(Integer value) {
            addCriterion("whether_ioan <=", value, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanIn(List<Integer> values) {
            addCriterion("whether_ioan in", values, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanNotIn(List<Integer> values) {
            addCriterion("whether_ioan not in", values, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanBetween(Integer value1, Integer value2) {
            addCriterion("whether_ioan between", value1, value2, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andWhetherIoanNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_ioan not between", value1, value2, "whetherIoan");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(Double value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(Double value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(Double value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(Double value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(Double value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<Double> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<Double> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(Double value1, Double value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(Double value1, Double value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountIsNull() {
            addCriterion("low_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountIsNotNull() {
            addCriterion("low_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountEqualTo(Double value) {
            addCriterion("low_credit_amount =", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountNotEqualTo(Double value) {
            addCriterion("low_credit_amount <>", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountGreaterThan(Double value) {
            addCriterion("low_credit_amount >", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("low_credit_amount >=", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountLessThan(Double value) {
            addCriterion("low_credit_amount <", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountLessThanOrEqualTo(Double value) {
            addCriterion("low_credit_amount <=", value, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountIn(List<Double> values) {
            addCriterion("low_credit_amount in", values, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountNotIn(List<Double> values) {
            addCriterion("low_credit_amount not in", values, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountBetween(Double value1, Double value2) {
            addCriterion("low_credit_amount between", value1, value2, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andLowCreditAmountNotBetween(Double value1, Double value2) {
            addCriterion("low_credit_amount not between", value1, value2, "lowCreditAmount");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(Byte value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(Byte value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(Byte value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(Byte value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(Byte value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(Byte value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<Byte> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<Byte> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(Byte value1, Byte value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(Byte value1, Byte value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}