package com.microservice.order.service;

import com.microservice.order.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Autowired
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Transactional
    public void save(Product product){
        restTemplate.postForObject("http://localhost:8003/save",product , Product.class);
    }



}
