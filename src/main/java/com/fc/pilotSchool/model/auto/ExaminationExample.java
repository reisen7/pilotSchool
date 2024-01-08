package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 考试管理表 ExaminationExample
 * @author fuce_自动生成
 * @date 2023-05-10 21:53:08
 */
public class ExaminationExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationExample() {
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
        
		
        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }
        
		
        public Criteria andEStarttimeIsNull() {
            addCriterion("e_starttime is null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIsNotNull() {
            addCriterion("e_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andEStarttimeEqualTo(Date value) {
            addCriterion("e_starttime =", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotEqualTo(Date value) {
            addCriterion("e_starttime <>", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThan(Date value) {
            addCriterion("e_starttime >", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_starttime >=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThan(Date value) {
            addCriterion("e_starttime <", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("e_starttime <=", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeLike(Date value) {
            addCriterion("e_starttime like", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotLike(Date value) {
            addCriterion("e_starttime not like", value, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeIn(List<Date> values) {
            addCriterion("e_starttime in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotIn(List<Date> values) {
            addCriterion("e_starttime not in", values, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeBetween(Date value1, Date value2) {
            addCriterion("e_starttime between", value1, value2, "eStarttime");
            return (Criteria) this;
        }

        public Criteria andEStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("e_starttime not between", value1, value2, "eStarttime");
            return (Criteria) this;
        }
        
		
        public Criteria andEPlaceIsNull() {
            addCriterion("e_place is null");
            return (Criteria) this;
        }

        public Criteria andEPlaceIsNotNull() {
            addCriterion("e_place is not null");
            return (Criteria) this;
        }

        public Criteria andEPlaceEqualTo(String value) {
            addCriterion("e_place =", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceNotEqualTo(String value) {
            addCriterion("e_place <>", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceGreaterThan(String value) {
            addCriterion("e_place >", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("e_place >=", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceLessThan(String value) {
            addCriterion("e_place <", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceLessThanOrEqualTo(String value) {
            addCriterion("e_place <=", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceLike(String value) {
            addCriterion("e_place like", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceNotLike(String value) {
            addCriterion("e_place not like", value, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceIn(List<String> values) {
            addCriterion("e_place in", values, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceNotIn(List<String> values) {
            addCriterion("e_place not in", values, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceBetween(String value1, String value2) {
            addCriterion("e_place between", value1, value2, "ePlace");
            return (Criteria) this;
        }

        public Criteria andEPlaceNotBetween(String value1, String value2) {
            addCriterion("e_place not between", value1, value2, "ePlace");
            return (Criteria) this;
        }
        
		
        public Criteria andEContentIsNull() {
            addCriterion("e_content is null");
            return (Criteria) this;
        }

        public Criteria andEContentIsNotNull() {
            addCriterion("e_content is not null");
            return (Criteria) this;
        }

        public Criteria andEContentEqualTo(String value) {
            addCriterion("e_content =", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentNotEqualTo(String value) {
            addCriterion("e_content <>", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentGreaterThan(String value) {
            addCriterion("e_content >", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentGreaterThanOrEqualTo(String value) {
            addCriterion("e_content >=", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentLessThan(String value) {
            addCriterion("e_content <", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentLessThanOrEqualTo(String value) {
            addCriterion("e_content <=", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentLike(String value) {
            addCriterion("e_content like", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentNotLike(String value) {
            addCriterion("e_content not like", value, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentIn(List<String> values) {
            addCriterion("e_content in", values, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentNotIn(List<String> values) {
            addCriterion("e_content not in", values, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentBetween(String value1, String value2) {
            addCriterion("e_content between", value1, value2, "eContent");
            return (Criteria) this;
        }

        public Criteria andEContentNotBetween(String value1, String value2) {
            addCriterion("e_content not between", value1, value2, "eContent");
            return (Criteria) this;
        }
        
		
        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(String value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(String value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(String value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(String value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLike(String value) {
            addCriterion("subject_id like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotLike(String value) {
            addCriterion("subject_id not like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<String> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<String> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(String value1, String value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(String value1, String value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }
        
		
        public Criteria andEEndtimeIsNull() {
            addCriterion("e_endtime is null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIsNotNull() {
            addCriterion("e_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEEndtimeEqualTo(Date value) {
            addCriterion("e_endtime =", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotEqualTo(Date value) {
            addCriterion("e_endtime <>", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThan(Date value) {
            addCriterion("e_endtime >", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_endtime >=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThan(Date value) {
            addCriterion("e_endtime <", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("e_endtime <=", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeLike(Date value) {
            addCriterion("e_endtime like", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotLike(Date value) {
            addCriterion("e_endtime not like", value, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeIn(List<Date> values) {
            addCriterion("e_endtime in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotIn(List<Date> values) {
            addCriterion("e_endtime not in", values, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeBetween(Date value1, Date value2) {
            addCriterion("e_endtime between", value1, value2, "eEndtime");
            return (Criteria) this;
        }

        public Criteria andEEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("e_endtime not between", value1, value2, "eEndtime");
            return (Criteria) this;
        }
        
		
        public Criteria andCoueseIdIsNull() {
            addCriterion("couese_id is null");
            return (Criteria) this;
        }

        public Criteria andCoueseIdIsNotNull() {
            addCriterion("couese_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoueseIdEqualTo(String value) {
            addCriterion("couese_id =", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdNotEqualTo(String value) {
            addCriterion("couese_id <>", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdGreaterThan(String value) {
            addCriterion("couese_id >", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdGreaterThanOrEqualTo(String value) {
            addCriterion("couese_id >=", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdLessThan(String value) {
            addCriterion("couese_id <", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdLessThanOrEqualTo(String value) {
            addCriterion("couese_id <=", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdLike(String value) {
            addCriterion("couese_id like", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdNotLike(String value) {
            addCriterion("couese_id not like", value, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdIn(List<String> values) {
            addCriterion("couese_id in", values, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdNotIn(List<String> values) {
            addCriterion("couese_id not in", values, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdBetween(String value1, String value2) {
            addCriterion("couese_id between", value1, value2, "coueseId");
            return (Criteria) this;
        }

        public Criteria andCoueseIdNotBetween(String value1, String value2) {
            addCriterion("couese_id not between", value1, value2, "coueseId");
            return (Criteria) this;
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
        
	
		 public Criteria andLikeQuery(Examination record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getEName()!=null&&StrUtil.isNotEmpty(record.getEName().toString())) {
    			 list.add("ifnull(e_name,'')");
    		}
			if(record.getEStarttime()!=null&&StrUtil.isNotEmpty(record.getEStarttime().toString())) {
    			 list.add("ifnull(e_starttime,'')");
    		}
			if(record.getEPlace()!=null&&StrUtil.isNotEmpty(record.getEPlace().toString())) {
    			 list.add("ifnull(e_place,'')");
    		}
			if(record.getEContent()!=null&&StrUtil.isNotEmpty(record.getEContent().toString())) {
    			 list.add("ifnull(e_content,'')");
    		}
			if(record.getSubjectId()!=null&&StrUtil.isNotEmpty(record.getSubjectId().toString())) {
    			 list.add("ifnull(subject_id,'')");
    		}
			if(record.getEEndtime()!=null&&StrUtil.isNotEmpty(record.getEEndtime().toString())) {
    			 list.add("ifnull(e_endtime,'')");
    		}
			if(record.getCoueseId()!=null&&StrUtil.isNotEmpty(record.getCoueseId().toString())) {
    			 list.add("ifnull(couese_id,'')");
    		}
			if(record.getTrainingId()!=null&&StrUtil.isNotEmpty(record.getTrainingId().toString())) {
    			 list.add("ifnull(training_id,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getEName()!=null&&StrUtil.isNotEmpty(record.getEName().toString())) {
    			list2.add("'%"+record.getEName()+"%'");
    		}
			if(record.getEStarttime()!=null&&StrUtil.isNotEmpty(record.getEStarttime().toString())) {
    			list2.add("'%"+record.getEStarttime()+"%'");
    		}
			if(record.getEPlace()!=null&&StrUtil.isNotEmpty(record.getEPlace().toString())) {
    			list2.add("'%"+record.getEPlace()+"%'");
    		}
			if(record.getEContent()!=null&&StrUtil.isNotEmpty(record.getEContent().toString())) {
    			list2.add("'%"+record.getEContent()+"%'");
    		}
			if(record.getSubjectId()!=null&&StrUtil.isNotEmpty(record.getSubjectId().toString())) {
    			list2.add("'%"+record.getSubjectId()+"%'");
    		}
			if(record.getEEndtime()!=null&&StrUtil.isNotEmpty(record.getEEndtime().toString())) {
    			list2.add("'%"+record.getEEndtime()+"%'");
    		}
			if(record.getCoueseId()!=null&&StrUtil.isNotEmpty(record.getCoueseId().toString())) {
    			list2.add("'%"+record.getCoueseId()+"%'");
    		}
			if(record.getTrainingId()!=null&&StrUtil.isNotEmpty(record.getTrainingId().toString())) {
    			list2.add("'%"+record.getTrainingId()+"%'");
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
    		list.add("ifnull(e_name,'')");
    		list.add("ifnull(e_starttime,'')");
    		list.add("ifnull(e_place,'')");
    		list.add("ifnull(e_content,'')");
    		list.add("ifnull(subject_id,'')");
    		list.add("ifnull(e_endtime,'')");
    		list.add("ifnull(couese_id,'')");
    		list.add("ifnull(training_id,'')");
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