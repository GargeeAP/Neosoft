package com.example.demo.polymorphism;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle extends Shape{

	@Override
	public void draw(){
		log.info("Drawing circle with default color Black and diameter 1 cm.");
	}
	
	
	public void draw(int diameter){
		log.info("Drawing circle with default color Black and diameter "+diameter+" cm.");
	}
	
	public void draw(int diameter, String color){
		log.info("Drawing circle with color "+color+" and diameter "+diameter+" cm.");
	}
}