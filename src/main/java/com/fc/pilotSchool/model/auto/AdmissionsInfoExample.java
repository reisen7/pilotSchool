package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 招生信息 AdmissionsInfoExample
 * @author fuce_自动生成
 * @date 2023-05-13 22:15:47
 */
public class AdmissionsInfoExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmissionsInfoExample() {
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
        
		
        public Criteria andAdmissionsTimeIsNull() {
            addCriterion("admissions_time is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeIsNotNull() {
            addCriterion("admissions_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeEqualTo(Date value) {
            addCriterion("admissions_time =", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeNotEqualTo(Date value) {
            addCriterion("admissions_time <>", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeGreaterThan(Date value) {
            addCriterion("admissions_time >", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admissions_time >=", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeLessThan(Date value) {
            addCriterion("admissions_time <", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeLessThanOrEqualTo(Date value) {
            addCriterion("admissions_time <=", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeLike(Date value) {
            addCriterion("admissions_time like", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeNotLike(Date value) {
            addCriterion("admissions_time not like", value, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeIn(List<Date> values) {
            addCriterion("admissions_time in", values, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeNotIn(List<Date> values) {
            addCriterion("admissions_time not in", values, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeBetween(Date value1, Date value2) {
            addCriterion("admissions_time between", value1, value2, "admissionsTime");
            return (Criteria) this;
        }

        public Criteria andAdmissionsTimeNotBetween(Date value1, Date value2) {
            addCriterion("admissions_time not between", value1, value2, "admissionsTime");
            return (Criteria) this;
        }
        
		
        public Criteria andAdmissionsObjIsNull() {
            addCriterion("admissions_obj is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjIsNotNull() {
            addCriterion("admissions_obj is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjEqualTo(String value) {
            addCriterion("admissions_obj =", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjNotEqualTo(String value) {
            addCriterion("admissions_obj <>", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjGreaterThan(String value) {
            addCriterion("admissions_obj >", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjGreaterThanOrEqualTo(String value) {
            addCriterion("admissions_obj >=", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjLessThan(String value) {
            addCriterion("admissions_obj <", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjLessThanOrEqualTo(String value) {
            addCriterion("admissions_obj <=", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjLike(String value) {
            addCriterion("admissions_obj like", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjNotLike(String value) {
            addCriterion("admissions_obj not like", value, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjIn(List<String> values) {
            addCriterion("admissions_obj in", values, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjNotIn(List<String> values) {
            addCriterion("admissions_obj not in", values, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjBetween(String value1, String value2) {
            addCriterion("admissions_obj between", value1, value2, "admissionsObj");
            return (Criteria) this;
        }

        public Criteria andAdmissionsObjNotBetween(String value1, String value2) {
            addCriterion("admissions_obj not between", value1, value2, "admissionsObj");
            return (Criteria) this;
        }
        
		
        public Criteria andAdmissionsRuleIsNull() {
            addCriterion("admissions_rule is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleIsNotNull() {
            addCriterion("admissions_rule is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleEqualTo(String value) {
            addCriterion("admissions_rule =", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleNotEqualTo(String value) {
            addCriterion("admissions_rule <>", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleGreaterThan(String value) {
            addCriterion("admissions_rule >", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleGreaterThanOrEqualTo(String value) {
            addCriterion("admissions_rule >=", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleLessThan(String value) {
            addCriterion("admissions_rule <", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleLessThanOrEqualTo(String value) {
            addCriterion("admissions_rule <=", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleLike(String value) {
            addCriterion("admissions_rule like", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleNotLike(String value) {
            addCriterion("admissions_rule not like", value, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleIn(List<String> values) {
            addCriterion("admissions_rule in", values, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleNotIn(List<String> values) {
            addCriterion("admissions_rule not in", values, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleBetween(String value1, String value2) {
            addCriterion("admissions_rule between", value1, value2, "admissionsRule");
            return (Criteria) this;
        }

        public Criteria andAdmissionsRuleNotBetween(String value1, String value2) {
            addCriterion("admissions_rule not between", value1, value2, "admissionsRule");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(AdmissionsInfo record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getAdmissionsTime()!=null&&StrUtil.isNotEmpty(record.getAdmissionsTime().toString())) {
    			 list.add("ifnull(admissions_time,'')");
    		}
			if(record.getAdmissionsObj()!=null&&StrUtil.isNotEmpty(record.getAdmissionsObj().toString())) {
    			 list.add("ifnull(admissions_obj,'')");
    		}
			if(record.getAdmissionsRule()!=null&&StrUtil.isNotEmpty(record.getAdmissionsRule().toString())) {
    			 list.add("ifnull(admissions_rule,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getAdmissionsTime()!=null&&StrUtil.isNotEmpty(record.getAdmissionsTime().toString())) {
    			list2.add("'%"+record.getAdmissionsTime()+"%'");
    		}
			if(record.getAdmissionsObj()!=null&&StrUtil.isNotEmpty(record.getAdmissionsObj().toString())) {
    			list2.add("'%"+record.getAdmissionsObj()+"%'");
    		}
			if(record.getAdmissionsRule()!=null&&StrUtil.isNotEmpty(record.getAdmissionsRule().toString())) {
    			list2.add("'%"+record.getAdmissionsRule()+"%'");
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
    		list.add("ifnull(admissions_time,'')");
    		list.add("ifnull(admissions_obj,'')");
    		list.add("ifnull(admissions_rule,'')");
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