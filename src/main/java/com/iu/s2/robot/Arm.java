package com.iu.s2.robot;

import org.springframework.stereotype.Component;

@Component
public abstract class Arm {


	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
