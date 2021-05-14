package com.example.demo.repository;

import com.example.demo.model.isLogged;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsLogedRepository extends JpaRepository<isLogged,Long> {

}
