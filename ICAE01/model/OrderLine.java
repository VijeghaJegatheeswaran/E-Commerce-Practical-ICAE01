package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_lines")
public class OrderLine {
    
    @Id
    private Long id;
    
    
    
    @ManyToOne
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;
    
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    
    @ManyToOne
    @JoinColumn(name = "daily_menu_id")
    private DailyMenu dailyMenu;
    
   
}