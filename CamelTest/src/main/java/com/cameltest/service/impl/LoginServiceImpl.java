package com.cameltest.service.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http.HttpComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultConsumerTemplate;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cameltest.pojo.CamelRequest;
import com.cameltest.pojo.CamelResponse;
import com.cameltest.service.LoginService;

public class LoginServiceImpl  implements LoginService  {

	@Override
	public String userCheck(String username) {
		String message ="" ;
		try {
			CamelContext context = SpringCamelContext.springCamelContext(new ClassPathXmlApplicationContext("beans.xml"),false) ;
			
			context.start() ;
			
			ProducerTemplate template = context.createProducerTemplate() ;
			template.start(); 
			
			CamelRequest request = new CamelRequest() ;
			request.setName(username);
			CamelResponse response = template.requestBody("direct:start",request,CamelResponse.class) ;
			System.out.println(response.getName());
			
			
			
			
			
			
			//template.sendBody("direct:start",null) ;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return message;
	}

}
 