package com.example.NVQuestionBank.service;

import com.example.NVQuestionBank.dto.ApiResponse;

public interface QuestionBankService {
	public ApiResponse findAllQuestions();

	public ApiResponse addNewQuestion();

	public ApiResponse updateQuestion();

}
