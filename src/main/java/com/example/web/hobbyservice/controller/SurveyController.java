/*
package com.example.web.hobbyservice.controller;

import com.example.web.hobbyservice.dto.SurveyDto;
import com.example.web.hobbyservice.service.SurveyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SurveyController {

    private SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }


    @GetMapping("/survey")
    public String list(Model model) {
        List<SurveyDto> surveyDtoList = surveyService.getSurveylist();
        model.addAttribute("surveyList", surveyDtoList);
        return "survey/survey.html";

    }
}
*/
