package com.example.NVQuestionBank.dto;

import java.util.HashMap;
import java.util.Map;

public class StatusDtl {
	private int statusCode;
	private String status;
	private Map<String, String> errorMap = new HashMap<>();

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, String> getErrorMap() {
		return errorMap;
	}

	public void setErrorMap(Map<String, String> errorMap) {
		this.errorMap = errorMap;
	}

}
