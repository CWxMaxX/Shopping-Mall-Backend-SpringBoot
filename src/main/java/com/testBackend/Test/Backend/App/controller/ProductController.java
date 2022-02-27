package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.entity.Product;
import com.testBackend.Test.Backend.App.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/publishProduct")
    public Product publishProduct(@RequestBody Product product){
        return productService.publishProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){return productService.getAllProducts();}

    @GetMapping("/getProductByID/{productID}")
    public Optional<Product> getProductByID(@PathVariable("productID") Integer productID){
       return productService.getProductByID(productID);
    }
}
