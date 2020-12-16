package com.example.NVQuestionBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.NVQuestionBank.service.ServiceManger;

@Controller
public class BaseController {
	@Autowired
	ServiceManger serviceManger;

	public ServiceManger getServiceManger() {
		return serviceManger;
	}

	public void setServiceManger(ServiceManger serviceManger) {
		this.serviceManger = serviceManger;
	}

}
