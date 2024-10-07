package dev.dizzpy.crud_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private Double price;

    // No-args constructor
    public Item() {
    }

    // All-args constructor
    public Item(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
