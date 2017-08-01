package com.cameltest.test;

import org.apache.camel.ProducerTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cameltest.pojo.CamelRequest;
import com.cameltest.pojo.CamelResponse;
import com.cameltest.service.impl.LoginServiceImpl;

public class SpringTest{

	public static void main(String[] args) throws Exception {
		
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;
	ProducerTemplate producer =  context.getBean("testtemplate",ProducerTemplate.class) ;
	CamelRequest request = new CamelRequest() ;
	request.setName("1234");
	CamelResponse res = producer.requestBody("direct:start",request,CamelResponse.class) ;
	System.out.println(res.getName());
	
	/*LoginServiceImpl login = context.getBean("test",LoginServiceImpl.class) ;
	login.userCheck("vijay-sree-malli") ;
	*/
		
	
	
	}

}
