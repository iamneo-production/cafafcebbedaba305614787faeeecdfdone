package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopid;
    private String laptopBrand;
    private int laptopPrice;

    public Laptop() {
    }

    public Laptop(String laptopBrand, int laptopPrice) {
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    // getters and setters
    public int getLaptopid() {
        return laptopid;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
