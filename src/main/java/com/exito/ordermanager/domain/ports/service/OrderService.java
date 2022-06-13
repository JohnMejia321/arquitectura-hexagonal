package com.exito.ordermanager.domain.ports.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.exito.ordermanager.domain.model.Order;
import com.exito.ordermanager.domain.ports.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;

	public OrderService(final OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public Order createOrder(Order order) {
		orderRepository.save(order);
		return order;
	}

	public Page<Order> getOrders(Pageable pageable) {
		
		return orderRepository.findAll(pageable);
	}

}
