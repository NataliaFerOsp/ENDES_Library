package com.endes.biblioteca;

import java.util.Set;

public class BookItem extends Book{
	private String CodigoBarra;
	private int id;
	
	public BookItem(String codigo_ISBN, String titulo, String autor, String resumen, int anyoPublicacion, String idioma,
			int numPag, Set authors, Autor author, String codigoBarra, int id) {
		super(codigo_ISBN, titulo, autor, resumen, anyoPublicacion, idioma, numPag, authors, author);
		CodigoBarra = codigoBarra;
		this.id = id;
	}
	
	
	
	
	

}
