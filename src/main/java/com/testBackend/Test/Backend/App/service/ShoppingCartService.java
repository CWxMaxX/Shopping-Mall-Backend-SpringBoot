package com.testBackend.Test.Backend.App.service;

import com.testBackend.Test.Backend.App.entity.ShoppingCart;
import com.testBackend.Test.Backend.App.repo.ShoppingCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ShoppingCartService  {
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;

    public ShoppingCart createShoppingCard(ShoppingCart shoppingCart){
        shoppingCartRepo.save(shoppingCart);
        return shoppingCart;
    }
}
