package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 招生宣传 AdmissionsPublicityExample
 * @author fuce_自动生成
 * @date 2023-05-10 10:19:40
 */
public class AdmissionsPublicityExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmissionsPublicityExample() {
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
        
		
        public Criteria andPublicityTimeIsNull() {
            addCriterion("publicity_time is null");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeIsNotNull() {
            addCriterion("publicity_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeEqualTo(Date value) {
            addCriterion("publicity_time =", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeNotEqualTo(Date value) {
            addCriterion("publicity_time <>", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeGreaterThan(Date value) {
            addCriterion("publicity_time >", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publicity_time >=", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeLessThan(Date value) {
            addCriterion("publicity_time <", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeLessThanOrEqualTo(Date value) {
            addCriterion("publicity_time <=", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeLike(Date value) {
            addCriterion("publicity_time like", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeNotLike(Date value) {
            addCriterion("publicity_time not like", value, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeIn(List<Date> values) {
            addCriterion("publicity_time in", values, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeNotIn(List<Date> values) {
            addCriterion("publicity_time not in", values, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeBetween(Date value1, Date value2) {
            addCriterion("publicity_time between", value1, value2, "publicityTime");
            return (Criteria) this;
        }

        public Criteria andPublicityTimeNotBetween(Date value1, Date value2) {
            addCriterion("publicity_time not between", value1, value2, "publicityTime");
            return (Criteria) this;
        }
        
		
        public Criteria andPublicityContextIsNull() {
            addCriterion("publicity_context is null");
            return (Criteria) this;
        }

        public Criteria andPublicityContextIsNotNull() {
            addCriterion("publicity_context is not null");
            return (Criteria) this;
        }

        public Criteria andPublicityContextEqualTo(String value) {
            addCriterion("publicity_context =", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextNotEqualTo(String value) {
            addCriterion("publicity_context <>", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextGreaterThan(String value) {
            addCriterion("publicity_context >", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextGreaterThanOrEqualTo(String value) {
            addCriterion("publicity_context >=", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextLessThan(String value) {
            addCriterion("publicity_context <", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextLessThanOrEqualTo(String value) {
            addCriterion("publicity_context <=", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextLike(String value) {
            addCriterion("publicity_context like", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextNotLike(String value) {
            addCriterion("publicity_context not like", value, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextIn(List<String> values) {
            addCriterion("publicity_context in", values, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextNotIn(List<String> values) {
            addCriterion("publicity_context not in", values, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextBetween(String value1, String value2) {
            addCriterion("publicity_context between", value1, value2, "publicityContext");
            return (Criteria) this;
        }

        public Criteria andPublicityContextNotBetween(String value1, String value2) {
            addCriterion("publicity_context not between", value1, value2, "publicityContext");
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
        
		
        public Criteria andPublicityWayIsNull() {
            addCriterion("publicity_way is null");
            return (Criteria) this;
        }

        public Criteria andPublicityWayIsNotNull() {
            addCriterion("publicity_way is not null");
            return (Criteria) this;
        }

        public Criteria andPublicityWayEqualTo(String value) {
            addCriterion("publicity_way =", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayNotEqualTo(String value) {
            addCriterion("publicity_way <>", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayGreaterThan(String value) {
            addCriterion("publicity_way >", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayGreaterThanOrEqualTo(String value) {
            addCriterion("publicity_way >=", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayLessThan(String value) {
            addCriterion("publicity_way <", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayLessThanOrEqualTo(String value) {
            addCriterion("publicity_way <=", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayLike(String value) {
            addCriterion("publicity_way like", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayNotLike(String value) {
            addCriterion("publicity_way not like", value, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayIn(List<String> values) {
            addCriterion("publicity_way in", values, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayNotIn(List<String> values) {
            addCriterion("publicity_way not in", values, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayBetween(String value1, String value2) {
            addCriterion("publicity_way between", value1, value2, "publicityWay");
            return (Criteria) this;
        }

        public Criteria andPublicityWayNotBetween(String value1, String value2) {
            addCriterion("publicity_way not between", value1, value2, "publicityWay");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(AdmissionsPublicity record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getPublicityTime()!=null&&StrUtil.isNotEmpty(record.getPublicityTime().toString())) {
    			 list.add("ifnull(publicity_time,'')");
    		}
			if(record.getPublicityContext()!=null&&StrUtil.isNotEmpty(record.getPublicityContext().toString())) {
    			 list.add("ifnull(publicity_context,'')");
    		}
			if(record.getAdmissionsRule()!=null&&StrUtil.isNotEmpty(record.getAdmissionsRule().toString())) {
    			 list.add("ifnull(admissions_rule,'')");
    		}
			if(record.getPublicityWay()!=null&&StrUtil.isNotEmpty(record.getPublicityWay().toString())) {
    			 list.add("ifnull(publicity_way,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getPublicityTime()!=null&&StrUtil.isNotEmpty(record.getPublicityTime().toString())) {
    			list2.add("'%"+record.getPublicityTime()+"%'");
    		}
			if(record.getPublicityContext()!=null&&StrUtil.isNotEmpty(record.getPublicityContext().toString())) {
    			list2.add("'%"+record.getPublicityContext()+"%'");
    		}
			if(record.getAdmissionsRule()!=null&&StrUtil.isNotEmpty(record.getAdmissionsRule().toString())) {
    			list2.add("'%"+record.getAdmissionsRule()+"%'");
    		}
			if(record.getPublicityWay()!=null&&StrUtil.isNotEmpty(record.getPublicityWay().toString())) {
    			list2.add("'%"+record.getPublicityWay()+"%'");
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
    		list.add("ifnull(publicity_time,'')");
    		list.add("ifnull(publicity_context,'')");
    		list.add("ifnull(admissions_rule,'')");
    		list.add("ifnull(publicity_way,'')");
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