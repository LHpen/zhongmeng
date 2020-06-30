package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeachersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachersExample() {
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

        public Criteria andTloginnameIsNull() {
            addCriterion("tloginname is null");
            return (Criteria) this;
        }

        public Criteria andTloginnameIsNotNull() {
            addCriterion("tloginname is not null");
            return (Criteria) this;
        }

        public Criteria andTloginnameEqualTo(String value) {
            addCriterion("tloginname =", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameNotEqualTo(String value) {
            addCriterion("tloginname <>", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameGreaterThan(String value) {
            addCriterion("tloginname >", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("tloginname >=", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameLessThan(String value) {
            addCriterion("tloginname <", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameLessThanOrEqualTo(String value) {
            addCriterion("tloginname <=", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameLike(String value) {
            addCriterion("tloginname like", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameNotLike(String value) {
            addCriterion("tloginname not like", value, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameIn(List<String> values) {
            addCriterion("tloginname in", values, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameNotIn(List<String> values) {
            addCriterion("tloginname not in", values, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameBetween(String value1, String value2) {
            addCriterion("tloginname between", value1, value2, "tloginname");
            return (Criteria) this;
        }

        public Criteria andTloginnameNotBetween(String value1, String value2) {
            addCriterion("tloginname not between", value1, value2, "tloginname");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTpwIsNull() {
            addCriterion("tpw is null");
            return (Criteria) this;
        }

        public Criteria andTpwIsNotNull() {
            addCriterion("tpw is not null");
            return (Criteria) this;
        }

        public Criteria andTpwEqualTo(String value) {
            addCriterion("tpw =", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwNotEqualTo(String value) {
            addCriterion("tpw <>", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwGreaterThan(String value) {
            addCriterion("tpw >", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwGreaterThanOrEqualTo(String value) {
            addCriterion("tpw >=", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwLessThan(String value) {
            addCriterion("tpw <", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwLessThanOrEqualTo(String value) {
            addCriterion("tpw <=", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwLike(String value) {
            addCriterion("tpw like", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwNotLike(String value) {
            addCriterion("tpw not like", value, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwIn(List<String> values) {
            addCriterion("tpw in", values, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwNotIn(List<String> values) {
            addCriterion("tpw not in", values, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwBetween(String value1, String value2) {
            addCriterion("tpw between", value1, value2, "tpw");
            return (Criteria) this;
        }

        public Criteria andTpwNotBetween(String value1, String value2) {
            addCriterion("tpw not between", value1, value2, "tpw");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNull() {
            addCriterion("ttype is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("ttype is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(Integer value) {
            addCriterion("ttype =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(Integer value) {
            addCriterion("ttype <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(Integer value) {
            addCriterion("ttype >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttype >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(Integer value) {
            addCriterion("ttype <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ttype <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<Integer> values) {
            addCriterion("ttype in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<Integer> values) {
            addCriterion("ttype not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(Integer value1, Integer value2) {
            addCriterion("ttype between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ttype not between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
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
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(String value) {
            addCriterion("tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(String value) {
            addCriterion("tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(String value) {
            addCriterion("tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(String value) {
            addCriterion("tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(String value) {
            addCriterion("tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(String value) {
            addCriterion("tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLike(String value) {
            addCriterion("tsex like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotLike(String value) {
            addCriterion("tsex not like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<String> values) {
            addCriterion("tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<String> values) {
            addCriterion("tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(String value1, String value2) {
            addCriterion("tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(String value1, String value2) {
            addCriterion("tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTimgIsNull() {
            addCriterion("timg is null");
            return (Criteria) this;
        }

        public Criteria andTimgIsNotNull() {
            addCriterion("timg is not null");
            return (Criteria) this;
        }

        public Criteria andTimgEqualTo(String value) {
            addCriterion("timg =", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotEqualTo(String value) {
            addCriterion("timg <>", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThan(String value) {
            addCriterion("timg >", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThanOrEqualTo(String value) {
            addCriterion("timg >=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThan(String value) {
            addCriterion("timg <", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThanOrEqualTo(String value) {
            addCriterion("timg <=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLike(String value) {
            addCriterion("timg like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotLike(String value) {
            addCriterion("timg not like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgIn(List<String> values) {
            addCriterion("timg in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotIn(List<String> values) {
            addCriterion("timg not in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgBetween(String value1, String value2) {
            addCriterion("timg between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotBetween(String value1, String value2) {
            addCriterion("timg not between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andPositionalIsNull() {
            addCriterion("positional is null");
            return (Criteria) this;
        }

        public Criteria andPositionalIsNotNull() {
            addCriterion("positional is not null");
            return (Criteria) this;
        }

        public Criteria andPositionalEqualTo(String value) {
            addCriterion("positional =", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalNotEqualTo(String value) {
            addCriterion("positional <>", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalGreaterThan(String value) {
            addCriterion("positional >", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalGreaterThanOrEqualTo(String value) {
            addCriterion("positional >=", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalLessThan(String value) {
            addCriterion("positional <", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalLessThanOrEqualTo(String value) {
            addCriterion("positional <=", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalLike(String value) {
            addCriterion("positional like", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalNotLike(String value) {
            addCriterion("positional not like", value, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalIn(List<String> values) {
            addCriterion("positional in", values, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalNotIn(List<String> values) {
            addCriterion("positional not in", values, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalBetween(String value1, String value2) {
            addCriterion("positional between", value1, value2, "positional");
            return (Criteria) this;
        }

        public Criteria andPositionalNotBetween(String value1, String value2) {
            addCriterion("positional not between", value1, value2, "positional");
            return (Criteria) this;
        }

        public Criteria andDatilIsNull() {
            addCriterion("datil is null");
            return (Criteria) this;
        }

        public Criteria andDatilIsNotNull() {
            addCriterion("datil is not null");
            return (Criteria) this;
        }

        public Criteria andDatilEqualTo(String value) {
            addCriterion("datil =", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilNotEqualTo(String value) {
            addCriterion("datil <>", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilGreaterThan(String value) {
            addCriterion("datil >", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilGreaterThanOrEqualTo(String value) {
            addCriterion("datil >=", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilLessThan(String value) {
            addCriterion("datil <", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilLessThanOrEqualTo(String value) {
            addCriterion("datil <=", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilLike(String value) {
            addCriterion("datil like", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilNotLike(String value) {
            addCriterion("datil not like", value, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilIn(List<String> values) {
            addCriterion("datil in", values, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilNotIn(List<String> values) {
            addCriterion("datil not in", values, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilBetween(String value1, String value2) {
            addCriterion("datil between", value1, value2, "datil");
            return (Criteria) this;
        }

        public Criteria andDatilNotBetween(String value1, String value2) {
            addCriterion("datil not between", value1, value2, "datil");
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