package com.cocotique.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String phone;

    private String address;

    @Column(name = "order_time")
    private LocalDateTime orderTime;

    
    @PrePersist
    protected void onCreate() {
        orderTime = LocalDateTime.now();
    }
}