package com.exito.ordermanager.domain.model;

public class Product {

	private String plu;
	private String pickingId;
	private String description;
	private String length;
	private String high;
	private String width;
	private String weight;
	private double quotedPrice;
	private double value;

	public Product() {
	}

	public String getPlu() {
		return plu;
	}

	public void setPlu(String plu) {
		this.plu = plu;
	}

	public String getPickingId() {
		return pickingId;
	}

	public void setPickingId(String pickingId) {
		this.pickingId = pickingId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public double getQuotedPrice() {
		return quotedPrice;
	}

	public void setQuotedPrice(double quotedPrice) {
		this.quotedPrice = quotedPrice;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	/*
	 * private String deliveryType; private int negotiationType; private String
	 * exitoShipments; private String sellerId; private String supplierNit; private
	 * String supplierName; private Double quantityShipped; private String
	 * dependencyCode; private String dispatchMode; private String costCenter;
	 * private String carrier; private Package _package; private Guide guide;
	 * private String senderName; private String senderAddress; private String
	 * daneCodeSender; private String senderEmail; private String senderPhone;
	 * private String creationDateDetail; private String promiseDelivery; private
	 * int canceled; private int processedSellerCenter; private int
	 * attemptsGuideGeneration;
	 */

}
