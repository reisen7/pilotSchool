package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 课程信息 CourseExample
 * @author fuce_自动生成
 * @date 2023-05-10 21:48:17
 */
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
        
		
        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }
        
		
        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }
        
		
        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }
        
		
        public Criteria andAmenitiesIdIsNull() {
            addCriterion("amenities_id is null");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdIsNotNull() {
            addCriterion("amenities_id is not null");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdEqualTo(String value) {
            addCriterion("amenities_id =", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdNotEqualTo(String value) {
            addCriterion("amenities_id <>", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdGreaterThan(String value) {
            addCriterion("amenities_id >", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdGreaterThanOrEqualTo(String value) {
            addCriterion("amenities_id >=", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdLessThan(String value) {
            addCriterion("amenities_id <", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdLessThanOrEqualTo(String value) {
            addCriterion("amenities_id <=", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdLike(String value) {
            addCriterion("amenities_id like", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdNotLike(String value) {
            addCriterion("amenities_id not like", value, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdIn(List<String> values) {
            addCriterion("amenities_id in", values, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdNotIn(List<String> values) {
            addCriterion("amenities_id not in", values, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdBetween(String value1, String value2) {
            addCriterion("amenities_id between", value1, value2, "amenitiesId");
            return (Criteria) this;
        }

        public Criteria andAmenitiesIdNotBetween(String value1, String value2) {
            addCriterion("amenities_id not between", value1, value2, "amenitiesId");
            return (Criteria) this;
        }
        
		
        public Criteria andCourseStarttimeIsNull() {
            addCriterion("course_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeIsNotNull() {
            addCriterion("course_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeEqualTo(Date value) {
            addCriterion("course_starttime =", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeNotEqualTo(Date value) {
            addCriterion("course_starttime <>", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeGreaterThan(Date value) {
            addCriterion("course_starttime >", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_starttime >=", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeLessThan(Date value) {
            addCriterion("course_starttime <", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("course_starttime <=", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeLike(Date value) {
            addCriterion("course_starttime like", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeNotLike(Date value) {
            addCriterion("course_starttime not like", value, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeIn(List<Date> values) {
            addCriterion("course_starttime in", values, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeNotIn(List<Date> values) {
            addCriterion("course_starttime not in", values, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeBetween(Date value1, Date value2) {
            addCriterion("course_starttime between", value1, value2, "courseStarttime");
            return (Criteria) this;
        }

        public Criteria andCourseStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("course_starttime not between", value1, value2, "courseStarttime");
            return (Criteria) this;
        }
        
		
        public Criteria andCourseEndtimeIsNull() {
            addCriterion("course_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeIsNotNull() {
            addCriterion("course_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeEqualTo(Date value) {
            addCriterion("course_endtime =", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeNotEqualTo(Date value) {
            addCriterion("course_endtime <>", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeGreaterThan(Date value) {
            addCriterion("course_endtime >", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_endtime >=", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeLessThan(Date value) {
            addCriterion("course_endtime <", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("course_endtime <=", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeLike(Date value) {
            addCriterion("course_endtime like", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeNotLike(Date value) {
            addCriterion("course_endtime not like", value, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeIn(List<Date> values) {
            addCriterion("course_endtime in", values, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeNotIn(List<Date> values) {
            addCriterion("course_endtime not in", values, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeBetween(Date value1, Date value2) {
            addCriterion("course_endtime between", value1, value2, "courseEndtime");
            return (Criteria) this;
        }

        public Criteria andCourseEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("course_endtime not between", value1, value2, "courseEndtime");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainIdIsNull() {
            addCriterion("train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(String value) {
            addCriterion("train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(String value) {
            addCriterion("train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(String value) {
            addCriterion("train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(String value) {
            addCriterion("train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(String value) {
            addCriterion("train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(String value) {
            addCriterion("train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLike(String value) {
            addCriterion("train_id like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotLike(String value) {
            addCriterion("train_id not like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<String> values) {
            addCriterion("train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<String> values) {
            addCriterion("train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(String value1, String value2) {
            addCriterion("train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(String value1, String value2) {
            addCriterion("train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Course record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getCId()!=null&&StrUtil.isNotEmpty(record.getCId().toString())) {
    			 list.add("ifnull(c_id,'')");
    		}
			if(record.getCourseName()!=null&&StrUtil.isNotEmpty(record.getCourseName().toString())) {
    			 list.add("ifnull(course_name,'')");
    		}
			if(record.getTId()!=null&&StrUtil.isNotEmpty(record.getTId().toString())) {
    			 list.add("ifnull(t_id,'')");
    		}
			if(record.getAmenitiesId()!=null&&StrUtil.isNotEmpty(record.getAmenitiesId().toString())) {
    			 list.add("ifnull(amenities_id,'')");
    		}
			if(record.getCourseStarttime()!=null&&StrUtil.isNotEmpty(record.getCourseStarttime().toString())) {
    			 list.add("ifnull(course_starttime,'')");
    		}
			if(record.getCourseEndtime()!=null&&StrUtil.isNotEmpty(record.getCourseEndtime().toString())) {
    			 list.add("ifnull(course_endtime,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getTrainId()!=null&&StrUtil.isNotEmpty(record.getTrainId().toString())) {
    			 list.add("ifnull(train_id,'')");
    		}
			if(record.getCId()!=null&&StrUtil.isNotEmpty(record.getCId().toString())) {
    			list2.add("'%"+record.getCId()+"%'");
    		}
			if(record.getCourseName()!=null&&StrUtil.isNotEmpty(record.getCourseName().toString())) {
    			list2.add("'%"+record.getCourseName()+"%'");
    		}
			if(record.getTId()!=null&&StrUtil.isNotEmpty(record.getTId().toString())) {
    			list2.add("'%"+record.getTId()+"%'");
    		}
			if(record.getAmenitiesId()!=null&&StrUtil.isNotEmpty(record.getAmenitiesId().toString())) {
    			list2.add("'%"+record.getAmenitiesId()+"%'");
    		}
			if(record.getCourseStarttime()!=null&&StrUtil.isNotEmpty(record.getCourseStarttime().toString())) {
    			list2.add("'%"+record.getCourseStarttime()+"%'");
    		}
			if(record.getCourseEndtime()!=null&&StrUtil.isNotEmpty(record.getCourseEndtime().toString())) {
    			list2.add("'%"+record.getCourseEndtime()+"%'");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			list2.add("'%"+record.getStatus()+"%'");
    		}
			if(record.getTrainId()!=null&&StrUtil.isNotEmpty(record.getTrainId().toString())) {
    			list2.add("'%"+record.getTrainId()+"%'");
    		}
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append(" like CONCAT(");
        	buffer.append(StrUtil.join(",",list2));
        	buffer.append(")");
        	if(!" CONCAT() like CONCAT()".equals(buffer.toString())) {
        		addCriterion(buffer.toString());
        	}
        	return (Criteria) this;
        }
        
        public Criteria andLikeQuery2(String searchText) {
		 	List<String> list= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
    		list.add("ifnull(c_id,'')");
    		list.add("ifnull(course_name,'')");
    		list.add("ifnull(t_id,'')");
    		list.add("ifnull(amenities_id,'')");
    		list.add("ifnull(course_starttime,'')");
    		list.add("ifnull(course_endtime,'')");
    		list.add("ifnull(status,'')");
    		list.add("ifnull(train_id,'')");
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append("like '%");
        	buffer.append(searchText);
        	buffer.append("%'");
        	addCriterion(buffer.toString());
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