package com.kj.questionnaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kj.questionnaire.model.Answer;
import com.kj.questionnaire.repository.AnswerRepository;

@RestController
@RequestMapping("/api")
public class AnswerController {
	@Autowired
	AnswerRepository answerRepository;
	
	@RequestMapping(value = "/answers", method = RequestMethod.POST)
	public String saveAnswer(@RequestBody Answer answer) {
		answerRepository.save(answer);
		return "";
	}
}
