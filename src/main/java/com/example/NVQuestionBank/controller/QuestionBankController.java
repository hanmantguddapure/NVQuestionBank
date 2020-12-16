package com.example.NVQuestionBank.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionBankController {
	private final Logger logger = LogManager.getLogger(QuestionBankController.class);

	@GetMapping("/find-all")
	public ResponseEntity<?> findAdd() {
		logger.info("----fetching all questions----");
		List<String> questions = null;
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}
	
	@PostMapping("/new-questions")
	public ResponseEntity<?> addNewQuestions() {
		logger.info("----fetching all questions----");
		List<String> questions = null;
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}

}
