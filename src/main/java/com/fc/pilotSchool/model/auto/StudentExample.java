package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 学生 StudentExample
 * @author fuce_自动生成
 * @date 2023-05-31 14:28:59
 */
public class StudentExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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
        
		
        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }
        
		
        public Criteria andTrueNameIsNull() {
            addCriterion("true_name is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("true_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("true_name =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("true_name <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("true_name >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("true_name >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("true_name <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("true_name <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("true_name like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("true_name not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("true_name in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("true_name not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("true_name between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("true_name not between", value1, value2, "trueName");
            return (Criteria) this;
        }
        
		
        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }
        
		
        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }
        
		
        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }
        
		
        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Character value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Character value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Character value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Character value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Character value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Character value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(Character value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(Character value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Character> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Character> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Character value1, Character value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Character value1, Character value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
        
		
        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Character value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Character value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Character value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Character value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Character value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Character value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(Character value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(Character value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Character> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Character> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Character value1, Character value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Character value1, Character value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }
        
		
        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }
        
		
        public Criteria andEnrollDateIsNull() {
            addCriterion("enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNotNull() {
            addCriterion("enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateEqualTo(Date value) {
            addCriterion("enroll_date =", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotEqualTo(Date value) {
            addCriterion("enroll_date <>", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThan(Date value) {
            addCriterion("enroll_date >", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enroll_date >=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThan(Date value) {
            addCriterion("enroll_date <", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThanOrEqualTo(Date value) {
            addCriterion("enroll_date <=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLike(Date value) {
            addCriterion("enroll_date like", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotLike(Date value) {
            addCriterion("enroll_date not like", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIn(List<Date> values) {
            addCriterion("enroll_date in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotIn(List<Date> values) {
            addCriterion("enroll_date not in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateBetween(Date value1, Date value2) {
            addCriterion("enroll_date between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotBetween(Date value1, Date value2) {
            addCriterion("enroll_date not between", value1, value2, "enrollDate");
            return (Criteria) this;
        }
        
		
        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLike(Date value) {
            addCriterion("login_date like", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotLike(Date value) {
            addCriterion("login_date not like", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
            return (Criteria) this;
        }
        
		
        public Criteria andMerfIsNull() {
            addCriterion("merf is null");
            return (Criteria) this;
        }

        public Criteria andMerfIsNotNull() {
            addCriterion("merf is not null");
            return (Criteria) this;
        }

        public Criteria andMerfEqualTo(String value) {
            addCriterion("merf =", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfNotEqualTo(String value) {
            addCriterion("merf <>", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfGreaterThan(String value) {
            addCriterion("merf >", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfGreaterThanOrEqualTo(String value) {
            addCriterion("merf >=", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfLessThan(String value) {
            addCriterion("merf <", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfLessThanOrEqualTo(String value) {
            addCriterion("merf <=", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfLike(String value) {
            addCriterion("merf like", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfNotLike(String value) {
            addCriterion("merf not like", value, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfIn(List<String> values) {
            addCriterion("merf in", values, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfNotIn(List<String> values) {
            addCriterion("merf not in", values, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfBetween(String value1, String value2) {
            addCriterion("merf between", value1, value2, "merf");
            return (Criteria) this;
        }

        public Criteria andMerfNotBetween(String value1, String value2) {
            addCriterion("merf not between", value1, value2, "merf");
            return (Criteria) this;
        }
        
		
        public Criteria andIsgraduIsNull() {
            addCriterion("isgradu is null");
            return (Criteria) this;
        }

        public Criteria andIsgraduIsNotNull() {
            addCriterion("isgradu is not null");
            return (Criteria) this;
        }

        public Criteria andIsgraduEqualTo(Character value) {
            addCriterion("isgradu =", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduNotEqualTo(Character value) {
            addCriterion("isgradu <>", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduGreaterThan(Character value) {
            addCriterion("isgradu >", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduGreaterThanOrEqualTo(Character value) {
            addCriterion("isgradu >=", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduLessThan(Character value) {
            addCriterion("isgradu <", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduLessThanOrEqualTo(Character value) {
            addCriterion("isgradu <=", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduLike(Character value) {
            addCriterion("isgradu like", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduNotLike(Character value) {
            addCriterion("isgradu not like", value, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduIn(List<Character> values) {
            addCriterion("isgradu in", values, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduNotIn(List<Character> values) {
            addCriterion("isgradu not in", values, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduBetween(Character value1, Character value2) {
            addCriterion("isgradu between", value1, value2, "isgradu");
            return (Criteria) this;
        }

        public Criteria andIsgraduNotBetween(Character value1, Character value2) {
            addCriterion("isgradu not between", value1, value2, "isgradu");
            return (Criteria) this;
        }
        
		
        public Criteria andIspayIsNull() {
            addCriterion("ispay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("ispay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Character value) {
            addCriterion("ispay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Character value) {
            addCriterion("ispay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Character value) {
            addCriterion("ispay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Character value) {
            addCriterion("ispay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Character value) {
            addCriterion("ispay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Character value) {
            addCriterion("ispay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLike(Character value) {
            addCriterion("ispay like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotLike(Character value) {
            addCriterion("ispay not like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Character> values) {
            addCriterion("ispay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Character> values) {
            addCriterion("ispay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Character value1, Character value2) {
            addCriterion("ispay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Character value1, Character value2) {
            addCriterion("ispay not between", value1, value2, "ispay");
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
        
	
		 public Criteria andLikeQuery(Student record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			 list.add("ifnull(username,'')");
    		}
			if(record.getTrueName()!=null&&StrUtil.isNotEmpty(record.getTrueName().toString())) {
    			 list.add("ifnull(true_name,'')");
    		}
			if(record.getIdCard()!=null&&StrUtil.isNotEmpty(record.getIdCard().toString())) {
    			 list.add("ifnull(id_card,'')");
    		}
			if(record.getPhone()!=null&&StrUtil.isNotEmpty(record.getPhone().toString())) {
    			 list.add("ifnull(phone,'')");
    		}
			if(record.getPwd()!=null&&StrUtil.isNotEmpty(record.getPwd().toString())) {
    			 list.add("ifnull(pwd,'')");
    		}
			if(record.getFlag()!=null&&StrUtil.isNotEmpty(record.getFlag().toString())) {
    			 list.add("ifnull(flag,'')");
    		}
			if(record.getSex()!=null&&StrUtil.isNotEmpty(record.getSex().toString())) {
    			 list.add("ifnull(sex,'')");
    		}
			if(record.getAddress()!=null&&StrUtil.isNotEmpty(record.getAddress().toString())) {
    			 list.add("ifnull(address,'')");
    		}
			if(record.getEnrollDate()!=null&&StrUtil.isNotEmpty(record.getEnrollDate().toString())) {
    			 list.add("ifnull(enroll_date,'')");
    		}
			if(record.getLoginDate()!=null&&StrUtil.isNotEmpty(record.getLoginDate().toString())) {
    			 list.add("ifnull(login_date,'')");
    		}
			if(record.getMerf()!=null&&StrUtil.isNotEmpty(record.getMerf().toString())) {
    			 list.add("ifnull(merf,'')");
    		}
			if(record.getIsgradu()!=null&&StrUtil.isNotEmpty(record.getIsgradu().toString())) {
    			 list.add("ifnull(isgradu,'')");
    		}
			if(record.getIspay()!=null&&StrUtil.isNotEmpty(record.getIspay().toString())) {
    			 list.add("ifnull(ispay,'')");
    		}
			if(record.getTrainId()!=null&&StrUtil.isNotEmpty(record.getTrainId().toString())) {
    			 list.add("ifnull(train_id,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getUsername()!=null&&StrUtil.isNotEmpty(record.getUsername().toString())) {
    			list2.add("'%"+record.getUsername()+"%'");
    		}
			if(record.getTrueName()!=null&&StrUtil.isNotEmpty(record.getTrueName().toString())) {
    			list2.add("'%"+record.getTrueName()+"%'");
    		}
			if(record.getIdCard()!=null&&StrUtil.isNotEmpty(record.getIdCard().toString())) {
    			list2.add("'%"+record.getIdCard()+"%'");
    		}
			if(record.getPhone()!=null&&StrUtil.isNotEmpty(record.getPhone().toString())) {
    			list2.add("'%"+record.getPhone()+"%'");
    		}
			if(record.getPwd()!=null&&StrUtil.isNotEmpty(record.getPwd().toString())) {
    			list2.add("'%"+record.getPwd()+"%'");
    		}
			if(record.getFlag()!=null&&StrUtil.isNotEmpty(record.getFlag().toString())) {
    			list2.add("'%"+record.getFlag()+"%'");
    		}
			if(record.getSex()!=null&&StrUtil.isNotEmpty(record.getSex().toString())) {
    			list2.add("'%"+record.getSex()+"%'");
    		}
			if(record.getAddress()!=null&&StrUtil.isNotEmpty(record.getAddress().toString())) {
    			list2.add("'%"+record.getAddress()+"%'");
    		}
			if(record.getEnrollDate()!=null&&StrUtil.isNotEmpty(record.getEnrollDate().toString())) {
    			list2.add("'%"+record.getEnrollDate()+"%'");
    		}
			if(record.getLoginDate()!=null&&StrUtil.isNotEmpty(record.getLoginDate().toString())) {
    			list2.add("'%"+record.getLoginDate()+"%'");
    		}
			if(record.getMerf()!=null&&StrUtil.isNotEmpty(record.getMerf().toString())) {
    			list2.add("'%"+record.getMerf()+"%'");
    		}
			if(record.getIsgradu()!=null&&StrUtil.isNotEmpty(record.getIsgradu().toString())) {
    			list2.add("'%"+record.getIsgradu()+"%'");
    		}
			if(record.getIspay()!=null&&StrUtil.isNotEmpty(record.getIspay().toString())) {
    			list2.add("'%"+record.getIspay()+"%'");
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
    		list.add("ifnull(username,'')");
    		list.add("ifnull(true_name,'')");
    		list.add("ifnull(id_card,'')");
    		list.add("ifnull(phone,'')");
    		list.add("ifnull(pwd,'')");
    		list.add("ifnull(flag,'')");
    		list.add("ifnull(sex,'')");
    		list.add("ifnull(address,'')");
    		list.add("ifnull(enroll_date,'')");
    		list.add("ifnull(login_date,'')");
    		list.add("ifnull(merf,'')");
    		list.add("ifnull(isgradu,'')");
    		list.add("ifnull(ispay,'')");
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