package com.example.NVQuestionBank.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepoManager {
	@Autowired
	QuestionBankRepo questionBankRepo;

	public QuestionBankRepo getQuestionBankRepo() {
		return questionBankRepo;
	}

	public void setQuestionBankRepo(QuestionBankRepo questionBankRepo) {
		this.questionBankRepo = questionBankRepo;
	}

}
