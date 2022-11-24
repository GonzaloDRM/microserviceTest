package com.microservice.customer.controller;

import com.microservice.customer.model.Customer;
import com.microservice.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public void create(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @GetMapping("/listAll")
    public ResponseEntity<?> listaAll(){
        return ResponseEntity.ok(customerService.listAll());
    }


}
