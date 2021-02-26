/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/** Clase para modelar libros en una librería
 *  @author pcuesta@uvigo.es
 */
 
class Libro {
    private String titulo;
    private String autores;
    private String editorial;
    private int anho;
    private String isbn;
    private double precio;
 
    /** construye un objeto Libro 
     * @param titulo el título del libro
     * @param autores los autores del libro
     * @param editorial la editorial del libro
     * @param anho el año de edición de la edición del libro
     * @param isbn el isbn del libro
     * @param precio el precio del libro
     */
    public Libro(String titulo, String autores, String editorial, int anho, 
            String isbn, double precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anho = anho;
        this.isbn = isbn;
        this.precio = precio;
    }
 
    /** @return el titulo del libro */
    public String getTitulo() {
        return titulo;
    }
 
    /** @return los autores del libro */
    public String getAutores() {
        return autores;
    }
 
    /** @return la editorial del libro */
    public String getEditorial() {
        return editorial;
    }
 
    /** @return el anho del libro */
    public int getAnho() {
        return anho;
    }
 
    /** @return el isbn del libro */
    public String getIsbn() {
        return isbn;
    }
 
    /** @return el precio del libro */
    public double getPrecio() {
        return precio;
    }
 
    /** @return info del objeto libro como una cadena */
    public String toString() {
        return "Libro:" 
            + "\n\tTitulo = " + getTitulo() 
            + "\n\tAutores = " + getAutores()
            + "\n\tEditorial = " + getEditorial() 
            + "\n\tAño = " + getAnho()
            + "\n\tIsbn = " + getIsbn() 
            + "\n\tprecio = " + getPrecio();
    }
}
