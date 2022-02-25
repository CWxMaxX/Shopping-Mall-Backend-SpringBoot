package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.entity.ShoppingCart;
import com.testBackend.Test.Backend.App.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/shoppingCart")
@CrossOrigin
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/createShoppingCart")
    public ShoppingCart createShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        shoppingCartService.createShoppingCard(shoppingCart);
        return shoppingCart;
    }

}
