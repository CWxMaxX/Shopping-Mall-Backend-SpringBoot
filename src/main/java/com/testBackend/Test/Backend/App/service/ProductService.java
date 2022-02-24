package com.testBackend.Test.Backend.App.service;


import com.testBackend.Test.Backend.App.entity.Product;
import com.testBackend.Test.Backend.App.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product publishProduct(Product product){
        productRepo.save(product);
        return product;
    }
}
