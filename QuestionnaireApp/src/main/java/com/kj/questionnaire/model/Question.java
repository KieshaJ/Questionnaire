package com.kj.questionnaire.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class Question {
	@Id
	@GeneratedValue
	private Integer id;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	
	public Question() {}
	
	public Question(Integer id, String question, String answer1, String answer2, String answer3, String answer4) {
		this.id = id;
		this.question = question;
		this.answer1 = answer1;
		this.answer1 = answer1;
		this.answer1 = answer1;
		this.answer1 = answer1;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
}
