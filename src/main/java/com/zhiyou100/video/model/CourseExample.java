package com.zhiyou100.video.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_nameEqualTo(String value) {
            addCriterion("course_name =", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThan(String value) {
            addCriterion("course_name >", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThan(String value) {
            addCriterion("course_name <", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameLike(String value) {
            addCriterion("course_name like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotLike(String value) {
            addCriterion("course_name not like", value, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameIn(List<String> values) {
            addCriterion("course_name in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_nameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "course_name");
            return (Criteria) this;
        }

        public Criteria andCourse_descrIsNull() {
            addCriterion("course_descr is null");
            return (Criteria) this;
        }

        public Criteria andCourse_descrIsNotNull() {
            addCriterion("course_descr is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_descrEqualTo(String value) {
            addCriterion("course_descr =", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrNotEqualTo(String value) {
            addCriterion("course_descr <>", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrGreaterThan(String value) {
            addCriterion("course_descr >", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrGreaterThanOrEqualTo(String value) {
            addCriterion("course_descr >=", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrLessThan(String value) {
            addCriterion("course_descr <", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrLessThanOrEqualTo(String value) {
            addCriterion("course_descr <=", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrLike(String value) {
            addCriterion("course_descr like", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrNotLike(String value) {
            addCriterion("course_descr not like", value, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrIn(List<String> values) {
            addCriterion("course_descr in", values, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrNotIn(List<String> values) {
            addCriterion("course_descr not in", values, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrBetween(String value1, String value2) {
            addCriterion("course_descr between", value1, value2, "course_descr");
            return (Criteria) this;
        }

        public Criteria andCourse_descrNotBetween(String value1, String value2) {
            addCriterion("course_descr not between", value1, value2, "course_descr");
            return (Criteria) this;
        }

        public Criteria andInsert_timeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsert_timeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsert_timeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeLessThan(Date value) {
            addCriterion("insert_time <", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insert_time");
            return (Criteria) this;
        }

        public Criteria andInsert_timeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insert_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andSubject_idIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubject_idIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubject_idEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idLessThan(Integer value) {
            addCriterion("subject_id <", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subject_id");
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