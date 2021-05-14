package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

//this interface shows the methods that are available to the Restaurants service

public interface ItemService {

    Page<Item> findAll(Pageable pageable);
    Page<Item> findType(String type, Pageable pageable);
    Page<Item> findName(String name, Pageable pageable);

    Optional<Item> findId(Long id) ;
    void addItem(Item item);
    void updateItem(Item item, Long id);
    void deleteItem(Long id);
}
