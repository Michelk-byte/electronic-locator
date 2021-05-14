package com.example.demo.service;

import com.example.demo.model.Purchased;
import com.example.demo.repository.purchasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchasedServiceImp implements PurchasedService{

    @Autowired
    purchasedRepository purRepo;

    @Override
    public Purchased addItem(Purchased pur) {
        return purRepo.save(pur);
    }
}
