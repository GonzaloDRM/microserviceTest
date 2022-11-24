package com.microservice.product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Product")
public class Product {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;

}
