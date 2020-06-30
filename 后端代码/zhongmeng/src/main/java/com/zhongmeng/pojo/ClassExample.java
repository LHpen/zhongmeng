package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andCdatilIsNull() {
            addCriterion("cdatil is null");
            return (Criteria) this;
        }

        public Criteria andCdatilIsNotNull() {
            addCriterion("cdatil is not null");
            return (Criteria) this;
        }

        public Criteria andCdatilEqualTo(String value) {
            addCriterion("cdatil =", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilNotEqualTo(String value) {
            addCriterion("cdatil <>", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilGreaterThan(String value) {
            addCriterion("cdatil >", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilGreaterThanOrEqualTo(String value) {
            addCriterion("cdatil >=", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilLessThan(String value) {
            addCriterion("cdatil <", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilLessThanOrEqualTo(String value) {
            addCriterion("cdatil <=", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilLike(String value) {
            addCriterion("cdatil like", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilNotLike(String value) {
            addCriterion("cdatil not like", value, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilIn(List<String> values) {
            addCriterion("cdatil in", values, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilNotIn(List<String> values) {
            addCriterion("cdatil not in", values, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilBetween(String value1, String value2) {
            addCriterion("cdatil between", value1, value2, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCdatilNotBetween(String value1, String value2) {
            addCriterion("cdatil not between", value1, value2, "cdatil");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIsNull() {
            addCriterion("cstarttime is null");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIsNotNull() {
            addCriterion("cstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andCstarttimeEqualTo(Date value) {
            addCriterion("cstarttime =", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotEqualTo(Date value) {
            addCriterion("cstarttime <>", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeGreaterThan(Date value) {
            addCriterion("cstarttime >", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cstarttime >=", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeLessThan(Date value) {
            addCriterion("cstarttime <", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("cstarttime <=", value, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeIn(List<Date> values) {
            addCriterion("cstarttime in", values, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotIn(List<Date> values) {
            addCriterion("cstarttime not in", values, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeBetween(Date value1, Date value2) {
            addCriterion("cstarttime between", value1, value2, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("cstarttime not between", value1, value2, "cstarttime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNull() {
            addCriterion("cendtime is null");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNotNull() {
            addCriterion("cendtime is not null");
            return (Criteria) this;
        }

        public Criteria andCendtimeEqualTo(Date value) {
            addCriterion("cendtime =", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotEqualTo(Date value) {
            addCriterion("cendtime <>", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThan(Date value) {
            addCriterion("cendtime >", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cendtime >=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThan(Date value) {
            addCriterion("cendtime <", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThanOrEqualTo(Date value) {
            addCriterion("cendtime <=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIn(List<Date> values) {
            addCriterion("cendtime in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotIn(List<Date> values) {
            addCriterion("cendtime not in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeBetween(Date value1, Date value2) {
            addCriterion("cendtime between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotBetween(Date value1, Date value2) {
            addCriterion("cendtime not between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("addressid is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("addressid =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("addressid <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("addressid >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressid >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("addressid <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("addressid <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("addressid in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("addressid not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("addressid between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("addressid not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberIsNull() {
            addCriterion("bbmaxnumber is null");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberIsNotNull() {
            addCriterion("bbmaxnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberEqualTo(Integer value) {
            addCriterion("bbmaxnumber =", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberNotEqualTo(Integer value) {
            addCriterion("bbmaxnumber <>", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberGreaterThan(Integer value) {
            addCriterion("bbmaxnumber >", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bbmaxnumber >=", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberLessThan(Integer value) {
            addCriterion("bbmaxnumber <", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberLessThanOrEqualTo(Integer value) {
            addCriterion("bbmaxnumber <=", value, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberIn(List<Integer> values) {
            addCriterion("bbmaxnumber in", values, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberNotIn(List<Integer> values) {
            addCriterion("bbmaxnumber not in", values, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberBetween(Integer value1, Integer value2) {
            addCriterion("bbmaxnumber between", value1, value2, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andBbmaxnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bbmaxnumber not between", value1, value2, "bbmaxnumber");
            return (Criteria) this;
        }

        public Criteria andCstateIsNull() {
            addCriterion("cstate is null");
            return (Criteria) this;
        }

        public Criteria andCstateIsNotNull() {
            addCriterion("cstate is not null");
            return (Criteria) this;
        }

        public Criteria andCstateEqualTo(String value) {
            addCriterion("cstate =", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotEqualTo(String value) {
            addCriterion("cstate <>", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThan(String value) {
            addCriterion("cstate >", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThanOrEqualTo(String value) {
            addCriterion("cstate >=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThan(String value) {
            addCriterion("cstate <", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThanOrEqualTo(String value) {
            addCriterion("cstate <=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLike(String value) {
            addCriterion("cstate like", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotLike(String value) {
            addCriterion("cstate not like", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateIn(List<String> values) {
            addCriterion("cstate in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotIn(List<String> values) {
            addCriterion("cstate not in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateBetween(String value1, String value2) {
            addCriterion("cstate between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotBetween(String value1, String value2) {
            addCriterion("cstate not between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNull() {
            addCriterion("address_name is null");
            return (Criteria) this;
        }

        public Criteria andAddressNameIsNotNull() {
            addCriterion("address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddressNameEqualTo(String value) {
            addCriterion("address_name =", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotEqualTo(String value) {
            addCriterion("address_name <>", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThan(String value) {
            addCriterion("address_name >", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("address_name >=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThan(String value) {
            addCriterion("address_name <", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLessThanOrEqualTo(String value) {
            addCriterion("address_name <=", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameLike(String value) {
            addCriterion("address_name like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotLike(String value) {
            addCriterion("address_name not like", value, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameIn(List<String> values) {
            addCriterion("address_name in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotIn(List<String> values) {
            addCriterion("address_name not in", values, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameBetween(String value1, String value2) {
            addCriterion("address_name between", value1, value2, "addressName");
            return (Criteria) this;
        }

        public Criteria andAddressNameNotBetween(String value1, String value2) {
            addCriterion("address_name not between", value1, value2, "addressName");
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