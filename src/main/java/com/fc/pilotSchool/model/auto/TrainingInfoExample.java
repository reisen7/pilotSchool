package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 训练信息管理 TrainingInfoExample
 * @author fuce_自动生成
 * @date 2023-05-10 21:53:52
 */
public class TrainingInfoExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingInfoExample() {
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
        
		
        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
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
        
		
        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainNumberIsNull() {
            addCriterion("train_number is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIsNotNull() {
            addCriterion("train_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberEqualTo(String value) {
            addCriterion("train_number =", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotEqualTo(String value) {
            addCriterion("train_number <>", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThan(String value) {
            addCriterion("train_number >", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThanOrEqualTo(String value) {
            addCriterion("train_number >=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThan(String value) {
            addCriterion("train_number <", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThanOrEqualTo(String value) {
            addCriterion("train_number <=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLike(String value) {
            addCriterion("train_number like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotLike(String value) {
            addCriterion("train_number not like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIn(List<String> values) {
            addCriterion("train_number in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotIn(List<String> values) {
            addCriterion("train_number not in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberBetween(String value1, String value2) {
            addCriterion("train_number between", value1, value2, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotBetween(String value1, String value2) {
            addCriterion("train_number not between", value1, value2, "trainNumber");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainStarttimeIsNull() {
            addCriterion("train_starttime is null");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeIsNotNull() {
            addCriterion("train_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeEqualTo(Date value) {
            addCriterion("train_starttime =", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeNotEqualTo(Date value) {
            addCriterion("train_starttime <>", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeGreaterThan(Date value) {
            addCriterion("train_starttime >", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("train_starttime >=", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeLessThan(Date value) {
            addCriterion("train_starttime <", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("train_starttime <=", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeLike(Date value) {
            addCriterion("train_starttime like", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeNotLike(Date value) {
            addCriterion("train_starttime not like", value, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeIn(List<Date> values) {
            addCriterion("train_starttime in", values, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeNotIn(List<Date> values) {
            addCriterion("train_starttime not in", values, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeBetween(Date value1, Date value2) {
            addCriterion("train_starttime between", value1, value2, "trainStarttime");
            return (Criteria) this;
        }

        public Criteria andTrainStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("train_starttime not between", value1, value2, "trainStarttime");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainEndtimeIsNull() {
            addCriterion("train_endtime is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeIsNotNull() {
            addCriterion("train_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeEqualTo(Date value) {
            addCriterion("train_endtime =", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeNotEqualTo(Date value) {
            addCriterion("train_endtime <>", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeGreaterThan(Date value) {
            addCriterion("train_endtime >", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("train_endtime >=", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeLessThan(Date value) {
            addCriterion("train_endtime <", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("train_endtime <=", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeLike(Date value) {
            addCriterion("train_endtime like", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeNotLike(Date value) {
            addCriterion("train_endtime not like", value, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeIn(List<Date> values) {
            addCriterion("train_endtime in", values, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeNotIn(List<Date> values) {
            addCriterion("train_endtime not in", values, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeBetween(Date value1, Date value2) {
            addCriterion("train_endtime between", value1, value2, "trainEndtime");
            return (Criteria) this;
        }

        public Criteria andTrainEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("train_endtime not between", value1, value2, "trainEndtime");
            return (Criteria) this;
        }
        
		
        public Criteria andTrainIdIsNull() {
            addCriterion("train_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("train_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(String value) {
            addCriterion("train_id =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(String value) {
            addCriterion("train_id <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(String value) {
            addCriterion("train_id >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(String value) {
            addCriterion("train_id >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(String value) {
            addCriterion("train_id <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(String value) {
            addCriterion("train_id <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLike(String value) {
            addCriterion("train_id like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotLike(String value) {
            addCriterion("train_id not like", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<String> values) {
            addCriterion("train_id in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<String> values) {
            addCriterion("train_id not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(String value1, String value2) {
            addCriterion("train_id between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(String value1, String value2) {
            addCriterion("train_id not between", value1, value2, "trainId");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(TrainingInfo record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getTrainingPlace()!=null&&StrUtil.isNotEmpty(record.getTrainingPlace().toString())) {
    			 list.add("ifnull(training_place,'')");
    		}
			if(record.getTrainingContent()!=null&&StrUtil.isNotEmpty(record.getTrainingContent().toString())) {
    			 list.add("ifnull(training_content,'')");
    		}
			if(record.getTId()!=null&&StrUtil.isNotEmpty(record.getTId().toString())) {
    			 list.add("ifnull(t_id,'')");
    		}
			if(record.getMachineId()!=null&&StrUtil.isNotEmpty(record.getMachineId().toString())) {
    			 list.add("ifnull(machine_id,'')");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			 list.add("ifnull(status,'')");
    		}
			if(record.getSId()!=null&&StrUtil.isNotEmpty(record.getSId().toString())) {
    			 list.add("ifnull(s_id,'')");
    		}
			if(record.getTrainNumber()!=null&&StrUtil.isNotEmpty(record.getTrainNumber().toString())) {
    			 list.add("ifnull(train_number,'')");
    		}
			if(record.getTrainStarttime()!=null&&StrUtil.isNotEmpty(record.getTrainStarttime().toString())) {
    			 list.add("ifnull(train_starttime,'')");
    		}
			if(record.getTrainEndtime()!=null&&StrUtil.isNotEmpty(record.getTrainEndtime().toString())) {
    			 list.add("ifnull(train_endtime,'')");
    		}
			if(record.getTrainId()!=null&&StrUtil.isNotEmpty(record.getTrainId().toString())) {
    			 list.add("ifnull(train_id,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getTrainingPlace()!=null&&StrUtil.isNotEmpty(record.getTrainingPlace().toString())) {
    			list2.add("'%"+record.getTrainingPlace()+"%'");
    		}
			if(record.getTrainingContent()!=null&&StrUtil.isNotEmpty(record.getTrainingContent().toString())) {
    			list2.add("'%"+record.getTrainingContent()+"%'");
    		}
			if(record.getTId()!=null&&StrUtil.isNotEmpty(record.getTId().toString())) {
    			list2.add("'%"+record.getTId()+"%'");
    		}
			if(record.getMachineId()!=null&&StrUtil.isNotEmpty(record.getMachineId().toString())) {
    			list2.add("'%"+record.getMachineId()+"%'");
    		}
			if(record.getStatus()!=null&&StrUtil.isNotEmpty(record.getStatus().toString())) {
    			list2.add("'%"+record.getStatus()+"%'");
    		}
			if(record.getSId()!=null&&StrUtil.isNotEmpty(record.getSId().toString())) {
    			list2.add("'%"+record.getSId()+"%'");
    		}
			if(record.getTrainNumber()!=null&&StrUtil.isNotEmpty(record.getTrainNumber().toString())) {
    			list2.add("'%"+record.getTrainNumber()+"%'");
    		}
			if(record.getTrainStarttime()!=null&&StrUtil.isNotEmpty(record.getTrainStarttime().toString())) {
    			list2.add("'%"+record.getTrainStarttime()+"%'");
    		}
			if(record.getTrainEndtime()!=null&&StrUtil.isNotEmpty(record.getTrainEndtime().toString())) {
    			list2.add("'%"+record.getTrainEndtime()+"%'");
    		}
			if(record.getTrainId()!=null&&StrUtil.isNotEmpty(record.getTrainId().toString())) {
    			list2.add("'%"+record.getTrainId()+"%'");
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
    		list.add("ifnull(training_place,'')");
    		list.add("ifnull(training_content,'')");
    		list.add("ifnull(t_id,'')");
    		list.add("ifnull(machine_id,'')");
    		list.add("ifnull(status,'')");
    		list.add("ifnull(s_id,'')");
    		list.add("ifnull(train_number,'')");
    		list.add("ifnull(train_starttime,'')");
    		list.add("ifnull(train_endtime,'')");
    		list.add("ifnull(train_id,'')");
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