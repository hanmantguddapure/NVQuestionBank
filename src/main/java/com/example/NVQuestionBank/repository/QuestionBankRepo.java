package com.example.NVQuestionBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.NVQuestionBank.entity.QuestionBank;

public interface QuestionBankRepo extends CrudRepository<QuestionBank, Long> {
	public QuestionBank findByQuestion(String question);

}
