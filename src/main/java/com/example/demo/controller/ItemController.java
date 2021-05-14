package com.example.demo.controller;


import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/items")
public class ItemController {

   final
   ItemService electronic_Service;

    public ItemController(ItemService electronic_Service) {
        this.electronic_Service = electronic_Service;
    }

   @GetMapping
   public ResponseEntity<Page<Item>> findRestos(Pageable pageable){
       return findAllRestaurants("All",pageable);
   }


    @GetMapping("/{type}")
    public ResponseEntity<Page<Item>> findAllRestaurants(@PathVariable("type") String type, Pageable pageable){
        try{
            if(type.contentEquals("All") ){
                return new ResponseEntity<>(electronic_Service.findAll(pageable),HttpStatus.OK);
            }
            else{
               return new ResponseEntity<>(electronic_Service.findType(type,pageable),HttpStatus.OK);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Page<Item>> findNameRestaurants(@PathVariable("name") String name, Pageable pageable){
        try{
                return new ResponseEntity<>(electronic_Service.findName(name,pageable),HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Item>> findId(@PathVariable Long id){
        return new ResponseEntity<>(electronic_Service.findId(id),HttpStatus.OK);
    }

}
