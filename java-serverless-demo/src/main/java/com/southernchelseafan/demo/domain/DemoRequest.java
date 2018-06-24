package com.southernchelseafan.demo.domain;

public class DemoRequest {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Request [name=" + this.name + "]";
	}
}
