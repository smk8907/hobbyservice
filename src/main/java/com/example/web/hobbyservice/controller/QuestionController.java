package com.example.web.hobbyservice.controller;

import com.example.web.hobbyservice.dto.QuestionDto;
import com.example.web.hobbyservice.dto.SurveyDto;
import com.example.web.hobbyservice.service.QuestionService;
import com.example.web.hobbyservice.service.SurveyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class QuestionController {

        private QuestionService questionService;

        public QuestionController(QuestionService questionService) {
            this.questionService = questionService;
        }

    @GetMapping("/survey/{no}")
    public String qdetail(@PathVariable("no") int s_id, Model model) {
        QuestionDto questionDto = questionService.getPost(s_id);

        model.addAttribute("questionDto", questionDto);
        return "survey/qdetail.html";
    }

    @Controller
    static class SurveyController {

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
}

