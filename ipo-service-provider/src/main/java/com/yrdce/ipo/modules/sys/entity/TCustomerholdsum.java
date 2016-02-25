package com.yrdce.ipo.modules.sys.entity;

import java.math.BigDecimal;

public class TCustomerholdsum {
	private String customerid;

	private String commodityid;

	private Short bsFlag;

	private Long holdqty;

	private BigDecimal holdfunds;

	private BigDecimal floatingloss;

	private BigDecimal evenprice;

	private Long frozenqty;

	private BigDecimal holdmargin;

	private Long gageqty;

	private BigDecimal holdassure;

	private String firmid;

	private Long gagefrozenqty;

	private String warehouseName;

	private String warehouseId;

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid == null ? null : customerid.trim();
	}

	public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid == null ? null : commodityid.trim();
	}

	public Short getBsFlag() {
		return bsFlag;
	}

	public void setBsFlag(Short bsFlag) {
		this.bsFlag = bsFlag;
	}

	public Long getHoldqty() {
		return holdqty;
	}

	public void setHoldqty(Long holdqty) {
		this.holdqty = holdqty;
	}

	public BigDecimal getHoldfunds() {
		return holdfunds;
	}

	public void setHoldfunds(BigDecimal holdfunds) {
		this.holdfunds = holdfunds;
	}

	public BigDecimal getFloatingloss() {
		return floatingloss;
	}

	public void setFloatingloss(BigDecimal floatingloss) {
		this.floatingloss = floatingloss;
	}

	public BigDecimal getEvenprice() {
		return evenprice;
	}

	public void setEvenprice(BigDecimal evenprice) {
		this.evenprice = evenprice;
	}

	public Long getFrozenqty() {
		return frozenqty;
	}

	public void setFrozenqty(Long frozenqty) {
		this.frozenqty = frozenqty;
	}

	public BigDecimal getHoldmargin() {
		return holdmargin;
	}

	public void setHoldmargin(BigDecimal holdmargin) {
		this.holdmargin = holdmargin;
	}

	public Long getGageqty() {
		return gageqty;
	}

	public void setGageqty(Long gageqty) {
		this.gageqty = gageqty;
	}

	public BigDecimal getHoldassure() {
		return holdassure;
	}

	public void setHoldassure(BigDecimal holdassure) {
		this.holdassure = holdassure;
	}

	public String getFirmid() {
		return firmid;
	}

	public void setFirmid(String firmid) {
		this.firmid = firmid == null ? null : firmid.trim();
	}

	public Long getGagefrozenqty() {
		return gagefrozenqty;
	}

	public void setGagefrozenqty(Long gagefrozenqty) {
		this.gagefrozenqty = gagefrozenqty;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

}