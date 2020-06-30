package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassbebesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassbebesExample() {
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

        public Criteria andCbidIsNull() {
            addCriterion("cbid is null");
            return (Criteria) this;
        }

        public Criteria andCbidIsNotNull() {
            addCriterion("cbid is not null");
            return (Criteria) this;
        }

        public Criteria andCbidEqualTo(Integer value) {
            addCriterion("cbid =", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotEqualTo(Integer value) {
            addCriterion("cbid <>", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThan(Integer value) {
            addCriterion("cbid >", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbid >=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThan(Integer value) {
            addCriterion("cbid <", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThanOrEqualTo(Integer value) {
            addCriterion("cbid <=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidIn(List<Integer> values) {
            addCriterion("cbid in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotIn(List<Integer> values) {
            addCriterion("cbid not in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidBetween(Integer value1, Integer value2) {
            addCriterion("cbid between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbid not between", value1, value2, "cbid");
            return (Criteria) this;
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

        public Criteria andRemainhoursIsNull() {
            addCriterion("remainhours is null");
            return (Criteria) this;
        }

        public Criteria andRemainhoursIsNotNull() {
            addCriterion("remainhours is not null");
            return (Criteria) this;
        }

        public Criteria andRemainhoursEqualTo(Integer value) {
            addCriterion("remainhours =", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursNotEqualTo(Integer value) {
            addCriterion("remainhours <>", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursGreaterThan(Integer value) {
            addCriterion("remainhours >", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainhours >=", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursLessThan(Integer value) {
            addCriterion("remainhours <", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursLessThanOrEqualTo(Integer value) {
            addCriterion("remainhours <=", value, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursIn(List<Integer> values) {
            addCriterion("remainhours in", values, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursNotIn(List<Integer> values) {
            addCriterion("remainhours not in", values, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursBetween(Integer value1, Integer value2) {
            addCriterion("remainhours between", value1, value2, "remainhours");
            return (Criteria) this;
        }

        public Criteria andRemainhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("remainhours not between", value1, value2, "remainhours");
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