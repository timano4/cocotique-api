package com.cocotique.controller; 

import com.cocotique.model.Order; 
import com.cocotique.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;


    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}