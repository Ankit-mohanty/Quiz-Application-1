package com.quize.quzeeapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Quize {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String title;
    @ManyToMany
    private List<Questions> questions;
}
