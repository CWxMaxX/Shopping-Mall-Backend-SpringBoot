package com.testBackend.Test.Backend.App.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class PaymentDTO {
    private String cardNumber;
    private String uID;
    private String nameOnCard;
    private String expireMonth;
    private String expireYear;
    private String cvv;
}
