/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yasin
 */
public class Administrador extends Empleado implements CRUD, Serializable {

    protected List<Empleado> empleados;
    static private Scanner Teclado = new Scanner(System.in);

    public Administrador() {
        this.empleados = new ArrayList<>();
        this.roll = "Admin";
    }

    public Administrador(String nombre, String apellido, String password) {
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.roll = "Admin";
        char letra = this.nombre.charAt(0);
        String s = String.valueOf(letra);
        this.usuario = s + apellido;
        System.out.println("Su usuario es: " + this.usuario);
        this.password = password;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setUsuario() {
        char letra = this.nombre.charAt(0);
        String s = String.valueOf(letra);
        this.usuario = s + apellido;
        System.out.println("Su usuario es: " + this.usuario);
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public void setPass(String pass) {
        this.password = pass;
    }

    @Override
    public String getPass() {
        return this.password;
    }

    //**************************************************************************
    //**************************************************************************
    @Override
    public void insertar(String nombre) {
        Empleado empleado = new Empleado(nombre);
        String apellido;
        System.out.println("Digite el apellido del nuevo usuario: ");
        apellido = Teclado.next();
        empleado.setApellido(apellido);
        empleado.setUsuario();
    }

    public void setEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    //**************************************************************************
    @Override
    public void mostrar() {
        empleados.forEach((empleado) -> {
            //for each
            mostrarPerfil(empleado);
        });
    }

    //**************************************************************************
    @Override
    public void buscar(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                mostrarPerfil(empleados.get(i));
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("El Empleado consultado no existe");
        }
    }

    //**************************************************************************
    private void mostrarPerfil(Empleado empleado) {
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());

    }
//******************************************************************************  

    @Override
    public void Eliminar(String nombre) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                empleados.remove(i);
            } else {
                System.out.println("El empleado consultado no existe");
            }
        }
    }
//******************************************************************************   

    @Override
    public void actualizar(String nombre) {
        boolean bandera = false;
        String name, apell, pass;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                System.out.println("Digite el nuevo nombre: ");
                name = Teclado.next();
                System.out.println("Digite el nuevo apellido: ");
                apell = Teclado.next();
                System.out.println("Digite su nueva contraseña: ");
                pass = Teclado.next();
                empleados.get(i).setNombre(name);
                empleados.get(i).setApellido(apell);
                empleados.get(i).setPass(pass);
                empleados.get(i).setUsuario();
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("El Empleado consultado no existe");
        }
    }

}
