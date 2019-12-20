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
public class ColeccionAlquiler implements Serializable, CRUD {

    protected List<Produccion> coleccion = new ArrayList<>();
    static private Scanner Teclado = new Scanner(System.in);

    public ColeccionAlquiler() {
    }

    public List<Produccion> getColeccion() {
        return this.coleccion;
    }

    public void setProduccion(Produccion produccion) {
        if (null == produccion.getTipo()) {
            this.coleccion.add((Documental) produccion);
        } else {
            switch (produccion.getTipo()) {
                case "Pelicula":
                    this.coleccion.add((Pelicula) produccion);
                    break;
                case "Serie":
                    this.coleccion.add((Serie) produccion);
                    break;
                default:
                    this.coleccion.add((Documental) produccion);
                    break;
            }
        }
    }
    //**************************************************************************

    @Override
    public void insertar(String nombre) {
        Produccion pelicula = new Pelicula();
        Produccion documental = new Documental();
        Produccion serie = new Serie();
        String genero, productor, director, name, casa, protag, durac, descripcion;
        double precio;
        int cantidad;

        if (null == nombre) {
            System.out.println("Categoria digitada no corresponde a ninguna registrada");
        } else {
            switch (nombre) {
                case "Pelicula":
                    //String genero, String productor, String director, String nombre, double precio, String casa, String protagonista, String duracion
                    System.out.println("Use el guion bajo para separar palabras");
                    System.out.println("Digite el nombre de la pelicula: ");
                    name = Teclado.next();
                    pelicula.SetNombre(name);
                    System.out.println("Digite el Genero de la pelicula: ");
                    genero = Teclado.next();
                    pelicula.setGenero(genero);
                    System.out.println("Digite el Director de la pelicula: ");
                    director = Teclado.next();
                    pelicula.setDirector(director);
                    System.out.println("Digite el Productor de la pelicula: ");
                    productor = Teclado.next();
                    pelicula.SetProductor(productor);
                    System.out.println("Digite la casa productora de la pelicula: ");
                    casa = Teclado.next();
                    ((Pelicula) pelicula).Setcasa(casa);
                    System.out.println("Digite el protagonista de la pelicula: ");
                    protag = Teclado.next();
                    ((Pelicula) pelicula).SetProtagonista(protag);
                    System.out.println("Digite la duración de la pelicula: ");
                    durac = Teclado.next();
                    ((Pelicula) pelicula).SetDuracion(durac);
                    System.out.println("Digite el precio del alquiler de la pelicula: ");
                    precio = Teclado.nextDouble();
                    pelicula.setPrecio(precio);
                    this.coleccion.add((Pelicula) pelicula);
                    System.out.println("Pelicula ingresada al sistema de forma exitosa");
                    break;
                case "Documental":
                    System.out.println("Use el guion bajo para separar palabras");
                    System.out.println("Digite el nombre del Documental: ");
                    name = Teclado.next();
                    documental.SetNombre(name);
                    System.out.println("Digite el Genero del Documental: ");
                    genero = Teclado.next();
                    documental.setGenero(genero);
                    System.out.println("Digite el Director del Documental: ");
                    director = Teclado.next();
                    documental.setDirector(director);
                    System.out.println("Digite el Productor del Documental: ");
                    productor = Teclado.next();
                    documental.SetProductor(productor);
                    System.out.println("Digite el pais de origen del Documental: ");
                    casa = Teclado.next();
                    ((Documental) documental).SetPais(casa);
                    System.out.println("Digite la duración del Documental: ");
                    durac = Teclado.next();
                    ((Documental) documental).SetDuracion(durac);
                    System.out.println("Digite el precio del alquiler del Documental: ");
                    precio = Teclado.nextDouble();
                    documental.setPrecio(precio);
                    this.coleccion.add((Documental) documental);
                    System.out.println("Documental ingresado al sistema de forma exitosa");
                    break;
                case "Serie":
                    System.out.println("Use el guion bajo para separar palabras");
                    System.out.println("Digite el nombre de la serie: ");
                    name = Teclado.next();
                    serie.SetNombre(name);
                    System.out.println("Digite el Genero de la serie: ");
                    genero = Teclado.next();
                    serie.setGenero(genero);
                    System.out.println("Digite el Director de la serie: ");
                    director = Teclado.next();
                    serie.setDirector(director);
                    System.out.println("Digite el Productor de la serie: ");
                    productor = Teclado.next();
                    serie.SetProductor(productor);
                    System.out.println("Digite el precio del alquiler de la serie: ");
                    precio = Teclado.nextDouble();
                    serie.setPrecio(precio);
                    System.out.println("Digite la cantidad de episodios que posee la serie");
                    cantidad = Teclado.nextInt();
                    ((Serie) serie).setCantidad(cantidad);
                    for (int i = 0; i < cantidad; i++) {
                        Capitulo capitulo = new Capitulo();
                        //String nombreCap, String duraccion, String descripcion
                        System.out.println("Digite el nombre del capitulo: ");
                        name = Teclado.next();
                        capitulo.SetNombre(name);
                        System.out.println("Digite la duración del capitulo: ");
                        durac = Teclado.next();
                        capitulo.SetDuracion(durac);
                        System.out.println("Digite la sipnosis del capitulo: ");
                        descripcion = Teclado.next();
                        capitulo.setDescripcion(descripcion);
                        ((Serie) serie).setCapitulo(capitulo);
                    }
                    this.coleccion.add((Serie) serie);
                    System.out.println("Serie ingresado al sistema de forma exitosa");
                    break;
                default:
                    System.out.println("Categoria digitada no corresponde a ninguna registrada");
                    break;
            }
        }
    }

