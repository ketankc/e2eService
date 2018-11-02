package com.e2e.Service.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingLine implements BasicEntity<Integer>{

	private Integer id;
	private String methodId;
	private String methodTitle;
	private BigDecimal total;
	private BigDecimal totalTax;
	private List<FeeLineTax> taxes;
	
	public ShippingLine() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethodId() {
		return methodId;
	}

	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}

	public String getMethodTitle() {
		return methodTitle;
	}

	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public List<FeeLineTax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<FeeLineTax> taxes) {
		this.taxes = taxes;
	}
	
	
}
