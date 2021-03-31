package com.bochtec.mysql.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CorpDomainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorpDomainExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCenterAreaIsNull() {
            addCriterion("center_area is null");
            return (Criteria) this;
        }

        public Criteria andCenterAreaIsNotNull() {
            addCriterion("center_area is not null");
            return (Criteria) this;
        }

        public Criteria andCenterAreaEqualTo(String value) {
            addCriterion("center_area =", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaNotEqualTo(String value) {
            addCriterion("center_area <>", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaGreaterThan(String value) {
            addCriterion("center_area >", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaGreaterThanOrEqualTo(String value) {
            addCriterion("center_area >=", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaLessThan(String value) {
            addCriterion("center_area <", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaLessThanOrEqualTo(String value) {
            addCriterion("center_area <=", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaLike(String value) {
            addCriterion("center_area like", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaNotLike(String value) {
            addCriterion("center_area not like", value, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaIn(List<String> values) {
            addCriterion("center_area in", values, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaNotIn(List<String> values) {
            addCriterion("center_area not in", values, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaBetween(String value1, String value2) {
            addCriterion("center_area between", value1, value2, "centerArea");
            return (Criteria) this;
        }

        public Criteria andCenterAreaNotBetween(String value1, String value2) {
            addCriterion("center_area not between", value1, value2, "centerArea");
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

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("corp_name is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("corp_name =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("corp_name <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("corp_name >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("corp_name >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("corp_name <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("corp_name <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("corp_name like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("corp_name not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("corp_name in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("corp_name not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("corp_name between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("corp_name not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNull() {
            addCriterion("social_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNotNull() {
            addCriterion("social_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeEqualTo(String value) {
            addCriterion("social_code =", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotEqualTo(String value) {
            addCriterion("social_code <>", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThan(String value) {
            addCriterion("social_code >", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_code >=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThan(String value) {
            addCriterion("social_code <", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThanOrEqualTo(String value) {
            addCriterion("social_code <=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLike(String value) {
            addCriterion("social_code like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotLike(String value) {
            addCriterion("social_code not like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIn(List<String> values) {
            addCriterion("social_code in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotIn(List<String> values) {
            addCriterion("social_code not in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeBetween(String value1, String value2) {
            addCriterion("social_code between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotBetween(String value1, String value2) {
            addCriterion("social_code not between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNull() {
            addCriterion("business_status is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNotNull() {
            addCriterion("business_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusEqualTo(String value) {
            addCriterion("business_status =", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotEqualTo(String value) {
            addCriterion("business_status <>", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThan(String value) {
            addCriterion("business_status >", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("business_status >=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThan(String value) {
            addCriterion("business_status <", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThanOrEqualTo(String value) {
            addCriterion("business_status <=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLike(String value) {
            addCriterion("business_status like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotLike(String value) {
            addCriterion("business_status not like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIn(List<String> values) {
            addCriterion("business_status in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotIn(List<String> values) {
            addCriterion("business_status not in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusBetween(String value1, String value2) {
            addCriterion("business_status between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotBetween(String value1, String value2) {
            addCriterion("business_status not between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNull() {
            addCriterion("register_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNotNull() {
            addCriterion("register_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalEqualTo(String value) {
            addCriterion("register_capital =", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotEqualTo(String value) {
            addCriterion("register_capital <>", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThan(String value) {
            addCriterion("register_capital >", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("register_capital >=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThan(String value) {
            addCriterion("register_capital <", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThanOrEqualTo(String value) {
            addCriterion("register_capital <=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLike(String value) {
            addCriterion("register_capital like", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotLike(String value) {
            addCriterion("register_capital not like", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIn(List<String> values) {
            addCriterion("register_capital in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotIn(List<String> values) {
            addCriterion("register_capital not in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalBetween(String value1, String value2) {
            addCriterion("register_capital between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotBetween(String value1, String value2) {
            addCriterion("register_capital not between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityIsNull() {
            addCriterion("register_authority is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityIsNotNull() {
            addCriterion("register_authority is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityEqualTo(String value) {
            addCriterion("register_authority =", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityNotEqualTo(String value) {
            addCriterion("register_authority <>", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityGreaterThan(String value) {
            addCriterion("register_authority >", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("register_authority >=", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityLessThan(String value) {
            addCriterion("register_authority <", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityLessThanOrEqualTo(String value) {
            addCriterion("register_authority <=", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityLike(String value) {
            addCriterion("register_authority like", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityNotLike(String value) {
            addCriterion("register_authority not like", value, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityIn(List<String> values) {
            addCriterion("register_authority in", values, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityNotIn(List<String> values) {
            addCriterion("register_authority not in", values, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityBetween(String value1, String value2) {
            addCriterion("register_authority between", value1, value2, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andRegisterAuthorityNotBetween(String value1, String value2) {
            addCriterion("register_authority not between", value1, value2, "registerAuthority");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andRealAddressIsNull() {
            addCriterion("real_address is null");
            return (Criteria) this;
        }

        public Criteria andRealAddressIsNotNull() {
            addCriterion("real_address is not null");
            return (Criteria) this;
        }

        public Criteria andRealAddressEqualTo(String value) {
            addCriterion("real_address =", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressNotEqualTo(String value) {
            addCriterion("real_address <>", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressGreaterThan(String value) {
            addCriterion("real_address >", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressGreaterThanOrEqualTo(String value) {
            addCriterion("real_address >=", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressLessThan(String value) {
            addCriterion("real_address <", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressLessThanOrEqualTo(String value) {
            addCriterion("real_address <=", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressLike(String value) {
            addCriterion("real_address like", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressNotLike(String value) {
            addCriterion("real_address not like", value, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressIn(List<String> values) {
            addCriterion("real_address in", values, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressNotIn(List<String> values) {
            addCriterion("real_address not in", values, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressBetween(String value1, String value2) {
            addCriterion("real_address between", value1, value2, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressNotBetween(String value1, String value2) {
            addCriterion("real_address not between", value1, value2, "realAddress");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeIsNull() {
            addCriterion("real_address_longitude is null");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeIsNotNull() {
            addCriterion("real_address_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeEqualTo(String value) {
            addCriterion("real_address_longitude =", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeNotEqualTo(String value) {
            addCriterion("real_address_longitude <>", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeGreaterThan(String value) {
            addCriterion("real_address_longitude >", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("real_address_longitude >=", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeLessThan(String value) {
            addCriterion("real_address_longitude <", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeLessThanOrEqualTo(String value) {
            addCriterion("real_address_longitude <=", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeLike(String value) {
            addCriterion("real_address_longitude like", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeNotLike(String value) {
            addCriterion("real_address_longitude not like", value, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeIn(List<String> values) {
            addCriterion("real_address_longitude in", values, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeNotIn(List<String> values) {
            addCriterion("real_address_longitude not in", values, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeBetween(String value1, String value2) {
            addCriterion("real_address_longitude between", value1, value2, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLongitudeNotBetween(String value1, String value2) {
            addCriterion("real_address_longitude not between", value1, value2, "realAddressLongitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeIsNull() {
            addCriterion("real_address_latitude is null");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeIsNotNull() {
            addCriterion("real_address_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeEqualTo(String value) {
            addCriterion("real_address_latitude =", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeNotEqualTo(String value) {
            addCriterion("real_address_latitude <>", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeGreaterThan(String value) {
            addCriterion("real_address_latitude >", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("real_address_latitude >=", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeLessThan(String value) {
            addCriterion("real_address_latitude <", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeLessThanOrEqualTo(String value) {
            addCriterion("real_address_latitude <=", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeLike(String value) {
            addCriterion("real_address_latitude like", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeNotLike(String value) {
            addCriterion("real_address_latitude not like", value, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeIn(List<String> values) {
            addCriterion("real_address_latitude in", values, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeNotIn(List<String> values) {
            addCriterion("real_address_latitude not in", values, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeBetween(String value1, String value2) {
            addCriterion("real_address_latitude between", value1, value2, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andRealAddressLatitudeNotBetween(String value1, String value2) {
            addCriterion("real_address_latitude not between", value1, value2, "realAddressLatitude");
            return (Criteria) this;
        }

        public Criteria andExpandStatusIsNull() {
            addCriterion("expand_status is null");
            return (Criteria) this;
        }

        public Criteria andExpandStatusIsNotNull() {
            addCriterion("expand_status is not null");
            return (Criteria) this;
        }

        public Criteria andExpandStatusEqualTo(String value) {
            addCriterion("expand_status =", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusNotEqualTo(String value) {
            addCriterion("expand_status <>", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusGreaterThan(String value) {
            addCriterion("expand_status >", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusGreaterThanOrEqualTo(String value) {
            addCriterion("expand_status >=", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusLessThan(String value) {
            addCriterion("expand_status <", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusLessThanOrEqualTo(String value) {
            addCriterion("expand_status <=", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusLike(String value) {
            addCriterion("expand_status like", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusNotLike(String value) {
            addCriterion("expand_status not like", value, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusIn(List<String> values) {
            addCriterion("expand_status in", values, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusNotIn(List<String> values) {
            addCriterion("expand_status not in", values, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusBetween(String value1, String value2) {
            addCriterion("expand_status between", value1, value2, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandStatusNotBetween(String value1, String value2) {
            addCriterion("expand_status not between", value1, value2, "expandStatus");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateIsNull() {
            addCriterion("expand_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateIsNotNull() {
            addCriterion("expand_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateEqualTo(Date value) {
            addCriterion("expand_finish_date =", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateNotEqualTo(Date value) {
            addCriterion("expand_finish_date <>", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateGreaterThan(Date value) {
            addCriterion("expand_finish_date >", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expand_finish_date >=", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateLessThan(Date value) {
            addCriterion("expand_finish_date <", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("expand_finish_date <=", value, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateIn(List<Date> values) {
            addCriterion("expand_finish_date in", values, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateNotIn(List<Date> values) {
            addCriterion("expand_finish_date not in", values, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateBetween(Date value1, Date value2) {
            addCriterion("expand_finish_date between", value1, value2, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("expand_finish_date not between", value1, value2, "expandFinishDate");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdIsNull() {
            addCriterion("expand_loan_office_id is null");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdIsNotNull() {
            addCriterion("expand_loan_office_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdEqualTo(Integer value) {
            addCriterion("expand_loan_office_id =", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdNotEqualTo(Integer value) {
            addCriterion("expand_loan_office_id <>", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdGreaterThan(Integer value) {
            addCriterion("expand_loan_office_id >", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("expand_loan_office_id >=", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdLessThan(Integer value) {
            addCriterion("expand_loan_office_id <", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdLessThanOrEqualTo(Integer value) {
            addCriterion("expand_loan_office_id <=", value, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdIn(List<Integer> values) {
            addCriterion("expand_loan_office_id in", values, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdNotIn(List<Integer> values) {
            addCriterion("expand_loan_office_id not in", values, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdBetween(Integer value1, Integer value2) {
            addCriterion("expand_loan_office_id between", value1, value2, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("expand_loan_office_id not between", value1, value2, "expandLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameIsNull() {
            addCriterion("expand_loan_office_name is null");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameIsNotNull() {
            addCriterion("expand_loan_office_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameEqualTo(String value) {
            addCriterion("expand_loan_office_name =", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameNotEqualTo(String value) {
            addCriterion("expand_loan_office_name <>", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameGreaterThan(String value) {
            addCriterion("expand_loan_office_name >", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("expand_loan_office_name >=", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameLessThan(String value) {
            addCriterion("expand_loan_office_name <", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameLessThanOrEqualTo(String value) {
            addCriterion("expand_loan_office_name <=", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameLike(String value) {
            addCriterion("expand_loan_office_name like", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameNotLike(String value) {
            addCriterion("expand_loan_office_name not like", value, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameIn(List<String> values) {
            addCriterion("expand_loan_office_name in", values, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameNotIn(List<String> values) {
            addCriterion("expand_loan_office_name not in", values, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameBetween(String value1, String value2) {
            addCriterion("expand_loan_office_name between", value1, value2, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andExpandLoanOfficeNameNotBetween(String value1, String value2) {
            addCriterion("expand_loan_office_name not between", value1, value2, "expandLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdIsNull() {
            addCriterion("distribute_loan_office_id is null");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdIsNotNull() {
            addCriterion("distribute_loan_office_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdEqualTo(Integer value) {
            addCriterion("distribute_loan_office_id =", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdNotEqualTo(Integer value) {
            addCriterion("distribute_loan_office_id <>", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdGreaterThan(Integer value) {
            addCriterion("distribute_loan_office_id >", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distribute_loan_office_id >=", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdLessThan(Integer value) {
            addCriterion("distribute_loan_office_id <", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdLessThanOrEqualTo(Integer value) {
            addCriterion("distribute_loan_office_id <=", value, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdIn(List<Integer> values) {
            addCriterion("distribute_loan_office_id in", values, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdNotIn(List<Integer> values) {
            addCriterion("distribute_loan_office_id not in", values, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdBetween(Integer value1, Integer value2) {
            addCriterion("distribute_loan_office_id between", value1, value2, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distribute_loan_office_id not between", value1, value2, "distributeLoanOfficeId");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameIsNull() {
            addCriterion("distribute_loan_office_name is null");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameIsNotNull() {
            addCriterion("distribute_loan_office_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameEqualTo(String value) {
            addCriterion("distribute_loan_office_name =", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameNotEqualTo(String value) {
            addCriterion("distribute_loan_office_name <>", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameGreaterThan(String value) {
            addCriterion("distribute_loan_office_name >", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("distribute_loan_office_name >=", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameLessThan(String value) {
            addCriterion("distribute_loan_office_name <", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameLessThanOrEqualTo(String value) {
            addCriterion("distribute_loan_office_name <=", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameLike(String value) {
            addCriterion("distribute_loan_office_name like", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameNotLike(String value) {
            addCriterion("distribute_loan_office_name not like", value, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameIn(List<String> values) {
            addCriterion("distribute_loan_office_name in", values, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameNotIn(List<String> values) {
            addCriterion("distribute_loan_office_name not in", values, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameBetween(String value1, String value2) {
            addCriterion("distribute_loan_office_name between", value1, value2, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDistributeLoanOfficeNameNotBetween(String value1, String value2) {
            addCriterion("distribute_loan_office_name not between", value1, value2, "distributeLoanOfficeName");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgIsNull() {
            addCriterion("delete_falg is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgIsNotNull() {
            addCriterion("delete_falg is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgEqualTo(Byte value) {
            addCriterion("delete_falg =", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgNotEqualTo(Byte value) {
            addCriterion("delete_falg <>", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgGreaterThan(Byte value) {
            addCriterion("delete_falg >", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_falg >=", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgLessThan(Byte value) {
            addCriterion("delete_falg <", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgLessThanOrEqualTo(Byte value) {
            addCriterion("delete_falg <=", value, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgIn(List<Byte> values) {
            addCriterion("delete_falg in", values, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgNotIn(List<Byte> values) {
            addCriterion("delete_falg not in", values, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgBetween(Byte value1, Byte value2) {
            addCriterion("delete_falg between", value1, value2, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andDeleteFalgNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_falg not between", value1, value2, "deleteFalg");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeIsNull() {
            addCriterion("expand_logic_type is null");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeIsNotNull() {
            addCriterion("expand_logic_type is not null");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeEqualTo(Byte value) {
            addCriterion("expand_logic_type =", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeNotEqualTo(Byte value) {
            addCriterion("expand_logic_type <>", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeGreaterThan(Byte value) {
            addCriterion("expand_logic_type >", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("expand_logic_type >=", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeLessThan(Byte value) {
            addCriterion("expand_logic_type <", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeLessThanOrEqualTo(Byte value) {
            addCriterion("expand_logic_type <=", value, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeIn(List<Byte> values) {
            addCriterion("expand_logic_type in", values, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeNotIn(List<Byte> values) {
            addCriterion("expand_logic_type not in", values, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeBetween(Byte value1, Byte value2) {
            addCriterion("expand_logic_type between", value1, value2, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andExpandLogicTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("expand_logic_type not between", value1, value2, "expandLogicType");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(Integer value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(Integer value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(Integer value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(Integer value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<Integer> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<Integer> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
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