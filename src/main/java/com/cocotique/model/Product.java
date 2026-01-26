package com.cocotique.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String tagline;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;
    private String imageUrl;
    private String imageUrl2;
    private String imageUrl3;
    private String category;

}
