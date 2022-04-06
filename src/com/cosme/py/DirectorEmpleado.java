package com.cosme.py;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo de tipo CreacionInforme (interfaz)
	private CreacionInforme informeNuevo;
	
	//Creacion del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo=informeNuevo;
		
	}
	
	@Override
	public String getTareas() {
		
		return "Gestionar las plantillas de los empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el direcctor: "+ informeNuevo.getInforme();
	}


	

}
