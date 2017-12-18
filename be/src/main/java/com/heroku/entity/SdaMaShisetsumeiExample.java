package com.heroku.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdaMaShisetsumeiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SdaMaShisetsumeiExample() {
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

        public Criteria andSdaSenmeicdIsNull() {
            addCriterion("sda_senmeicd is null");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdIsNotNull() {
            addCriterion("sda_senmeicd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdEqualTo(String value) {
            addCriterion("sda_senmeicd =", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdNotEqualTo(String value) {
            addCriterion("sda_senmeicd <>", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdGreaterThan(String value) {
            addCriterion("sda_senmeicd >", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_senmeicd >=", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdLessThan(String value) {
            addCriterion("sda_senmeicd <", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdLessThanOrEqualTo(String value) {
            addCriterion("sda_senmeicd <=", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdLike(String value) {
            addCriterion("sda_senmeicd like", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdNotLike(String value) {
            addCriterion("sda_senmeicd not like", value, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdIn(List<String> values) {
            addCriterion("sda_senmeicd in", values, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdNotIn(List<String> values) {
            addCriterion("sda_senmeicd not in", values, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdBetween(String value1, String value2) {
            addCriterion("sda_senmeicd between", value1, value2, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSenmeicdNotBetween(String value1, String value2) {
            addCriterion("sda_senmeicd not between", value1, value2, "sdaSenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdIsNull() {
            addCriterion("sda_shisetsucd is null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdIsNotNull() {
            addCriterion("sda_shisetsucd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdEqualTo(String value) {
            addCriterion("sda_shisetsucd =", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdNotEqualTo(String value) {
            addCriterion("sda_shisetsucd <>", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdGreaterThan(String value) {
            addCriterion("sda_shisetsucd >", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_shisetsucd >=", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdLessThan(String value) {
            addCriterion("sda_shisetsucd <", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdLessThanOrEqualTo(String value) {
            addCriterion("sda_shisetsucd <=", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdLike(String value) {
            addCriterion("sda_shisetsucd like", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdNotLike(String value) {
            addCriterion("sda_shisetsucd not like", value, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdIn(List<String> values) {
            addCriterion("sda_shisetsucd in", values, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdNotIn(List<String> values) {
            addCriterion("sda_shisetsucd not in", values, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdBetween(String value1, String value2) {
            addCriterion("sda_shisetsucd between", value1, value2, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsucdNotBetween(String value1, String value2) {
            addCriterion("sda_shisetsucd not between", value1, value2, "sdaShisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmIsNull() {
            addCriterion("sda_shisetsunm is null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmIsNotNull() {
            addCriterion("sda_shisetsunm is not null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmEqualTo(String value) {
            addCriterion("sda_shisetsunm =", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmNotEqualTo(String value) {
            addCriterion("sda_shisetsunm <>", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmGreaterThan(String value) {
            addCriterion("sda_shisetsunm >", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmGreaterThanOrEqualTo(String value) {
            addCriterion("sda_shisetsunm >=", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmLessThan(String value) {
            addCriterion("sda_shisetsunm <", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmLessThanOrEqualTo(String value) {
            addCriterion("sda_shisetsunm <=", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmLike(String value) {
            addCriterion("sda_shisetsunm like", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmNotLike(String value) {
            addCriterion("sda_shisetsunm not like", value, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmIn(List<String> values) {
            addCriterion("sda_shisetsunm in", values, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmNotIn(List<String> values) {
            addCriterion("sda_shisetsunm not in", values, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmBetween(String value1, String value2) {
            addCriterion("sda_shisetsunm between", value1, value2, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunmNotBetween(String value1, String value2) {
            addCriterion("sda_shisetsunm not between", value1, value2, "sdaShisetsunm");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoIsNull() {
            addCriterion("sda_shisetsuno is null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoIsNotNull() {
            addCriterion("sda_shisetsuno is not null");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoEqualTo(Integer value) {
            addCriterion("sda_shisetsuno =", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoNotEqualTo(Integer value) {
            addCriterion("sda_shisetsuno <>", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoGreaterThan(Integer value) {
            addCriterion("sda_shisetsuno >", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sda_shisetsuno >=", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoLessThan(Integer value) {
            addCriterion("sda_shisetsuno <", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoLessThanOrEqualTo(Integer value) {
            addCriterion("sda_shisetsuno <=", value, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoIn(List<Integer> values) {
            addCriterion("sda_shisetsuno in", values, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoNotIn(List<Integer> values) {
            addCriterion("sda_shisetsuno not in", values, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoBetween(Integer value1, Integer value2) {
            addCriterion("sda_shisetsuno between", value1, value2, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaShisetsunoNotBetween(Integer value1, Integer value2) {
            addCriterion("sda_shisetsuno not between", value1, value2, "sdaShisetsuno");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdIsNull() {
            addCriterion("sda_searchsenmeicd is null");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdIsNotNull() {
            addCriterion("sda_searchsenmeicd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdEqualTo(String value) {
            addCriterion("sda_searchsenmeicd =", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdNotEqualTo(String value) {
            addCriterion("sda_searchsenmeicd <>", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdGreaterThan(String value) {
            addCriterion("sda_searchsenmeicd >", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_searchsenmeicd >=", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdLessThan(String value) {
            addCriterion("sda_searchsenmeicd <", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdLessThanOrEqualTo(String value) {
            addCriterion("sda_searchsenmeicd <=", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdLike(String value) {
            addCriterion("sda_searchsenmeicd like", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdNotLike(String value) {
            addCriterion("sda_searchsenmeicd not like", value, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdIn(List<String> values) {
            addCriterion("sda_searchsenmeicd in", values, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdNotIn(List<String> values) {
            addCriterion("sda_searchsenmeicd not in", values, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdBetween(String value1, String value2) {
            addCriterion("sda_searchsenmeicd between", value1, value2, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchsenmeicdNotBetween(String value1, String value2) {
            addCriterion("sda_searchsenmeicd not between", value1, value2, "sdaSearchsenmeicd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdIsNull() {
            addCriterion("sda_searchshisetsucd is null");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdIsNotNull() {
            addCriterion("sda_searchshisetsucd is not null");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdEqualTo(String value) {
            addCriterion("sda_searchshisetsucd =", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdNotEqualTo(String value) {
            addCriterion("sda_searchshisetsucd <>", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdGreaterThan(String value) {
            addCriterion("sda_searchshisetsucd >", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdGreaterThanOrEqualTo(String value) {
            addCriterion("sda_searchshisetsucd >=", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdLessThan(String value) {
            addCriterion("sda_searchshisetsucd <", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdLessThanOrEqualTo(String value) {
            addCriterion("sda_searchshisetsucd <=", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdLike(String value) {
            addCriterion("sda_searchshisetsucd like", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdNotLike(String value) {
            addCriterion("sda_searchshisetsucd not like", value, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdIn(List<String> values) {
            addCriterion("sda_searchshisetsucd in", values, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdNotIn(List<String> values) {
            addCriterion("sda_searchshisetsucd not in", values, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdBetween(String value1, String value2) {
            addCriterion("sda_searchshisetsucd between", value1, value2, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaSearchshisetsucdNotBetween(String value1, String value2) {
            addCriterion("sda_searchshisetsucd not between", value1, value2, "sdaSearchshisetsucd");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfIsNull() {
            addCriterion("sda_tasenf is null");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfIsNotNull() {
            addCriterion("sda_tasenf is not null");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfEqualTo(String value) {
            addCriterion("sda_tasenf =", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfNotEqualTo(String value) {
            addCriterion("sda_tasenf <>", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfGreaterThan(String value) {
            addCriterion("sda_tasenf >", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfGreaterThanOrEqualTo(String value) {
            addCriterion("sda_tasenf >=", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfLessThan(String value) {
            addCriterion("sda_tasenf <", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfLessThanOrEqualTo(String value) {
            addCriterion("sda_tasenf <=", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfLike(String value) {
            addCriterion("sda_tasenf like", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfNotLike(String value) {
            addCriterion("sda_tasenf not like", value, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfIn(List<String> values) {
            addCriterion("sda_tasenf in", values, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfNotIn(List<String> values) {
            addCriterion("sda_tasenf not in", values, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfBetween(String value1, String value2) {
            addCriterion("sda_tasenf between", value1, value2, "sdaTasenf");
            return (Criteria) this;
        }

        public Criteria andSdaTasenfNotBetween(String value1, String value2) {
            addCriterion("sda_tasenf not between", value1, value2, "sdaTasenf");
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