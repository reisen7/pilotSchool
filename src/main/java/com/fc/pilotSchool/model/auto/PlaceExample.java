package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 场地 PlaceExample
 * @author fuce_自动生成
 * @date 2023-05-10 14:21:55
 */
public class PlaceExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceExample() {
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
        
		
        public Criteria andPlaceNameIsNull() {
            addCriterion("place_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIsNotNull() {
            addCriterion("place_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceNameEqualTo(String value) {
            addCriterion("place_name =", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotEqualTo(String value) {
            addCriterion("place_name <>", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThan(String value) {
            addCriterion("place_name >", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("place_name >=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThan(String value) {
            addCriterion("place_name <", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("place_name <=", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameLike(String value) {
            addCriterion("place_name like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotLike(String value) {
            addCriterion("place_name not like", value, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameIn(List<String> values) {
            addCriterion("place_name in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotIn(List<String> values) {
            addCriterion("place_name not in", values, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameBetween(String value1, String value2) {
            addCriterion("place_name between", value1, value2, "placeName");
            return (Criteria) this;
        }

        public Criteria andPlaceNameNotBetween(String value1, String value2) {
            addCriterion("place_name not between", value1, value2, "placeName");
            return (Criteria) this;
        }
        
		
        public Criteria andPlaceAddressIsNull() {
            addCriterion("place_address is null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIsNotNull() {
            addCriterion("place_address is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressEqualTo(String value) {
            addCriterion("place_address =", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotEqualTo(String value) {
            addCriterion("place_address <>", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThan(String value) {
            addCriterion("place_address >", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("place_address >=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThan(String value) {
            addCriterion("place_address <", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLessThanOrEqualTo(String value) {
            addCriterion("place_address <=", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressLike(String value) {
            addCriterion("place_address like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotLike(String value) {
            addCriterion("place_address not like", value, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressIn(List<String> values) {
            addCriterion("place_address in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotIn(List<String> values) {
            addCriterion("place_address not in", values, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressBetween(String value1, String value2) {
            addCriterion("place_address between", value1, value2, "placeAddress");
            return (Criteria) this;
        }

        public Criteria andPlaceAddressNotBetween(String value1, String value2) {
            addCriterion("place_address not between", value1, value2, "placeAddress");
            return (Criteria) this;
        }
        
		
        public Criteria andPlaceMasterIsNull() {
            addCriterion("place_master is null");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterIsNotNull() {
            addCriterion("place_master is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterEqualTo(String value) {
            addCriterion("place_master =", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterNotEqualTo(String value) {
            addCriterion("place_master <>", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterGreaterThan(String value) {
            addCriterion("place_master >", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterGreaterThanOrEqualTo(String value) {
            addCriterion("place_master >=", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterLessThan(String value) {
            addCriterion("place_master <", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterLessThanOrEqualTo(String value) {
            addCriterion("place_master <=", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterLike(String value) {
            addCriterion("place_master like", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterNotLike(String value) {
            addCriterion("place_master not like", value, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterIn(List<String> values) {
            addCriterion("place_master in", values, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterNotIn(List<String> values) {
            addCriterion("place_master not in", values, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterBetween(String value1, String value2) {
            addCriterion("place_master between", value1, value2, "placeMaster");
            return (Criteria) this;
        }

        public Criteria andPlaceMasterNotBetween(String value1, String value2) {
            addCriterion("place_master not between", value1, value2, "placeMaster");
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
        
		
        public Criteria andPlaceStatusIsNull() {
            addCriterion("place_status is null");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusIsNotNull() {
            addCriterion("place_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusEqualTo(String value) {
            addCriterion("place_status =", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotEqualTo(String value) {
            addCriterion("place_status <>", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusGreaterThan(String value) {
            addCriterion("place_status >", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("place_status >=", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusLessThan(String value) {
            addCriterion("place_status <", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusLessThanOrEqualTo(String value) {
            addCriterion("place_status <=", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusLike(String value) {
            addCriterion("place_status like", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotLike(String value) {
            addCriterion("place_status not like", value, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusIn(List<String> values) {
            addCriterion("place_status in", values, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotIn(List<String> values) {
            addCriterion("place_status not in", values, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusBetween(String value1, String value2) {
            addCriterion("place_status between", value1, value2, "placeStatus");
            return (Criteria) this;
        }

        public Criteria andPlaceStatusNotBetween(String value1, String value2) {
            addCriterion("place_status not between", value1, value2, "placeStatus");
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
        
	
		 public Criteria andLikeQuery(Place record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getPlaceName()!=null&&StrUtil.isNotEmpty(record.getPlaceName().toString())) {
    			 list.add("ifnull(place_name,'')");
    		}
			if(record.getPlaceAddress()!=null&&StrUtil.isNotEmpty(record.getPlaceAddress().toString())) {
    			 list.add("ifnull(place_address,'')");
    		}
			if(record.getPlaceMaster()!=null&&StrUtil.isNotEmpty(record.getPlaceMaster().toString())) {
    			 list.add("ifnull(place_master,'')");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			 list.add("ifnull(master_phone,'')");
    		}
			if(record.getPlaceStatus()!=null&&StrUtil.isNotEmpty(record.getPlaceStatus().toString())) {
    			 list.add("ifnull(place_status,'')");
    		}
			if(record.getCost()!=null&&StrUtil.isNotEmpty(record.getCost().toString())) {
    			 list.add("ifnull(cost,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getPlaceName()!=null&&StrUtil.isNotEmpty(record.getPlaceName().toString())) {
    			list2.add("'%"+record.getPlaceName()+"%'");
    		}
			if(record.getPlaceAddress()!=null&&StrUtil.isNotEmpty(record.getPlaceAddress().toString())) {
    			list2.add("'%"+record.getPlaceAddress()+"%'");
    		}
			if(record.getPlaceMaster()!=null&&StrUtil.isNotEmpty(record.getPlaceMaster().toString())) {
    			list2.add("'%"+record.getPlaceMaster()+"%'");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			list2.add("'%"+record.getMasterPhone()+"%'");
    		}
			if(record.getPlaceStatus()!=null&&StrUtil.isNotEmpty(record.getPlaceStatus().toString())) {
    			list2.add("'%"+record.getPlaceStatus()+"%'");
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
    		list.add("ifnull(place_name,'')");
    		list.add("ifnull(place_address,'')");
    		list.add("ifnull(place_master,'')");
    		list.add("ifnull(master_phone,'')");
    		list.add("ifnull(place_status,'')");
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