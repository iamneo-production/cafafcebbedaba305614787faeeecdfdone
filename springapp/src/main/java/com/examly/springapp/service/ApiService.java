package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

    private List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        // Implement logic to add a laptop to the list
        return laptops.add(laptop);
    }

    public Laptop getLaptopById(int laptopid) {
        // Implement logic to retrieve a laptop by ID
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopid() == laptopid) {
                return laptop;
            }
        }
        return null; // Return null if not found
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }
}
