package com.xxyp.model;

import java.util.ArrayList;
import java.util.List;

public class WorksPhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksPhotoExample() {
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

        public Criteria andWorksPhotoIdIsNull() {
            addCriterion("works_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdIsNotNull() {
            addCriterion("works_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdEqualTo(Long value) {
            addCriterion("works_photo_id =", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdNotEqualTo(Long value) {
            addCriterion("works_photo_id <>", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdGreaterThan(Long value) {
            addCriterion("works_photo_id >", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_photo_id >=", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdLessThan(Long value) {
            addCriterion("works_photo_id <", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdLessThanOrEqualTo(Long value) {
            addCriterion("works_photo_id <=", value, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdIn(List<Long> values) {
            addCriterion("works_photo_id in", values, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdNotIn(List<Long> values) {
            addCriterion("works_photo_id not in", values, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdBetween(Long value1, Long value2) {
            addCriterion("works_photo_id between", value1, value2, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIdNotBetween(Long value1, Long value2) {
            addCriterion("works_photo_id not between", value1, value2, "worksPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNull() {
            addCriterion("works_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNotNull() {
            addCriterion("works_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIdEqualTo(Long value) {
            addCriterion("works_id =", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotEqualTo(Long value) {
            addCriterion("works_id <>", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThan(Long value) {
            addCriterion("works_id >", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_id >=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThan(Long value) {
            addCriterion("works_id <", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThanOrEqualTo(Long value) {
            addCriterion("works_id <=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIn(List<Long> values) {
            addCriterion("works_id in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotIn(List<Long> values) {
            addCriterion("works_id not in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdBetween(Long value1, Long value2) {
            addCriterion("works_id between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotBetween(Long value1, Long value2) {
            addCriterion("works_id not between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIsNull() {
            addCriterion("works_photo is null");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIsNotNull() {
            addCriterion("works_photo is not null");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoEqualTo(String value) {
            addCriterion("works_photo =", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoNotEqualTo(String value) {
            addCriterion("works_photo <>", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoGreaterThan(String value) {
            addCriterion("works_photo >", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("works_photo >=", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoLessThan(String value) {
            addCriterion("works_photo <", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoLessThanOrEqualTo(String value) {
            addCriterion("works_photo <=", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoLike(String value) {
            addCriterion("works_photo like", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoNotLike(String value) {
            addCriterion("works_photo not like", value, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoIn(List<String> values) {
            addCriterion("works_photo in", values, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoNotIn(List<String> values) {
            addCriterion("works_photo not in", values, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoBetween(String value1, String value2) {
            addCriterion("works_photo between", value1, value2, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksPhotoNotBetween(String value1, String value2) {
            addCriterion("works_photo not between", value1, value2, "worksPhoto");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderIsNull() {
            addCriterion("works_image_order is null");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderIsNotNull() {
            addCriterion("works_image_order is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderEqualTo(Byte value) {
            addCriterion("works_image_order =", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderNotEqualTo(Byte value) {
            addCriterion("works_image_order <>", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderGreaterThan(Byte value) {
            addCriterion("works_image_order >", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("works_image_order >=", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderLessThan(Byte value) {
            addCriterion("works_image_order <", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderLessThanOrEqualTo(Byte value) {
            addCriterion("works_image_order <=", value, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderIn(List<Byte> values) {
            addCriterion("works_image_order in", values, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderNotIn(List<Byte> values) {
            addCriterion("works_image_order not in", values, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderBetween(Byte value1, Byte value2) {
            addCriterion("works_image_order between", value1, value2, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("works_image_order not between", value1, value2, "worksImageOrder");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountIsNull() {
            addCriterion("works_image_like_count is null");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountIsNotNull() {
            addCriterion("works_image_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountEqualTo(Long value) {
            addCriterion("works_image_like_count =", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountNotEqualTo(Long value) {
            addCriterion("works_image_like_count <>", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountGreaterThan(Long value) {
            addCriterion("works_image_like_count >", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("works_image_like_count >=", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountLessThan(Long value) {
            addCriterion("works_image_like_count <", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("works_image_like_count <=", value, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountIn(List<Long> values) {
            addCriterion("works_image_like_count in", values, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountNotIn(List<Long> values) {
            addCriterion("works_image_like_count not in", values, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountBetween(Long value1, Long value2) {
            addCriterion("works_image_like_count between", value1, value2, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("works_image_like_count not between", value1, value2, "worksImageLikeCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountIsNull() {
            addCriterion("works_image_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountIsNotNull() {
            addCriterion("works_image_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountEqualTo(Long value) {
            addCriterion("works_image_comment_count =", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountNotEqualTo(Long value) {
            addCriterion("works_image_comment_count <>", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountGreaterThan(Long value) {
            addCriterion("works_image_comment_count >", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("works_image_comment_count >=", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountLessThan(Long value) {
            addCriterion("works_image_comment_count <", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("works_image_comment_count <=", value, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountIn(List<Long> values) {
            addCriterion("works_image_comment_count in", values, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountNotIn(List<Long> values) {
            addCriterion("works_image_comment_count not in", values, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountBetween(Long value1, Long value2) {
            addCriterion("works_image_comment_count between", value1, value2, "worksImageCommentCount");
            return (Criteria) this;
        }

        public Criteria andWorksImageCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("works_image_comment_count not between", value1, value2, "worksImageCommentCount");
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