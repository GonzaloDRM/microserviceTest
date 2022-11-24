package com.microservice.customer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Customer")
public class Customer {

    @Id
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;

}
