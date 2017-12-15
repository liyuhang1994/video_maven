package com.zhiyou100.video.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideo_titleIsNull() {
            addCriterion("video_title is null");
            return (Criteria) this;
        }

        public Criteria andVideo_titleIsNotNull() {
            addCriterion("video_title is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_titleEqualTo(String value) {
            addCriterion("video_title =", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleNotEqualTo(String value) {
            addCriterion("video_title <>", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleGreaterThan(String value) {
            addCriterion("video_title >", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleGreaterThanOrEqualTo(String value) {
            addCriterion("video_title >=", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleLessThan(String value) {
            addCriterion("video_title <", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleLessThanOrEqualTo(String value) {
            addCriterion("video_title <=", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleLike(String value) {
            addCriterion("video_title like", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleNotLike(String value) {
            addCriterion("video_title not like", value, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleIn(List<String> values) {
            addCriterion("video_title in", values, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleNotIn(List<String> values) {
            addCriterion("video_title not in", values, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleBetween(String value1, String value2) {
            addCriterion("video_title between", value1, value2, "video_title");
            return (Criteria) this;
        }

        public Criteria andVideo_titleNotBetween(String value1, String value2) {
            addCriterion("video_title not between", value1, value2, "video_title");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idIsNull() {
            addCriterion("speaker_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idIsNotNull() {
            addCriterion("speaker_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idEqualTo(Integer value) {
            addCriterion("speaker_id =", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idNotEqualTo(Integer value) {
            addCriterion("speaker_id <>", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idGreaterThan(Integer value) {
            addCriterion("speaker_id >", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("speaker_id >=", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idLessThan(Integer value) {
            addCriterion("speaker_id <", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idLessThanOrEqualTo(Integer value) {
            addCriterion("speaker_id <=", value, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idIn(List<Integer> values) {
            addCriterion("speaker_id in", values, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idNotIn(List<Integer> values) {
            addCriterion("speaker_id not in", values, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id between", value1, value2, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andSpeaker_idNotBetween(Integer value1, Integer value2) {
            addCriterion("speaker_id not between", value1, value2, "speaker_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourse_idIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_idEqualTo(Integer value) {
            addCriterion("course_id =", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idGreaterThan(Integer value) {
            addCriterion("course_id >", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idLessThan(Integer value) {
            addCriterion("course_id <", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idIn(List<Integer> values) {
            addCriterion("course_id in", values, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "course_id");
            return (Criteria) this;
        }

        public Criteria andCourse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "course_id");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthIsNull() {
            addCriterion("video_length is null");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthIsNotNull() {
            addCriterion("video_length is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthEqualTo(Integer value) {
            addCriterion("video_length =", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthNotEqualTo(Integer value) {
            addCriterion("video_length <>", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthGreaterThan(Integer value) {
            addCriterion("video_length >", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_length >=", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthLessThan(Integer value) {
            addCriterion("video_length <", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthLessThanOrEqualTo(Integer value) {
            addCriterion("video_length <=", value, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthIn(List<Integer> values) {
            addCriterion("video_length in", values, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthNotIn(List<Integer> values) {
            addCriterion("video_length not in", values, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthBetween(Integer value1, Integer value2) {
            addCriterion("video_length between", value1, value2, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_lengthNotBetween(Integer value1, Integer value2) {
            addCriterion("video_length not between", value1, value2, "video_length");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlIsNull() {
            addCriterion("video_image_url is null");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlIsNotNull() {
            addCriterion("video_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlEqualTo(String value) {
            addCriterion("video_image_url =", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlNotEqualTo(String value) {
            addCriterion("video_image_url <>", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlGreaterThan(String value) {
            addCriterion("video_image_url >", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlGreaterThanOrEqualTo(String value) {
            addCriterion("video_image_url >=", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlLessThan(String value) {
            addCriterion("video_image_url <", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlLessThanOrEqualTo(String value) {
            addCriterion("video_image_url <=", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlLike(String value) {
            addCriterion("video_image_url like", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlNotLike(String value) {
            addCriterion("video_image_url not like", value, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlIn(List<String> values) {
            addCriterion("video_image_url in", values, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlNotIn(List<String> values) {
            addCriterion("video_image_url not in", values, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlBetween(String value1, String value2) {
            addCriterion("video_image_url between", value1, value2, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_image_urlNotBetween(String value1, String value2) {
            addCriterion("video_image_url not between", value1, value2, "video_image_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideo_urlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_urlEqualTo(String value) {
            addCriterion("video_url =", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlGreaterThan(String value) {
            addCriterion("video_url >", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLessThan(String value) {
            addCriterion("video_url <", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLike(String value) {
            addCriterion("video_url like", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotLike(String value) {
            addCriterion("video_url not like", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlIn(List<String> values) {
            addCriterion("video_url in", values, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_descrIsNull() {
            addCriterion("video_descr is null");
            return (Criteria) this;
        }

        public Criteria andVideo_descrIsNotNull() {
            addCriterion("video_descr is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_descrEqualTo(String value) {
            addCriterion("video_descr =", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrNotEqualTo(String value) {
            addCriterion("video_descr <>", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrGreaterThan(String value) {
            addCriterion("video_descr >", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrGreaterThanOrEqualTo(String value) {
            addCriterion("video_descr >=", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrLessThan(String value) {
            addCriterion("video_descr <", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrLessThanOrEqualTo(String value) {
            addCriterion("video_descr <=", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrLike(String value) {
            addCriterion("video_descr like", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrNotLike(String value) {
            addCriterion("video_descr not like", value, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrIn(List<String> values) {
            addCriterion("video_descr in", values, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrNotIn(List<String> values) {
            addCriterion("video_descr not in", values, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrBetween(String value1, String value2) {
            addCriterion("video_descr between", value1, value2, "video_descr");
            return (Criteria) this;
        }

        public Criteria andVideo_descrNotBetween(String value1, String value2) {
            addCriterion("video_descr not between", value1, value2, "video_descr");
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

        public Criteria andVideo_play_timesIsNull() {
            addCriterion("video_play_times is null");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesIsNotNull() {
            addCriterion("video_play_times is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesEqualTo(Integer value) {
            addCriterion("video_play_times =", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesNotEqualTo(Integer value) {
            addCriterion("video_play_times <>", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesGreaterThan(Integer value) {
            addCriterion("video_play_times >", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_play_times >=", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesLessThan(Integer value) {
            addCriterion("video_play_times <", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesLessThanOrEqualTo(Integer value) {
            addCriterion("video_play_times <=", value, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesIn(List<Integer> values) {
            addCriterion("video_play_times in", values, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesNotIn(List<Integer> values) {
            addCriterion("video_play_times not in", values, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesBetween(Integer value1, Integer value2) {
            addCriterion("video_play_times between", value1, value2, "video_play_times");
            return (Criteria) this;
        }

        public Criteria andVideo_play_timesNotBetween(Integer value1, Integer value2) {
            addCriterion("video_play_times not between", value1, value2, "video_play_times");
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