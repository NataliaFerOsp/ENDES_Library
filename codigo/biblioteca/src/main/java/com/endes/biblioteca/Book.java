package com.endes.biblioteca;

import java.util.HashSet;
import java.util.Set;

public abstract class Book{
    private String codigo_ISBN;
    private String titulo;
    private String autor;
    private String resumen;
    private int anyoPublicacion;
    private String idioma;
    private int numPag;
    private Set Authors;
    private HashSet<Autor>authors;
    
    
	public Book(String codigo_ISBN, String titulo, String autor, String resumen, int anyoPublicacion, String idioma,
			int numPag, Set authors, Autor author) {
		super();
		this.codigo_ISBN = codigo_ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.resumen = resumen;
		this.anyoPublicacion = anyoPublicacion;
		this.idioma = idioma;
		this.numPag = numPag;
		Authors = authors;
		 authors= new HashSet<>();
		 authors.add(author);
	}
    
    
    


    
}
