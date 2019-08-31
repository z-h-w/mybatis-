package twm.mybatisdemo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EtcCarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtcCarInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(String value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(String value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(String value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(String value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(String value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(String value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLike(String value) {
            addCriterion("apply_num like", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotLike(String value) {
            addCriterion("apply_num not like", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<String> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<String> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(String value1, String value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(String value1, String value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNull() {
            addCriterion("credit_status is null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNotNull() {
            addCriterion("credit_status is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusEqualTo(Integer value) {
            addCriterion("credit_status =", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotEqualTo(Integer value) {
            addCriterion("credit_status <>", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThan(Integer value) {
            addCriterion("credit_status >", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_status >=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThan(Integer value) {
            addCriterion("credit_status <", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("credit_status <=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIn(List<Integer> values) {
            addCriterion("credit_status in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotIn(List<Integer> values) {
            addCriterion("credit_status not in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusBetween(Integer value1, Integer value2) {
            addCriterion("credit_status between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_status not between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIsNull() {
            addCriterion("channel_source is null");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIsNotNull() {
            addCriterion("channel_source is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSourceEqualTo(String value) {
            addCriterion("channel_source =", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotEqualTo(String value) {
            addCriterion("channel_source <>", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceGreaterThan(String value) {
            addCriterion("channel_source >", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceGreaterThanOrEqualTo(String value) {
            addCriterion("channel_source >=", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLessThan(String value) {
            addCriterion("channel_source <", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLessThanOrEqualTo(String value) {
            addCriterion("channel_source <=", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLike(String value) {
            addCriterion("channel_source like", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotLike(String value) {
            addCriterion("channel_source not like", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIn(List<String> values) {
            addCriterion("channel_source in", values, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotIn(List<String> values) {
            addCriterion("channel_source not in", values, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceBetween(String value1, String value2) {
            addCriterion("channel_source between", value1, value2, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotBetween(String value1, String value2) {
            addCriterion("channel_source not between", value1, value2, "channelSource");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNull() {
            addCriterion("customer_num is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNotNull() {
            addCriterion("customer_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumEqualTo(String value) {
            addCriterion("customer_num =", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotEqualTo(String value) {
            addCriterion("customer_num <>", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThan(String value) {
            addCriterion("customer_num >", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThanOrEqualTo(String value) {
            addCriterion("customer_num >=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThan(String value) {
            addCriterion("customer_num <", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThanOrEqualTo(String value) {
            addCriterion("customer_num <=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLike(String value) {
            addCriterion("customer_num like", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotLike(String value) {
            addCriterion("customer_num not like", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIn(List<String> values) {
            addCriterion("customer_num in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotIn(List<String> values) {
            addCriterion("customer_num not in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumBetween(String value1, String value2) {
            addCriterion("customer_num between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotBetween(String value1, String value2) {
            addCriterion("customer_num not between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNull() {
            addCriterion("vehicle_color is null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNotNull() {
            addCriterion("vehicle_color is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorEqualTo(String value) {
            addCriterion("vehicle_color =", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotEqualTo(String value) {
            addCriterion("vehicle_color <>", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThan(String value) {
            addCriterion("vehicle_color >", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_color >=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThan(String value) {
            addCriterion("vehicle_color <", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThanOrEqualTo(String value) {
            addCriterion("vehicle_color <=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLike(String value) {
            addCriterion("vehicle_color like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotLike(String value) {
            addCriterion("vehicle_color not like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIn(List<String> values) {
            addCriterion("vehicle_color in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotIn(List<String> values) {
            addCriterion("vehicle_color not in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorBetween(String value1, String value2) {
            addCriterion("vehicle_color between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotBetween(String value1, String value2) {
            addCriterion("vehicle_color not between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeIsNull() {
            addCriterion("vehicle_native is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeIsNotNull() {
            addCriterion("vehicle_native is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeEqualTo(String value) {
            addCriterion("vehicle_native =", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeNotEqualTo(String value) {
            addCriterion("vehicle_native <>", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeGreaterThan(String value) {
            addCriterion("vehicle_native >", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_native >=", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeLessThan(String value) {
            addCriterion("vehicle_native <", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_native <=", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeLike(String value) {
            addCriterion("vehicle_native like", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeNotLike(String value) {
            addCriterion("vehicle_native not like", value, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeIn(List<String> values) {
            addCriterion("vehicle_native in", values, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeNotIn(List<String> values) {
            addCriterion("vehicle_native not in", values, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeBetween(String value1, String value2) {
            addCriterion("vehicle_native between", value1, value2, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andVehicleNativeNotBetween(String value1, String value2) {
            addCriterion("vehicle_native not between", value1, value2, "vehicleNative");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("tonnage is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("tonnage is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(Long value) {
            addCriterion("tonnage =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(Long value) {
            addCriterion("tonnage <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(Long value) {
            addCriterion("tonnage >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(Long value) {
            addCriterion("tonnage >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(Long value) {
            addCriterion("tonnage <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(Long value) {
            addCriterion("tonnage <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<Long> values) {
            addCriterion("tonnage in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<Long> values) {
            addCriterion("tonnage not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(Long value1, Long value2) {
            addCriterion("tonnage between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(Long value1, Long value2) {
            addCriterion("tonnage not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNull() {
            addCriterion("vehicle_type is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("vehicle_type is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(String value) {
            addCriterion("vehicle_type =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(String value) {
            addCriterion("vehicle_type <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(String value) {
            addCriterion("vehicle_type >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_type >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(String value) {
            addCriterion("vehicle_type <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_type <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLike(String value) {
            addCriterion("vehicle_type like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotLike(String value) {
            addCriterion("vehicle_type not like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<String> values) {
            addCriterion("vehicle_type in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<String> values) {
            addCriterion("vehicle_type not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(String value1, String value2) {
            addCriterion("vehicle_type between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("vehicle_type not between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindIsNull() {
            addCriterion("vehicle_type_kind is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindIsNotNull() {
            addCriterion("vehicle_type_kind is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindEqualTo(Long value) {
            addCriterion("vehicle_type_kind =", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindNotEqualTo(Long value) {
            addCriterion("vehicle_type_kind <>", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindGreaterThan(Long value) {
            addCriterion("vehicle_type_kind >", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindGreaterThanOrEqualTo(Long value) {
            addCriterion("vehicle_type_kind >=", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindLessThan(Long value) {
            addCriterion("vehicle_type_kind <", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindLessThanOrEqualTo(Long value) {
            addCriterion("vehicle_type_kind <=", value, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindIn(List<Long> values) {
            addCriterion("vehicle_type_kind in", values, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindNotIn(List<Long> values) {
            addCriterion("vehicle_type_kind not in", values, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindBetween(Long value1, Long value2) {
            addCriterion("vehicle_type_kind between", value1, value2, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeKindNotBetween(Long value1, Long value2) {
            addCriterion("vehicle_type_kind not between", value1, value2, "vehicleTypeKind");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerIsNull() {
            addCriterion("vehicle_owner is null");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerIsNotNull() {
            addCriterion("vehicle_owner is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerEqualTo(String value) {
            addCriterion("vehicle_owner =", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerNotEqualTo(String value) {
            addCriterion("vehicle_owner <>", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerGreaterThan(String value) {
            addCriterion("vehicle_owner >", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_owner >=", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerLessThan(String value) {
            addCriterion("vehicle_owner <", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerLessThanOrEqualTo(String value) {
            addCriterion("vehicle_owner <=", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerLike(String value) {
            addCriterion("vehicle_owner like", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerNotLike(String value) {
            addCriterion("vehicle_owner not like", value, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerIn(List<String> values) {
            addCriterion("vehicle_owner in", values, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerNotIn(List<String> values) {
            addCriterion("vehicle_owner not in", values, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerBetween(String value1, String value2) {
            addCriterion("vehicle_owner between", value1, value2, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andVehicleOwnerNotBetween(String value1, String value2) {
            addCriterion("vehicle_owner not between", value1, value2, "vehicleOwner");
            return (Criteria) this;
        }

        public Criteria andDrivingPicIsNull() {
            addCriterion("driving_pic is null");
            return (Criteria) this;
        }

        public Criteria andDrivingPicIsNotNull() {
            addCriterion("driving_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingPicEqualTo(String value) {
            addCriterion("driving_pic =", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicNotEqualTo(String value) {
            addCriterion("driving_pic <>", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicGreaterThan(String value) {
            addCriterion("driving_pic >", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicGreaterThanOrEqualTo(String value) {
            addCriterion("driving_pic >=", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicLessThan(String value) {
            addCriterion("driving_pic <", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicLessThanOrEqualTo(String value) {
            addCriterion("driving_pic <=", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicLike(String value) {
            addCriterion("driving_pic like", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicNotLike(String value) {
            addCriterion("driving_pic not like", value, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicIn(List<String> values) {
            addCriterion("driving_pic in", values, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicNotIn(List<String> values) {
            addCriterion("driving_pic not in", values, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicBetween(String value1, String value2) {
            addCriterion("driving_pic between", value1, value2, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingPicNotBetween(String value1, String value2) {
            addCriterion("driving_pic not between", value1, value2, "drivingPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicIsNull() {
            addCriterion("driving_down_pic is null");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicIsNotNull() {
            addCriterion("driving_down_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicEqualTo(String value) {
            addCriterion("driving_down_pic =", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicNotEqualTo(String value) {
            addCriterion("driving_down_pic <>", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicGreaterThan(String value) {
            addCriterion("driving_down_pic >", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicGreaterThanOrEqualTo(String value) {
            addCriterion("driving_down_pic >=", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicLessThan(String value) {
            addCriterion("driving_down_pic <", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicLessThanOrEqualTo(String value) {
            addCriterion("driving_down_pic <=", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicLike(String value) {
            addCriterion("driving_down_pic like", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicNotLike(String value) {
            addCriterion("driving_down_pic not like", value, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicIn(List<String> values) {
            addCriterion("driving_down_pic in", values, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicNotIn(List<String> values) {
            addCriterion("driving_down_pic not in", values, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicBetween(String value1, String value2) {
            addCriterion("driving_down_pic between", value1, value2, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andDrivingDownPicNotBetween(String value1, String value2) {
            addCriterion("driving_down_pic not between", value1, value2, "drivingDownPic");
            return (Criteria) this;
        }

        public Criteria andUseQualityIsNull() {
            addCriterion("use_quality is null");
            return (Criteria) this;
        }

        public Criteria andUseQualityIsNotNull() {
            addCriterion("use_quality is not null");
            return (Criteria) this;
        }

        public Criteria andUseQualityEqualTo(String value) {
            addCriterion("use_quality =", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityNotEqualTo(String value) {
            addCriterion("use_quality <>", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityGreaterThan(String value) {
            addCriterion("use_quality >", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityGreaterThanOrEqualTo(String value) {
            addCriterion("use_quality >=", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityLessThan(String value) {
            addCriterion("use_quality <", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityLessThanOrEqualTo(String value) {
            addCriterion("use_quality <=", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityLike(String value) {
            addCriterion("use_quality like", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityNotLike(String value) {
            addCriterion("use_quality not like", value, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityIn(List<String> values) {
            addCriterion("use_quality in", values, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityNotIn(List<String> values) {
            addCriterion("use_quality not in", values, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityBetween(String value1, String value2) {
            addCriterion("use_quality between", value1, value2, "useQuality");
            return (Criteria) this;
        }

        public Criteria andUseQualityNotBetween(String value1, String value2) {
            addCriterion("use_quality not between", value1, value2, "useQuality");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNull() {
            addCriterion("brand_model is null");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNotNull() {
            addCriterion("brand_model is not null");
            return (Criteria) this;
        }

        public Criteria andBrandModelEqualTo(String value) {
            addCriterion("brand_model =", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotEqualTo(String value) {
            addCriterion("brand_model <>", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThan(String value) {
            addCriterion("brand_model >", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThanOrEqualTo(String value) {
            addCriterion("brand_model >=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThan(String value) {
            addCriterion("brand_model <", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThanOrEqualTo(String value) {
            addCriterion("brand_model <=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLike(String value) {
            addCriterion("brand_model like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotLike(String value) {
            addCriterion("brand_model not like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelIn(List<String> values) {
            addCriterion("brand_model in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotIn(List<String> values) {
            addCriterion("brand_model not in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelBetween(String value1, String value2) {
            addCriterion("brand_model between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotBetween(String value1, String value2) {
            addCriterion("brand_model not between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIsNull() {
            addCriterion("certificate_time is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIsNotNull() {
            addCriterion("certificate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeEqualTo(Date value) {
            addCriterion("certificate_time =", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotEqualTo(Date value) {
            addCriterion("certificate_time <>", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeGreaterThan(Date value) {
            addCriterion("certificate_time >", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("certificate_time >=", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeLessThan(Date value) {
            addCriterion("certificate_time <", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeLessThanOrEqualTo(Date value) {
            addCriterion("certificate_time <=", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIn(List<Date> values) {
            addCriterion("certificate_time in", values, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotIn(List<Date> values) {
            addCriterion("certificate_time not in", values, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeBetween(Date value1, Date value2) {
            addCriterion("certificate_time between", value1, value2, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotBetween(Date value1, Date value2) {
            addCriterion("certificate_time not between", value1, value2, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorIsNull() {
            addCriterion("headstock_color is null");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorIsNotNull() {
            addCriterion("headstock_color is not null");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorEqualTo(Integer value) {
            addCriterion("headstock_color =", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorNotEqualTo(Integer value) {
            addCriterion("headstock_color <>", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorGreaterThan(Integer value) {
            addCriterion("headstock_color >", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("headstock_color >=", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorLessThan(Integer value) {
            addCriterion("headstock_color <", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorLessThanOrEqualTo(Integer value) {
            addCriterion("headstock_color <=", value, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorIn(List<Integer> values) {
            addCriterion("headstock_color in", values, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorNotIn(List<Integer> values) {
            addCriterion("headstock_color not in", values, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorBetween(Integer value1, Integer value2) {
            addCriterion("headstock_color between", value1, value2, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andHeadstockColorNotBetween(Integer value1, Integer value2) {
            addCriterion("headstock_color not between", value1, value2, "headstockColor");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNull() {
            addCriterion("issued_by is null");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNotNull() {
            addCriterion("issued_by is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedByEqualTo(String value) {
            addCriterion("issued_by =", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotEqualTo(String value) {
            addCriterion("issued_by <>", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThan(String value) {
            addCriterion("issued_by >", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThanOrEqualTo(String value) {
            addCriterion("issued_by >=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThan(String value) {
            addCriterion("issued_by <", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThanOrEqualTo(String value) {
            addCriterion("issued_by <=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLike(String value) {
            addCriterion("issued_by like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotLike(String value) {
            addCriterion("issued_by not like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByIn(List<String> values) {
            addCriterion("issued_by in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotIn(List<String> values) {
            addCriterion("issued_by not in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByBetween(String value1, String value2) {
            addCriterion("issued_by between", value1, value2, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotBetween(String value1, String value2) {
            addCriterion("issued_by not between", value1, value2, "issuedBy");
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

        public Criteria andEtcApplyStatusIsNull() {
            addCriterion("etc_apply_status is null");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusIsNotNull() {
            addCriterion("etc_apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusEqualTo(Integer value) {
            addCriterion("etc_apply_status =", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusNotEqualTo(Integer value) {
            addCriterion("etc_apply_status <>", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusGreaterThan(Integer value) {
            addCriterion("etc_apply_status >", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("etc_apply_status >=", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusLessThan(Integer value) {
            addCriterion("etc_apply_status <", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("etc_apply_status <=", value, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusIn(List<Integer> values) {
            addCriterion("etc_apply_status in", values, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusNotIn(List<Integer> values) {
            addCriterion("etc_apply_status not in", values, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("etc_apply_status between", value1, value2, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andEtcApplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("etc_apply_status not between", value1, value2, "etcApplyStatus");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andApprovalResultIsNull() {
            addCriterion("approval_result is null");
            return (Criteria) this;
        }

        public Criteria andApprovalResultIsNotNull() {
            addCriterion("approval_result is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalResultEqualTo(Integer value) {
            addCriterion("approval_result =", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultNotEqualTo(Integer value) {
            addCriterion("approval_result <>", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultGreaterThan(Integer value) {
            addCriterion("approval_result >", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_result >=", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultLessThan(Integer value) {
            addCriterion("approval_result <", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultLessThanOrEqualTo(Integer value) {
            addCriterion("approval_result <=", value, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultIn(List<Integer> values) {
            addCriterion("approval_result in", values, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultNotIn(List<Integer> values) {
            addCriterion("approval_result not in", values, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultBetween(Integer value1, Integer value2) {
            addCriterion("approval_result between", value1, value2, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andApprovalResultNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_result not between", value1, value2, "approvalResult");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("biz_id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(String value) {
            addCriterion("biz_id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(String value) {
            addCriterion("biz_id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(String value) {
            addCriterion("biz_id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(String value) {
            addCriterion("biz_id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(String value) {
            addCriterion("biz_id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLike(String value) {
            addCriterion("biz_id like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotLike(String value) {
            addCriterion("biz_id not like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<String> values) {
            addCriterion("biz_id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<String> values) {
            addCriterion("biz_id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(String value1, String value2) {
            addCriterion("biz_id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(String value1, String value2) {
            addCriterion("biz_id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkIsNull() {
            addCriterion("open_remark is null");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkIsNotNull() {
            addCriterion("open_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkEqualTo(String value) {
            addCriterion("open_remark =", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkNotEqualTo(String value) {
            addCriterion("open_remark <>", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkGreaterThan(String value) {
            addCriterion("open_remark >", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("open_remark >=", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkLessThan(String value) {
            addCriterion("open_remark <", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkLessThanOrEqualTo(String value) {
            addCriterion("open_remark <=", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkLike(String value) {
            addCriterion("open_remark like", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkNotLike(String value) {
            addCriterion("open_remark not like", value, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkIn(List<String> values) {
            addCriterion("open_remark in", values, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkNotIn(List<String> values) {
            addCriterion("open_remark not in", values, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkBetween(String value1, String value2) {
            addCriterion("open_remark between", value1, value2, "openRemark");
            return (Criteria) this;
        }

        public Criteria andOpenRemarkNotBetween(String value1, String value2) {
            addCriterion("open_remark not between", value1, value2, "openRemark");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andModifyIsNull() {
            addCriterion("modify is null");
            return (Criteria) this;
        }

        public Criteria andModifyIsNotNull() {
            addCriterion("modify is not null");
            return (Criteria) this;
        }

        public Criteria andModifyEqualTo(String value) {
            addCriterion("modify =", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotEqualTo(String value) {
            addCriterion("modify <>", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThan(String value) {
            addCriterion("modify >", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThanOrEqualTo(String value) {
            addCriterion("modify >=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThan(String value) {
            addCriterion("modify <", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThanOrEqualTo(String value) {
            addCriterion("modify <=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLike(String value) {
            addCriterion("modify like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotLike(String value) {
            addCriterion("modify not like", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyIn(List<String> values) {
            addCriterion("modify in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotIn(List<String> values) {
            addCriterion("modify not in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyBetween(String value1, String value2) {
            addCriterion("modify between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotBetween(String value1, String value2) {
            addCriterion("modify not between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoIsNull() {
            addCriterion("etc_card_no is null");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoIsNotNull() {
            addCriterion("etc_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoEqualTo(String value) {
            addCriterion("etc_card_no =", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoNotEqualTo(String value) {
            addCriterion("etc_card_no <>", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoGreaterThan(String value) {
            addCriterion("etc_card_no >", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("etc_card_no >=", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoLessThan(String value) {
            addCriterion("etc_card_no <", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoLessThanOrEqualTo(String value) {
            addCriterion("etc_card_no <=", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoLike(String value) {
            addCriterion("etc_card_no like", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoNotLike(String value) {
            addCriterion("etc_card_no not like", value, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoIn(List<String> values) {
            addCriterion("etc_card_no in", values, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoNotIn(List<String> values) {
            addCriterion("etc_card_no not in", values, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoBetween(String value1, String value2) {
            addCriterion("etc_card_no between", value1, value2, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andEtcCardNoNotBetween(String value1, String value2) {
            addCriterion("etc_card_no not between", value1, value2, "etcCardNo");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(Byte value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(Byte value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(Byte value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(Byte value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<Byte> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<Byte> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(Byte value1, Byte value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeIsNull() {
            addCriterion("etc_type is null");
            return (Criteria) this;
        }

        public Criteria andEtcTypeIsNotNull() {
            addCriterion("etc_type is not null");
            return (Criteria) this;
        }

        public Criteria andEtcTypeEqualTo(Byte value) {
            addCriterion("etc_type =", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeNotEqualTo(Byte value) {
            addCriterion("etc_type <>", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeGreaterThan(Byte value) {
            addCriterion("etc_type >", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("etc_type >=", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeLessThan(Byte value) {
            addCriterion("etc_type <", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeLessThanOrEqualTo(Byte value) {
            addCriterion("etc_type <=", value, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeIn(List<Byte> values) {
            addCriterion("etc_type in", values, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeNotIn(List<Byte> values) {
            addCriterion("etc_type not in", values, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeBetween(Byte value1, Byte value2) {
            addCriterion("etc_type between", value1, value2, "etcType");
            return (Criteria) this;
        }

        public Criteria andEtcTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("etc_type not between", value1, value2, "etcType");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
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