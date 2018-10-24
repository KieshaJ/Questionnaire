package com.kj.questionnaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kj.questionnaire.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
