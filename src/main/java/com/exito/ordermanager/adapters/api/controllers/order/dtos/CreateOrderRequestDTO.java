package com.exito.ordermanager.adapters.api.controllers.order.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.exito.ordermanager.adapters.api.controllers.order.validators.City;
import com.exito.ordermanager.adapters.api.controllers.order.validators.DateFormat;
import com.exito.ordermanager.adapters.api.controllers.order.validators.EqualDates;
import com.exito.ordermanager.domain.model.Order;

@EqualDates(message = "creationDate should be equal to purchaseDate", fields = "creationDate,purchaseDate")
public class CreateOrderRequestDTO {

	@NotBlank(message = "id is mandatory")		
	private String id;
	
	@NotBlank(message = "channel is mandatory")	
	@Size(min = 8, message = "Channel should have at least 8 characters")
	private String channel;
	
	@NotBlank(message = "city is mandatory")	
	@City(message = "city is not Medellin Sabaneta El Santuario Rionegro")
	private String city;
	
	@NotBlank(message = "purchaseDate is mandatory")
	@DateFormat(message = "purchaseDate has wrong format (dd/MM/yyyy)", format="dd/MM/yyyy")
	private String purchaseDate;
	
	@NotBlank(message = "creationDate is mandatory")
	@DateFormat(message = "creationDate has wrong format", format="dd/MM/yyyy")
	private String creationDate;
	

	public void setId(String id) {
		this.id = id;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getId() {
		return id;
	}

	public String getChannel() {
		return channel;
	}

	public String getCity() {
		return city;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public Order getOrder() {
		Order order = new Order(this.id);
		return order;
	}

}
