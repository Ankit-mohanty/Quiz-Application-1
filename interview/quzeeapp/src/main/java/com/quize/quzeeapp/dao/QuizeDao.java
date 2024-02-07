package com.quize.quzeeapp.dao;

import com.quize.quzeeapp.model.Questions;
import com.quize.quzeeapp.model.Quize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizeDao extends JpaRepository<Quize, Integer> {

}
