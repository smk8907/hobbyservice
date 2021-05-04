/*
package com.example.web.hobbyservice.service;

import com.example.web.hobbyservice.dto.LifeQuestionDto;
import com.example.web.hobbyservice.respository.LifeQuestionRepository;
import com.example.web.hobbyservice.table.LifeQuestion;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class LifeQuestionService {

    private LifeQuestionRepository lifeQuestionRepository;

    public LifeQuestionService(LifeQuestionRepository lifeQuestionRepository) {

        this.lifeQuestionRepository = lifeQuestionRepository;
    }

    @Transactional
    public LifeQuestionDto getPost(int s_id) {
        Optional<LifeQuestion> lifeQuestionWrapper = lifeQuestionRepository.findById(s_id);
        LifeQuestion lifeQuestion = lifeQuestionWrapper.get();

        LifeQuestionDto lifeQuestionDto = LifeQuestionDto.builder()
                .ql_id(lifeQuestion.getQl_id())
                .s_id(lifeQuestion.getS_id())
                .ql_title(lifeQuestion.getQl_title())
                .ql_content1(lifeQuestion.getQl_content1())
                .ql_content2(lifeQuestion.getQl_content2())
                .ql_content3(lifeQuestion.getQl_content3())
                .build();

        return lifeQuestionDto;
    }

}
*/
