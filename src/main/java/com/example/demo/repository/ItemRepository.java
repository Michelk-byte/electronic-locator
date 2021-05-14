package com.example.demo.repository;

import com.example.demo.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item,Long> {
    // methods that returns the paginated result based on the type of the request
    Page<Item> findBytypeContaining(String type, Pageable pageable);
    Page<Item> findByNameStartingWithIgnoreCase(String name, Pageable pageable);

    // methods to filter the items by types it will help us select the selected electronics by type
    List<Item> findByType(String Type);

    //methods to get the electronic device by id
    Optional<Item> findById(Long id);
}
