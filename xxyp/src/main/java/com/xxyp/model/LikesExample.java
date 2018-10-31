package com.xxyp.model;

import java.util.ArrayList;
import java.util.List;

public class LikesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikesExample() {
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

        public Criteria andLikesIdIsNull() {
            addCriterion("likes_id is null");
            return (Criteria) this;
        }

        public Criteria andLikesIdIsNotNull() {
            addCriterion("likes_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikesIdEqualTo(Long value) {
            addCriterion("likes_id =", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotEqualTo(Long value) {
            addCriterion("likes_id <>", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdGreaterThan(Long value) {
            addCriterion("likes_id >", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("likes_id >=", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdLessThan(Long value) {
            addCriterion("likes_id <", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdLessThanOrEqualTo(Long value) {
            addCriterion("likes_id <=", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdIn(List<Long> values) {
            addCriterion("likes_id in", values, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotIn(List<Long> values) {
            addCriterion("likes_id not in", values, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdBetween(Long value1, Long value2) {
            addCriterion("likes_id between", value1, value2, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotBetween(Long value1, Long value2) {
            addCriterion("likes_id not between", value1, value2, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdIsNull() {
            addCriterion("like_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdIsNotNull() {
            addCriterion("like_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdEqualTo(Long value) {
            addCriterion("like_user_id =", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdNotEqualTo(Long value) {
            addCriterion("like_user_id <>", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdGreaterThan(Long value) {
            addCriterion("like_user_id >", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("like_user_id >=", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdLessThan(Long value) {
            addCriterion("like_user_id <", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdLessThanOrEqualTo(Long value) {
            addCriterion("like_user_id <=", value, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdIn(List<Long> values) {
            addCriterion("like_user_id in", values, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdNotIn(List<Long> values) {
            addCriterion("like_user_id not in", values, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdBetween(Long value1, Long value2) {
            addCriterion("like_user_id between", value1, value2, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andLikeUserIdNotBetween(Long value1, Long value2) {
            addCriterion("like_user_id not between", value1, value2, "likeUserId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNull() {
            addCriterion("work_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("work_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Long value) {
            addCriterion("work_id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Long value) {
            addCriterion("work_id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Long value) {
            addCriterion("work_id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Long value) {
            addCriterion("work_id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Long value) {
            addCriterion("work_id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Long> values) {
            addCriterion("work_id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Long> values) {
            addCriterion("work_id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Long value1, Long value2) {
            addCriterion("work_id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Long value1, Long value2) {
            addCriterion("work_id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(Byte value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(Byte value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(Byte value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(Byte value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(Byte value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<Byte> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<Byte> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(Byte value1, Byte value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("work_type not between", value1, value2, "workType");
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