package com.example.demo.controller;


import com.example.demo.model.*;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.*;

@RestController
@RequestMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Autowired
    ItemService itemService;

    @PostMapping("/insert")
    ResponseEntity<Map<String, String>> insertItem(@RequestBody Item newItem) {
        itemService.addItem(newItem);

        return ResponseEntity.ok().body(Collections.singletonMap("response", "Item added!"));
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Map<String, String>> replaceEmployee(@RequestBody Item newItem, @PathVariable Long id) {
        itemService.updateItem(newItem, id);

        return ResponseEntity.ok().body(Collections.singletonMap("response", "Item updated!"));
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Map<String, String>> deleteEmployee(@PathVariable Long id) {
        itemService.deleteItem(id);

        return ResponseEntity.ok().body(Collections.singletonMap("response", "Item deleted!"));
    }
}
