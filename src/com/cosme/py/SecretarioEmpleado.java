package com.cosme.py;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInforme informeNuevo;
	
	

	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es un informe del secretatio: "+informeNuevo.getInforme();
	}

}
