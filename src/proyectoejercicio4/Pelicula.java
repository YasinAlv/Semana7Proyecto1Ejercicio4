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
public class Pelicula extends Produccion implements Serializable {

    protected String casa;
    protected String protagonista;
    protected String duracion;

    public Pelicula() {
        this.tipo = "Pelicula";
    }

    public Pelicula(String casa) {
        this.casa = casa;
        this.tipo = "Pelicula";
    }

    public Pelicula(String casa, String protagonista) {
        this.casa = casa;
        this.protagonista = protagonista;
    }

    public Pelicula(String casa, String protagonista, String duracion) {
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
    }

    public Pelicula(String genero, String productor, String director, String nombre, double precio, String casa, String protagonista, String duracion) {
        this.genero = genero;
        this.productor = productor;
        this.director = director;
        this.nombre = nombre;
        this.precio = precio;
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
        this.tipo = "Pelicula";
    }

    //*************************************************
    //SETTERS Y GETTERS
    public void Setcasa(String casa) {
        this.casa = casa;
    }

    public String getcasa() {
        return this.casa;
    }

    public void SetProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getProtagonista() {
        return this.protagonista;
    }

    public void SetDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return this.duracion;
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

    public void SetTipo() {
        this.tipo = "Pelicula";
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
}
