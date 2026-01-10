package com.example.lazylog.model;


import jakarta.persistence.*;

@Entity
@Table(name = "MealLog")
public class MealLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
