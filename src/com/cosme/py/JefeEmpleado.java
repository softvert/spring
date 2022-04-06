package com.cosme.py;

public class JefeEmpleado implements Empleados {
	
	private CreacionInforme informeNuevo;
	
	public JefeEmpleado(CreacionInforme informeNuevo) {
	
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las secciones relativas a mis empleados de seccion";
		
		
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el jefe con arreglos: " +informeNuevo.getInforme();
	}
	
	

}
