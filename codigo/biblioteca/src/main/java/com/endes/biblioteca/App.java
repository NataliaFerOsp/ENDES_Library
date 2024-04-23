package com.endes.biblioteca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        for(Lenguaje_enumerado lenguaje:Lenguaje_enumerado.values()) {
        	System.out.println(lenguaje + " ");
        }
        
        Lenguaje_enumerado lenguaprincipal = Lenguaje_enumerado.EN;
        
    }
}
