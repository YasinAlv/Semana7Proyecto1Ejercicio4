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
public class Cliente implements Serializable {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;
    protected List<String> Alquiladas = new ArrayList<>();
    protected int cantidad;
    protected double total;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String apellido, int edad, String sexo, int cantidad, double total) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.cantidad = cantidad;
        this.total = total;
    }
    //*************************************************  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

    public void setAlquiladas(String alquilada) {
        this.Alquiladas.add(alquilada);
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void mostrarLista() {
        for (int i = 0; i < Alquiladas.size(); i++) {
            System.out.println(Alquiladas.get(i));
        }
    }
}
