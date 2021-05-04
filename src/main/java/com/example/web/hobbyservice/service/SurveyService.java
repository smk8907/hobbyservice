package com.example.web.hobbyservice.service;

import com.example.web.hobbyservice.dto.SurveyDto;
import com.example.web.hobbyservice.respository.SurveyRepository;
import com.example.web.hobbyservice.table.Survey;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SurveyService {

    private SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {

        this.surveyRepository = surveyRepository;
    }

    @Transactional
    public List<SurveyDto> getSurveylist() {
        List<Survey> surveys = surveyRepository.findAll();
        List<SurveyDto> surveyDtoList = new ArrayList<>();

        for(Survey survey : surveys) {
            SurveyDto surveyDto = SurveyDto.builder()
                    .s_id(survey.getS_id())
                    .interest(survey.getInterest())
                    .build();

            surveyDtoList.add(surveyDto);
        }

        return surveyDtoList;

    }

}
