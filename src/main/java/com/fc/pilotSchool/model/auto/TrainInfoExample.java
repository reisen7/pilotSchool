package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 培训信息 TrainInfoExample
 * @author fuce_自动生成
 * @date 2023-05-13 20:46:33
 */
public class TrainInfoExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainInfoExample() {
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
        
		
        public Criteria andTrainingIdIsNull() {
            addCriterion("training_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainingIdIsNotNull() {
            addCriterion("training_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingIdEqualTo(String value) {
            addCriterion("training_id =", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdNotEqualTo(String value) {
            addCriterion("training_id <>", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdGreaterThan(String value) {
            addCriterion("training_id >", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdGreaterThanOrEqualTo(String value) {
            addCriterion("training_id >=", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdLessThan(String value) {
            addCriterion("training_id <", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdLessThanOrEqualTo(String value) {
            addCriterion("training_id <=", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdLike(String value) {
            addCriterion("training_id like", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdNotLike(String value) {
            addCriterion("training_id not like", value, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdIn(List<String> values) {
            addCriterion("training_id in", values, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdNotIn(List<String> values) {
            addCriterion("training_id not in", values, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdBetween(String value1, String value2) {
            addCriterion("training_id between", value1, value2, "trainingId");
            return (Criteria) this;
        }

        public Criteria andTrainingIdNotBetween(String value1, String value2) {
            addCriterion("training_id not between", value1, value2, "trainingId");
            return (Criteria) this;
        }
        
		
        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("place_id like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("place_id not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }
        
		
        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(String value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(String value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(String value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(String value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(String value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(String value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLike(String value) {
            addCriterion("machine_id like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotLike(String value) {
            addCriterion("machine_id not like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<String> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<String> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(String value1, String value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(String value1, String value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainingPlaceIsNull() {
            addCriterion("training_place is null");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceIsNotNull() {
            addCriterion("training_place is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceEqualTo(String value) {
            addCriterion("training_place =", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceNotEqualTo(String value) {
            addCriterion("training_place <>", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceGreaterThan(String value) {
            addCriterion("training_place >", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("training_place >=", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceLessThan(String value) {
            addCriterion("training_place <", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceLessThanOrEqualTo(String value) {
            addCriterion("training_place <=", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceLike(String value) {
            addCriterion("training_place like", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceNotLike(String value) {
            addCriterion("training_place not like", value, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceIn(List<String> values) {
            addCriterion("training_place in", values, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceNotIn(List<String> values) {
            addCriterion("training_place not in", values, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceBetween(String value1, String value2) {
            addCriterion("training_place between", value1, value2, "trainingPlace");
            return (Criteria) this;
        }

        public Criteria andTrainingPlaceNotBetween(String value1, String value2) {
            addCriterion("training_place not between", value1, value2, "trainingPlace");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainingDetailsIsNull() {
            addCriterion("training_details is null");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsIsNotNull() {
            addCriterion("training_details is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsEqualTo(String value) {
            addCriterion("training_details =", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsNotEqualTo(String value) {
            addCriterion("training_details <>", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsGreaterThan(String value) {
            addCriterion("training_details >", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("training_details >=", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsLessThan(String value) {
            addCriterion("training_details <", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsLessThanOrEqualTo(String value) {
            addCriterion("training_details <=", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsLike(String value) {
            addCriterion("training_details like", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsNotLike(String value) {
            addCriterion("training_details not like", value, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsIn(List<String> values) {
            addCriterion("training_details in", values, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsNotIn(List<String> values) {
            addCriterion("training_details not in", values, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsBetween(String value1, String value2) {
            addCriterion("training_details between", value1, value2, "trainingDetails");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailsNotBetween(String value1, String value2) {
            addCriterion("training_details not between", value1, value2, "trainingDetails");
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
        
		
        public Criteria andTrainCategoryIsNull() {
            addCriterion("train_category is null");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryIsNotNull() {
            addCriterion("train_category is not null");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryEqualTo(String value) {
            addCriterion("train_category =", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryNotEqualTo(String value) {
            addCriterion("train_category <>", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryGreaterThan(String value) {
            addCriterion("train_category >", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("train_category >=", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryLessThan(String value) {
            addCriterion("train_category <", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryLessThanOrEqualTo(String value) {
            addCriterion("train_category <=", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryLike(String value) {
            addCriterion("train_category like", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryNotLike(String value) {
            addCriterion("train_category not like", value, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryIn(List<String> values) {
            addCriterion("train_category in", values, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryNotIn(List<String> values) {
            addCriterion("train_category not in", values, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryBetween(String value1, String value2) {
            addCriterion("train_category between", value1, value2, "trainCategory");
            return (Criteria) this;
        }

        public Criteria andTrainCategoryNotBetween(String value1, String value2) {
            addCriterion("train_category not between", value1, value2, "trainCategory");
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
        
	
		 public Criteria andLikeQuery(TrainInfo record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getTrainingId()!=null&&StrUtil.isNotEmpty(record.getTrainingId().toString())) {
    			 list.add("ifnull(training_id,'')");
    		}
			if(record.getPlaceId()!=null&&StrUtil.isNotEmpty(record.getPlaceId().toString())) {
    			 list.add("ifnull(place_id,'')");
    		}
			if(record.getMachineId()!=null&&StrUtil.isNotEmpty(record.getMachineId().toString())) {
    			 list.add("ifnull(machine_id,'')");
    		}
			if(record.getTrainingPlace()!=null&&StrUtil.isNotEmpty(record.getTrainingPlace().toString())) {
    			 list.add("ifnull(training_place,'')");
    		}
			if(record.getTrainingDetails()!=null&&StrUtil.isNotEmpty(record.getTrainingDetails().toString())) {
    			 list.add("ifnull(training_details,'')");
    		}
			if(record.getStartDate()!=null&&StrUtil.isNotEmpty(record.getStartDate().toString())) {
    			 list.add("ifnull(start_date,'')");
    		}
			if(record.getEndDate()!=null&&StrUtil.isNotEmpty(record.getEndDate().toString())) {
    			 list.add("ifnull(end_date,'')");
    		}
			if(record.getTrainCategory()!=null&&StrUtil.isNotEmpty(record.getTrainCategory().toString())) {
    			 list.add("ifnull(train_category,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getTrainingId()!=null&&StrUtil.isNotEmpty(record.getTrainingId().toString())) {
    			list2.add("'%"+record.getTrainingId()+"%'");
    		}
			if(record.getPlaceId()!=null&&StrUtil.isNotEmpty(record.getPlaceId().toString())) {
    			list2.add("'%"+record.getPlaceId()+"%'");
    		}
			if(record.getMachineId()!=null&&StrUtil.isNotEmpty(record.getMachineId().toString())) {
    			list2.add("'%"+record.getMachineId()+"%'");
    		}
			if(record.getTrainingPlace()!=null&&StrUtil.isNotEmpty(record.getTrainingPlace().toString())) {
    			list2.add("'%"+record.getTrainingPlace()+"%'");
    		}
			if(record.getTrainingDetails()!=null&&StrUtil.isNotEmpty(record.getTrainingDetails().toString())) {
    			list2.add("'%"+record.getTrainingDetails()+"%'");
    		}
			if(record.getStartDate()!=null&&StrUtil.isNotEmpty(record.getStartDate().toString())) {
    			list2.add("'%"+record.getStartDate()+"%'");
    		}
			if(record.getEndDate()!=null&&StrUtil.isNotEmpty(record.getEndDate().toString())) {
    			list2.add("'%"+record.getEndDate()+"%'");
    		}
			if(record.getTrainCategory()!=null&&StrUtil.isNotEmpty(record.getTrainCategory().toString())) {
    			list2.add("'%"+record.getTrainCategory()+"%'");
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
    		list.add("ifnull(training_id,'')");
    		list.add("ifnull(place_id,'')");
    		list.add("ifnull(machine_id,'')");
    		list.add("ifnull(training_place,'')");
    		list.add("ifnull(training_details,'')");
    		list.add("ifnull(start_date,'')");
    		list.add("ifnull(end_date,'')");
    		list.add("ifnull(train_category,'')");
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