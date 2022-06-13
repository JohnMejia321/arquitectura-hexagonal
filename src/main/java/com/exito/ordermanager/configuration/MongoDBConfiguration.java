package com.exito.ordermanager.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.exito.ordermanager.adapters.db.mongo.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}
