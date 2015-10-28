package com.yrdce.ipo.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.yrdce.ipo.common.persistence.DataEntity;

public class IpoDistributionExample extends DataEntity<IpoDistributionExample> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public IpoDistributionExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andUseridIsNull() {
			addCriterion("userid is null");
			return (Criteria) this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("userid is not null");
			return (Criteria) this;
		}

		public Criteria andUseridEqualTo(String value) {
			addCriterion("userid =", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotEqualTo(String value) {
			addCriterion("userid <>", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThan(String value) {
			addCriterion("userid >", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			addCriterion("userid >=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThan(String value) {
			addCriterion("userid <", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThanOrEqualTo(String value) {
			addCriterion("userid <=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLike(String value) {
			addCriterion("userid like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotLike(String value) {
			addCriterion("userid not like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridIn(List<String> values) {
			addCriterion("userid in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotIn(List<String> values) {
			addCriterion("userid not in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridBetween(String value1, String value2) {
			addCriterion("userid between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotBetween(String value1, String value2) {
			addCriterion("userid not between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andCommoditynameIsNull() {
			addCriterion("commodityname is null");
			return (Criteria) this;
		}

		public Criteria andCommoditynameIsNotNull() {
			addCriterion("commodityname is not null");
			return (Criteria) this;
		}

		public Criteria andCommoditynameEqualTo(String value) {
			addCriterion("commodityname =", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameNotEqualTo(String value) {
			addCriterion("commodityname <>", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameGreaterThan(String value) {
			addCriterion("commodityname >", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
			addCriterion("commodityname >=", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameLessThan(String value) {
			addCriterion("commodityname <", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameLessThanOrEqualTo(String value) {
			addCriterion("commodityname <=", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameLike(String value) {
			addCriterion("commodityname like", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameNotLike(String value) {
			addCriterion("commodityname not like", value, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameIn(List<String> values) {
			addCriterion("commodityname in", values, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameNotIn(List<String> values) {
			addCriterion("commodityname not in", values, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameBetween(String value1, String value2) {
			addCriterion("commodityname between", value1, value2, "commodityname");
			return (Criteria) this;
		}

		public Criteria andCommoditynameNotBetween(String value1, String value2) {
			addCriterion("commodityname not between", value1, value2, "commodityname");
			return (Criteria) this;
		}

		public Criteria andStartNumberIsNull() {
			addCriterion("start_number is null");
			return (Criteria) this;
		}

		public Criteria andStartNumberIsNotNull() {
			addCriterion("start_number is not null");
			return (Criteria) this;
		}

		public Criteria andStartNumberEqualTo(BigDecimal value) {
			addCriterion("start_number =", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberNotEqualTo(BigDecimal value) {
			addCriterion("start_number <>", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberGreaterThan(BigDecimal value) {
			addCriterion("start_number >", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("start_number >=", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberLessThan(BigDecimal value) {
			addCriterion("start_number <", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberLessThanOrEqualTo(BigDecimal value) {
			addCriterion("start_number <=", value, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberIn(List<BigDecimal> values) {
			addCriterion("start_number in", values, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberNotIn(List<BigDecimal> values) {
			addCriterion("start_number not in", values, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("start_number between", value1, value2, "startNumber");
			return (Criteria) this;
		}

		public Criteria andStartNumberNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("start_number not between", value1, value2, "startNumber");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityIsNull() {
			addCriterion("distribution_quantity is null");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityIsNotNull() {
			addCriterion("distribution_quantity is not null");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityEqualTo(BigDecimal value) {
			addCriterion("distribution_quantity =", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityNotEqualTo(BigDecimal value) {
			addCriterion("distribution_quantity <>", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityGreaterThan(BigDecimal value) {
			addCriterion("distribution_quantity >", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("distribution_quantity >=", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityLessThan(BigDecimal value) {
			addCriterion("distribution_quantity <", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityLessThanOrEqualTo(BigDecimal value) {
			addCriterion("distribution_quantity <=", value, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityIn(List<BigDecimal> values) {
			addCriterion("distribution_quantity in", values, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityNotIn(List<BigDecimal> values) {
			addCriterion("distribution_quantity not in", values, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("distribution_quantity between", value1, value2, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("distribution_quantity not between", value1, value2, "distributionQuantity");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeIsNull() {
			addCriterion("distribution_time is null");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeIsNotNull() {
			addCriterion("distribution_time is not null");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeEqualTo(Date value) {
			addCriterionForJDBCDate("distribution_time =", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("distribution_time <>", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeGreaterThan(Date value) {
			addCriterionForJDBCDate("distribution_time >", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("distribution_time >=", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeLessThan(Date value) {
			addCriterionForJDBCDate("distribution_time <", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("distribution_time <=", value, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeIn(List<Date> values) {
			addCriterionForJDBCDate("distribution_time in", values, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("distribution_time not in", values, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("distribution_time between", value1, value2, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andDistributionTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("distribution_time not between", value1, value2, "distributionTime");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("count is null");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("count is not null");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(BigDecimal value) {
			addCriterion("count =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(BigDecimal value) {
			addCriterion("count <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(BigDecimal value) {
			addCriterion("count >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("count >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(BigDecimal value) {
			addCriterion("count <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("count <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<BigDecimal> values) {
			addCriterion("count in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<BigDecimal> values) {
			addCriterion("count not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("count between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("count not between", value1, value2, "count");
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