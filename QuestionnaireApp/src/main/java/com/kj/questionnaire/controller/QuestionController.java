package com.kj.questionnaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.questionnaire.model.Question;
import com.kj.questionnaire.repository.QuestionRepository;

@RestController
@RequestMapping("/api")
public class QuestionController {
	@Autowired
	QuestionRepository questionRepository;
	
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public List<Question> getQuestions() {
		return questionRepository.findAll();
	}
}
