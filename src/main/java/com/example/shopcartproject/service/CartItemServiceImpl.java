package com.example.shopcartproject.service;

import com.example.shopcartproject.model.CartItem;
import com.example.shopcartproject.repository.CartItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CartItemServiceImpl implements CartItemService {
    @Autowired
    CartItemRepo cartItemRepo;
    public List<CartItem> getItemsByOrderNumber(String orderNumber) {
        return cartItemRepo.findByOrderNumberOrderByItemName(orderNumber);
    }

    @Override
    public CartItem addItem(CartItem cartItem) {
        return cartItemRepo.save(cartItem);
    }


//    @Override
//    public CartItem addItem(String orderNumber, String item) {
//        CartItem cartItem = new CartItem(orderNumber, item);
//        cartItemRepo.save(cartItem);
//    }
//
//    @Override
//    public List<CartItem> getItem() {
//        return cartItemRepo.findAll();
//    }
//
//    @Override
//    public List<CartItem> getOrderBYNumber(String orderNumber) {
//        return cartItemRepo.findAll();
//    }
}
