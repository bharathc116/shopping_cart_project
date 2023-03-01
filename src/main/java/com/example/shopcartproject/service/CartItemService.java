package com.example.shopcartproject.service;

import com.example.shopcartproject.model.CartItem;

import java.util.List;

public interface CartItemService {
    List<CartItem> getItemsByOrderNumber(String orderNumber);
    CartItem addItem(CartItem cartItem);

//    CartItem addItem(CartItem cartItem);
//    List<CartItem> getItem();
//    List<CartItem> getItemByNumber();
}
