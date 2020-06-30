package com.zhongmeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class InstitutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionExample() {
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

        public Criteria andInsidIsNull() {
            addCriterion("insid is null");
            return (Criteria) this;
        }

        public Criteria andInsidIsNotNull() {
            addCriterion("insid is not null");
            return (Criteria) this;
        }

        public Criteria andInsidEqualTo(Integer value) {
            addCriterion("insid =", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotEqualTo(Integer value) {
            addCriterion("insid <>", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidGreaterThan(Integer value) {
            addCriterion("insid >", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("insid >=", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidLessThan(Integer value) {
            addCriterion("insid <", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidLessThanOrEqualTo(Integer value) {
            addCriterion("insid <=", value, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidIn(List<Integer> values) {
            addCriterion("insid in", values, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotIn(List<Integer> values) {
            addCriterion("insid not in", values, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidBetween(Integer value1, Integer value2) {
            addCriterion("insid between", value1, value2, "insid");
            return (Criteria) this;
        }

        public Criteria andInsidNotBetween(Integer value1, Integer value2) {
            addCriterion("insid not between", value1, value2, "insid");
            return (Criteria) this;
        }

        public Criteria andInsnameIsNull() {
            addCriterion("insname is null");
            return (Criteria) this;
        }

        public Criteria andInsnameIsNotNull() {
            addCriterion("insname is not null");
            return (Criteria) this;
        }

        public Criteria andInsnameEqualTo(String value) {
            addCriterion("insname =", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotEqualTo(String value) {
            addCriterion("insname <>", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameGreaterThan(String value) {
            addCriterion("insname >", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameGreaterThanOrEqualTo(String value) {
            addCriterion("insname >=", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLessThan(String value) {
            addCriterion("insname <", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLessThanOrEqualTo(String value) {
            addCriterion("insname <=", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLike(String value) {
            addCriterion("insname like", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotLike(String value) {
            addCriterion("insname not like", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameIn(List<String> values) {
            addCriterion("insname in", values, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotIn(List<String> values) {
            addCriterion("insname not in", values, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameBetween(String value1, String value2) {
            addCriterion("insname between", value1, value2, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotBetween(String value1, String value2) {
            addCriterion("insname not between", value1, value2, "insname");
            return (Criteria) this;
        }

        public Criteria andInsdatilIsNull() {
            addCriterion("insdatil is null");
            return (Criteria) this;
        }

        public Criteria andInsdatilIsNotNull() {
            addCriterion("insdatil is not null");
            return (Criteria) this;
        }

        public Criteria andInsdatilEqualTo(String value) {
            addCriterion("insdatil =", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilNotEqualTo(String value) {
            addCriterion("insdatil <>", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilGreaterThan(String value) {
            addCriterion("insdatil >", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilGreaterThanOrEqualTo(String value) {
            addCriterion("insdatil >=", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilLessThan(String value) {
            addCriterion("insdatil <", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilLessThanOrEqualTo(String value) {
            addCriterion("insdatil <=", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilLike(String value) {
            addCriterion("insdatil like", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilNotLike(String value) {
            addCriterion("insdatil not like", value, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilIn(List<String> values) {
            addCriterion("insdatil in", values, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilNotIn(List<String> values) {
            addCriterion("insdatil not in", values, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilBetween(String value1, String value2) {
            addCriterion("insdatil between", value1, value2, "insdatil");
            return (Criteria) this;
        }

        public Criteria andInsdatilNotBetween(String value1, String value2) {
            addCriterion("insdatil not between", value1, value2, "insdatil");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeIsNull() {
            addCriterion("Weixin2Dcode is null");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeIsNotNull() {
            addCriterion("Weixin2Dcode is not null");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeEqualTo(String value) {
            addCriterion("Weixin2Dcode =", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeNotEqualTo(String value) {
            addCriterion("Weixin2Dcode <>", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeGreaterThan(String value) {
            addCriterion("Weixin2Dcode >", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeGreaterThanOrEqualTo(String value) {
            addCriterion("Weixin2Dcode >=", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeLessThan(String value) {
            addCriterion("Weixin2Dcode <", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeLessThanOrEqualTo(String value) {
            addCriterion("Weixin2Dcode <=", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeLike(String value) {
            addCriterion("Weixin2Dcode like", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeNotLike(String value) {
            addCriterion("Weixin2Dcode not like", value, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeIn(List<String> values) {
            addCriterion("Weixin2Dcode in", values, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeNotIn(List<String> values) {
            addCriterion("Weixin2Dcode not in", values, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeBetween(String value1, String value2) {
            addCriterion("Weixin2Dcode between", value1, value2, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andWeixin2dcodeNotBetween(String value1, String value2) {
            addCriterion("Weixin2Dcode not between", value1, value2, "weixin2dcode");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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