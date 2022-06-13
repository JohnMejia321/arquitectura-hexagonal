package com.exito.ordermanager.adapters.api.controllers.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exito.ordermanager.adapters.api.controllers.order.dtos.CreateOrderRequestDTO;
import com.exito.ordermanager.adapters.api.controllers.order.dtos.CreateOrderResponseDTO;
import com.exito.ordermanager.domain.model.Order;
import com.exito.ordermanager.domain.ports.service.OrderService;

@RestController
@RequestMapping("/orders")
@Validated
public class OrderController {

	private final OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	CreateOrderResponseDTO createOrder(@Valid @RequestBody CreateOrderRequestDTO createOrderRequest) {

		return CreateOrderResponseDTO.of(orderService.createOrder(createOrderRequest.getOrder()));
	}


	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> getAllOrders(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {

		try {
			List<Order> orders = new ArrayList<Order>();
			Pageable paging = PageRequest.of(page, size);

			Page<Order> pageOrders;

			pageOrders = orderService.getOrders(paging);

			orders = pageOrders.getContent();

			Map<String, Object> response = new HashMap<>();
			//Use DTO if it's needed
			response.put("orders", orders);
			response.put("currentPage", pageOrders.getNumber());
			response.put("totalItems", pageOrders.getTotalElements());
			response.put("totalPages", pageOrders.getTotalPages());

			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
