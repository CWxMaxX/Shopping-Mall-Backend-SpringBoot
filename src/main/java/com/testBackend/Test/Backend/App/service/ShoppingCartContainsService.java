package com.testBackend.Test.Backend.App.service;


import com.testBackend.Test.Backend.App.entity.ShoppingCartContains;
import com.testBackend.Test.Backend.App.repo.ShoppingCartContainsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ShoppingCartContainsService {
    @Autowired
    private ShoppingCartContainsRepo shoppingCartContainsRepo;

    public ShoppingCartContains addProduct(ShoppingCartContains shoppingCartContains){
        shoppingCartContainsRepo.save(shoppingCartContains);
        return shoppingCartContains;
    }
    public List<ShoppingCartContains> getCartProductsList(String cartID){
        List<ShoppingCartContains> cartProductsList = shoppingCartContainsRepo.findAllByCartID(cartID);
        return cartProductsList;
    }
    public boolean removeProduct (String productID){
         shoppingCartContainsRepo.deleteByProductID(productID);
         return true;
    }

    public boolean removeProductsByCartID(String cartID){
        shoppingCartContainsRepo.deleteByCartID(cartID);
        return true;
    }
}
