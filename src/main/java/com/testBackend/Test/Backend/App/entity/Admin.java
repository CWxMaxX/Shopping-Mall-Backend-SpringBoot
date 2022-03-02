package com.testBackend.Test.Backend.App.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String adminID;
    @Column(nullable = false, length = 20)
    private static String name;
    @Column(nullable = false, length = 15)
    private String phoneNumber;
    @Column(nullable = false, unique = true, length = 45)
    private static String email;
    @Column(nullable = false, length = 64)
    private static String password;

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
