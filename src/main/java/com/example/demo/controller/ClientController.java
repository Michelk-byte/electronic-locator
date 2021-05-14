package com.example.demo.controller;


import com.example.demo.model.*;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {




//    @Transactional
//    @DeleteMapping("/delete/item")
//    public ResponseEntity<List<Cart>> deletItem(@RequestParam("id")Long id){
//        cartServ.deleteItem(id);
//        return new ResponseEntity<>(cartServ.findAll(),HttpStatus.OK);
//    }









}
