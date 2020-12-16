package com.example.NVQuestionBank.service;

import com.example.NVQuestionBank.dto.ApiResponse;
import com.example.NVQuestionBank.dto.QuestionDtl;

public interface QuestionBankService {
	public ApiResponse findAllQuestions();

	public ApiResponse addNewQuestion(QuestionDtl questionDtl);

	public ApiResponse updateQuestion(QuestionDtl questionDtl);

}
