package com.microservice.order.service;

import com.microservice.order.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private final RestTemplate restTemplate;

    public CustomerService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Transactional
    public void save(Customer customer){
        restTemplate.postForObject("http://localhost:8001/save", customer, Customer.class);
    }


}
