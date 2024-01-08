package com.fc.pilotSchool.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * 教练表 TeacherExample
 * @author fuce_自动生成
 * @date 2023-05-08 18:33:22
 */
public class TeacherExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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
        
		
        public Criteria andTCardIsNull() {
            addCriterion("t_card is null");
            return (Criteria) this;
        }

        public Criteria andTCardIsNotNull() {
            addCriterion("t_card is not null");
            return (Criteria) this;
        }

        public Criteria andTCardEqualTo(String value) {
            addCriterion("t_card =", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotEqualTo(String value) {
            addCriterion("t_card <>", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardGreaterThan(String value) {
            addCriterion("t_card >", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardGreaterThanOrEqualTo(String value) {
            addCriterion("t_card >=", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLessThan(String value) {
            addCriterion("t_card <", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLessThanOrEqualTo(String value) {
            addCriterion("t_card <=", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLike(String value) {
            addCriterion("t_card like", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotLike(String value) {
            addCriterion("t_card not like", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardIn(List<String> values) {
            addCriterion("t_card in", values, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotIn(List<String> values) {
            addCriterion("t_card not in", values, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardBetween(String value1, String value2) {
            addCriterion("t_card between", value1, value2, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotBetween(String value1, String value2) {
            addCriterion("t_card not between", value1, value2, "tCard");
            return (Criteria) this;
        }
        
		
        public Criteria andWagesIsNull() {
            addCriterion("wages is null");
            return (Criteria) this;
        }

        public Criteria andWagesIsNotNull() {
            addCriterion("wages is not null");
            return (Criteria) this;
        }

        public Criteria andWagesEqualTo(String value) {
            addCriterion("wages =", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotEqualTo(String value) {
            addCriterion("wages <>", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThan(String value) {
            addCriterion("wages >", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThanOrEqualTo(String value) {
            addCriterion("wages >=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThan(String value) {
            addCriterion("wages <", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThanOrEqualTo(String value) {
            addCriterion("wages <=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLike(String value) {
            addCriterion("wages like", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotLike(String value) {
            addCriterion("wages not like", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesIn(List<String> values) {
            addCriterion("wages in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotIn(List<String> values) {
            addCriterion("wages not in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesBetween(String value1, String value2) {
            addCriterion("wages between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotBetween(String value1, String value2) {
            addCriterion("wages not between", value1, value2, "wages");
            return (Criteria) this;
        }
        
	
		 public Criteria andLikeQuery(Teacher record) {
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
			if(record.getLoginDate()!=null&&StrUtil.isNotEmpty(record.getLoginDate().toString())) {
    			 list.add("ifnull(login_date,'')");
    		}
			if(record.getTCard()!=null&&StrUtil.isNotEmpty(record.getTCard().toString())) {
    			 list.add("ifnull(t_card,'')");
    		}
			if(record.getWages()!=null&&StrUtil.isNotEmpty(record.getWages().toString())) {
    			 list.add("ifnull(wages,'')");
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
			if(record.getLoginDate()!=null&&StrUtil.isNotEmpty(record.getLoginDate().toString())) {
    			list2.add("'%"+record.getLoginDate()+"%'");
    		}
			if(record.getTCard()!=null&&StrUtil.isNotEmpty(record.getTCard().toString())) {
    			list2.add("'%"+record.getTCard()+"%'");
    		}
			if(record.getWages()!=null&&StrUtil.isNotEmpty(record.getWages().toString())) {
    			list2.add("'%"+record.getWages()+"%'");
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
    		list.add("ifnull(login_date,'')");
    		list.add("ifnull(t_card,'')");
    		list.add("ifnull(wages,'')");
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