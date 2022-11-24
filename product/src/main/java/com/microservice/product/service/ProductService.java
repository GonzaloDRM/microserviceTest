package com.microservice.product.service;

import com.microservice.product.model.Product;
import com.microservice.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional
    public void save(Product product){
        productRepository.save(product);
    }

    @Transactional(readOnly = true)
    public List<Product> listAll(){
        return productRepository.findAll();
    }

}
