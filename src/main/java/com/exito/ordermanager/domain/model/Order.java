package com.exito.ordermanager.domain.model;

import java.util.Date;

public class Order {

	
	private String id;
	private String channel;
	private String city;
	private Date purchaseDate;
	private Date creationDate;
	/*private String recipientName;
	private String recipientIdentification;
	private String recipientAddress;
	private String recipientPhone;
	private String daneCodeRecipient;
	private String recipientCity;
	private String recipientEmail;
	private String purchaseDate;
	
	private Double purchaseTotal;
	private String creationDate;

	// campos necesarios mennsaje kafka
	private String transactionId;
	private String transactionDate;
	private String nitDestinatario;
*/
	
	public Order(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
