package com.example.NVQuestionBank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NVQuestionBank.service.QuestionBankService;
import com.example.NVQuestionBank.service.ServiceManger;

public class ServiceMangerImpl implements ServiceManger {

	@Autowired
	public QuestionBankService questionBankService;

	public QuestionBankService getQuestionBankService() {
		return questionBankService;
	}

	public void setQuestionBankService(QuestionBankService questionBankService) {
		this.questionBankService = questionBankService;
	}

}
