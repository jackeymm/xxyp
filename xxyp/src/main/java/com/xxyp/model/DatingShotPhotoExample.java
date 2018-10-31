package com.xxyp.model;

import java.util.ArrayList;
import java.util.List;

public class DatingShotPhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatingShotPhotoExample() {
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

        public Criteria andDatingShotPhotoIdIsNull() {
            addCriterion("dating_shot_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdIsNotNull() {
            addCriterion("dating_shot_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdEqualTo(Long value) {
            addCriterion("dating_shot_photo_id =", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdNotEqualTo(Long value) {
            addCriterion("dating_shot_photo_id <>", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdGreaterThan(Long value) {
            addCriterion("dating_shot_photo_id >", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dating_shot_photo_id >=", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdLessThan(Long value) {
            addCriterion("dating_shot_photo_id <", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdLessThanOrEqualTo(Long value) {
            addCriterion("dating_shot_photo_id <=", value, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdIn(List<Long> values) {
            addCriterion("dating_shot_photo_id in", values, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdNotIn(List<Long> values) {
            addCriterion("dating_shot_photo_id not in", values, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdBetween(Long value1, Long value2) {
            addCriterion("dating_shot_photo_id between", value1, value2, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIdNotBetween(Long value1, Long value2) {
            addCriterion("dating_shot_photo_id not between", value1, value2, "datingShotPhotoId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdIsNull() {
            addCriterion("dating_shot_id is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdIsNotNull() {
            addCriterion("dating_shot_id is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdEqualTo(Long value) {
            addCriterion("dating_shot_id =", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdNotEqualTo(Long value) {
            addCriterion("dating_shot_id <>", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdGreaterThan(Long value) {
            addCriterion("dating_shot_id >", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dating_shot_id >=", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdLessThan(Long value) {
            addCriterion("dating_shot_id <", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdLessThanOrEqualTo(Long value) {
            addCriterion("dating_shot_id <=", value, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdIn(List<Long> values) {
            addCriterion("dating_shot_id in", values, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdNotIn(List<Long> values) {
            addCriterion("dating_shot_id not in", values, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdBetween(Long value1, Long value2) {
            addCriterion("dating_shot_id between", value1, value2, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotIdNotBetween(Long value1, Long value2) {
            addCriterion("dating_shot_id not between", value1, value2, "datingShotId");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIsNull() {
            addCriterion("dating_shot_photo is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIsNotNull() {
            addCriterion("dating_shot_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoEqualTo(String value) {
            addCriterion("dating_shot_photo =", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoNotEqualTo(String value) {
            addCriterion("dating_shot_photo <>", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoGreaterThan(String value) {
            addCriterion("dating_shot_photo >", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("dating_shot_photo >=", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoLessThan(String value) {
            addCriterion("dating_shot_photo <", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoLessThanOrEqualTo(String value) {
            addCriterion("dating_shot_photo <=", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoLike(String value) {
            addCriterion("dating_shot_photo like", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoNotLike(String value) {
            addCriterion("dating_shot_photo not like", value, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoIn(List<String> values) {
            addCriterion("dating_shot_photo in", values, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoNotIn(List<String> values) {
            addCriterion("dating_shot_photo not in", values, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoBetween(String value1, String value2) {
            addCriterion("dating_shot_photo between", value1, value2, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotPhotoNotBetween(String value1, String value2) {
            addCriterion("dating_shot_photo not between", value1, value2, "datingShotPhoto");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderIsNull() {
            addCriterion("dating_shot_image_order is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderIsNotNull() {
            addCriterion("dating_shot_image_order is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderEqualTo(Byte value) {
            addCriterion("dating_shot_image_order =", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderNotEqualTo(Byte value) {
            addCriterion("dating_shot_image_order <>", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderGreaterThan(Byte value) {
            addCriterion("dating_shot_image_order >", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("dating_shot_image_order >=", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderLessThan(Byte value) {
            addCriterion("dating_shot_image_order <", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderLessThanOrEqualTo(Byte value) {
            addCriterion("dating_shot_image_order <=", value, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderIn(List<Byte> values) {
            addCriterion("dating_shot_image_order in", values, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderNotIn(List<Byte> values) {
            addCriterion("dating_shot_image_order not in", values, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderBetween(Byte value1, Byte value2) {
            addCriterion("dating_shot_image_order between", value1, value2, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andDatingShotImageOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("dating_shot_image_order not between", value1, value2, "datingShotImageOrder");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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