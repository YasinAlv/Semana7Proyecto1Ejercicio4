/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yashin
 */
public class PeliculaTest {
    
    public PeliculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Setcasa method, of class Pelicula.
     */
    @Test
    public void testSetcasa() {
        System.out.println("Setcasa");
        String casa = "";
        Pelicula instance = new Pelicula();
        instance.Setcasa(casa);
        
    }

    /**
     * Test of getcasa method, of class Pelicula.
     */
    @Test
    public void testGetcasa() {
        System.out.println("getcasa");
        Pelicula instance = new Pelicula();
        instance.Setcasa("");
        String expResult = "";
        String result = instance.getcasa();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetProtagonista method, of class Pelicula.
     */
    @Test
    public void testSetProtagonista() {
        System.out.println("SetProtagonista");
        String protagonista = "";
        Pelicula instance = new Pelicula();
        instance.SetProtagonista(protagonista);
        
    }

    /**
     * Test of getProtagonista method, of class Pelicula.
     */
    @Test
    public void testGetProtagonista() {
        System.out.println("getProtagonista");
        Pelicula instance = new Pelicula();
        instance.SetProtagonista("");
        String expResult = "";
        String result = instance.getProtagonista();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetDuracion method, of class Pelicula.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("SetDuracion");
        String duracion = "";
        Pelicula instance = new Pelicula();
        instance.SetDuracion(duracion);
        
    }

    /**
     * Test of getDuracion method, of class Pelicula.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Pelicula instance = new Pelicula();
        instance.SetDuracion("");
        String expResult = "";
        String result = instance.getDuracion();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetProductor method, of class Pelicula.
     */
    @Test
    public void testSetProductor() {
        System.out.println("SetProductor");
        String productor = "";
        Pelicula instance = new Pelicula();
        instance.SetProductor(productor);
    }

    /**
     * Test of getProductor method, of class Pelicula.
     */
    @Test
    public void testGetProductor() {
        System.out.println("getProductor");
        Pelicula instance = new Pelicula();
        instance.SetProductor("");
        String expResult = "";
        String result = instance.getProductor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenero method, of class Pelicula.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Pelicula instance = new Pelicula();
        instance.setGenero(genero);
    }

    /**
     * Test of getGenero method, of class Pelicula.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Pelicula instance = new Pelicula();
        instance.setGenero("");
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDirector method, of class Pelicula.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Pelicula instance = new Pelicula();
        instance.setDirector(director);
    }

    /**
     * Test of getDirector method, of class Pelicula.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Pelicula instance = new Pelicula();
        instance.setDirector("");
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class Pelicula.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Pelicula instance = new Pelicula();
        instance.setPrecio(precio);
    }

    /**
     * Test of getPrecio method, of class Pelicula.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Pelicula instance = new Pelicula();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of SetNombre method, of class Pelicula.
     */
    @Test
    public void testSetNombre() {
        System.out.println("SetNombre");
        String nombre = "";
        Pelicula instance = new Pelicula();
        instance.SetNombre(nombre);
    }

    /**
     * Test of getNombre method, of class Pelicula.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pelicula instance = new Pelicula();
        instance.SetNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetTipo method, of class Pelicula.
     */
    @Test
    public void testSetTipo() {
        System.out.println("SetTipo");
        Pelicula instance = new Pelicula();
        instance.SetTipo();
    }

    /**
     * Test of getTipo method, of class Pelicula.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Pelicula instance = new Pelicula();
        String expResult = "Pelicula";
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
}
