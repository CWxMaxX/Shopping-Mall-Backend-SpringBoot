package com.testBackend.Test.Backend.App.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product {
    @Id
    private Integer productID;
    private String productName;
    private Float price;
    private String imageURL;
    private String description;
    private Integer availableQuantity;

}
