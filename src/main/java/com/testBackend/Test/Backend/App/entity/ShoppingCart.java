package com.testBackend.Test.Backend.App.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCart {
    @Id
    private String cartID;

    private String uID;
    private String deliveryStatus;
    private String deliveryAddress;
    private String paymentStatus;

}
