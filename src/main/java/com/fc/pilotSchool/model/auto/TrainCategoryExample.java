package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 培训类别 TrainCategoryExample
 * @author fuce_自动生成
 * @date 2023-05-13 20:37:10
 */
public class TrainCategoryExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainCategoryExample() {
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
        
		
        public Criteria andTrainingNameIsNull() {
            addCriterion("training_name is null");
            return (Criteria) this;
        }

        public Criteria andTrainingNameIsNotNull() {
            addCriterion("training_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingNameEqualTo(String value) {
            addCriterion("training_name =", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameNotEqualTo(String value) {
            addCriterion("training_name <>", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameGreaterThan(String value) {
            addCriterion("training_name >", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameGreaterThanOrEqualTo(String value) {
            addCriterion("training_name >=", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameLessThan(String value) {
            addCriterion("training_name <", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameLessThanOrEqualTo(String value) {
            addCriterion("training_name <=", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameLike(String value) {
            addCriterion("training_name like", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameNotLike(String value) {
            addCriterion("training_name not like", value, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameIn(List<String> values) {
            addCriterion("training_name in", values, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameNotIn(List<String> values) {
            addCriterion("training_name not in", values, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameBetween(String value1, String value2) {
            addCriterion("training_name between", value1, value2, "trainingName");
            return (Criteria) this;
        }

        public Criteria andTrainingNameNotBetween(String value1, String value2) {
            addCriterion("training_name not between", value1, value2, "trainingName");
            return (Criteria) this;
        }
        
		
        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(String value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(String value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(String value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(String value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(String value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(String value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLike(String value) {
            addCriterion("pay like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotLike(String value) {
            addCriterion("pay not like", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<String> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<String> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(String value1, String value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(String value1, String value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainingContentIsNull() {
            addCriterion("training_content is null");
            return (Criteria) this;
        }

        public Criteria andTrainingContentIsNotNull() {
            addCriterion("training_content is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingContentEqualTo(String value) {
            addCriterion("training_content =", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentNotEqualTo(String value) {
            addCriterion("training_content <>", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentGreaterThan(String value) {
            addCriterion("training_content >", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentGreaterThanOrEqualTo(String value) {
            addCriterion("training_content >=", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentLessThan(String value) {
            addCriterion("training_content <", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentLessThanOrEqualTo(String value) {
            addCriterion("training_content <=", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentLike(String value) {
            addCriterion("training_content like", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentNotLike(String value) {
            addCriterion("training_content not like", value, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentIn(List<String> values) {
            addCriterion("training_content in", values, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentNotIn(List<String> values) {
            addCriterion("training_content not in", values, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentBetween(String value1, String value2) {
            addCriterion("training_content between", value1, value2, "trainingContent");
            return (Criteria) this;
        }

        public Criteria andTrainingContentNotBetween(String value1, String value2) {
            addCriterion("training_content not between", value1, value2, "trainingContent");
            return (Criteria) this;
        }
        
		
        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(Date value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(Date value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }
        
		
        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(Date value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(Date value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(TrainCategory record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getTrainingName()!=null&&StrUtil.isNotEmpty(record.getTrainingName().toString())) {
    			 list.add("ifnull(training_name,'')");
    		}
			if(record.getPay()!=null&&StrUtil.isNotEmpty(record.getPay().toString())) {
    			 list.add("ifnull(pay,'')");
    		}
			if(record.getTrainingContent()!=null&&StrUtil.isNotEmpty(record.getTrainingContent().toString())) {
    			 list.add("ifnull(training_content,'')");
    		}
			if(record.getStartDate()!=null&&StrUtil.isNotEmpty(record.getStartDate().toString())) {
    			 list.add("ifnull(start_date,'')");
    		}
			if(record.getEndDate()!=null&&StrUtil.isNotEmpty(record.getEndDate().toString())) {
    			 list.add("ifnull(end_date,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getTrainingName()!=null&&StrUtil.isNotEmpty(record.getTrainingName().toString())) {
    			list2.add("'%"+record.getTrainingName()+"%'");
    		}
			if(record.getPay()!=null&&StrUtil.isNotEmpty(record.getPay().toString())) {
    			list2.add("'%"+record.getPay()+"%'");
    		}
			if(record.getTrainingContent()!=null&&StrUtil.isNotEmpty(record.getTrainingContent().toString())) {
    			list2.add("'%"+record.getTrainingContent()+"%'");
    		}
			if(record.getStartDate()!=null&&StrUtil.isNotEmpty(record.getStartDate().toString())) {
    			list2.add("'%"+record.getStartDate()+"%'");
    		}
			if(record.getEndDate()!=null&&StrUtil.isNotEmpty(record.getEndDate().toString())) {
    			list2.add("'%"+record.getEndDate()+"%'");
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
    		list.add("ifnull(training_name,'')");
    		list.add("ifnull(pay,'')");
    		list.add("ifnull(training_content,'')");
    		list.add("ifnull(start_date,'')");
    		list.add("ifnull(end_date,'')");
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