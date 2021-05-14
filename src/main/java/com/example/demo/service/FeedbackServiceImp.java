package com.example.demo.service;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImp  {

    @Autowired
    FeedbakRepository feedRepo;

    public Feedback addFeed(Feedback fb){
        return feedRepo.save(fb);
    }
}
