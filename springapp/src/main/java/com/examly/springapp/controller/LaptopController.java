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
    public ResponseEntity<String> addLaptop(Laptop laptop) {
        try {
            // Assign a unique ID to the laptop before adding it
            laptop.setLaptopId(nextId++);
            laptops.add(laptop);
            return ResponseEntity.ok("true"); // Return success
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("false"); // Return error
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
