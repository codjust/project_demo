package com.codjust.demo.common;

import org.springframework.stereotype.Component;

@Component
public class Fight {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void sayHello() {
		System.out.println("Hello Figghting!");
	}
}
