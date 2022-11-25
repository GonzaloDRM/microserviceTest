package com.microservice.order.controller;

import com.microservice.order.model.Customer;
import com.microservice.order.model.Order;
import com.microservice.order.model.Product;
import com.microservice.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/listAll")
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(orderService.listAll());
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Order order, @RequestBody List<Product> products, @RequestBody Customer customer){
        orderService.save(order, products, customer);
        return ResponseEntity.ok("save successful");
    }

}
