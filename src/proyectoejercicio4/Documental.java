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
public class Documental extends Produccion implements Serializable {

    protected String paisOrigen;
    protected String duracion;

    public Documental() {
        this.tipo = "Documental";
    }

    public Documental(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Documental(String paisOrigen, String duracion) {
        this.paisOrigen = paisOrigen;
        this.duracion = duracion;
    }

    public Documental(String genero, String productor, String director, String nombre, double precio, String paisOrigen, String duracion) {
        this.genero = genero;
        this.productor = productor;
        this.director = director;
        this.nombre = nombre;
        this.precio = precio;
        this.paisOrigen = paisOrigen;
        this.duracion = duracion;
        this.tipo = "Documental";
    }

    //*********************************************************
    //SETTERS Y GETTERS
    public void SetDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void SetPais(String pais) {
        this.paisOrigen = pais;
    }

    public String getPais() {
        return this.paisOrigen;
    }

    //**********************************************
    //override
    @Override
    public void SetProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String getProductor() {
        return this.productor;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getDirector() {
        return this.director;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void Settipo() {
        this.tipo = "Documental";
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
}
