package com.example.baitapspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "products")

public class ProductEntity  {
    @Id
    private int id ;
    private String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String description ;
    private int price ;

}
