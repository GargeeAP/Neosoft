package com.example.demo;

import com.example.demo.encapsulation.EncapsulationExm;
import com.example.demo.inheritance.ChildClass;
import com.example.demo.polymorphism.Circle;
import com.example.demo.polymorphism.Shape;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OopsConcepts {


	public static void main(String args[])
	{

		//ENCAPSULATION
		EncapsulationExm obj = new EncapsulationExm ();
		obj.setNoOfEmployees(100);
		log.info("No Of Employees: "+(int)obj.getNoOfEmployees());

		//POLYMORPHISM
		Shape sh = new Circle();
		sh.draw();

		Circle cr = new Circle();
		cr.draw(10);
		cr.draw(10,"red");


		//INHERITANCE

		ChildClass a = new ChildClass();

		a.childMethod();
		a.superMethod();
	}

}
