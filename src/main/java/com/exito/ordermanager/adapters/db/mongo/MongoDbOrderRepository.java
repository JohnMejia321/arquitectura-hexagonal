package com.exito.ordermanager.adapters.db.mongo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.exito.ordermanager.domain.model.Order;
import com.exito.ordermanager.domain.ports.repository.OrderRepository;

@Component
@Primary
public class MongoDbOrderRepository implements OrderRepository {

	private final SpringDataMongoOrderRepository orderRepository;

	@Autowired
	public MongoDbOrderRepository(final SpringDataMongoOrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public Optional<Order> findById(final UUID id) {
		return orderRepository.findById(id);
	}

	public void save( Order order) {
		orderRepository.save(order);
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return orderRepository.findAll(pageable);
	}
	
}