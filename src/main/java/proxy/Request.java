package proxy;

import proxy.Client.Peticion;

public class Request {
	private String nombre;
	private String extension;
	private Peticion peticion;
	
	public Request(String nombre, String extension, Peticion peticion) {
		this.nombre = nombre;
		this.extension = extension;
		this.peticion = peticion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Peticion getPeticion() {
		return peticion;
	}

	public void setPeticion(Peticion peticion) {
		this.peticion = peticion;
	}
	
}
