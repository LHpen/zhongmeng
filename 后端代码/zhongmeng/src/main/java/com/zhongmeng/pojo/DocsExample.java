package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocsExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDtitleIsNull() {
            addCriterion("dtitle is null");
            return (Criteria) this;
        }

        public Criteria andDtitleIsNotNull() {
            addCriterion("dtitle is not null");
            return (Criteria) this;
        }

        public Criteria andDtitleEqualTo(String value) {
            addCriterion("dtitle =", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotEqualTo(String value) {
            addCriterion("dtitle <>", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleGreaterThan(String value) {
            addCriterion("dtitle >", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleGreaterThanOrEqualTo(String value) {
            addCriterion("dtitle >=", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLessThan(String value) {
            addCriterion("dtitle <", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLessThanOrEqualTo(String value) {
            addCriterion("dtitle <=", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleLike(String value) {
            addCriterion("dtitle like", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotLike(String value) {
            addCriterion("dtitle not like", value, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleIn(List<String> values) {
            addCriterion("dtitle in", values, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotIn(List<String> values) {
            addCriterion("dtitle not in", values, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleBetween(String value1, String value2) {
            addCriterion("dtitle between", value1, value2, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtitleNotBetween(String value1, String value2) {
            addCriterion("dtitle not between", value1, value2, "dtitle");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNull() {
            addCriterion("dtime is null");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNotNull() {
            addCriterion("dtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtimeEqualTo(Date value) {
            addCriterion("dtime =", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotEqualTo(Date value) {
            addCriterion("dtime <>", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThan(Date value) {
            addCriterion("dtime >", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dtime >=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThan(Date value) {
            addCriterion("dtime <", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThanOrEqualTo(Date value) {
            addCriterion("dtime <=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeIn(List<Date> values) {
            addCriterion("dtime in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotIn(List<Date> values) {
            addCriterion("dtime not in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeBetween(Date value1, Date value2) {
            addCriterion("dtime between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotBetween(Date value1, Date value2) {
            addCriterion("dtime not between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andDimgIsNull() {
            addCriterion("dimg is null");
            return (Criteria) this;
        }

        public Criteria andDimgIsNotNull() {
            addCriterion("dimg is not null");
            return (Criteria) this;
        }

        public Criteria andDimgEqualTo(String value) {
            addCriterion("dimg =", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotEqualTo(String value) {
            addCriterion("dimg <>", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgGreaterThan(String value) {
            addCriterion("dimg >", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgGreaterThanOrEqualTo(String value) {
            addCriterion("dimg >=", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLessThan(String value) {
            addCriterion("dimg <", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLessThanOrEqualTo(String value) {
            addCriterion("dimg <=", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgLike(String value) {
            addCriterion("dimg like", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotLike(String value) {
            addCriterion("dimg not like", value, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgIn(List<String> values) {
            addCriterion("dimg in", values, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotIn(List<String> values) {
            addCriterion("dimg not in", values, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgBetween(String value1, String value2) {
            addCriterion("dimg between", value1, value2, "dimg");
            return (Criteria) this;
        }

        public Criteria andDimgNotBetween(String value1, String value2) {
            addCriterion("dimg not between", value1, value2, "dimg");
            return (Criteria) this;
        }

        public Criteria andDinfoIsNull() {
            addCriterion("dinfo is null");
            return (Criteria) this;
        }

        public Criteria andDinfoIsNotNull() {
            addCriterion("dinfo is not null");
            return (Criteria) this;
        }

        public Criteria andDinfoEqualTo(String value) {
            addCriterion("dinfo =", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoNotEqualTo(String value) {
            addCriterion("dinfo <>", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoGreaterThan(String value) {
            addCriterion("dinfo >", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoGreaterThanOrEqualTo(String value) {
            addCriterion("dinfo >=", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoLessThan(String value) {
            addCriterion("dinfo <", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoLessThanOrEqualTo(String value) {
            addCriterion("dinfo <=", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoLike(String value) {
            addCriterion("dinfo like", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoNotLike(String value) {
            addCriterion("dinfo not like", value, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoIn(List<String> values) {
            addCriterion("dinfo in", values, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoNotIn(List<String> values) {
            addCriterion("dinfo not in", values, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoBetween(String value1, String value2) {
            addCriterion("dinfo between", value1, value2, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDinfoNotBetween(String value1, String value2) {
            addCriterion("dinfo not between", value1, value2, "dinfo");
            return (Criteria) this;
        }

        public Criteria andDdatilIsNull() {
            addCriterion("ddatil is null");
            return (Criteria) this;
        }

        public Criteria andDdatilIsNotNull() {
            addCriterion("ddatil is not null");
            return (Criteria) this;
        }

        public Criteria andDdatilEqualTo(String value) {
            addCriterion("ddatil =", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilNotEqualTo(String value) {
            addCriterion("ddatil <>", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilGreaterThan(String value) {
            addCriterion("ddatil >", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilGreaterThanOrEqualTo(String value) {
            addCriterion("ddatil >=", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilLessThan(String value) {
            addCriterion("ddatil <", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilLessThanOrEqualTo(String value) {
            addCriterion("ddatil <=", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilLike(String value) {
            addCriterion("ddatil like", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilNotLike(String value) {
            addCriterion("ddatil not like", value, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilIn(List<String> values) {
            addCriterion("ddatil in", values, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilNotIn(List<String> values) {
            addCriterion("ddatil not in", values, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilBetween(String value1, String value2) {
            addCriterion("ddatil between", value1, value2, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDdatilNotBetween(String value1, String value2) {
            addCriterion("ddatil not between", value1, value2, "ddatil");
            return (Criteria) this;
        }

        public Criteria andDtypeIsNull() {
            addCriterion("dtype is null");
            return (Criteria) this;
        }

        public Criteria andDtypeIsNotNull() {
            addCriterion("dtype is not null");
            return (Criteria) this;
        }

        public Criteria andDtypeEqualTo(String value) {
            addCriterion("dtype =", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotEqualTo(String value) {
            addCriterion("dtype <>", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeGreaterThan(String value) {
            addCriterion("dtype >", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeGreaterThanOrEqualTo(String value) {
            addCriterion("dtype >=", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeLessThan(String value) {
            addCriterion("dtype <", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeLessThanOrEqualTo(String value) {
            addCriterion("dtype <=", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeLike(String value) {
            addCriterion("dtype like", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotLike(String value) {
            addCriterion("dtype not like", value, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeIn(List<String> values) {
            addCriterion("dtype in", values, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotIn(List<String> values) {
            addCriterion("dtype not in", values, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeBetween(String value1, String value2) {
            addCriterion("dtype between", value1, value2, "dtype");
            return (Criteria) this;
        }

        public Criteria andDtypeNotBetween(String value1, String value2) {
            addCriterion("dtype not between", value1, value2, "dtype");
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