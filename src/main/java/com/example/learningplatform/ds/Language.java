package com.example.learningplatform.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String duration;
    private double fees;

    public Language(){}

    public Language(String name, String duration, double fees) {
        this.name = name;
        this.duration = duration;
        this.fees = fees;
    }
}
