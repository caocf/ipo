package com.yrdce.ipo.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yrdce.ipo.common.persistence.DataEntity;

public class IpoOrderExample extends DataEntity<IpoOrderExample> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public IpoOrderExample() {
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

		public Criteria andOrderidIsNull() {
			addCriterion("orderid is null");
			return (Criteria) this;
		}

		public Criteria andOrderidIsNotNull() {
			addCriterion("orderid is not null");
			return (Criteria) this;
		}

		public Criteria andOrderidEqualTo(String value) {
			addCriterion("orderid =", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotEqualTo(String value) {
			addCriterion("orderid <>", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidGreaterThan(String value) {
			addCriterion("orderid >", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidGreaterThanOrEqualTo(String value) {
			addCriterion("orderid >=", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidLessThan(String value) {
			addCriterion("orderid <", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidLessThanOrEqualTo(String value) {
			addCriterion("orderid <=", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidLike(String value) {
			addCriterion("orderid like", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotLike(String value) {
			addCriterion("orderid not like", value, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidIn(List<String> values) {
			addCriterion("orderid in", values, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotIn(List<String> values) {
			addCriterion("orderid not in", values, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidBetween(String value1, String value2) {
			addCriterion("orderid between", value1, value2, "orderid");
			return (Criteria) this;
		}

		public Criteria andOrderidNotBetween(String value1, String value2) {
			addCriterion("orderid not between", value1, value2, "orderid");
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

		public Criteria andCommodityidIsNull() {
			addCriterion("commodityid is null");
			return (Criteria) this;
		}

		public Criteria andCommodityidIsNotNull() {
			addCriterion("commodityid is not null");
			return (Criteria) this;
		}

		public Criteria andCommodityidEqualTo(String value) {
			addCriterion("commodityid =", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidNotEqualTo(String value) {
			addCriterion("commodityid <>", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidGreaterThan(String value) {
			addCriterion("commodityid >", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidGreaterThanOrEqualTo(String value) {
			addCriterion("commodityid >=", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidLessThan(String value) {
			addCriterion("commodityid <", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidLessThanOrEqualTo(String value) {
			addCriterion("commodityid <=", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidLike(String value) {
			addCriterion("commodityid like", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidNotLike(String value) {
			addCriterion("commodityid not like", value, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidIn(List<String> values) {
			addCriterion("commodityid in", values, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidNotIn(List<String> values) {
			addCriterion("commodityid not in", values, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidBetween(String value1, String value2) {
			addCriterion("commodityid between", value1, value2, "commodityid");
			return (Criteria) this;
		}

		public Criteria andCommodityidNotBetween(String value1, String value2) {
			addCriterion("commodityid not between", value1, value2, "commodityid");
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

		public Criteria andDateIsNull() {
			addCriterion("date is null");
			return (Criteria) this;
		}

		public Criteria andDateIsNotNull() {
			addCriterion("date is not null");
			return (Criteria) this;
		}

		public Criteria andDateEqualTo(Date value) {
			addCriterion("date =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {
			addCriterion("date <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {
			addCriterion("date >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {
			addCriterion("date >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {
			addCriterion("date <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {
			addCriterion("date <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {
			addCriterion("date in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {
			addCriterion("date not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {
			addCriterion("date between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {
			addCriterion("date not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsIsNull() {
			addCriterion("frozenfunds is null");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsIsNotNull() {
			addCriterion("frozenfunds is not null");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsEqualTo(BigDecimal value) {
			addCriterion("frozenfunds =", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsNotEqualTo(BigDecimal value) {
			addCriterion("frozenfunds <>", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsGreaterThan(BigDecimal value) {
			addCriterion("frozenfunds >", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("frozenfunds >=", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsLessThan(BigDecimal value) {
			addCriterion("frozenfunds <", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsLessThanOrEqualTo(BigDecimal value) {
			addCriterion("frozenfunds <=", value, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsIn(List<BigDecimal> values) {
			addCriterion("frozenfunds in", values, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsNotIn(List<BigDecimal> values) {
			addCriterion("frozenfunds not in", values, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("frozenfunds between", value1, value2, "frozenfunds");
			return (Criteria) this;
		}

		public Criteria andFrozenfundsNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("frozenfunds not between", value1, value2, "frozenfunds");
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