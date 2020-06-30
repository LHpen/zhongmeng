package com.zhongmeng.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodssExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGprice1IsNull() {
            addCriterion("gprice1 is null");
            return (Criteria) this;
        }

        public Criteria andGprice1IsNotNull() {
            addCriterion("gprice1 is not null");
            return (Criteria) this;
        }

        public Criteria andGprice1EqualTo(BigDecimal value) {
            addCriterion("gprice1 =", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1NotEqualTo(BigDecimal value) {
            addCriterion("gprice1 <>", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1GreaterThan(BigDecimal value) {
            addCriterion("gprice1 >", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice1 >=", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1LessThan(BigDecimal value) {
            addCriterion("gprice1 <", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice1 <=", value, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1In(List<BigDecimal> values) {
            addCriterion("gprice1 in", values, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1NotIn(List<BigDecimal> values) {
            addCriterion("gprice1 not in", values, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice1 between", value1, value2, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice1 not between", value1, value2, "gprice1");
            return (Criteria) this;
        }

        public Criteria andGprice2IsNull() {
            addCriterion("gprice2 is null");
            return (Criteria) this;
        }

        public Criteria andGprice2IsNotNull() {
            addCriterion("gprice2 is not null");
            return (Criteria) this;
        }

        public Criteria andGprice2EqualTo(BigDecimal value) {
            addCriterion("gprice2 =", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2NotEqualTo(BigDecimal value) {
            addCriterion("gprice2 <>", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2GreaterThan(BigDecimal value) {
            addCriterion("gprice2 >", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice2 >=", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2LessThan(BigDecimal value) {
            addCriterion("gprice2 <", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice2 <=", value, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2In(List<BigDecimal> values) {
            addCriterion("gprice2 in", values, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2NotIn(List<BigDecimal> values) {
            addCriterion("gprice2 not in", values, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice2 between", value1, value2, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice2 not between", value1, value2, "gprice2");
            return (Criteria) this;
        }

        public Criteria andGprice3IsNull() {
            addCriterion("gprice3 is null");
            return (Criteria) this;
        }

        public Criteria andGprice3IsNotNull() {
            addCriterion("gprice3 is not null");
            return (Criteria) this;
        }

        public Criteria andGprice3EqualTo(BigDecimal value) {
            addCriterion("gprice3 =", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3NotEqualTo(BigDecimal value) {
            addCriterion("gprice3 <>", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3GreaterThan(BigDecimal value) {
            addCriterion("gprice3 >", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice3 >=", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3LessThan(BigDecimal value) {
            addCriterion("gprice3 <", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice3 <=", value, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3In(List<BigDecimal> values) {
            addCriterion("gprice3 in", values, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3NotIn(List<BigDecimal> values) {
            addCriterion("gprice3 not in", values, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice3 between", value1, value2, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice3 not between", value1, value2, "gprice3");
            return (Criteria) this;
        }

        public Criteria andGprice4IsNull() {
            addCriterion("gprice4 is null");
            return (Criteria) this;
        }

        public Criteria andGprice4IsNotNull() {
            addCriterion("gprice4 is not null");
            return (Criteria) this;
        }

        public Criteria andGprice4EqualTo(BigDecimal value) {
            addCriterion("gprice4 =", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4NotEqualTo(BigDecimal value) {
            addCriterion("gprice4 <>", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4GreaterThan(BigDecimal value) {
            addCriterion("gprice4 >", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice4 >=", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4LessThan(BigDecimal value) {
            addCriterion("gprice4 <", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice4 <=", value, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4In(List<BigDecimal> values) {
            addCriterion("gprice4 in", values, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4NotIn(List<BigDecimal> values) {
            addCriterion("gprice4 not in", values, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice4 between", value1, value2, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGprice4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice4 not between", value1, value2, "gprice4");
            return (Criteria) this;
        }

        public Criteria andGdatilIsNull() {
            addCriterion("gdatil is null");
            return (Criteria) this;
        }

        public Criteria andGdatilIsNotNull() {
            addCriterion("gdatil is not null");
            return (Criteria) this;
        }

        public Criteria andGdatilEqualTo(String value) {
            addCriterion("gdatil =", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilNotEqualTo(String value) {
            addCriterion("gdatil <>", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilGreaterThan(String value) {
            addCriterion("gdatil >", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilGreaterThanOrEqualTo(String value) {
            addCriterion("gdatil >=", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilLessThan(String value) {
            addCriterion("gdatil <", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilLessThanOrEqualTo(String value) {
            addCriterion("gdatil <=", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilLike(String value) {
            addCriterion("gdatil like", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilNotLike(String value) {
            addCriterion("gdatil not like", value, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilIn(List<String> values) {
            addCriterion("gdatil in", values, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilNotIn(List<String> values) {
            addCriterion("gdatil not in", values, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilBetween(String value1, String value2) {
            addCriterion("gdatil between", value1, value2, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGdatilNotBetween(String value1, String value2) {
            addCriterion("gdatil not between", value1, value2, "gdatil");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gtype is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gtype is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(String value) {
            addCriterion("gtype =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(String value) {
            addCriterion("gtype <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(String value) {
            addCriterion("gtype >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(String value) {
            addCriterion("gtype >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(String value) {
            addCriterion("gtype <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(String value) {
            addCriterion("gtype <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLike(String value) {
            addCriterion("gtype like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotLike(String value) {
            addCriterion("gtype not like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<String> values) {
            addCriterion("gtype in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<String> values) {
            addCriterion("gtype not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(String value1, String value2) {
            addCriterion("gtype between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(String value1, String value2) {
            addCriterion("gtype not between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGspecIsNull() {
            addCriterion("gspec is null");
            return (Criteria) this;
        }

        public Criteria andGspecIsNotNull() {
            addCriterion("gspec is not null");
            return (Criteria) this;
        }

        public Criteria andGspecEqualTo(String value) {
            addCriterion("gspec =", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecNotEqualTo(String value) {
            addCriterion("gspec <>", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecGreaterThan(String value) {
            addCriterion("gspec >", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecGreaterThanOrEqualTo(String value) {
            addCriterion("gspec >=", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecLessThan(String value) {
            addCriterion("gspec <", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecLessThanOrEqualTo(String value) {
            addCriterion("gspec <=", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecLike(String value) {
            addCriterion("gspec like", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecNotLike(String value) {
            addCriterion("gspec not like", value, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecIn(List<String> values) {
            addCriterion("gspec in", values, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecNotIn(List<String> values) {
            addCriterion("gspec not in", values, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecBetween(String value1, String value2) {
            addCriterion("gspec between", value1, value2, "gspec");
            return (Criteria) this;
        }

        public Criteria andGspecNotBetween(String value1, String value2) {
            addCriterion("gspec not between", value1, value2, "gspec");
            return (Criteria) this;
        }

        public Criteria andGnumberIsNull() {
            addCriterion("gnumber is null");
            return (Criteria) this;
        }

        public Criteria andGnumberIsNotNull() {
            addCriterion("gnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGnumberEqualTo(Integer value) {
            addCriterion("gnumber =", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotEqualTo(Integer value) {
            addCriterion("gnumber <>", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberGreaterThan(Integer value) {
            addCriterion("gnumber >", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("gnumber >=", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberLessThan(Integer value) {
            addCriterion("gnumber <", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberLessThanOrEqualTo(Integer value) {
            addCriterion("gnumber <=", value, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberIn(List<Integer> values) {
            addCriterion("gnumber in", values, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotIn(List<Integer> values) {
            addCriterion("gnumber not in", values, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberBetween(Integer value1, Integer value2) {
            addCriterion("gnumber between", value1, value2, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("gnumber not between", value1, value2, "gnumber");
            return (Criteria) this;
        }

        public Criteria andGimgIsNull() {
            addCriterion("gimg is null");
            return (Criteria) this;
        }

        public Criteria andGimgIsNotNull() {
            addCriterion("gimg is not null");
            return (Criteria) this;
        }

        public Criteria andGimgEqualTo(String value) {
            addCriterion("gimg =", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotEqualTo(String value) {
            addCriterion("gimg <>", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgGreaterThan(String value) {
            addCriterion("gimg >", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgGreaterThanOrEqualTo(String value) {
            addCriterion("gimg >=", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLessThan(String value) {
            addCriterion("gimg <", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLessThanOrEqualTo(String value) {
            addCriterion("gimg <=", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgLike(String value) {
            addCriterion("gimg like", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotLike(String value) {
            addCriterion("gimg not like", value, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgIn(List<String> values) {
            addCriterion("gimg in", values, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotIn(List<String> values) {
            addCriterion("gimg not in", values, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgBetween(String value1, String value2) {
            addCriterion("gimg between", value1, value2, "gimg");
            return (Criteria) this;
        }

        public Criteria andGimgNotBetween(String value1, String value2) {
            addCriterion("gimg not between", value1, value2, "gimg");
            return (Criteria) this;
        }

        public Criteria andGsnumberIsNull() {
            addCriterion("gsnumber is null");
            return (Criteria) this;
        }

        public Criteria andGsnumberIsNotNull() {
            addCriterion("gsnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGsnumberEqualTo(Integer value) {
            addCriterion("gsnumber =", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberNotEqualTo(Integer value) {
            addCriterion("gsnumber <>", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberGreaterThan(Integer value) {
            addCriterion("gsnumber >", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("gsnumber >=", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberLessThan(Integer value) {
            addCriterion("gsnumber <", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("gsnumber <=", value, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberIn(List<Integer> values) {
            addCriterion("gsnumber in", values, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberNotIn(List<Integer> values) {
            addCriterion("gsnumber not in", values, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberBetween(Integer value1, Integer value2) {
            addCriterion("gsnumber between", value1, value2, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("gsnumber not between", value1, value2, "gsnumber");
            return (Criteria) this;
        }

        public Criteria andGtimeIsNull() {
            addCriterion("gtime is null");
            return (Criteria) this;
        }

        public Criteria andGtimeIsNotNull() {
            addCriterion("gtime is not null");
            return (Criteria) this;
        }

        public Criteria andGtimeEqualTo(Date value) {
            addCriterion("gtime =", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotEqualTo(Date value) {
            addCriterion("gtime <>", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeGreaterThan(Date value) {
            addCriterion("gtime >", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gtime >=", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeLessThan(Date value) {
            addCriterion("gtime <", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeLessThanOrEqualTo(Date value) {
            addCriterion("gtime <=", value, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeIn(List<Date> values) {
            addCriterion("gtime in", values, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotIn(List<Date> values) {
            addCriterion("gtime not in", values, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeBetween(Date value1, Date value2) {
            addCriterion("gtime between", value1, value2, "gtime");
            return (Criteria) this;
        }

        public Criteria andGtimeNotBetween(Date value1, Date value2) {
            addCriterion("gtime not between", value1, value2, "gtime");
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