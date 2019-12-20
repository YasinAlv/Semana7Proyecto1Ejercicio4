/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.io.Serializable;
import java.io.*;

/**
 *
 * @author Yasin
 */
public class Produccion implements Serializable {

    protected String genero;
    protected String productor;
    protected String director;
    protected String nombre;
    protected double precio;
    protected String tipo;

    public Produccion() {
    }

    public Produccion(String genero) {
        this.genero = genero;
    }

    public Produccion(String genero, String productor) {
        this.genero = genero;
        this.productor = productor;
    }

    public Produccion(String genero, String productor, String director) {
        this.genero = genero;
        this.productor = productor;
        this.director = director;
    }

    public Produccion(String genero, String productor, String director, String nombre, double precio) {
        this.genero = genero;
        this.productor = productor;
        this.director = director;
        this.nombre = nombre;
        this.precio = precio;
    }

    //********************************************************SETTERS Y GETTERS
    public void SetProductor(String productor) {
        this.productor = productor;
    }

    public String getProductor() {
        return this.productor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void SetTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
