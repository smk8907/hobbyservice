package com.example.web.hobbyservice.respository;

import com.example.web.hobbyservice.table.Question;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionRepository extends JpaRepository<Question, Integer> {
}