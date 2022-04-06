package com.cosme.py;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
	
		/*Empleados empleados=new DirectorEmpleado();
		
		System.out.println(empleados.getTareas());*/
		
	ClassPathXmlApplicationContext contexto=new	ClassPathXmlApplicationContext("applicationContex.xml");
	
	Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
	System.out.println(Juan.getTareas());
	System.out.println(Juan.getInforme());
	contexto.close();
	
}
}
