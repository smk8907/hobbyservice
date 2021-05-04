package com.example.web.hobbyservice.service;


import com.example.web.hobbyservice.dto.QuestionDto;
import com.example.web.hobbyservice.respository.QuestionRepository;
import com.example.web.hobbyservice.table.Question;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {

        this.questionRepository = questionRepository;
    }

    @Transactional
    public QuestionDto getPost(int s_id) {
        Optional<Question> questionWrapper = questionRepository.findById(s_id);
        Question question = questionWrapper.get();

            QuestionDto questionDto = QuestionDto.builder()
                   /* .q_id(question.getQ_id())*/
                    .s_id(question.getS_id())
                    .q_title(question.getQ_title())
                    .q_content1(question.getQ_content1())
                    .q_content2(question.getQ_content2())
                    .q_content3(question.getQ_content3())
                    .build();

            return questionDto;
        }

    }


