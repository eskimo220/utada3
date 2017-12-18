package com.heroku.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdaMaSetsubishubetsuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SdaMaSetsubishubetsuExample() {
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

        public Criteria andSdaBumoncdIsNull() {
            addCriterion("sda_bumoncd is null");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdIsNotNull() {
            addCriterion("sda_bumoncd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdEqualTo(String value) {
            addCriterion("sda_bumoncd =", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdNotEqualTo(String value) {
            addCriterion("sda_bumoncd <>", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdGreaterThan(String value) {
            addCriterion("sda_bumoncd >", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_bumoncd >=", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdLessThan(String value) {
            addCriterion("sda_bumoncd <", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdLessThanOrEqualTo(String value) {
            addCriterion("sda_bumoncd <=", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdLike(String value) {
            addCriterion("sda_bumoncd like", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdNotLike(String value) {
            addCriterion("sda_bumoncd not like", value, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdIn(List<String> values) {
            addCriterion("sda_bumoncd in", values, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdNotIn(List<String> values) {
            addCriterion("sda_bumoncd not in", values, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdBetween(String value1, String value2) {
            addCriterion("sda_bumoncd between", value1, value2, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaBumoncdNotBetween(String value1, String value2) {
            addCriterion("sda_bumoncd not between", value1, value2, "sdaBumoncd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdIsNull() {
            addCriterion("sda_setsubishubetsucd is null");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdIsNotNull() {
            addCriterion("sda_setsubishubetsucd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdEqualTo(String value) {
            addCriterion("sda_setsubishubetsucd =", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdNotEqualTo(String value) {
            addCriterion("sda_setsubishubetsucd <>", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdGreaterThan(String value) {
            addCriterion("sda_setsubishubetsucd >", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_setsubishubetsucd >=", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdLessThan(String value) {
            addCriterion("sda_setsubishubetsucd <", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdLessThanOrEqualTo(String value) {
            addCriterion("sda_setsubishubetsucd <=", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdLike(String value) {
            addCriterion("sda_setsubishubetsucd like", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdNotLike(String value) {
            addCriterion("sda_setsubishubetsucd not like", value, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdIn(List<String> values) {
            addCriterion("sda_setsubishubetsucd in", values, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdNotIn(List<String> values) {
            addCriterion("sda_setsubishubetsucd not in", values, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdBetween(String value1, String value2) {
            addCriterion("sda_setsubishubetsucd between", value1, value2, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsucdNotBetween(String value1, String value2) {
            addCriterion("sda_setsubishubetsucd not between", value1, value2, "sdaSetsubishubetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmIsNull() {
            addCriterion("sda_setsubishubetsunm is null");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmIsNotNull() {
            addCriterion("sda_setsubishubetsunm is not null");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmEqualTo(String value) {
            addCriterion("sda_setsubishubetsunm =", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmNotEqualTo(String value) {
            addCriterion("sda_setsubishubetsunm <>", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmGreaterThan(String value) {
            addCriterion("sda_setsubishubetsunm >", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmGreaterThanOrEqualTo(String value) {
            addCriterion("sda_setsubishubetsunm >=", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmLessThan(String value) {
            addCriterion("sda_setsubishubetsunm <", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmLessThanOrEqualTo(String value) {
            addCriterion("sda_setsubishubetsunm <=", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmLike(String value) {
            addCriterion("sda_setsubishubetsunm like", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmNotLike(String value) {
            addCriterion("sda_setsubishubetsunm not like", value, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmIn(List<String> values) {
            addCriterion("sda_setsubishubetsunm in", values, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmNotIn(List<String> values) {
            addCriterion("sda_setsubishubetsunm not in", values, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmBetween(String value1, String value2) {
            addCriterion("sda_setsubishubetsunm between", value1, value2, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaSetsubishubetsunmNotBetween(String value1, String value2) {
            addCriterion("sda_setsubishubetsunm not between", value1, value2, "sdaSetsubishubetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoIsNull() {
            addCriterion("sda_displayno is null");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoIsNotNull() {
            addCriterion("sda_displayno is not null");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoEqualTo(Integer value) {
            addCriterion("sda_displayno =", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoNotEqualTo(Integer value) {
            addCriterion("sda_displayno <>", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoGreaterThan(Integer value) {
            addCriterion("sda_displayno >", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sda_displayno >=", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoLessThan(Integer value) {
            addCriterion("sda_displayno <", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoLessThanOrEqualTo(Integer value) {
            addCriterion("sda_displayno <=", value, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoIn(List<Integer> values) {
            addCriterion("sda_displayno in", values, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoNotIn(List<Integer> values) {
            addCriterion("sda_displayno not in", values, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoBetween(Integer value1, Integer value2) {
            addCriterion("sda_displayno between", value1, value2, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaDisplaynoNotBetween(Integer value1, Integer value2) {
            addCriterion("sda_displayno not between", value1, value2, "sdaDisplayno");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofIsNull() {
            addCriterion("sda_mishiyof is null");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofIsNotNull() {
            addCriterion("sda_mishiyof is not null");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofEqualTo(String value) {
            addCriterion("sda_mishiyof =", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofNotEqualTo(String value) {
            addCriterion("sda_mishiyof <>", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofGreaterThan(String value) {
            addCriterion("sda_mishiyof >", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofGreaterThanOrEqualTo(String value) {
            addCriterion("sda_mishiyof >=", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofLessThan(String value) {
            addCriterion("sda_mishiyof <", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofLessThanOrEqualTo(String value) {
            addCriterion("sda_mishiyof <=", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofLike(String value) {
            addCriterion("sda_mishiyof like", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofNotLike(String value) {
            addCriterion("sda_mishiyof not like", value, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofIn(List<String> values) {
            addCriterion("sda_mishiyof in", values, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofNotIn(List<String> values) {
            addCriterion("sda_mishiyof not in", values, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofBetween(String value1, String value2) {
            addCriterion("sda_mishiyof between", value1, value2, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMishiyofNotBetween(String value1, String value2) {
            addCriterion("sda_mishiyof not between", value1, value2, "sdaMishiyof");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridIsNull() {
            addCriterion("sda_makeuserid is null");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridIsNotNull() {
            addCriterion("sda_makeuserid is not null");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridEqualTo(String value) {
            addCriterion("sda_makeuserid =", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridNotEqualTo(String value) {
            addCriterion("sda_makeuserid <>", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridGreaterThan(String value) {
            addCriterion("sda_makeuserid >", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridGreaterThanOrEqualTo(String value) {
            addCriterion("sda_makeuserid >=", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridLessThan(String value) {
            addCriterion("sda_makeuserid <", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridLessThanOrEqualTo(String value) {
            addCriterion("sda_makeuserid <=", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridLike(String value) {
            addCriterion("sda_makeuserid like", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridNotLike(String value) {
            addCriterion("sda_makeuserid not like", value, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridIn(List<String> values) {
            addCriterion("sda_makeuserid in", values, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridNotIn(List<String> values) {
            addCriterion("sda_makeuserid not in", values, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridBetween(String value1, String value2) {
            addCriterion("sda_makeuserid between", value1, value2, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMakeuseridNotBetween(String value1, String value2) {
            addCriterion("sda_makeuserid not between", value1, value2, "sdaMakeuserid");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeIsNull() {
            addCriterion("sda_maketime is null");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeIsNotNull() {
            addCriterion("sda_maketime is not null");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeEqualTo(Date value) {
            addCriterion("sda_maketime =", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeNotEqualTo(Date value) {
            addCriterion("sda_maketime <>", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeGreaterThan(Date value) {
            addCriterion("sda_maketime >", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sda_maketime >=", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeLessThan(Date value) {
            addCriterion("sda_maketime <", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeLessThanOrEqualTo(Date value) {
            addCriterion("sda_maketime <=", value, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeIn(List<Date> values) {
            addCriterion("sda_maketime in", values, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeNotIn(List<Date> values) {
            addCriterion("sda_maketime not in", values, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeBetween(Date value1, Date value2) {
            addCriterion("sda_maketime between", value1, value2, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaMaketimeNotBetween(Date value1, Date value2) {
            addCriterion("sda_maketime not between", value1, value2, "sdaMaketime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridIsNull() {
            addCriterion("sda_updateuserid is null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridIsNotNull() {
            addCriterion("sda_updateuserid is not null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridEqualTo(String value) {
            addCriterion("sda_updateuserid =", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridNotEqualTo(String value) {
            addCriterion("sda_updateuserid <>", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridGreaterThan(String value) {
            addCriterion("sda_updateuserid >", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("sda_updateuserid >=", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridLessThan(String value) {
            addCriterion("sda_updateuserid <", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("sda_updateuserid <=", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridLike(String value) {
            addCriterion("sda_updateuserid like", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridNotLike(String value) {
            addCriterion("sda_updateuserid not like", value, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridIn(List<String> values) {
            addCriterion("sda_updateuserid in", values, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridNotIn(List<String> values) {
            addCriterion("sda_updateuserid not in", values, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridBetween(String value1, String value2) {
            addCriterion("sda_updateuserid between", value1, value2, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("sda_updateuserid not between", value1, value2, "sdaUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeIsNull() {
            addCriterion("sda_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeIsNotNull() {
            addCriterion("sda_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeEqualTo(Date value) {
            addCriterion("sda_updatetime =", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeNotEqualTo(Date value) {
            addCriterion("sda_updatetime <>", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeGreaterThan(Date value) {
            addCriterion("sda_updatetime >", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sda_updatetime >=", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeLessThan(Date value) {
            addCriterion("sda_updatetime <", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sda_updatetime <=", value, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeIn(List<Date> values) {
            addCriterion("sda_updatetime in", values, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeNotIn(List<Date> values) {
            addCriterion("sda_updatetime not in", values, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("sda_updatetime between", value1, value2, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sda_updatetime not between", value1, value2, "sdaUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientIsNull() {
            addCriterion("sda_updateclient is null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientIsNotNull() {
            addCriterion("sda_updateclient is not null");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientEqualTo(String value) {
            addCriterion("sda_updateclient =", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientNotEqualTo(String value) {
            addCriterion("sda_updateclient <>", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientGreaterThan(String value) {
            addCriterion("sda_updateclient >", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientGreaterThanOrEqualTo(String value) {
            addCriterion("sda_updateclient >=", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientLessThan(String value) {
            addCriterion("sda_updateclient <", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientLessThanOrEqualTo(String value) {
            addCriterion("sda_updateclient <=", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientLike(String value) {
            addCriterion("sda_updateclient like", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientNotLike(String value) {
            addCriterion("sda_updateclient not like", value, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientIn(List<String> values) {
            addCriterion("sda_updateclient in", values, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientNotIn(List<String> values) {
            addCriterion("sda_updateclient not in", values, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientBetween(String value1, String value2) {
            addCriterion("sda_updateclient between", value1, value2, "sdaUpdateclient");
            return (Criteria) this;
        }

        public Criteria andSdaUpdateclientNotBetween(String value1, String value2) {
            addCriterion("sda_updateclient not between", value1, value2, "sdaUpdateclient");
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