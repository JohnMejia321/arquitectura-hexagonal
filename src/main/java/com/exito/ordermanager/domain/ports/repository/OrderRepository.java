package com.exito.ordermanager.domain.ports.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.exito.ordermanager.domain.model.Order;

public interface OrderRepository {

	void save(Order order);

	Page<Order> findAll(Pageable pageable);

}
