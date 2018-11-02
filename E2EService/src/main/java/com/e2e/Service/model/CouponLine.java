package com.e2e.Service.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CouponLine implements BasicEntity<Integer>{

	private Integer id;
	private String code;
	private BigDecimal amount;
	private BigDecimal dicountTax;
	
	public CouponLine() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getDicountTax() {
		return dicountTax;
	}

	public void setDicountTax(BigDecimal dicountTax) {
		this.dicountTax = dicountTax;
	}
	
}
