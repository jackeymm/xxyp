package com.xxyp.model;

import java.util.ArrayList;
import java.util.List;

public class DatingShotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatingShotExample() {
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
        public Criteria andDatingUserIdEqualTo(Long value) {
            addCriterion("dating_user_id =", value, "datingUserId");
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

        public Criteria andDatingShotAddressIsNull() {
            addCriterion("dating_shot_address is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressIsNotNull() {
            addCriterion("dating_shot_address is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressEqualTo(String value) {
            addCriterion("dating_shot_address =", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressNotEqualTo(String value) {
            addCriterion("dating_shot_address <>", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressGreaterThan(String value) {
            addCriterion("dating_shot_address >", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dating_shot_address >=", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressLessThan(String value) {
            addCriterion("dating_shot_address <", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressLessThanOrEqualTo(String value) {
            addCriterion("dating_shot_address <=", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressLike(String value) {
            addCriterion("dating_shot_address like", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressNotLike(String value) {
            addCriterion("dating_shot_address not like", value, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressIn(List<String> values) {
            addCriterion("dating_shot_address in", values, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressNotIn(List<String> values) {
            addCriterion("dating_shot_address not in", values, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressBetween(String value1, String value2) {
            addCriterion("dating_shot_address between", value1, value2, "datingShotAddress");
            return (Criteria) this;
        }

        public Criteria andDatingShotAddressNotBetween(String value1, String value2) {
            addCriterion("dating_shot_address not between", value1, value2, "datingShotAddress");
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

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("payment_method like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("payment_method not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andDatingShotIntroductionIsNull() {
            addCriterion("dating_shot_introduction is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionIsNotNull() {
            addCriterion("dating_shot_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionEqualTo(String value) {
            addCriterion("dating_shot_introduction =", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionNotEqualTo(String value) {
            addCriterion("dating_shot_introduction <>", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionGreaterThan(String value) {
            addCriterion("dating_shot_introduction >", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("dating_shot_introduction >=", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionLessThan(String value) {
            addCriterion("dating_shot_introduction <", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionLessThanOrEqualTo(String value) {
            addCriterion("dating_shot_introduction <=", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionLike(String value) {
            addCriterion("dating_shot_introduction like", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionNotLike(String value) {
            addCriterion("dating_shot_introduction not like", value, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionIn(List<String> values) {
            addCriterion("dating_shot_introduction in", values, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionNotIn(List<String> values) {
            addCriterion("dating_shot_introduction not in", values, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionBetween(String value1, String value2) {
            addCriterion("dating_shot_introduction between", value1, value2, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotIntroductionNotBetween(String value1, String value2) {
            addCriterion("dating_shot_introduction not between", value1, value2, "datingShotIntroduction");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesIsNull() {
            addCriterion("dating_shot_images is null");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesIsNotNull() {
            addCriterion("dating_shot_images is not null");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesEqualTo(String value) {
            addCriterion("dating_shot_images =", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesNotEqualTo(String value) {
            addCriterion("dating_shot_images <>", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesGreaterThan(String value) {
            addCriterion("dating_shot_images >", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesGreaterThanOrEqualTo(String value) {
            addCriterion("dating_shot_images >=", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesLessThan(String value) {
            addCriterion("dating_shot_images <", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesLessThanOrEqualTo(String value) {
            addCriterion("dating_shot_images <=", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesLike(String value) {
            addCriterion("dating_shot_images like", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesNotLike(String value) {
            addCriterion("dating_shot_images not like", value, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesIn(List<String> values) {
            addCriterion("dating_shot_images in", values, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesNotIn(List<String> values) {
            addCriterion("dating_shot_images not in", values, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesBetween(String value1, String value2) {
            addCriterion("dating_shot_images between", value1, value2, "datingShotImages");
            return (Criteria) this;
        }

        public Criteria andDatingShotImagesNotBetween(String value1, String value2) {
            addCriterion("dating_shot_images not between", value1, value2, "datingShotImages");
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