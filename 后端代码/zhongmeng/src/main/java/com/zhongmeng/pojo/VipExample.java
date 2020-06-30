package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVloginnameIsNull() {
            addCriterion("vloginname is null");
            return (Criteria) this;
        }

        public Criteria andVloginnameIsNotNull() {
            addCriterion("vloginname is not null");
            return (Criteria) this;
        }

        public Criteria andVloginnameEqualTo(String value) {
            addCriterion("vloginname =", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameNotEqualTo(String value) {
            addCriterion("vloginname <>", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameGreaterThan(String value) {
            addCriterion("vloginname >", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("vloginname >=", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameLessThan(String value) {
            addCriterion("vloginname <", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameLessThanOrEqualTo(String value) {
            addCriterion("vloginname <=", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameLike(String value) {
            addCriterion("vloginname like", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameNotLike(String value) {
            addCriterion("vloginname not like", value, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameIn(List<String> values) {
            addCriterion("vloginname in", values, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameNotIn(List<String> values) {
            addCriterion("vloginname not in", values, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameBetween(String value1, String value2) {
            addCriterion("vloginname between", value1, value2, "vloginname");
            return (Criteria) this;
        }

        public Criteria andVloginnameNotBetween(String value1, String value2) {
            addCriterion("vloginname not between", value1, value2, "vloginname");
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

        public Criteria andVpwIsNull() {
            addCriterion("vpw is null");
            return (Criteria) this;
        }

        public Criteria andVpwIsNotNull() {
            addCriterion("vpw is not null");
            return (Criteria) this;
        }

        public Criteria andVpwEqualTo(String value) {
            addCriterion("vpw =", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwNotEqualTo(String value) {
            addCriterion("vpw <>", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwGreaterThan(String value) {
            addCriterion("vpw >", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwGreaterThanOrEqualTo(String value) {
            addCriterion("vpw >=", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwLessThan(String value) {
            addCriterion("vpw <", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwLessThanOrEqualTo(String value) {
            addCriterion("vpw <=", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwLike(String value) {
            addCriterion("vpw like", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwNotLike(String value) {
            addCriterion("vpw not like", value, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwIn(List<String> values) {
            addCriterion("vpw in", values, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwNotIn(List<String> values) {
            addCriterion("vpw not in", values, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwBetween(String value1, String value2) {
            addCriterion("vpw between", value1, value2, "vpw");
            return (Criteria) this;
        }

        public Criteria andVpwNotBetween(String value1, String value2) {
            addCriterion("vpw not between", value1, value2, "vpw");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andViptypeIsNull() {
            addCriterion("viptype is null");
            return (Criteria) this;
        }

        public Criteria andViptypeIsNotNull() {
            addCriterion("viptype is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeEqualTo(String value) {
            addCriterion("viptype =", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotEqualTo(String value) {
            addCriterion("viptype <>", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeGreaterThan(String value) {
            addCriterion("viptype >", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeGreaterThanOrEqualTo(String value) {
            addCriterion("viptype >=", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLessThan(String value) {
            addCriterion("viptype <", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLessThanOrEqualTo(String value) {
            addCriterion("viptype <=", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeLike(String value) {
            addCriterion("viptype like", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotLike(String value) {
            addCriterion("viptype not like", value, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeIn(List<String> values) {
            addCriterion("viptype in", values, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotIn(List<String> values) {
            addCriterion("viptype not in", values, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeBetween(String value1, String value2) {
            addCriterion("viptype between", value1, value2, "viptype");
            return (Criteria) this;
        }

        public Criteria andViptypeNotBetween(String value1, String value2) {
            addCriterion("viptype not between", value1, value2, "viptype");
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

        public Criteria andVsexIsNull() {
            addCriterion("vsex is null");
            return (Criteria) this;
        }

        public Criteria andVsexIsNotNull() {
            addCriterion("vsex is not null");
            return (Criteria) this;
        }

        public Criteria andVsexEqualTo(String value) {
            addCriterion("vsex =", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexNotEqualTo(String value) {
            addCriterion("vsex <>", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexGreaterThan(String value) {
            addCriterion("vsex >", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexGreaterThanOrEqualTo(String value) {
            addCriterion("vsex >=", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexLessThan(String value) {
            addCriterion("vsex <", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexLessThanOrEqualTo(String value) {
            addCriterion("vsex <=", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexLike(String value) {
            addCriterion("vsex like", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexNotLike(String value) {
            addCriterion("vsex not like", value, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexIn(List<String> values) {
            addCriterion("vsex in", values, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexNotIn(List<String> values) {
            addCriterion("vsex not in", values, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexBetween(String value1, String value2) {
            addCriterion("vsex between", value1, value2, "vsex");
            return (Criteria) this;
        }

        public Criteria andVsexNotBetween(String value1, String value2) {
            addCriterion("vsex not between", value1, value2, "vsex");
            return (Criteria) this;
        }

        public Criteria andVaddtimeIsNull() {
            addCriterion("vaddtime is null");
            return (Criteria) this;
        }

        public Criteria andVaddtimeIsNotNull() {
            addCriterion("vaddtime is not null");
            return (Criteria) this;
        }

        public Criteria andVaddtimeEqualTo(Date value) {
            addCriterion("vaddtime =", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeNotEqualTo(Date value) {
            addCriterion("vaddtime <>", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeGreaterThan(Date value) {
            addCriterion("vaddtime >", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vaddtime >=", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeLessThan(Date value) {
            addCriterion("vaddtime <", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("vaddtime <=", value, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeIn(List<Date> values) {
            addCriterion("vaddtime in", values, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeNotIn(List<Date> values) {
            addCriterion("vaddtime not in", values, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeBetween(Date value1, Date value2) {
            addCriterion("vaddtime between", value1, value2, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("vaddtime not between", value1, value2, "vaddtime");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNull() {
            addCriterion("vaddress is null");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNotNull() {
            addCriterion("vaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVaddressEqualTo(String value) {
            addCriterion("vaddress =", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotEqualTo(String value) {
            addCriterion("vaddress <>", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThan(String value) {
            addCriterion("vaddress >", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vaddress >=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThan(String value) {
            addCriterion("vaddress <", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThanOrEqualTo(String value) {
            addCriterion("vaddress <=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLike(String value) {
            addCriterion("vaddress like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotLike(String value) {
            addCriterion("vaddress not like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressIn(List<String> values) {
            addCriterion("vaddress in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotIn(List<String> values) {
            addCriterion("vaddress not in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressBetween(String value1, String value2) {
            addCriterion("vaddress between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotBetween(String value1, String value2) {
            addCriterion("vaddress not between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVstateIsNull() {
            addCriterion("vstate is null");
            return (Criteria) this;
        }

        public Criteria andVstateIsNotNull() {
            addCriterion("vstate is not null");
            return (Criteria) this;
        }

        public Criteria andVstateEqualTo(String value) {
            addCriterion("vstate =", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotEqualTo(String value) {
            addCriterion("vstate <>", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateGreaterThan(String value) {
            addCriterion("vstate >", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateGreaterThanOrEqualTo(String value) {
            addCriterion("vstate >=", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLessThan(String value) {
            addCriterion("vstate <", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLessThanOrEqualTo(String value) {
            addCriterion("vstate <=", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLike(String value) {
            addCriterion("vstate like", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotLike(String value) {
            addCriterion("vstate not like", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateIn(List<String> values) {
            addCriterion("vstate in", values, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotIn(List<String> values) {
            addCriterion("vstate not in", values, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateBetween(String value1, String value2) {
            addCriterion("vstate between", value1, value2, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotBetween(String value1, String value2) {
            addCriterion("vstate not between", value1, value2, "vstate");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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