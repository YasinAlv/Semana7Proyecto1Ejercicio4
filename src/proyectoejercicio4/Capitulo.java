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
public class Capitulo implements Serializable {

    protected String nombreCap;
    protected String duraccionCap;
    protected String descripcion;

    public Capitulo() {
    }

    public Capitulo(String nombreCap) {
        this.nombreCap = nombreCap;
    }

    public Capitulo(String nombreCap, String duraccion) {
        this.nombreCap = nombreCap;
        this.duraccionCap = duraccion;
    }

    public Capitulo(String nombreCap, String duraccion, String descripcion) {
        this.nombreCap = nombreCap;
        this.duraccionCap = duraccion;
        this.descripcion = descripcion;
    }

    //***************************************************
    //SETTERS Y GETTERS
    public void SetNombre(String nombreCap) {
        this.nombreCap = nombreCap;
    }

    public String getNombre() {
        return this.nombreCap;
    }

    public void SetDuracion(String duracionCap) {
        this.duraccionCap = duracionCap;
    }

    public String getDuracion() {
        return this.duraccionCap;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
