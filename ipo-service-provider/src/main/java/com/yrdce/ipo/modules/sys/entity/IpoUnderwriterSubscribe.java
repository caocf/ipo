package com.yrdce.ipo.modules.sys.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 承销商承销设置表
 * 
 * @author chenjing
 *
 */
public class IpoUnderwriterSubscribe {
	private Long subscribeid;

	private String underwriterid;// 承销商ID

	private String commodityid;// 商品ID

	private Long subscribecounts;// 认购数量

	private BigDecimal proportion;// 占承销商手续费总和的比例

	private Short deleteFlag;// 删除标记 0:有效 1:无效

	private Short state;// 处理状态 1:未处理 2:已处理

	private String createUser;// 创建人

	private Date createDate;// 创建时间

	private String updateUser;// 修改人

	private Date updateDate;// 修改时间

	private BigDecimal subscribeprice;// 认购价格

	private BigDecimal amount;// 认购金额

	private BigDecimal userBalance;// 用户可用资金

	private BigDecimal lBalance;// 冻结后的余额

	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public Long getSubscribeid() {
		return subscribeid;
	}

	public void setSubscribeid(Long subscribeid) {
		this.subscribeid = subscribeid;
	}

	public String getUnderwriterid() {
		return underwriterid;
	}

	public void setUnderwriterid(String underwriterid) {
		this.underwriterid = underwriterid;
	}

	public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}

	public Long getSubscribecounts() {
		return subscribecounts;
	}

	public void setSubscribecounts(Long subscribecounts) {
		this.subscribecounts = subscribecounts;
	}

	public BigDecimal getProportion() {
		return proportion;
	}

	public void setProportion(BigDecimal proportion) {
		this.proportion = proportion;
	}

	public Short getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Short deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(BigDecimal userBalance) {
		this.userBalance = userBalance;
	}

	public BigDecimal getlBalance() {
		return lBalance;
	}

	public void setlBalance(BigDecimal lBalance) {
		this.lBalance = lBalance;
	}

	public BigDecimal getSubscribeprice() {
		return subscribeprice;
	}

	public void setSubscribeprice(BigDecimal subscribeprice) {
		this.subscribeprice = subscribeprice;
	}

}