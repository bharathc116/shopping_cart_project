package com.example.shopcartproject.repository;

import com.example.shopcartproject.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
    List<CartItem> findByOrderNumberOrderByItemName(String orderNumber);
}
