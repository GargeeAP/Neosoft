package com.example.demo.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChildClass extends SuperClass{

	public void childMethod(){
		log.info("SubClassB");
	}
}
