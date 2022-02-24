package com.testBackend.Test.Backend.App.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Payment {
    @Id
    private String cardNumber;
    private String uID;
    private String nameOnCard;
    private String expireMonth;
    private String expireYear;
    private String cvv;
}
