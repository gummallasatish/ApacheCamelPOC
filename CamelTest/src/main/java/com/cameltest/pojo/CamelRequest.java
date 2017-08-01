package com.cameltest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CamelRequest")
public class CamelRequest {
	
	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
