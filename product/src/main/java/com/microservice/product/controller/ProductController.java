package com.microservice.product.controller;

import com.microservice.product.model.Product;
import com.microservice.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Product product){
        productService.save(product);
        return ResponseEntity.ok("Save successful");
    }

    @GetMapping("/listAll")
    public ResponseEntity<?> listAll(){
        return ResponseEntity.ok(productService.listAll());
    }

}
