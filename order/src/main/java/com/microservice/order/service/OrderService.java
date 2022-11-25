package com.microservice.order.service;

import com.microservice.order.model.Customer;
import com.microservice.order.model.Order;
import com.microservice.order.model.Product;
import com.microservice.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private final RestTemplate productRest;
    private final OrderRepository orderRepository;

    public OrderService(RestTemplate productRest, OrderRepository orderRepository){
        this.productRest = productRest;
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void save(Order order, List<Product> products, Customer customer){
        order.setCustomers(customer);
        order.setProducts(products);
        orderRepository.save(order);
    }

    @Transactional(readOnly = true)
    public List<Order> listAll(){
        return orderRepository.findAll();
    }



}
