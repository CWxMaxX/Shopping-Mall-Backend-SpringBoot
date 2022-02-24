package com.testBackend.Test.Backend.App.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private Integer productID;
    private String productName;
    private Float price;
    private String imageURL;
    private String description;
    private Integer availableQuantity;
}
