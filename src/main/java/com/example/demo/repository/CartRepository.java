package com.example.demo.repository;


import com.example.demo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    List<Cart> findAll();
    void deleteByIdI(Long idi);
    Optional<Cart> findByIdI(Long aLong);

    int countByIdI(Long id);

    @Override
    void deleteAll();
}
