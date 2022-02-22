package com.testBackend.Test.Backend.App.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AdminDTO {
    private String adminID;
    private String name;
    private String email;
    private String phoneNumber;
}
