package com.codjust.demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {	
	
	@Autowired
	private Fight fight;
	
	private int Id;
	
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
	public int getId() {
		return Id;
	}
	
	public void say() {
		fight.sayHello();
	}
}
