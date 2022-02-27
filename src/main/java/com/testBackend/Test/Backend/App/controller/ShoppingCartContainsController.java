package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.entity.ShoppingCartContains;
import com.testBackend.Test.Backend.App.service.ShoppingCartContainsService;
import com.testBackend.Test.Backend.App.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/shoppingCart")
@CrossOrigin

public class ShoppingCartContainsController {
    @Autowired
    private ShoppingCartContainsService shoppingCartContainsService;

    @PostMapping("/addProduct")
    public ShoppingCartContains addProduct(@RequestBody ShoppingCartContains shoppingCartContains) {
        return shoppingCartContainsService.addProduct(shoppingCartContains);
    }

    @GetMapping("/getCartContains/{cartID}")
    public List<ShoppingCartContains> getCartContains(@PathVariable("cartID") String cartID) {
        return shoppingCartContainsService.getCartProductsList(cartID);
    }

    @DeleteMapping("/removeProductByID")
    public boolean removeProductByID(@RequestBody String productID) {
        return shoppingCartContainsService.removeProduct(productID);
    }
    @DeleteMapping("/removeProductsByCartID")
    public boolean removeProductsByCartID(@RequestBody String cartID){
        return shoppingCartContainsService.removeProductsByCartID(cartID);
    }

}
