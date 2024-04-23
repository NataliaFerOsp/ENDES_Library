package com.endes.biblioteca;

public interface Search {
	BookItem searchByTitle(String titulo);
	   BookItem searchByAuthor(String autor);
}
