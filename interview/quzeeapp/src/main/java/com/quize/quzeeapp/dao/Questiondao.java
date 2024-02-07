package com.quize.quzeeapp.dao;

import com.quize.quzeeapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Questiondao extends JpaRepository<Questions,Integer> {
    List<Questions>findByCategory(String category);
    @Query(value = "SELECT * FROM  question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ",  nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(String category, int numQ);
}
