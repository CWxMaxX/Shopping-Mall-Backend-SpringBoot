package com.testBackend.Test.Backend.App.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ShoppingCartContainsPK.class)
public class ShoppingCartContains {
    @Id
    private String cartID;
    @Id
    private String productID;
    private Integer quantity;
}
