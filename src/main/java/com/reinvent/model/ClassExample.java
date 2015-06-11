package com.reinvent.model;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public ClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andClsIdIsNull() {
            addCriterion("cls_id is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("cls_id is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(Integer value) {
            addCriterion("cls_id =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(Integer value) {
            addCriterion("cls_id <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(Integer value) {
            addCriterion("cls_id >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cls_id >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(Integer value) {
            addCriterion("cls_id <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cls_id <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<Integer> values) {
            addCriterion("cls_id in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<Integer> values) {
            addCriterion("cls_id not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(Integer value1, Integer value2) {
            addCriterion("cls_id between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cls_id not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsShtDescIsNull() {
            addCriterion("cls_sht_desc is null");
            return (Criteria) this;
        }

        public Criteria andClsShtDescIsNotNull() {
            addCriterion("cls_sht_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClsShtDescEqualTo(String value) {
            addCriterion("cls_sht_desc =", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescNotEqualTo(String value) {
            addCriterion("cls_sht_desc <>", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescGreaterThan(String value) {
            addCriterion("cls_sht_desc >", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescGreaterThanOrEqualTo(String value) {
            addCriterion("cls_sht_desc >=", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescLessThan(String value) {
            addCriterion("cls_sht_desc <", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescLessThanOrEqualTo(String value) {
            addCriterion("cls_sht_desc <=", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescLike(String value) {
            addCriterion("cls_sht_desc like", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescNotLike(String value) {
            addCriterion("cls_sht_desc not like", value, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescIn(List<String> values) {
            addCriterion("cls_sht_desc in", values, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescNotIn(List<String> values) {
            addCriterion("cls_sht_desc not in", values, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescBetween(String value1, String value2) {
            addCriterion("cls_sht_desc between", value1, value2, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsShtDescNotBetween(String value1, String value2) {
            addCriterion("cls_sht_desc not between", value1, value2, "clsShtDesc");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionIsNull() {
            addCriterion("cls_description is null");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionIsNotNull() {
            addCriterion("cls_description is not null");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionEqualTo(String value) {
            addCriterion("cls_description =", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionNotEqualTo(String value) {
            addCriterion("cls_description <>", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionGreaterThan(String value) {
            addCriterion("cls_description >", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cls_description >=", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionLessThan(String value) {
            addCriterion("cls_description <", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("cls_description <=", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionLike(String value) {
            addCriterion("cls_description like", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionNotLike(String value) {
            addCriterion("cls_description not like", value, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionIn(List<String> values) {
            addCriterion("cls_description in", values, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionNotIn(List<String> values) {
            addCriterion("cls_description not in", values, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionBetween(String value1, String value2) {
            addCriterion("cls_description between", value1, value2, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsDescriptionNotBetween(String value1, String value2) {
            addCriterion("cls_description not between", value1, value2, "clsDescription");
            return (Criteria) this;
        }

        public Criteria andClsColorIsNull() {
            addCriterion("cls_color is null");
            return (Criteria) this;
        }

        public Criteria andClsColorIsNotNull() {
            addCriterion("cls_color is not null");
            return (Criteria) this;
        }

        public Criteria andClsColorEqualTo(String value) {
            addCriterion("cls_color =", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorNotEqualTo(String value) {
            addCriterion("cls_color <>", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorGreaterThan(String value) {
            addCriterion("cls_color >", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorGreaterThanOrEqualTo(String value) {
            addCriterion("cls_color >=", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorLessThan(String value) {
            addCriterion("cls_color <", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorLessThanOrEqualTo(String value) {
            addCriterion("cls_color <=", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorLike(String value) {
            addCriterion("cls_color like", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorNotLike(String value) {
            addCriterion("cls_color not like", value, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorIn(List<String> values) {
            addCriterion("cls_color in", values, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorNotIn(List<String> values) {
            addCriterion("cls_color not in", values, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorBetween(String value1, String value2) {
            addCriterion("cls_color between", value1, value2, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsColorNotBetween(String value1, String value2) {
            addCriterion("cls_color not between", value1, value2, "clsColor");
            return (Criteria) this;
        }

        public Criteria andClsImageIsNull() {
            addCriterion("cls_image is null");
            return (Criteria) this;
        }

        public Criteria andClsImageIsNotNull() {
            addCriterion("cls_image is not null");
            return (Criteria) this;
        }

        public Criteria andClsImageEqualTo(String value) {
            addCriterion("cls_image =", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageNotEqualTo(String value) {
            addCriterion("cls_image <>", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageGreaterThan(String value) {
            addCriterion("cls_image >", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageGreaterThanOrEqualTo(String value) {
            addCriterion("cls_image >=", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageLessThan(String value) {
            addCriterion("cls_image <", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageLessThanOrEqualTo(String value) {
            addCriterion("cls_image <=", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageLike(String value) {
            addCriterion("cls_image like", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageNotLike(String value) {
            addCriterion("cls_image not like", value, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageIn(List<String> values) {
            addCriterion("cls_image in", values, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageNotIn(List<String> values) {
            addCriterion("cls_image not in", values, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageBetween(String value1, String value2) {
            addCriterion("cls_image between", value1, value2, "clsImage");
            return (Criteria) this;
        }

        public Criteria andClsImageNotBetween(String value1, String value2) {
            addCriterion("cls_image not between", value1, value2, "clsImage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tt_classes
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 12 00:25:44 EAT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tt_classes
     *
     * @mbggenerated Fri Jun 12 00:25:44 EAT 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}