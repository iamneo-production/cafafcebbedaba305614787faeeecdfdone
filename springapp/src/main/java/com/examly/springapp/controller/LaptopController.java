package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public ResponseEntity<Boolean> addLaptop(@RequestBody Laptop laptop) {
        boolean isAdded = apiService.addLaptop(laptop);
        
        if (isAdded) {
            return ResponseEntity.ok(true); // Return HTTP 200 OK with true
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false); // Return HTTP 400 Bad Request with false
        }
    }

    @GetMapping("/{laptopid}")
    public Laptop getLaptop(@PathVariable int laptopid) {
        return apiService.getLaptopById(laptopid);
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return apiService.getAllLaptops();
    }
}
