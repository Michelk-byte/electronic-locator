package com.example.demo.repository;

import com.example.demo.model.Purchased;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface purchasedRepository extends JpaRepository<Purchased,Long> {
    Purchased save(Purchased pur);
}
