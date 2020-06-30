package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KinsfolkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KinsfolkExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Integer value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Integer value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Integer value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Integer value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Integer value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Integer> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Integer> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Integer value1, Integer value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Integer value1, Integer value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKnameIsNull() {
            addCriterion("kname is null");
            return (Criteria) this;
        }

        public Criteria andKnameIsNotNull() {
            addCriterion("kname is not null");
            return (Criteria) this;
        }

        public Criteria andKnameEqualTo(String value) {
            addCriterion("kname =", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotEqualTo(String value) {
            addCriterion("kname <>", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThan(String value) {
            addCriterion("kname >", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThanOrEqualTo(String value) {
            addCriterion("kname >=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThan(String value) {
            addCriterion("kname <", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThanOrEqualTo(String value) {
            addCriterion("kname <=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLike(String value) {
            addCriterion("kname like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotLike(String value) {
            addCriterion("kname not like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameIn(List<String> values) {
            addCriterion("kname in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotIn(List<String> values) {
            addCriterion("kname not in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameBetween(String value1, String value2) {
            addCriterion("kname between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotBetween(String value1, String value2) {
            addCriterion("kname not between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCTime("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCTime("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCTime("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCTime("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCTime("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCTime("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andKsexIsNull() {
            addCriterion("ksex is null");
            return (Criteria) this;
        }

        public Criteria andKsexIsNotNull() {
            addCriterion("ksex is not null");
            return (Criteria) this;
        }

        public Criteria andKsexEqualTo(String value) {
            addCriterion("ksex =", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexNotEqualTo(String value) {
            addCriterion("ksex <>", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexGreaterThan(String value) {
            addCriterion("ksex >", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexGreaterThanOrEqualTo(String value) {
            addCriterion("ksex >=", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexLessThan(String value) {
            addCriterion("ksex <", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexLessThanOrEqualTo(String value) {
            addCriterion("ksex <=", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexLike(String value) {
            addCriterion("ksex like", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexNotLike(String value) {
            addCriterion("ksex not like", value, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexIn(List<String> values) {
            addCriterion("ksex in", values, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexNotIn(List<String> values) {
            addCriterion("ksex not in", values, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexBetween(String value1, String value2) {
            addCriterion("ksex between", value1, value2, "ksex");
            return (Criteria) this;
        }

        public Criteria andKsexNotBetween(String value1, String value2) {
            addCriterion("ksex not between", value1, value2, "ksex");
            return (Criteria) this;
        }

        public Criteria andKtypeIsNull() {
            addCriterion("ktype is null");
            return (Criteria) this;
        }

        public Criteria andKtypeIsNotNull() {
            addCriterion("ktype is not null");
            return (Criteria) this;
        }

        public Criteria andKtypeEqualTo(String value) {
            addCriterion("ktype =", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeNotEqualTo(String value) {
            addCriterion("ktype <>", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeGreaterThan(String value) {
            addCriterion("ktype >", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ktype >=", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeLessThan(String value) {
            addCriterion("ktype <", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeLessThanOrEqualTo(String value) {
            addCriterion("ktype <=", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeLike(String value) {
            addCriterion("ktype like", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeNotLike(String value) {
            addCriterion("ktype not like", value, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeIn(List<String> values) {
            addCriterion("ktype in", values, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeNotIn(List<String> values) {
            addCriterion("ktype not in", values, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeBetween(String value1, String value2) {
            addCriterion("ktype between", value1, value2, "ktype");
            return (Criteria) this;
        }

        public Criteria andKtypeNotBetween(String value1, String value2) {
            addCriterion("ktype not between", value1, value2, "ktype");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
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