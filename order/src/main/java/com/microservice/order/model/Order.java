package com.microservice.order.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "Order")
public class Order {

    @Id
    private Integer id;
    private List<Product> products;
    private String state;
    private Date creation;
    private Date update;
    private Customer customers;
    private String paymentMethod;

}
