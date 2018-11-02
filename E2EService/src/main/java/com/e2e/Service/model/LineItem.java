package com.e2e.Service.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineItem  implements BasicEntity<Integer>{

	private Integer id;
	private BigDecimal subtotal;
	private BigDecimal subtotalTax;
	private BigDecimal total;
	private BigDecimal totalTax;
	private BigDecimal price;
	private Integer quantity;
	private String taxClass;
	private String name;
	private Integer productId;
	private Integer variationId;
	private String sku;
	private List<ProductMetaItem> meta;
	private List<TaxesMeta> taxes;
	private Map<String,String> variations;
	
	public LineItem() {
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getSubtotalTax() {
		return subtotalTax;
	}

	public void setSubtotalTax(BigDecimal subtotalTax) {
		this.subtotalTax = subtotalTax;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getVariationId() {
		return variationId;
	}

	public void setVariationId(Integer variationId) {
		this.variationId = variationId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public List<ProductMetaItem> getMeta() {
		return meta;
	}

	public void setMeta(List<ProductMetaItem> meta) {
		this.meta = meta;
	}

	public List<TaxesMeta> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<TaxesMeta> taxes) {
		this.taxes = taxes;
	}

	public Map<String, String> getVariations() {
		return variations;
	}

	public void setVariations(Map<String, String> variations) {
		this.variations = variations;
	}

	@Override
	public Integer getId() {
		return id;
	}
	
	
}
