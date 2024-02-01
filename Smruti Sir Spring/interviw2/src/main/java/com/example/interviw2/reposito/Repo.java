package com.example.interviw2.reposito;

import com.example.interviw2.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Model, Integer> {
}
