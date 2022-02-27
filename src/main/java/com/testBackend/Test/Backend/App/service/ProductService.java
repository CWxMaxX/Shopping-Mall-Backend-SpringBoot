package com.testBackend.Test.Backend.App.service;


import com.testBackend.Test.Backend.App.entity.Product;
import com.testBackend.Test.Backend.App.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public Product publishProduct(Product product){
        productRepo.save(product);
        return product;
    }
    public List<Product> getAllProducts(){
        List<Product> productList = productRepo.findAll();
        return modelMapper.map(productList,new TypeToken<List<Product>>(){}.getType());
    }
    public Optional<Product> getProductByID(Integer productID){

        return productRepo.findById(productID);
    }

}
