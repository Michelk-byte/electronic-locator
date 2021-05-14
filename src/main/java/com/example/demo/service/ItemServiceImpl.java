package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemrepo;

    //autowiring the Items Repository
    private final ItemRepository repository;

    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    //method that return the paginated result by default
    @Override
    public Page<Item> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    //method that return the paginated result by type
    @Override
    public Page<Item> findType(String type, Pageable pageable) {
        return repository.findBytypeContaining(type, pageable);
    }

    //methode that return the paginated resulted result by name
    // it's a collection because we may have more than one restaurant that shares the same name but are in different location
    @Override
    public Page<Item> findName(String name, Pageable pageable) {
        return repository.findByNameStartingWithIgnoreCase(name, pageable);
    }

    //method to return the device by its id
    @Override
    public Optional<Item> findId(Long id) {
        return repository.findById(id);
    }


    //method to save an item
    @Override
    public void addItem(Item newitem) {
        itemrepo.save(newitem);
    }

    //method to update an item
    @Override
    public void updateItem(Item newItem, Long id) {
        itemrepo.findById(id)
                .map(item -> {
                    item.setName(newItem.getName());
                    item.setType(newItem.getType());
                    item.setDescription(newItem.getDescription());
                    item.setImg(newItem.getImg());
                    item.setPrice(newItem.getPrice());
                    return itemrepo.save(item);
                })
                .orElseGet(() -> {
                    newItem.setId(id);
                    return itemrepo.save(newItem);
                });
    }

    //method to save an item
    @Override
    public void deleteItem(Long id) {
        itemrepo.deleteById(id);
    }

}
