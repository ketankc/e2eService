package com.e2e.Service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetails implements BasicEntity<String> {

	private String methodId;
	private String methodTitle;
	private Boolean paid;
	private String transactionId;
	
	public PaymentDetails() {
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
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	@Override
	public String getId() {
		return this.getMethodId();
	}

}
