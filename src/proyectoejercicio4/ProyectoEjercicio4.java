/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.io.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Yasin
 */
public class ProyectoEjercicio4 implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        Scanner Teclado2 = new Scanner(System.in).useDelimiter("/n");
        int op1 = 0, op2 = 0, cantidad;
        String usuario, pass, nombre, nombreProduccion;
        //precarga de algunas instancias con constructores que reciben todos los atributos como parametros
        System.out.println("Usuario administrador default contraseña:1234");
        Administrador administrador = new Administrador("Usuario", "Admin", "1234");
        System.out.println("Usuario Agente de Ventas default contraseña: 1234");
        Empleado agenteVentas = new Empleado("Juan", "Lopez", "1234");
        Capitulo capitulo = new Capitulo("Despertar_Sith", "1 h 10 m", "Los_Siths vuelven_al_ataque");
        Produccion pelicula = new Pelicula("Accion", "Stallone", "Jar_Jar_Abrams", "Nose3", 1000, "Disney", "Stallone", "2h_30m");
        Produccion serie = new Serie("Ciencia_Ficcion", "Favreau", "Favreau", "Star_Wars_Chronicles", 500, 1);//revisar la duracion
        Produccion documental = new Documental("Informativo", "George_Paranoic", "Jose_Peña", "Nos_mienten", 4500, "USA", "4h_45m");
        ColeccionAlquiler inventarioProducciones = new ColeccionAlquiler();
        ((Serie) serie).setCapitulo(capitulo);
        //precarga en la coleccion con 3 producciones de diferente tipo
        inventarioProducciones.setProduccion(pelicula);
        inventarioProducciones.setProduccion(serie);
        inventarioProducciones.setProduccion(documental);
        administrador.setEmpleado(agenteVentas);
        System.out.println("Bienvenido al Sistema de Alquiler de peliculas");
        do {
            inventarioProducciones = leerColeccion();
            administrador = leerAdministrador();
            agenteVentas = leerEmpleado();
            System.out.println("1) Opciones del Administrador");
            System.out.println("2) Opciones del Agente de Ventas");
            System.out.println("3) Salir");
            if (op1 > 3) {
                System.out.println("Digite una opción valida");
            }
            op1 = Validar();
            switch (op1) {

                case 1:
                    System.out.println("Digite su usuario: ");
                    usuario = Teclado.next();
                    System.out.println("Digite su contraseña: ");
                    pass = Teclado.next();
                    if ((administrador.getUsuario().equals(usuario)) && (administrador.getPass().equals(pass))) {
                        do {
                            System.out.println("1) Ver Catalogo de Producciones");
                            System.out.println("2) Consultar por nombre");
                            System.out.println("3) Ingresar una nueva produccion");
                            System.out.println("4) Actualizar catalogo");
                            System.out.println("5) Eliminar una producción");
                            System.out.println("6) Cambiar credenciales Administrador");
                            System.out.println("7) Registrar un nuevo usuario");
                            System.out.println("8) Consultar los usuarios inscritos");
                            System.out.println("9) Modificar un usuario");
                            System.out.println("10) Eliminar un usuario");
                            System.out.println("11) Salir");
                            if (op2 > 11) {
                                System.out.println("Digite una opción valida");
                            }
                            op2 = Validar();

                            switch (op2) {
                                case 1:
                                    inventarioProducciones.mostrar();
                                    break;
                                case 2:
                                    System.out.println("Digite el nombre de la producción a buscar: ");
                                    nombre = Teclado.next();
                                    inventarioProducciones.buscar(nombre);
                                    break;
                                case 3:
                                    System.out.println("Digite la categoria de la producción: (Pelicula - Serie - Documental)");
                                    nombre = Teclado.next();
                                    inventarioProducciones.insertar(nombre);
                                    break;
                                case 4:
                                    System.out.println("Digite el nombre de la producción que desea actualizar: ");
                                    nombre = Teclado.next();
                                    inventarioProducciones.actualizar(nombre);
                                    break;
                                case 5:
                                    System.out.println("Digite el nombre de la producción que desea eliminar: ");
                                    nombre = Teclado.next();
                                    inventarioProducciones.Eliminar(nombre);
                                    break;
                                case 6:
                                    System.out.println("Digite su nombre: ");
                                    nombre = Teclado.next();
                                    System.out.println("Digite su nueva contraseña: ");
                                    pass = Teclado.next();
                                    administrador.setNombre(nombre);
                                    administrador.setPass(pass);
                                    administrador.setUsuario();
                                    break;
                                case 7:
                                    System.out.println("Digite el nombre del nuevo empleado a registrar: ");
                                    nombre = Teclado.next();
                                    administrador.insertar(nombre);
                                    break;
                                case 8:
                                    administrador.mostrar();
                                    break;
                                case 9:
                                    System.out.println("Digite el nombre del empleado a modificar: ");
                                    nombre = Teclado.next();
                                    administrador.actualizar(nombre);
                                case 10:
                                    System.out.println("Digite el nombre del empleado a eliminar: ");
                                    nombre = Teclado.next();
                                    administrador.Eliminar(nombre);
                            }
                        } while (op2 != 11);
                    } else {
                        System.out.println("Credenciales incorrectas (verifique su usuario y contraseña, recuerde que solo Administradores pueden acceder a este menu");
                    }
                    break;
                case 2:
                    System.out.println("Digite su usuario: ");
                    usuario = Teclado.next();
                    System.out.println("Digite su contraseña: ");
                    pass = Teclado.next();
                    if (((agenteVentas.getUsuario().equals(usuario)) && (agenteVentas.getPass().equals(pass)))) {
                        do {
                            System.out.println("1) Ver Catalogo de Producciones");
                            System.out.println("2) Consultar produccion por nombre");
                            System.out.println("3) Registrar un nuevo cliente");
                            System.out.println("4) Consultar cliente por nombre");
                            System.out.println("5) Realizar Alquiler a Cliente");
                            System.out.println("6) Ver historial de ventas");
                            System.out.println("7) Salir");
                            if (op2 > 7) {
                                System.out.println("Digite una opción valida");
                            }
                            op2 = Validar();

                            switch (op2) {
                                case 1:
                                    inventarioProducciones.mostrar();
                                    break;
                                case 2:
                                    System.out.println("Digite el nombre de la producción a buscar: ");
                                    nombre = Teclado.next();
                                    inventarioProducciones.buscar(nombre);
                                    break;
                                case 3:
                                    System.out.println("Digite el nombre del nuevo cliente a registrar: ");
                                    nombre = Teclado.next();
                                    agenteVentas.insertar(nombre);
                                    break;
                                case 4:
                                    System.out.println("Digite el nombre cliente a consultar: ");
                                    nombre = Teclado.next();
                                    agenteVentas.buscar(nombre);
                                    break;
                                case 5:
                                    System.out.println("Digite el nombre del cliente que va a realizar el alquiler: ");
                                    nombre = Teclado.next();
                                    boolean bandera = agenteVentas.validacionCliente(nombre);
                                    boolean busqueda;
                                    double sumatoria = 0.0;
                                    if (bandera == true) {
                                        System.out.println("Introduzca la cantidad de producciones a alquilar");
                                        cantidad = Validar();
                                        for (int i = 0; i < cantidad; i++) {
                                            do {

                                                System.out.println("Digite el nombre de la produccion: ");
                                                nombreProduccion = Teclado.next();
                                                busqueda = inventarioProducciones.validarProduccion(nombreProduccion);
                                                if (busqueda == true) {
                                                    agenteVentas.asignarProduccion(nombre, inventarioProducciones.getProduccion(nombreProduccion));
                                                    sumatoria = sumatoria + inventarioProducciones.consultarPrecio(nombreProduccion);
                                                    System.out.println("Produccion ingresada.");
                                                } else {
                                                    System.out.println("Nombre de produccion no registrada en la base de datos");
                                                }
                                            } while (busqueda == false);
                                        }
                                        agenteVentas.asignarTotal(nombre, sumatoria, cantidad);
                                        System.out.println("Transacción exitosa!!!");
                                    } else {
                                        System.out.println("Cliente no registrado");
                                    }
                                    break;
                                case 6:
                                    agenteVentas.mostrar();
                                    break;
                            }
                        } while (op2 != 7);
                    }
                    break;
            }
        } while (op1 != 3);
        escribirColeccion(inventarioProducciones);
        escribirAdministrador(administrador);
        escribirEmpleado(agenteVentas);
    }

    //************************************************************************
    public static int Validar() {
        Scanner Teclado = new Scanner(System.in);
        boolean validacion;
        int numA = 0;
        do {
            System.out.println("Digite un numero: ");
            String A = Teclado.next();
            try {
                numA = Integer.parseInt(A);
                validacion = true;
            } catch (NumberFormatException ex) {
                System.out.println("Favor digite un número entero");
                validacion = false;
            }
        } while (validacion == false);
        return numA;
    }

    //************************************************************************
    private static void escribirColeccion(ColeccionAlquiler inventarioProducciones) {

        try {
            FileOutputStream fos = new FileOutputStream("coleccion.txt");
            try (ObjectOutputStream os = new ObjectOutputStream(fos)) {
                os.writeObject(inventarioProducciones);
                //Hay que cerrar siempre el archivo
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        System.out.println("Coleccion actualizada y escrita con exito!!");
    }

    //************************************************************************
    private static void escribirAdministrador(Administrador administrador) {

        try {
            FileOutputStream fos = new FileOutputStream("administrador.txt");
            try (ObjectOutputStream os = new ObjectOutputStream(fos)) {
                os.writeObject(administrador);
                //Hay que cerrar siempre el archivo
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Coleccion de Usuarios actualizada y escrita con exito!!");
    }
//************************************************************************

    private static void escribirEmpleado(Empleado agenteVentas) {

        try {
            FileOutputStream fos = new FileOutputStream("clientes.txt");
            try (ObjectOutputStream os = new ObjectOutputStream(fos)) {
                os.writeObject(agenteVentas);
                //Hay que cerrar siempre el archivo
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Coleccion de Clientes actualizada y escrita con exito!!");
    }

    //************************************************************************
    private static ColeccionAlquiler leerColeccion() {
        ColeccionAlquiler inventarioProducciones = null;
        try {
            FileInputStream fis = new FileInputStream("coleccion.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            inventarioProducciones = (ColeccionAlquiler) ois.readObject();//El método readObject() recupera el objeto
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return inventarioProducciones;
    }

    //************************************************************************
    private static Administrador leerAdministrador() {
        Administrador administrador = null;
        try {
            FileInputStream fis = new FileInputStream("administrador.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            administrador = (Administrador) ois.readObject();//El método readObject() recupera el objeto
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return administrador;
    }

    //************************************************************************
    private static Empleado leerEmpleado() {

        Empleado empleado = null;
        try {
            FileInputStream fis = new FileInputStream("clientes.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            empleado = (Empleado) ois.readObject();//El método readObject() recupera el objeto
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return empleado;
    }
    ///////////////////
}
