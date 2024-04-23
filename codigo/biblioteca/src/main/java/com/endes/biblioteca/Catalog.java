package com.endes.biblioteca;

import java.util.Set;

public class Catalog implements Search , Manage{
 private Set records;

 
 
 
 
 // consstructor
 
public Catalog(Set records) {
	
	this.records = records;
}

//metodo de las interfaces


@Override
public void createBookItem(BookItem bookItem) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateBookItem(BookItem bookItem) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteBookItem(String ISBN) {
	// TODO Auto-generated method stub
	
}

@Override
public BookItem getBookItem(String ISBN) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public BookItem searchByTitle(String titulo) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public BookItem searchByAuthor(String autor) {
	// TODO Auto-generated method stub
	return null;
}
 
 
 
 
 
 


 
 
 
}
