package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "employees")
public class Employee extends Person {
    @Id
    private int id;
    
  
    @ManyToMany
    @JoinTable(
        name = "employee_canteen",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "canteen_id")
    )
    private List<Canteen> canteens;
    
    
}