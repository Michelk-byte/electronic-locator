package com.example.demo.service;

import com.example.demo.model.Cart;

import java.util.List;
import java.util.Optional;

public interface CartService {
    Cart addItem(Cart cart);
    Optional<Cart> getId(long id);
    List<Cart> findAll();
    void deleteItem(Long id);
    void deleteAll();
    Boolean Check(Long id);
}
