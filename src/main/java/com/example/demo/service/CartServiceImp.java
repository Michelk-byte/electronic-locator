package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImp implements CartService {

    @Autowired
    CartRepository cartRepo;

    @Override
    public Cart addItem(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public Optional<Cart> getId(long id) {
        return cartRepo.findByIdI(id);
    }

    @Override
    public List<Cart> findAll() {
        return cartRepo.findAll();
    }

    @Override
    public void deleteItem(Long id) {
        cartRepo.deleteByIdI(id);
    }

    @Override
    public void deleteAll() {
        cartRepo.deleteAll();
    }

    @Override
    public Boolean Check(Long id) {
        return cartRepo.countByIdI(id)==0;
    }
}
