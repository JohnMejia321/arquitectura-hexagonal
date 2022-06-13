package com.exito.ordermanager.adapters.api.controllers.order.dtos;

import com.exito.ordermanager.domain.model.Order;

public class CreateOrderResponseDTO {

	private String id;
	private String channel;

	public CreateOrderResponseDTO(String id, String channel) {
		this.id = id;
		this.channel = channel;
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

	public static CreateOrderResponseDTO of(Order order) {
		return new CreateOrderResponseDTO(order.getId(), order.getChannel());

	}

}
