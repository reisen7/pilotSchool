package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 设施 FacilityExample
 * @author fuce_自动生成
 * @date 2023-05-10 14:23:27
 */
public class FacilityExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacilityExample() {
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
        
		
        public Criteria andFacilityNameIsNull() {
            addCriterion("facility_name is null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNotNull() {
            addCriterion("facility_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameEqualTo(String value) {
            addCriterion("facility_name =", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotEqualTo(String value) {
            addCriterion("facility_name <>", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThan(String value) {
            addCriterion("facility_name >", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("facility_name >=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThan(String value) {
            addCriterion("facility_name <", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThanOrEqualTo(String value) {
            addCriterion("facility_name <=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLike(String value) {
            addCriterion("facility_name like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotLike(String value) {
            addCriterion("facility_name not like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIn(List<String> values) {
            addCriterion("facility_name in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotIn(List<String> values) {
            addCriterion("facility_name not in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameBetween(String value1, String value2) {
            addCriterion("facility_name between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotBetween(String value1, String value2) {
            addCriterion("facility_name not between", value1, value2, "facilityName");
            return (Criteria) this;
        }
        
		
        public Criteria andFacilityAddressIsNull() {
            addCriterion("facility_address is null");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressIsNotNull() {
            addCriterion("facility_address is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressEqualTo(String value) {
            addCriterion("facility_address =", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressNotEqualTo(String value) {
            addCriterion("facility_address <>", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressGreaterThan(String value) {
            addCriterion("facility_address >", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("facility_address >=", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressLessThan(String value) {
            addCriterion("facility_address <", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressLessThanOrEqualTo(String value) {
            addCriterion("facility_address <=", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressLike(String value) {
            addCriterion("facility_address like", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressNotLike(String value) {
            addCriterion("facility_address not like", value, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressIn(List<String> values) {
            addCriterion("facility_address in", values, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressNotIn(List<String> values) {
            addCriterion("facility_address not in", values, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressBetween(String value1, String value2) {
            addCriterion("facility_address between", value1, value2, "facilityAddress");
            return (Criteria) this;
        }

        public Criteria andFacilityAddressNotBetween(String value1, String value2) {
            addCriterion("facility_address not between", value1, value2, "facilityAddress");
            return (Criteria) this;
        }
        
		
        public Criteria andFacilityMasterIsNull() {
            addCriterion("facility_master is null");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterIsNotNull() {
            addCriterion("facility_master is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterEqualTo(String value) {
            addCriterion("facility_master =", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterNotEqualTo(String value) {
            addCriterion("facility_master <>", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterGreaterThan(String value) {
            addCriterion("facility_master >", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterGreaterThanOrEqualTo(String value) {
            addCriterion("facility_master >=", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterLessThan(String value) {
            addCriterion("facility_master <", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterLessThanOrEqualTo(String value) {
            addCriterion("facility_master <=", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterLike(String value) {
            addCriterion("facility_master like", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterNotLike(String value) {
            addCriterion("facility_master not like", value, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterIn(List<String> values) {
            addCriterion("facility_master in", values, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterNotIn(List<String> values) {
            addCriterion("facility_master not in", values, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterBetween(String value1, String value2) {
            addCriterion("facility_master between", value1, value2, "facilityMaster");
            return (Criteria) this;
        }

        public Criteria andFacilityMasterNotBetween(String value1, String value2) {
            addCriterion("facility_master not between", value1, value2, "facilityMaster");
            return (Criteria) this;
        }
        
		
        public Criteria andMasterPhoneIsNull() {
            addCriterion("master_phone is null");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneIsNotNull() {
            addCriterion("master_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneEqualTo(String value) {
            addCriterion("master_phone =", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneNotEqualTo(String value) {
            addCriterion("master_phone <>", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneGreaterThan(String value) {
            addCriterion("master_phone >", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("master_phone >=", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneLessThan(String value) {
            addCriterion("master_phone <", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneLessThanOrEqualTo(String value) {
            addCriterion("master_phone <=", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneLike(String value) {
            addCriterion("master_phone like", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneNotLike(String value) {
            addCriterion("master_phone not like", value, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneIn(List<String> values) {
            addCriterion("master_phone in", values, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneNotIn(List<String> values) {
            addCriterion("master_phone not in", values, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneBetween(String value1, String value2) {
            addCriterion("master_phone between", value1, value2, "masterPhone");
            return (Criteria) this;
        }

        public Criteria andMasterPhoneNotBetween(String value1, String value2) {
            addCriterion("master_phone not between", value1, value2, "masterPhone");
            return (Criteria) this;
        }
        
		
        public Criteria andFacilityStatusIsNull() {
            addCriterion("facility_status is null");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusIsNotNull() {
            addCriterion("facility_status is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusEqualTo(String value) {
            addCriterion("facility_status =", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotEqualTo(String value) {
            addCriterion("facility_status <>", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusGreaterThan(String value) {
            addCriterion("facility_status >", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("facility_status >=", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLessThan(String value) {
            addCriterion("facility_status <", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLessThanOrEqualTo(String value) {
            addCriterion("facility_status <=", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLike(String value) {
            addCriterion("facility_status like", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotLike(String value) {
            addCriterion("facility_status not like", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusIn(List<String> values) {
            addCriterion("facility_status in", values, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotIn(List<String> values) {
            addCriterion("facility_status not in", values, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusBetween(String value1, String value2) {
            addCriterion("facility_status between", value1, value2, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotBetween(String value1, String value2) {
            addCriterion("facility_status not between", value1, value2, "facilityStatus");
            return (Criteria) this;
        }
        
		
        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(String value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(String value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(String value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(String value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(String value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(String value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLike(String value) {
            addCriterion("cost like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotLike(String value) {
            addCriterion("cost not like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<String> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<String> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(String value1, String value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(String value1, String value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Facility record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getFacilityName()!=null&&StrUtil.isNotEmpty(record.getFacilityName().toString())) {
    			 list.add("ifnull(facility_name,'')");
    		}
			if(record.getFacilityAddress()!=null&&StrUtil.isNotEmpty(record.getFacilityAddress().toString())) {
    			 list.add("ifnull(facility_address,'')");
    		}
			if(record.getFacilityMaster()!=null&&StrUtil.isNotEmpty(record.getFacilityMaster().toString())) {
    			 list.add("ifnull(facility_master,'')");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			 list.add("ifnull(master_phone,'')");
    		}
			if(record.getFacilityStatus()!=null&&StrUtil.isNotEmpty(record.getFacilityStatus().toString())) {
    			 list.add("ifnull(facility_status,'')");
    		}
			if(record.getCost()!=null&&StrUtil.isNotEmpty(record.getCost().toString())) {
    			 list.add("ifnull(cost,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getFacilityName()!=null&&StrUtil.isNotEmpty(record.getFacilityName().toString())) {
    			list2.add("'%"+record.getFacilityName()+"%'");
    		}
			if(record.getFacilityAddress()!=null&&StrUtil.isNotEmpty(record.getFacilityAddress().toString())) {
    			list2.add("'%"+record.getFacilityAddress()+"%'");
    		}
			if(record.getFacilityMaster()!=null&&StrUtil.isNotEmpty(record.getFacilityMaster().toString())) {
    			list2.add("'%"+record.getFacilityMaster()+"%'");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			list2.add("'%"+record.getMasterPhone()+"%'");
    		}
			if(record.getFacilityStatus()!=null&&StrUtil.isNotEmpty(record.getFacilityStatus().toString())) {
    			list2.add("'%"+record.getFacilityStatus()+"%'");
    		}
			if(record.getCost()!=null&&StrUtil.isNotEmpty(record.getCost().toString())) {
    			list2.add("'%"+record.getCost()+"%'");
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
    		list.add("ifnull(facility_name,'')");
    		list.add("ifnull(facility_address,'')");
    		list.add("ifnull(facility_master,'')");
    		list.add("ifnull(master_phone,'')");
    		list.add("ifnull(facility_status,'')");
    		list.add("ifnull(cost,'')");
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