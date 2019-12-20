/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Yasin
 */
public class Empleado extends ColeccionAlquiler implements Serializable, CRUD {

    protected List<Cliente> clientes = new ArrayList<>();
    protected String nombre;
    protected String apellido;
    protected String roll;
    protected String usuario;
    protected String password;
    static private Scanner Teclado = new Scanner(System.in);

    public Empleado() {
        this.roll = "Empleado";
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.roll = "Empleado";
    }

    public Empleado(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.roll = "Empleado";
        char letra = this.nombre.charAt(0);
        String s = String.valueOf(letra);
        this.usuario = s + apellido;
        System.out.println("Su usuario es: " + this.usuario);
        this.password = password;
    }

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

    public void setUsuario() {
        char letra = this.nombre.charAt(0);
        String s = String.valueOf(letra);
        this.usuario = s + apellido;
        System.out.println("Su usuario es: " + this.usuario);
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getPass() {
        return this.password;
    }

    //**************************************************************************
    @Override
    public void insertar(String nombre) {
        Cliente cliente = new Cliente(nombre);
        String apellido, sexo;
        int edad;
        System.out.println("Digite el apellido del nuevo Cliente: ");
        apellido = Teclado.next();
        System.out.println("Digite el sexo (M/F/NA): ");
        sexo = Teclado.next();
        System.out.println("Digite la edad: ");
        edad = Teclado.nextInt();
        cliente.setApellido(apellido);
        cliente.setSexo(sexo);
        cliente.setEdad(edad);
        this.clientes.add(cliente);
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    //**************************************************************************
    @Override
    public void mostrar() {
        clientes.forEach((cliente) -> {
            //for each
            mostrarPerfil(cliente);
        });
    }

    //**************************************************************************
    @Override
    public void buscar(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre)) {
                mostrarPerfil(clientes.get(i));
                bandera = true;
            }
            if (bandera == false) {
                System.out.println("El cliente consultado no existe");
            }
        }
    }

    //**************************************************************************
    private void mostrarPerfil(Cliente cliente) {
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + " Seco: " + cliente.getSexo() + " edad: " + cliente.getEdad());
        System.out.println("Cantidad de producciones alquiladas: " + cliente.getCantidad());
        cliente.mostrarLista();
        System.out.println("Total del alquiler: " + cliente.getTotal());
        System.out.println("****************************************************************************");
    }
//******************************************************************************  

    @Override
    public void Eliminar(String nombre) {
    }
//******************************************************************************   

    @Override
    public void actualizar(String nombre) {
    }

    //******************************************************************************     
    public boolean validacionCliente(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre)) {
                bandera = true;
            }
        }
        return bandera;
    }
    //****************************************************************************** 

    public void asignarProduccion(String nombre, String produccion) {
        String name;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre)) {
                clientes.get(i).setAlquiladas(produccion);
            }
        }
    }

    //****************************************************************************** 
    public void asignarTotal(String nombre, double total, int cantidad) {
        String name;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre)) {
                clientes.get(i).setTotal(total);
                clientes.get(i).setCantidad(cantidad);
            }
        }
    }
//    
}
