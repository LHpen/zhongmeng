package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManagersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagersExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMloginnameIsNull() {
            addCriterion("mloginname is null");
            return (Criteria) this;
        }

        public Criteria andMloginnameIsNotNull() {
            addCriterion("mloginname is not null");
            return (Criteria) this;
        }

        public Criteria andMloginnameEqualTo(String value) {
            addCriterion("mloginname =", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameNotEqualTo(String value) {
            addCriterion("mloginname <>", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameGreaterThan(String value) {
            addCriterion("mloginname >", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("mloginname >=", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameLessThan(String value) {
            addCriterion("mloginname <", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameLessThanOrEqualTo(String value) {
            addCriterion("mloginname <=", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameLike(String value) {
            addCriterion("mloginname like", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameNotLike(String value) {
            addCriterion("mloginname not like", value, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameIn(List<String> values) {
            addCriterion("mloginname in", values, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameNotIn(List<String> values) {
            addCriterion("mloginname not in", values, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameBetween(String value1, String value2) {
            addCriterion("mloginname between", value1, value2, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMloginnameNotBetween(String value1, String value2) {
            addCriterion("mloginname not between", value1, value2, "mloginname");
            return (Criteria) this;
        }

        public Criteria andMpwIsNull() {
            addCriterion("mpw is null");
            return (Criteria) this;
        }

        public Criteria andMpwIsNotNull() {
            addCriterion("mpw is not null");
            return (Criteria) this;
        }

        public Criteria andMpwEqualTo(String value) {
            addCriterion("mpw =", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwNotEqualTo(String value) {
            addCriterion("mpw <>", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwGreaterThan(String value) {
            addCriterion("mpw >", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwGreaterThanOrEqualTo(String value) {
            addCriterion("mpw >=", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwLessThan(String value) {
            addCriterion("mpw <", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwLessThanOrEqualTo(String value) {
            addCriterion("mpw <=", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwLike(String value) {
            addCriterion("mpw like", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwNotLike(String value) {
            addCriterion("mpw not like", value, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwIn(List<String> values) {
            addCriterion("mpw in", values, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwNotIn(List<String> values) {
            addCriterion("mpw not in", values, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwBetween(String value1, String value2) {
            addCriterion("mpw between", value1, value2, "mpw");
            return (Criteria) this;
        }

        public Criteria andMpwNotBetween(String value1, String value2) {
            addCriterion("mpw not between", value1, value2, "mpw");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andManagetypeIsNull() {
            addCriterion("managetype is null");
            return (Criteria) this;
        }

        public Criteria andManagetypeIsNotNull() {
            addCriterion("managetype is not null");
            return (Criteria) this;
        }

        public Criteria andManagetypeEqualTo(String value) {
            addCriterion("managetype =", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotEqualTo(String value) {
            addCriterion("managetype <>", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeGreaterThan(String value) {
            addCriterion("managetype >", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("managetype >=", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLessThan(String value) {
            addCriterion("managetype <", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLessThanOrEqualTo(String value) {
            addCriterion("managetype <=", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLike(String value) {
            addCriterion("managetype like", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotLike(String value) {
            addCriterion("managetype not like", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeIn(List<String> values) {
            addCriterion("managetype in", values, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotIn(List<String> values) {
            addCriterion("managetype not in", values, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeBetween(String value1, String value2) {
            addCriterion("managetype between", value1, value2, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotBetween(String value1, String value2) {
            addCriterion("managetype not between", value1, value2, "managetype");
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