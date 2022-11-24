package com.microservice.order.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Customer {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
