package com.cameltest.camelBean;

import com.cameltest.pojo.CamelRequest;
import com.cameltest.pojo.CamelResponse;
import com.cameltest.service.SpringTestController;

public class SpringCamelController {
	
	private SpringTestController springtestController ;
	
	private String name  ;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSpringtestController(SpringTestController springtestController) {
		this.springtestController = springtestController;
	}
	
	public CamelResponse  execute(CamelRequest req) {
		System.out.println();
		return springtestController.sayHello(req.getName());
	}

}
