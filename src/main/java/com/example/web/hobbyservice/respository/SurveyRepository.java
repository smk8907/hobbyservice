package com.example.web.hobbyservice.respository;

import com.example.web.hobbyservice.table.Survey;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SurveyRepository extends JpaRepository<Survey, Integer> {
}
