package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 飞行体验活动管理 FlyExperienceExample
 * @author fuce_自动生成
 * @date 2023-05-10 19:49:37
 */
public class FlyExperienceExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlyExperienceExample() {
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
        
		
        public Criteria andPlanTimeIsNull() {
            addCriterion("plan_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNotNull() {
            addCriterion("plan_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeEqualTo(Date value) {
            addCriterion("plan_time =", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotEqualTo(Date value) {
            addCriterion("plan_time <>", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThan(Date value) {
            addCriterion("plan_time >", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_time >=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThan(Date value) {
            addCriterion("plan_time <", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_time <=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLike(Date value) {
            addCriterion("plan_time like", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotLike(Date value) {
            addCriterion("plan_time not like", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIn(List<Date> values) {
            addCriterion("plan_time in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotIn(List<Date> values) {
            addCriterion("plan_time not in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeBetween(Date value1, Date value2) {
            addCriterion("plan_time between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_time not between", value1, value2, "planTime");
            return (Criteria) this;
        }
        
		
        public Criteria andPlanPlaceIsNull() {
            addCriterion("plan_place is null");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceIsNotNull() {
            addCriterion("plan_place is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceEqualTo(String value) {
            addCriterion("plan_place =", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceNotEqualTo(String value) {
            addCriterion("plan_place <>", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceGreaterThan(String value) {
            addCriterion("plan_place >", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("plan_place >=", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceLessThan(String value) {
            addCriterion("plan_place <", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceLessThanOrEqualTo(String value) {
            addCriterion("plan_place <=", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceLike(String value) {
            addCriterion("plan_place like", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceNotLike(String value) {
            addCriterion("plan_place not like", value, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceIn(List<String> values) {
            addCriterion("plan_place in", values, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceNotIn(List<String> values) {
            addCriterion("plan_place not in", values, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceBetween(String value1, String value2) {
            addCriterion("plan_place between", value1, value2, "planPlace");
            return (Criteria) this;
        }

        public Criteria andPlanPlaceNotBetween(String value1, String value2) {
            addCriterion("plan_place not between", value1, value2, "planPlace");
            return (Criteria) this;
        }
        
		
        public Criteria andPlanContentIsNull() {
            addCriterion("plan_content is null");
            return (Criteria) this;
        }

        public Criteria andPlanContentIsNotNull() {
            addCriterion("plan_content is not null");
            return (Criteria) this;
        }

        public Criteria andPlanContentEqualTo(String value) {
            addCriterion("plan_content =", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotEqualTo(String value) {
            addCriterion("plan_content <>", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentGreaterThan(String value) {
            addCriterion("plan_content >", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentGreaterThanOrEqualTo(String value) {
            addCriterion("plan_content >=", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLessThan(String value) {
            addCriterion("plan_content <", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLessThanOrEqualTo(String value) {
            addCriterion("plan_content <=", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLike(String value) {
            addCriterion("plan_content like", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotLike(String value) {
            addCriterion("plan_content not like", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentIn(List<String> values) {
            addCriterion("plan_content in", values, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotIn(List<String> values) {
            addCriterion("plan_content not in", values, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentBetween(String value1, String value2) {
            addCriterion("plan_content between", value1, value2, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotBetween(String value1, String value2) {
            addCriterion("plan_content not between", value1, value2, "planContent");
            return (Criteria) this;
        }
        
		
        public Criteria andPlanIsNull() {
            addCriterion("plan is null");
            return (Criteria) this;
        }

        public Criteria andPlanIsNotNull() {
            addCriterion("plan is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEqualTo(String value) {
            addCriterion("plan =", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotEqualTo(String value) {
            addCriterion("plan <>", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThan(String value) {
            addCriterion("plan >", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThanOrEqualTo(String value) {
            addCriterion("plan >=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThan(String value) {
            addCriterion("plan <", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThanOrEqualTo(String value) {
            addCriterion("plan <=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLike(String value) {
            addCriterion("plan like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotLike(String value) {
            addCriterion("plan not like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanIn(List<String> values) {
            addCriterion("plan in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotIn(List<String> values) {
            addCriterion("plan not in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanBetween(String value1, String value2) {
            addCriterion("plan between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotBetween(String value1, String value2) {
            addCriterion("plan not between", value1, value2, "plan");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(FlyExperience record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getPlanTime()!=null&&StrUtil.isNotEmpty(record.getPlanTime().toString())) {
    			 list.add("ifnull(plan_time,'')");
    		}
			if(record.getPlanPlace()!=null&&StrUtil.isNotEmpty(record.getPlanPlace().toString())) {
    			 list.add("ifnull(plan_place,'')");
    		}
			if(record.getPlanContent()!=null&&StrUtil.isNotEmpty(record.getPlanContent().toString())) {
    			 list.add("ifnull(plan_content,'')");
    		}
			if(record.getPlan()!=null&&StrUtil.isNotEmpty(record.getPlan().toString())) {
    			 list.add("ifnull(plan,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getPlanTime()!=null&&StrUtil.isNotEmpty(record.getPlanTime().toString())) {
    			list2.add("'%"+record.getPlanTime()+"%'");
    		}
			if(record.getPlanPlace()!=null&&StrUtil.isNotEmpty(record.getPlanPlace().toString())) {
    			list2.add("'%"+record.getPlanPlace()+"%'");
    		}
			if(record.getPlanContent()!=null&&StrUtil.isNotEmpty(record.getPlanContent().toString())) {
    			list2.add("'%"+record.getPlanContent()+"%'");
    		}
			if(record.getPlan()!=null&&StrUtil.isNotEmpty(record.getPlan().toString())) {
    			list2.add("'%"+record.getPlan()+"%'");
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
    		list.add("ifnull(plan_time,'')");
    		list.add("ifnull(plan_place,'')");
    		list.add("ifnull(plan_content,'')");
    		list.add("ifnull(plan,'')");
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