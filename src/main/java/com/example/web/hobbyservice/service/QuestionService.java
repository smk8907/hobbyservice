package com.example.web.hobbyservice.service;


import com.example.web.hobbyservice.dto.QuestionDto;
import com.example.web.hobbyservice.respository.QuestionRepository;
import com.example.web.hobbyservice.table.Question;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {

        this.questionRepository = questionRepository;
    }

    @Transactional
    public List<QuestionDto> getQuestionlist() {
        List<Question> questions = questionRepository.findAll();
        List<QuestionDto> questionDtoList = new ArrayList<>();

        for(Question question : questions) {
            QuestionDto questionDto = QuestionDto.builder()
                    .q_id(question.getQ_id())
                    .q_content(question.getQ_content())
                    .s_id(question.getS_id())
                    .build();

            questionDtoList.add(questionDto);
        }

        return questionDtoList;

    }

}
