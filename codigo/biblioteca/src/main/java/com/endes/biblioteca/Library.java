package com.endes.biblioteca;

import java.util.Set;

public class Library {

	private String nombre;
	private String direccion;
	 private Catalog catalog;
	
	public Library(String nombre, String direccion,Catalog catalog) {
	
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalog = catalog;
	}
	
	
	//setter y getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	
	
	
	
}
