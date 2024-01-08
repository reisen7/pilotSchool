package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 *  AgreementExample
 * @author fuce_自动生成
 * @date 2023-05-10 21:03:21
 */
public class AgreementExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgreementExample() {
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
        
		
        public Criteria andAgreementNameIsNull() {
            addCriterion("agreement_name is null");
            return (Criteria) this;
        }

        public Criteria andAgreementNameIsNotNull() {
            addCriterion("agreement_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementNameEqualTo(String value) {
            addCriterion("agreement_name =", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotEqualTo(String value) {
            addCriterion("agreement_name <>", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameGreaterThan(String value) {
            addCriterion("agreement_name >", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_name >=", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLessThan(String value) {
            addCriterion("agreement_name <", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLessThanOrEqualTo(String value) {
            addCriterion("agreement_name <=", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameLike(String value) {
            addCriterion("agreement_name like", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotLike(String value) {
            addCriterion("agreement_name not like", value, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameIn(List<String> values) {
            addCriterion("agreement_name in", values, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotIn(List<String> values) {
            addCriterion("agreement_name not in", values, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameBetween(String value1, String value2) {
            addCriterion("agreement_name between", value1, value2, "agreementName");
            return (Criteria) this;
        }

        public Criteria andAgreementNameNotBetween(String value1, String value2) {
            addCriterion("agreement_name not between", value1, value2, "agreementName");
            return (Criteria) this;
        }
        
		
        public Criteria andAgreementDateIsNull() {
            addCriterion("agreement_date is null");
            return (Criteria) this;
        }

        public Criteria andAgreementDateIsNotNull() {
            addCriterion("agreement_date is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementDateEqualTo(Date value) {
            addCriterion("agreement_date =", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateNotEqualTo(Date value) {
            addCriterion("agreement_date <>", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateGreaterThan(Date value) {
            addCriterion("agreement_date >", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("agreement_date >=", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateLessThan(Date value) {
            addCriterion("agreement_date <", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateLessThanOrEqualTo(Date value) {
            addCriterion("agreement_date <=", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateLike(Date value) {
            addCriterion("agreement_date like", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateNotLike(Date value) {
            addCriterion("agreement_date not like", value, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateIn(List<Date> values) {
            addCriterion("agreement_date in", values, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateNotIn(List<Date> values) {
            addCriterion("agreement_date not in", values, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateBetween(Date value1, Date value2) {
            addCriterion("agreement_date between", value1, value2, "agreementDate");
            return (Criteria) this;
        }

        public Criteria andAgreementDateNotBetween(Date value1, Date value2) {
            addCriterion("agreement_date not between", value1, value2, "agreementDate");
            return (Criteria) this;
        }
        
		
        public Criteria andAgreementPathIsNull() {
            addCriterion("agreement_path is null");
            return (Criteria) this;
        }

        public Criteria andAgreementPathIsNotNull() {
            addCriterion("agreement_path is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementPathEqualTo(String value) {
            addCriterion("agreement_path =", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathNotEqualTo(String value) {
            addCriterion("agreement_path <>", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathGreaterThan(String value) {
            addCriterion("agreement_path >", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_path >=", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathLessThan(String value) {
            addCriterion("agreement_path <", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathLessThanOrEqualTo(String value) {
            addCriterion("agreement_path <=", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathLike(String value) {
            addCriterion("agreement_path like", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathNotLike(String value) {
            addCriterion("agreement_path not like", value, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathIn(List<String> values) {
            addCriterion("agreement_path in", values, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathNotIn(List<String> values) {
            addCriterion("agreement_path not in", values, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathBetween(String value1, String value2) {
            addCriterion("agreement_path between", value1, value2, "agreementPath");
            return (Criteria) this;
        }

        public Criteria andAgreementPathNotBetween(String value1, String value2) {
            addCriterion("agreement_path not between", value1, value2, "agreementPath");
            return (Criteria) this;
        }
        
		
        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Agreement record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getAgreementName()!=null&&StrUtil.isNotEmpty(record.getAgreementName().toString())) {
    			 list.add("ifnull(agreement_name,'')");
    		}
			if(record.getAgreementDate()!=null&&StrUtil.isNotEmpty(record.getAgreementDate().toString())) {
    			 list.add("ifnull(agreement_date,'')");
    		}
			if(record.getAgreementPath()!=null&&StrUtil.isNotEmpty(record.getAgreementPath().toString())) {
    			 list.add("ifnull(agreement_path,'')");
    		}
			if(record.getStudentId()!=null&&StrUtil.isNotEmpty(record.getStudentId().toString())) {
    			 list.add("ifnull(student_id,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getAgreementName()!=null&&StrUtil.isNotEmpty(record.getAgreementName().toString())) {
    			list2.add("'%"+record.getAgreementName()+"%'");
    		}
			if(record.getAgreementDate()!=null&&StrUtil.isNotEmpty(record.getAgreementDate().toString())) {
    			list2.add("'%"+record.getAgreementDate()+"%'");
    		}
			if(record.getAgreementPath()!=null&&StrUtil.isNotEmpty(record.getAgreementPath().toString())) {
    			list2.add("'%"+record.getAgreementPath()+"%'");
    		}
			if(record.getStudentId()!=null&&StrUtil.isNotEmpty(record.getStudentId().toString())) {
    			list2.add("'%"+record.getStudentId()+"%'");
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
    		list.add("ifnull(agreement_name,'')");
    		list.add("ifnull(agreement_date,'')");
    		list.add("ifnull(agreement_path,'')");
    		list.add("ifnull(student_id,'')");
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