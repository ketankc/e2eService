package com.e2e.Service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {

	private String href;
	
	public void setHref(String href) {
		this.href = href;
	}
	public String getHref() {
		return href;
	}
}
