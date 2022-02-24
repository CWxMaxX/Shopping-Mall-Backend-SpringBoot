package com.testBackend.Test.Backend.App.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ShoppingCartDTO {
    private String cartID;

    private String uID;
    private String deliveryStatus;
    private String deliveryAddress;
    private String paymentStatus;
}
