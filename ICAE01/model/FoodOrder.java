package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "food_orders")
public class FoodOrder {
    
    
    
    @Column(name = "order_date")
    private LocalDate orderDate;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    
    @OneToMany(mappedBy = "foodOrder")
    private List<OrderLine> orderLines;
    
   
}