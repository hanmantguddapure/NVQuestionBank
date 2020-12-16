package com.example.NVQuestionBank.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.NVQuestionBank.comman.Constant;
import com.example.NVQuestionBank.dto.ApiResponse;
import com.example.NVQuestionBank.dto.QuestionDtl;
import com.example.NVQuestionBank.entity.QuestionBank;
import com.example.NVQuestionBank.repository.RepoManager;
import com.example.NVQuestionBank.service.QuestionBankService;

@Service
public class QuestionBankServiceImpl extends RepoManager implements QuestionBankService {
	private final Logger logger = LogManager.getLogger(QuestionBankServiceImpl.class);

	@Override
	public ApiResponse findAllQuestions() {
		ApiResponse apiResponse = new ApiResponse();
		List<QuestionBank> quesBankLst = (List<QuestionBank>) this.getQuestionBankRepo().findAll();
		if (null != quesBankLst && quesBankLst.size() > 0) {
			List<String> questions = quesBankLst.stream().map(QuestionBank::getQuestion).collect(Collectors.toList());
			apiResponse.setValue(questions);
			apiResponse.setStatusCode(HttpStatus.OK.value());
			apiResponse.setStatus(Constant.status.SUCCESS);
			return apiResponse;
		} else {
			apiResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
			apiResponse.setStatus(Constant.status.FAILED);
			return apiResponse;
		}
	}

	@Override
	public ApiResponse addNewQuestion(QuestionDtl questionDtl) {
		ApiResponse apiResponse = new ApiResponse();
		QuestionBank questionbank = null;
		questionbank = this.getQuestionBankRepo().findByQuestion(questionDtl.getQuestion());
		if (null == questionbank) {
			questionbank = new QuestionBank();
			questionbank.setCreatedDate(LocalDate.now());
		}
		questionbank = this.getQuestionBankRepo().save(questionbank);
		apiResponse.setStatusCode(HttpStatus.OK.value());
		apiResponse.setStatus(Constant.status.SUCCESS);
		apiResponse.setValue(questionDtl);
		return apiResponse;
	}

	@Override
	public ApiResponse updateQuestion(QuestionDtl questionDtl) {
		ApiResponse apiResponse = new ApiResponse();
		Optional<QuestionBank> questionbank = null;
		questionbank = this.getQuestionBankRepo().findById(questionDtl.getQuestionId());
		if (questionbank.isPresent()) {
			QuestionBank questionBankObj=questionbank.get();
			questionBankObj.setQuestion(questionDtl.getQuestion());
			questionBankObj = this.getQuestionBankRepo().save(questionBankObj);
			apiResponse.setStatusCode(HttpStatus.OK.value());
			apiResponse.setStatus(Constant.status.SUCCESS);
			apiResponse.setValue(questionDtl);
			return apiResponse;
		}else {
			apiResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
			apiResponse.setStatus(Constant.status.FAILED);
			apiResponse.setValue(questionDtl);
			return apiResponse;
		}
		
		
	}

}
