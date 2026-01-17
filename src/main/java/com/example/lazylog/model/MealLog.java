package com.example.lazylog.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "MealLog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MealLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Instant loggedAt;

    private String imageUrl;

    private String userPromptLog;

    private int visualClarity;

    private int sizeReference;

    private int satisfactoryDescription;

    private int confidence;

    private double estimatedCalories;

    private double estimatedCarb;

    private double estimatedFat;

    private double estimatedProtein;

    @CreatedDate
    private Instant createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
