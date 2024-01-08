package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 设备表 MachineExample
 * @author fuce_自动生成
 * @date 2023-05-10 14:22:57
 */
public class MachineExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineExample() {
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
        
		
        public Criteria andMachineNameIsNull() {
            addCriterion("machine_name is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("machine_name is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("machine_name =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("machine_name <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("machine_name >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("machine_name >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("machine_name <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("machine_name <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("machine_name like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("machine_name not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("machine_name in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("machine_name not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("machine_name between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("machine_name not between", value1, value2, "machineName");
            return (Criteria) this;
        }
        
		
        public Criteria andMachineAddressIsNull() {
            addCriterion("machine_address is null");
            return (Criteria) this;
        }

        public Criteria andMachineAddressIsNotNull() {
            addCriterion("machine_address is not null");
            return (Criteria) this;
        }

        public Criteria andMachineAddressEqualTo(String value) {
            addCriterion("machine_address =", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressNotEqualTo(String value) {
            addCriterion("machine_address <>", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressGreaterThan(String value) {
            addCriterion("machine_address >", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressGreaterThanOrEqualTo(String value) {
            addCriterion("machine_address >=", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressLessThan(String value) {
            addCriterion("machine_address <", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressLessThanOrEqualTo(String value) {
            addCriterion("machine_address <=", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressLike(String value) {
            addCriterion("machine_address like", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressNotLike(String value) {
            addCriterion("machine_address not like", value, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressIn(List<String> values) {
            addCriterion("machine_address in", values, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressNotIn(List<String> values) {
            addCriterion("machine_address not in", values, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressBetween(String value1, String value2) {
            addCriterion("machine_address between", value1, value2, "machineAddress");
            return (Criteria) this;
        }

        public Criteria andMachineAddressNotBetween(String value1, String value2) {
            addCriterion("machine_address not between", value1, value2, "machineAddress");
            return (Criteria) this;
        }
        
		
        public Criteria andMachineMasterIsNull() {
            addCriterion("machine_master is null");
            return (Criteria) this;
        }

        public Criteria andMachineMasterIsNotNull() {
            addCriterion("machine_master is not null");
            return (Criteria) this;
        }

        public Criteria andMachineMasterEqualTo(String value) {
            addCriterion("machine_master =", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterNotEqualTo(String value) {
            addCriterion("machine_master <>", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterGreaterThan(String value) {
            addCriterion("machine_master >", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterGreaterThanOrEqualTo(String value) {
            addCriterion("machine_master >=", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterLessThan(String value) {
            addCriterion("machine_master <", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterLessThanOrEqualTo(String value) {
            addCriterion("machine_master <=", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterLike(String value) {
            addCriterion("machine_master like", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterNotLike(String value) {
            addCriterion("machine_master not like", value, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterIn(List<String> values) {
            addCriterion("machine_master in", values, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterNotIn(List<String> values) {
            addCriterion("machine_master not in", values, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterBetween(String value1, String value2) {
            addCriterion("machine_master between", value1, value2, "machineMaster");
            return (Criteria) this;
        }

        public Criteria andMachineMasterNotBetween(String value1, String value2) {
            addCriterion("machine_master not between", value1, value2, "machineMaster");
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
        
		
        public Criteria andMachineStatusIsNull() {
            addCriterion("machine_status is null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIsNotNull() {
            addCriterion("machine_status is not null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusEqualTo(String value) {
            addCriterion("machine_status =", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotEqualTo(String value) {
            addCriterion("machine_status <>", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThan(String value) {
            addCriterion("machine_status >", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThanOrEqualTo(String value) {
            addCriterion("machine_status >=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThan(String value) {
            addCriterion("machine_status <", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThanOrEqualTo(String value) {
            addCriterion("machine_status <=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLike(String value) {
            addCriterion("machine_status like", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotLike(String value) {
            addCriterion("machine_status not like", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIn(List<String> values) {
            addCriterion("machine_status in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotIn(List<String> values) {
            addCriterion("machine_status not in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusBetween(String value1, String value2) {
            addCriterion("machine_status between", value1, value2, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotBetween(String value1, String value2) {
            addCriterion("machine_status not between", value1, value2, "machineStatus");
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
        
	
		 public Criteria andLikeQuery(Machine record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getMachineName()!=null&&StrUtil.isNotEmpty(record.getMachineName().toString())) {
    			 list.add("ifnull(machine_name,'')");
    		}
			if(record.getMachineAddress()!=null&&StrUtil.isNotEmpty(record.getMachineAddress().toString())) {
    			 list.add("ifnull(machine_address,'')");
    		}
			if(record.getMachineMaster()!=null&&StrUtil.isNotEmpty(record.getMachineMaster().toString())) {
    			 list.add("ifnull(machine_master,'')");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			 list.add("ifnull(master_phone,'')");
    		}
			if(record.getMachineStatus()!=null&&StrUtil.isNotEmpty(record.getMachineStatus().toString())) {
    			 list.add("ifnull(machine_status,'')");
    		}
			if(record.getCost()!=null&&StrUtil.isNotEmpty(record.getCost().toString())) {
    			 list.add("ifnull(cost,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getMachineName()!=null&&StrUtil.isNotEmpty(record.getMachineName().toString())) {
    			list2.add("'%"+record.getMachineName()+"%'");
    		}
			if(record.getMachineAddress()!=null&&StrUtil.isNotEmpty(record.getMachineAddress().toString())) {
    			list2.add("'%"+record.getMachineAddress()+"%'");
    		}
			if(record.getMachineMaster()!=null&&StrUtil.isNotEmpty(record.getMachineMaster().toString())) {
    			list2.add("'%"+record.getMachineMaster()+"%'");
    		}
			if(record.getMasterPhone()!=null&&StrUtil.isNotEmpty(record.getMasterPhone().toString())) {
    			list2.add("'%"+record.getMasterPhone()+"%'");
    		}
			if(record.getMachineStatus()!=null&&StrUtil.isNotEmpty(record.getMachineStatus().toString())) {
    			list2.add("'%"+record.getMachineStatus()+"%'");
    		}
			if(record.getCost()!=null&&StrUtil.isNotEmpty(record.getCost().toString())) {
    			list2.add("'%"+record.getCost()+"%'");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			list2.add("'%"+record.getStatus()+"%'");
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
    		list.add("ifnull(machine_name,'')");
    		list.add("ifnull(machine_address,'')");
    		list.add("ifnull(machine_master,'')");
    		list.add("ifnull(master_phone,'')");
    		list.add("ifnull(machine_status,'')");
    		list.add("ifnull(cost,'')");
    		list.add("ifnull(status,'')");
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