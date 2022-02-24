package com.testBackend.Test.Backend.App.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {

    @Id

    @Column(unique = true)
    private String uID;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phoneNumber;
    private String shippingAddress;
}
