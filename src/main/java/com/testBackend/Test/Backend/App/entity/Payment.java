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

public class Payment {
    @Id
    private String cardNumber;
    private String uID;
    private String nameOnCard;
    private String expireDate;
    private String cvv;
}
