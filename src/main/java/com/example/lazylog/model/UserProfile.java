package com.example.lazylog.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "UserProfile")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int age;

    private String gender;

    private double heightCm;

    private double weightCm;

    private String goalType;

    private double dailyCalorieTarget;

    private String activityLevel;

    private String country;

    private String referenceObjectUrl;

    private double dailyCarbTarget;

    private double dailyFatTarget;

    private double dailyProteinTarget;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
