package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 工作信息表 StudenjobExample
 * @author fuce_自动生成
 * @date 2023-05-10 10:58:07
 */
public class StudenjobExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudenjobExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
		
        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }
        
		
        public Criteria andEmployersNameIsNull() {
            addCriterion("employers_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployersNameIsNotNull() {
            addCriterion("employers_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployersNameEqualTo(String value) {
            addCriterion("employers_name =", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameNotEqualTo(String value) {
            addCriterion("employers_name <>", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameGreaterThan(String value) {
            addCriterion("employers_name >", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameGreaterThanOrEqualTo(String value) {
            addCriterion("employers_name >=", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameLessThan(String value) {
            addCriterion("employers_name <", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameLessThanOrEqualTo(String value) {
            addCriterion("employers_name <=", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameLike(String value) {
            addCriterion("employers_name like", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameNotLike(String value) {
            addCriterion("employers_name not like", value, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameIn(List<String> values) {
            addCriterion("employers_name in", values, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameNotIn(List<String> values) {
            addCriterion("employers_name not in", values, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameBetween(String value1, String value2) {
            addCriterion("employers_name between", value1, value2, "employersName");
            return (Criteria) this;
        }

        public Criteria andEmployersNameNotBetween(String value1, String value2) {
            addCriterion("employers_name not between", value1, value2, "employersName");
            return (Criteria) this;
        }
        
		
        public Criteria andEmployersPhoneIsNull() {
            addCriterion("employers_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneIsNotNull() {
            addCriterion("employers_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneEqualTo(String value) {
            addCriterion("employers_phone =", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneNotEqualTo(String value) {
            addCriterion("employers_phone <>", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneGreaterThan(String value) {
            addCriterion("employers_phone >", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employers_phone >=", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneLessThan(String value) {
            addCriterion("employers_phone <", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneLessThanOrEqualTo(String value) {
            addCriterion("employers_phone <=", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneLike(String value) {
            addCriterion("employers_phone like", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneNotLike(String value) {
            addCriterion("employers_phone not like", value, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneIn(List<String> values) {
            addCriterion("employers_phone in", values, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneNotIn(List<String> values) {
            addCriterion("employers_phone not in", values, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneBetween(String value1, String value2) {
            addCriterion("employers_phone between", value1, value2, "employersPhone");
            return (Criteria) this;
        }

        public Criteria andEmployersPhoneNotBetween(String value1, String value2) {
            addCriterion("employers_phone not between", value1, value2, "employersPhone");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Studenjob record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getJobName()!=null&&StrUtil.isNotEmpty(record.getJobName().toString())) {
    			 list.add("ifnull(job_name,'')");
    		}
			if(record.getEmployersName()!=null&&StrUtil.isNotEmpty(record.getEmployersName().toString())) {
    			 list.add("ifnull(employers_name,'')");
    		}
			if(record.getEmployersPhone()!=null&&StrUtil.isNotEmpty(record.getEmployersPhone().toString())) {
    			 list.add("ifnull(employers_phone,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getJobName()!=null&&StrUtil.isNotEmpty(record.getJobName().toString())) {
    			list2.add("'%"+record.getJobName()+"%'");
    		}
			if(record.getEmployersName()!=null&&StrUtil.isNotEmpty(record.getEmployersName().toString())) {
    			list2.add("'%"+record.getEmployersName()+"%'");
    		}
			if(record.getEmployersPhone()!=null&&StrUtil.isNotEmpty(record.getEmployersPhone().toString())) {
    			list2.add("'%"+record.getEmployersPhone()+"%'");
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
    		list.add("ifnull(id,'')");
    		list.add("ifnull(job_name,'')");
    		list.add("ifnull(employers_name,'')");
    		list.add("ifnull(employers_phone,'')");
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