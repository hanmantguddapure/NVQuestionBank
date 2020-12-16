package com.example.NVQuestionBank.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NVQuestionBank.dto.ApiResponse;
import com.example.NVQuestionBank.dto.QuestionDtl;

@RestController
@RequestMapping("/question")
public class QuestionBankController extends BaseController {
	private final Logger logger = LogManager.getLogger(QuestionBankController.class);

	@GetMapping("/find-all")
	public ResponseEntity<?> findAdd() {
		logger.info("----fetching all questions----");
		ApiResponse apiResponse = this.getServiceManger().getQuestionBankService().findAllQuestions();
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}

	@PostMapping("/new-questions")
	public ResponseEntity<?> addNewQuestions(@RequestBody QuestionDtl questionBankDtl) {
		logger.info("----adding new questions----");
		ApiResponse apiResponse = this.getServiceManger().getQuestionBankService().addNewQuestion(questionBankDtl);
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}

	@PostMapping("/update-questions")
	public ResponseEntity<?> updateQuestions(@RequestBody QuestionDtl questionBankDtl) {
		logger.info("----adding new questions----");
		ApiResponse apiResponse = this.getServiceManger().getQuestionBankService().updateQuestion(questionBankDtl);
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}

}
