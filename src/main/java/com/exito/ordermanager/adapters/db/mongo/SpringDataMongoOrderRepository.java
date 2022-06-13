package com.exito.ordermanager.adapters.db.mongo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exito.ordermanager.domain.model.Order;

public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {

}
