package com.cameltest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CamelResponse")
public class CamelResponse {

	String name ;
	String value ;
	String id ;
	
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
