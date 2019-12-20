/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 *
 * @author Yasin
 */
public class Serie extends Produccion implements Serializable {

    protected int cantidadCapitulos;
    protected List<Capitulo> capitulos = new ArrayList<>();

    public Serie() {
        this.tipo = "Serie";
    }

    public Serie(int cantidad) {
        this.cantidadCapitulos = cantidad;
    }

    public Serie(String genero, String productor, String director, String nombre, double precio, int cantidad) {
        this.genero = genero;
        this.productor = productor;
        this.director = director;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadCapitulos = cantidad;
        this.tipo = "Serie";

    }

    //********************************************************SETTERS Y GETTERS
    public void setCapitulo(Capitulo capitulo) {
        this.capitulos.add(capitulo);
    }

    public void setCantidad(int cantidad) {
        this.cantidadCapitulos = cantidad;
    }

    public int getCantidadcap() {
        return this.cantidadCapitulos;
    }

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

    /**
     *
     * @param director
     */
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
        this.tipo = "Serie";
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
}
