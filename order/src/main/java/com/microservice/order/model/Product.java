package com.microservice.order.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;


}
