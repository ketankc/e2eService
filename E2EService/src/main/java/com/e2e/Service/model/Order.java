package com.e2e.Service.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order implements BasicEntity<Integer> {

	private Integer id;
	private Integer parentId;
	private String orderKey;
	private Integer orderNumber;
	private Boolean pricesIncludeTax;
	private String createdVia;
	private Date createdAt;
	private Date updatedAt;
	private Date completedAt;
	private Date paidAt;
	private String status;
	private String currency;
	private String cartHash;
	private Boolean setPaid;
	private BigDecimal total;
	private BigDecimal subtotal;
	private Integer totalLineItemsQuantity;
	private BigDecimal totalTax;
	private BigDecimal totalShipping;
	private BigDecimal cartTax;
	private BigDecimal shippingTax;
	private BigDecimal totalDiscount;
	private BigDecimal discountTax;
	private String transactionId;
	private String shippingMethods;
	private String paymentMethod;
	private String paymentMethodTitle;
	private PaymentDetails paymentDetails;
	private BillingAddress billingAddress;
	private ShippingAddress shippingAddress;
	private String note;
	private String version;
	private String customerIp;
	private String customerUserAgent;
	private Integer customerId;
	private String viewOrderUrl;
	private List<LineItem> lineItems;
	private List<ShippingLine> shippingLines;
	private List<TaxLine> taxLines;
	private List<FeeLine> feeLines;
	private List<CouponLine> couponLines;
	private List<RefundLine> refunds;
	private Customer customer;
	
	public Order() {
	}
	
	@Override
	public Integer getId() {
		return id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getOrderKey() {
		return orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Boolean getPricesIncludeTax() {
		return pricesIncludeTax;
	}

	public void setPricesIncludeTax(Boolean pricesIncludeTax) {
		this.pricesIncludeTax = pricesIncludeTax;
	}

	public String getCreatedVia() {
		return createdVia;
	}

	public void setCreatedVia(String createdVia) {
		this.createdVia = createdVia;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(Date completedAt) {
		this.completedAt = completedAt;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCartHash() {
		return cartHash;
	}

	public void setCartHash(String cartHash) {
		this.cartHash = cartHash;
	}

	public Boolean getSetPaid() {
		return setPaid;
	}

	public void setSetPaid(Boolean setPaid) {
		this.setPaid = setPaid;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getTotalLineItemsQuantity() {
		return totalLineItemsQuantity;
	}

	public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
		this.totalLineItemsQuantity = totalLineItemsQuantity;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getTotalShipping() {
		return totalShipping;
	}

	public void setTotalShipping(BigDecimal totalShipping) {
		this.totalShipping = totalShipping;
	}

	public BigDecimal getCartTax() {
		return cartTax;
	}

	public void setCartTax(BigDecimal cartTax) {
		this.cartTax = cartTax;
	}

	public BigDecimal getShippingTax() {
		return shippingTax;
	}

	public void setShippingTax(BigDecimal shippingTax) {
		this.shippingTax = shippingTax;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public BigDecimal getDiscountTax() {
		return discountTax;
	}

	public void setDiscountTax(BigDecimal discountTax) {
		this.discountTax = discountTax;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getShippingMethods() {
		return shippingMethods;
	}

	public void setShippingMethods(String shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCustomerIp() {
		return customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}

	public String getCustomerUserAgent() {
		return customerUserAgent;
	}

	public void setCustomerUserAgent(String customerUserAgent) {
		this.customerUserAgent = customerUserAgent;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getViewOrderUrl() {
		return viewOrderUrl;
	}

	public void setViewOrderUrl(String viewOrderUrl) {
		this.viewOrderUrl = viewOrderUrl;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public List<ShippingLine> getShippingLines() {
		return shippingLines;
	}

	public void setShippingLines(List<ShippingLine> shippingLines) {
		this.shippingLines = shippingLines;
	}

	public List<TaxLine> getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(List<TaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	public List<FeeLine> getFeeLines() {
		return feeLines;
	}

	public void setFeeLines(List<FeeLine> feeLines) {
		this.feeLines = feeLines;
	}

	public List<CouponLine> getCouponLines() {
		return couponLines;
	}

	public void setCouponLines(List<CouponLine> couponLines) {
		this.couponLines = couponLines;
	}

	public List<RefundLine> getRefunds() {
		return refunds;
	}

	public void setRefunds(List<RefundLine> refunds) {
		this.refunds = refunds;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
