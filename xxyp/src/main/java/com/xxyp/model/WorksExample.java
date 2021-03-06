package com.xxyp.model;

import java.util.ArrayList;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNull() {
            addCriterion("user_image is null");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNotNull() {
            addCriterion("user_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserImageEqualTo(String value) {
            addCriterion("user_image =", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotEqualTo(String value) {
            addCriterion("user_image <>", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThan(String value) {
            addCriterion("user_image >", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_image >=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThan(String value) {
            addCriterion("user_image <", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThanOrEqualTo(String value) {
            addCriterion("user_image <=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLike(String value) {
            addCriterion("user_image like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotLike(String value) {
            addCriterion("user_image not like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageIn(List<String> values) {
            addCriterion("user_image in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotIn(List<String> values) {
            addCriterion("user_image not in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageBetween(String value1, String value2) {
            addCriterion("user_image between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotBetween(String value1, String value2) {
            addCriterion("user_image not between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andWorksAddressIsNull() {
            addCriterion("works_address is null");
            return (Criteria) this;
        }

        public Criteria andWorksAddressIsNotNull() {
            addCriterion("works_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorksAddressEqualTo(String value) {
            addCriterion("works_address =", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressNotEqualTo(String value) {
            addCriterion("works_address <>", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressGreaterThan(String value) {
            addCriterion("works_address >", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressGreaterThanOrEqualTo(String value) {
            addCriterion("works_address >=", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressLessThan(String value) {
            addCriterion("works_address <", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressLessThanOrEqualTo(String value) {
            addCriterion("works_address <=", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressLike(String value) {
            addCriterion("works_address like", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressNotLike(String value) {
            addCriterion("works_address not like", value, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressIn(List<String> values) {
            addCriterion("works_address in", values, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressNotIn(List<String> values) {
            addCriterion("works_address not in", values, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressBetween(String value1, String value2) {
            addCriterion("works_address between", value1, value2, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andWorksAddressNotBetween(String value1, String value2) {
            addCriterion("works_address not between", value1, value2, "worksAddress");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Long value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Long value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Long value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Long value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Long value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Long> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Long> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Long value1, Long value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Long value1, Long value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
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

        public Criteria andStatusIn(List<Integer> values) {
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

        public Criteria andWorksTitleIsNull() {
            addCriterion("works_title is null");
            return (Criteria) this;
        }

        public Criteria andWorksTitleIsNotNull() {
            addCriterion("works_title is not null");
            return (Criteria) this;
        }

        public Criteria andWorksTitleEqualTo(String value) {
            addCriterion("works_title =", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotEqualTo(String value) {
            addCriterion("works_title <>", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleGreaterThan(String value) {
            addCriterion("works_title >", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleGreaterThanOrEqualTo(String value) {
            addCriterion("works_title >=", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLessThan(String value) {
            addCriterion("works_title <", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLessThanOrEqualTo(String value) {
            addCriterion("works_title <=", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLike(String value) {
            addCriterion("works_title like", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotLike(String value) {
            addCriterion("works_title not like", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleIn(List<String> values) {
            addCriterion("works_title in", values, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotIn(List<String> values) {
            addCriterion("works_title not in", values, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleBetween(String value1, String value2) {
            addCriterion("works_title between", value1, value2, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotBetween(String value1, String value2) {
            addCriterion("works_title not between", value1, value2, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionIsNull() {
            addCriterion("works_introduction is null");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionIsNotNull() {
            addCriterion("works_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionEqualTo(String value) {
            addCriterion("works_introduction =", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionNotEqualTo(String value) {
            addCriterion("works_introduction <>", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionGreaterThan(String value) {
            addCriterion("works_introduction >", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("works_introduction >=", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionLessThan(String value) {
            addCriterion("works_introduction <", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionLessThanOrEqualTo(String value) {
            addCriterion("works_introduction <=", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionLike(String value) {
            addCriterion("works_introduction like", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionNotLike(String value) {
            addCriterion("works_introduction not like", value, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionIn(List<String> values) {
            addCriterion("works_introduction in", values, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionNotIn(List<String> values) {
            addCriterion("works_introduction not in", values, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionBetween(String value1, String value2) {
            addCriterion("works_introduction between", value1, value2, "worksIntroduction");
            return (Criteria) this;
        }

        public Criteria andWorksIntroductionNotBetween(String value1, String value2) {
            addCriterion("works_introduction not between", value1, value2, "worksIntroduction");
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