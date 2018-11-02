package com.e2e.Service.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxLine implements BasicEntity<Integer>{

	private Integer id;
	private Integer rateId;
	private String code;
	private String title;
	private BigDecimal taxTotal;
	private BigDecimal shippingTaxTotal;
	private Boolean compound;
	public TaxLine() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRateId() {
		return rateId;
	}
	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getTaxTotal() {
		return taxTotal;
	}
	public void setTaxTotal(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}
	public BigDecimal getShippingTaxTotal() {
		return shippingTaxTotal;
	}
	public void setShippingTaxTotal(BigDecimal shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}
	public Boolean getCompound() {
		return compound;
	}
	public void setCompound(Boolean compound) {
		this.compound = compound;
	}
}
