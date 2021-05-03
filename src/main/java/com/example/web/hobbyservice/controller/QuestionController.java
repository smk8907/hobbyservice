package com.example.web.hobbyservice.controller;

import com.example.web.hobbyservice.dto.QuestionDto;
import com.example.web.hobbyservice.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/survey")
    public String list(Model model) {
        List<QuestionDto> questionDtoList = questionService.getQuestionlist();
        model.addAttribute("questionList", questionDtoList);
        return "survey/survey.html";
    }
}