    //**************************************************************************
    @Override
    public void mostrar() {
        coleccion.forEach((produccion) -> {
            //for each
            mostrarPerfil(produccion);
        });
    }

    //**************************************************************************
    @Override
    public void buscar(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                mostrarPerfil(coleccion.get(i));
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("La producción consultada no existe");
        }
    }

    //**************************************************************************
    @Override
    public void actualizar(String nombre) {
        int op = 0, cant;
        double price;
        String name, gen, product, direct, protag, durac, casa, pais, respuesta;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                do {
                    System.out.println("1) Cambiar Nombre");
                    System.out.println("2) Cambiar Genero");
                    System.out.println("3) Cambiar Productor");
                    System.out.println("4) Cambiar Director");
                    System.out.println("5) Cambiar Precio");
                    if (null == coleccion.get(i).getTipo()) {
                        System.out.println("6) Cambiar la cantidad de capitulos");
                        System.out.println("7) Cambiar Duración");
                    } else {
                        switch (coleccion.get(i).getTipo()) {
                            case "Pelicula":
                                System.out.println("6) Cambiar Protagonista");
                                System.out.println("7) Cambiar Duración");
                                System.out.println("8) Cambiar Casa");
                                break;
                            case "Documental":
                                System.out.println("6) Cambiar Pais de Origen");
                                System.out.println("7) Cambiar Duración");
                                break;
                            default:
                                System.out.println("6) Cambiar la cantidad de capitulos");
                                System.out.println("7) Cambiar Duración");
                                break;
                        }
                    }
                    if (op > 8) {
                        System.out.println("Digite una opción valida");
                    }
                    op = Validar();
                    switch (op) {

                        case 1:
                            System.out.println("Digite el nuevo nombre de la produccion: ");
                            name = Teclado.next();
                            coleccion.get(i).SetNombre(name);
                            break;
                        case 2:
                            System.out.println("Digite el nuevo Genero de la produccion: ");
                            gen = Teclado.next();
                            coleccion.get(i).setGenero(gen);
                            break;
                        case 3:
                            System.out.println("Digite el nuevo productor: ");
                            product = Teclado.next();
                            coleccion.get(i).SetProductor(product);
                            break;
                        case 4:
                            System.out.println("Digite el nuevo director: ");
                            direct = Teclado.next();
                            coleccion.get(i).setDirector(direct);
                            break;
                        case 5:
                            System.out.println("Digite el nuevo precio: ");
                            price = Teclado.nextDouble();
                            coleccion.get(i).setPrecio(price);
                            break;
                        case 6:
                            if (null == coleccion.get(i).getTipo()) {
                                System.out.println("Digite la cantidad de episodios nueva: ");
                                cant = Teclado.nextInt();
                                ((Serie) coleccion.get(i)).setCantidad(cant);
                            } else {
                                switch (coleccion.get(i).getTipo()) {
                                    case "Pelicula":
                                        System.out.println("Digite el nuevo protagonista: ");
                                        protag = Teclado.next();
                                        ((Pelicula) coleccion.get(i)).SetProtagonista(protag);
                                        break;
                                    case "Documental":
                                        System.out.println("Digite el nuevo pais de origen: ");
                                        pais = Teclado.next();
                                        ((Documental) coleccion.get(i)).SetPais(pais);
                                        break;
                                    default:
                                        System.out.println("Digite la cantidad de episodios nueva: ");
                                        cant = Teclado.nextInt();
                                        ((Serie) coleccion.get(i)).setCantidad(cant);
                                        break;
                                }
                            }
                            break;
                        case 7:
                            if (null == coleccion.get(i).getTipo()) {

                            } else {
                                switch (coleccion.get(i).getTipo()) {
                                    case "Pelicula":
                                        System.out.println("Digite la nueva duracion: ");
                                        durac = Teclado.next();
                                        ((Pelicula) coleccion.get(i)).SetDuracion(durac);
                                        break;
                                    case "Documental":
                                        System.out.println("Digite la nueva duracion: ");
                                        durac = Teclado.next();
                                        ((Documental) coleccion.get(i)).SetDuracion(durac);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 8:
                            if ("Pelicula".equals(coleccion.get(i).getTipo())) {
                                System.out.println("Digite la nueva casa: ");
                                casa = Teclado.next();
                                ((Pelicula) coleccion.get(i)).Setcasa(casa);
                            } else {
                                System.out.println("Series y documental no poseen casa");
                            }
                            break;
                    }
                    System.out.println("Desea tramitar otro cambio? (S/N)");
                    respuesta = Teclado.next();
                } while (("S".equals(respuesta)) || ("s".equals(respuesta)) || ("Si".equals(respuesta)) || ("Sí".equals(respuesta)));

            } else {
                System.out.println("La producción consultada no existe");
            }
        }
    }

    //**************************************************************************
    private void mostrarPerfil(Produccion produccion) {
        if (null == produccion.getTipo()) {
            System.out.println("Categoría: SERIE");
            System.out.println("Nombre: " + produccion.getNombre() + "\n"
                    + "Genero: " + produccion.getGenero() + " \n"
                    + "Director: " + produccion.getDirector() + " \n"
                    + "Productor: " + produccion.getProductor() + " \n"
                    + "Precio Alquiler: " + produccion.getPrecio() + " \n"
                    + "Cantidad de Capitulos: " + ((Serie) produccion).getCantidadcap());
            System.out.println("*******************************************************");
        } else {
            switch (produccion.getTipo()) {
                case "Pelicula":
                    System.out.println("Categoría: PELICULA");
                    System.out.println("Nombre: " + produccion.getNombre() + "\n"
                            + "Genero: " + produccion.getGenero() + " \n"
                            + "Director: " + produccion.getDirector() + " \n"
                            + "Productor: " + produccion.getProductor() + " \n"
                            + "Precio Alquiler: " + produccion.getPrecio() + " \n"
                            + "Duracion de la pelicula: " + ((Pelicula) produccion).getDuracion() + " \n"
                            + "Protagonista: " + ((Pelicula) produccion).getProtagonista() + " \n"
                            + "Casa cinematografiaca: " + ((Pelicula) produccion).getcasa());
                    System.out.println("*******************************************************");
                    break;
                case "Documental":
                    System.out.println("Categoría: DOCUMENTAL");
                    System.out.println("Nombre: " + produccion.getNombre() + "\n"
                            + "Genero: " + produccion.getGenero() + " \n"
                            + "Director: " + produccion.getDirector() + " \n"
                            + "Productor: " + produccion.getProductor() + " \n"
                            + "Precio Alquiler: " + produccion.getPrecio() + " \n"
                            + "Duracion del documental: " + ((Documental) produccion).getDuracion() + "\n"
                            + "Pais de Origen: " + ((Documental) produccion).getPais());
                    System.out.println("*******************************************************");
                    break;
                default:
                    System.out.println("Categoría: SERIE");
                    System.out.println("Nombre: " + produccion.getNombre() + "\n"
                            + "Genero: " + produccion.getGenero() + " \n"
                            + "Director: " + produccion.getDirector() + " \n"
                            + "Productor: " + produccion.getProductor() + " \n"
                            + "Precio Alquiler: " + produccion.getPrecio() + " \n"
                            + "Cantidad de Capitulos: " + ((Serie) produccion).getCantidadcap());
                    System.out.println("*******************************************************");
                    break;
            }
        }
    }

    //**************************************************************************
    @Override
    public void Eliminar(String nombre) {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                coleccion.remove(i);
            } else {
                System.out.println("La producción consultada no existe");
            }
        }
    }
    //**************************************************************************

    public boolean validarProduccion(String nombre) {
        boolean bandera = false;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                bandera = true;
            }
        }
        return bandera;
    }

    //**************************************************************************
    public String getProduccion(String nombre) {
        String produccion = "";
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                produccion = coleccion.get(i).getNombre();
            }
        }
        return produccion;
    }

    //**************************************************************************
    public double consultarPrecio(String nombre) {
        double precio = 0;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getNombre().equals(nombre)) {
                precio = coleccion.get(i).getPrecio();
            }
        }
        return precio;
    }

    //**************************************************************************
    private int Validar() {
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
}
