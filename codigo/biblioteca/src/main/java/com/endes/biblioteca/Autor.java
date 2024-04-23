package com.endes.biblioteca;

import java.util.HashSet;

public class Autor {
    private String nombre;
    private String biografia;
    private HashSet<Book> books;
    
    
	public Autor(String nombre, String biografia, Book book) {
		
		this.nombre = nombre;
		this.biografia = biografia;
		books = new HashSet<>();//se inicializa el hashSet
	    books.add(book);

    
    
    
    
    // Constructor, getters y setters aquí
}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	public HashSet<Book> getBooks() {
		return books;
	}


	public void setBooks(HashSet<Book> books) {
		this.books = books;
	}

	
	
	
}