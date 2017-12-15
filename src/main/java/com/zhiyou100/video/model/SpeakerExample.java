package com.zhiyou100.video.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpeakerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpeakerExample() {
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

        public Criteria andSpeaker_nameIsNull() {
            addCriterion("speaker_name is null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameIsNotNull() {
            addCriterion("speaker_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameEqualTo(String value) {
            addCriterion("speaker_name =", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameNotEqualTo(String value) {
            addCriterion("speaker_name <>", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameGreaterThan(String value) {
            addCriterion("speaker_name >", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_name >=", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameLessThan(String value) {
            addCriterion("speaker_name <", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameLessThanOrEqualTo(String value) {
            addCriterion("speaker_name <=", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameLike(String value) {
            addCriterion("speaker_name like", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameNotLike(String value) {
            addCriterion("speaker_name not like", value, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameIn(List<String> values) {
            addCriterion("speaker_name in", values, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameNotIn(List<String> values) {
            addCriterion("speaker_name not in", values, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameBetween(String value1, String value2) {
            addCriterion("speaker_name between", value1, value2, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_nameNotBetween(String value1, String value2) {
            addCriterion("speaker_name not between", value1, value2, "speaker_name");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobIsNull() {
            addCriterion("speaker_job is null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobIsNotNull() {
            addCriterion("speaker_job is not null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobEqualTo(String value) {
            addCriterion("speaker_job =", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobNotEqualTo(String value) {
            addCriterion("speaker_job <>", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobGreaterThan(String value) {
            addCriterion("speaker_job >", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_job >=", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobLessThan(String value) {
            addCriterion("speaker_job <", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobLessThanOrEqualTo(String value) {
            addCriterion("speaker_job <=", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobLike(String value) {
            addCriterion("speaker_job like", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobNotLike(String value) {
            addCriterion("speaker_job not like", value, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobIn(List<String> values) {
            addCriterion("speaker_job in", values, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobNotIn(List<String> values) {
            addCriterion("speaker_job not in", values, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobBetween(String value1, String value2) {
            addCriterion("speaker_job between", value1, value2, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_jobNotBetween(String value1, String value2) {
            addCriterion("speaker_job not between", value1, value2, "speaker_job");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlIsNull() {
            addCriterion("speaker_head_url is null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlIsNotNull() {
            addCriterion("speaker_head_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlEqualTo(String value) {
            addCriterion("speaker_head_url =", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlNotEqualTo(String value) {
            addCriterion("speaker_head_url <>", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlGreaterThan(String value) {
            addCriterion("speaker_head_url >", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_head_url >=", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlLessThan(String value) {
            addCriterion("speaker_head_url <", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlLessThanOrEqualTo(String value) {
            addCriterion("speaker_head_url <=", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlLike(String value) {
            addCriterion("speaker_head_url like", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlNotLike(String value) {
            addCriterion("speaker_head_url not like", value, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlIn(List<String> values) {
            addCriterion("speaker_head_url in", values, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlNotIn(List<String> values) {
            addCriterion("speaker_head_url not in", values, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlBetween(String value1, String value2) {
            addCriterion("speaker_head_url between", value1, value2, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_head_urlNotBetween(String value1, String value2) {
            addCriterion("speaker_head_url not between", value1, value2, "speaker_head_url");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrIsNull() {
            addCriterion("speaker_descr is null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrIsNotNull() {
            addCriterion("speaker_descr is not null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrEqualTo(String value) {
            addCriterion("speaker_descr =", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrNotEqualTo(String value) {
            addCriterion("speaker_descr <>", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrGreaterThan(String value) {
            addCriterion("speaker_descr >", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrGreaterThanOrEqualTo(String value) {
            addCriterion("speaker_descr >=", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrLessThan(String value) {
            addCriterion("speaker_descr <", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrLessThanOrEqualTo(String value) {
            addCriterion("speaker_descr <=", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrLike(String value) {
            addCriterion("speaker_descr like", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrNotLike(String value) {
            addCriterion("speaker_descr not like", value, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrIn(List<String> values) {
            addCriterion("speaker_descr in", values, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrNotIn(List<String> values) {
            addCriterion("speaker_descr not in", values, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrBetween(String value1, String value2) {
            addCriterion("speaker_descr between", value1, value2, "speaker_descr");
            return (Criteria) this;
        }

        public Criteria andSpeaker_descrNotBetween(String value1, String value2) {
            addCriterion("speaker_descr not between", value1, value2, "speaker_descr");
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