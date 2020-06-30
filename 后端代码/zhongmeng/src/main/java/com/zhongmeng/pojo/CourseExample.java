package com.zhongmeng.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
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

        public Criteria andCimgIsNull() {
            addCriterion("cimg is null");
            return (Criteria) this;
        }

        public Criteria andCimgIsNotNull() {
            addCriterion("cimg is not null");
            return (Criteria) this;
        }

        public Criteria andCimgEqualTo(String value) {
            addCriterion("cimg =", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotEqualTo(String value) {
            addCriterion("cimg <>", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThan(String value) {
            addCriterion("cimg >", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThanOrEqualTo(String value) {
            addCriterion("cimg >=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThan(String value) {
            addCriterion("cimg <", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThanOrEqualTo(String value) {
            addCriterion("cimg <=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLike(String value) {
            addCriterion("cimg like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotLike(String value) {
            addCriterion("cimg not like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgIn(List<String> values) {
            addCriterion("cimg in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotIn(List<String> values) {
            addCriterion("cimg not in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgBetween(String value1, String value2) {
            addCriterion("cimg between", value1, value2, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotBetween(String value1, String value2) {
            addCriterion("cimg not between", value1, value2, "cimg");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Integer value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Integer value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Integer value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Integer value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Integer> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Integer> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Integer value1, Integer value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andClasshourIsNull() {
            addCriterion("classhour is null");
            return (Criteria) this;
        }

        public Criteria andClasshourIsNotNull() {
            addCriterion("classhour is not null");
            return (Criteria) this;
        }

        public Criteria andClasshourEqualTo(Integer value) {
            addCriterion("classhour =", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourNotEqualTo(Integer value) {
            addCriterion("classhour <>", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourGreaterThan(Integer value) {
            addCriterion("classhour >", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourGreaterThanOrEqualTo(Integer value) {
            addCriterion("classhour >=", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourLessThan(Integer value) {
            addCriterion("classhour <", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourLessThanOrEqualTo(Integer value) {
            addCriterion("classhour <=", value, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourIn(List<Integer> values) {
            addCriterion("classhour in", values, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourNotIn(List<Integer> values) {
            addCriterion("classhour not in", values, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourBetween(Integer value1, Integer value2) {
            addCriterion("classhour between", value1, value2, "classhour");
            return (Criteria) this;
        }

        public Criteria andClasshourNotBetween(Integer value1, Integer value2) {
            addCriterion("classhour not between", value1, value2, "classhour");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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