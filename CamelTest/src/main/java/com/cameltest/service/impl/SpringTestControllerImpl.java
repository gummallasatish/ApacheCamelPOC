package com.cameltest.service.impl;

import com.cameltest.pojo.CamelResponse;
import com.cameltest.service.SpringTestController;

public class SpringTestControllerImpl implements SpringTestController {

	public CamelResponse sayHello(String username) {
		//System.out.println( "Hello "+username);
		CamelResponse res = new CamelResponse() ;
		res.setName("Hello "+username) ;
		return res;
	}

}
