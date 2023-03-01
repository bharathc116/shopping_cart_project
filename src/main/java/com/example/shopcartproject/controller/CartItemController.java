package com.example.shopcartproject.controller;

import com.example.shopcartproject.model.CartItem;
import com.example.shopcartproject.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class CartItemController {
    @Autowired


    CartItemService cartItemService;
    @GetMapping("/orders/{orderNumber}")
    public List<CartItem> getItemsByOrderNumber(@PathVariable String orderNumber) {
        return cartItemService.getItemsByOrderNumber(orderNumber);
    }
    @PostMapping("/orders")
    public ResponseEntity<CartItem> createItem(@RequestBody CartItem cartItem){
return new ResponseEntity<>(cartItemService.addItem(cartItem),HttpStatus.CREATED);

    }

//    @PostMapping("/item")
//    public ResponseEntity<Void> addItemToCart(@RequestBody CartItem cartItem) {
//        cartItemService.addItem(cartItem.getOrderNumber(), cartItem.getItem());
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/item/{orderNumber}")
//
//    public ResponseEntity<List<CartItem>> getItems(@RequestParam("order_Number")String orderNumber){
//
//        List<CartItem> cart = cartItemService.getOrderBYNumber( orderNumber);
//        return ResponseEntity.ok().body(cart);
//    }


}
