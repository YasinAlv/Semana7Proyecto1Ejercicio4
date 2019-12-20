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
public class ProduccionTest {
    
    public ProduccionTest() {
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
     * Test of SetProductor method, of class Produccion.
     */
    @Test
    public void testSetProductor() {
        System.out.println("SetProductor");
        String productor = "";
        Produccion instance = new Produccion();
        instance.SetProductor(productor);

    }

    /**
     * Test of getProductor method, of class Produccion.
     */
    @Test
    public void testGetProductor() {
        System.out.println("getProductor");
        Produccion instance = new Produccion();
        instance.SetProductor("");
        String expResult = "";
        String result = instance.getProductor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGenero method, of class Produccion.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Produccion instance = new Produccion();
        instance.setGenero(genero);

    }

    /**
     * Test of getGenero method, of class Produccion.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Produccion instance = new Produccion();
        instance.setGenero("");
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDirector method, of class Produccion.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Produccion instance = new Produccion();
        instance.setDirector(director);

    }

    /**
     * Test of getDirector method, of class Produccion.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Produccion instance = new Produccion();
        instance.setDirector("");
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPrecio method, of class Produccion.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Produccion instance = new Produccion();
        instance.setPrecio(precio);

    }

    /**
     * Test of getPrecio method, of class Produccion.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Produccion instance = new Produccion();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of SetNombre method, of class Produccion.
     */
    @Test
    public void testSetNombre() {
        System.out.println("SetNombre");
        String nombre = "";
        Produccion instance = new Produccion();
        instance.SetNombre(nombre);

    }

    /**
     * Test of getNombre method, of class Produccion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Produccion instance = new Produccion();
        instance.SetNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    /**
     * Test of SetTipo method, of class Produccion.
     */
    @Test
    public void testSetTipo() {
        System.out.println("SetTipo");
        String tipo = "";
        Produccion instance = new Produccion();
        instance.SetTipo(tipo);

    }

    /**
     * Test of getTipo method, of class Produccion.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Produccion instance = new Produccion();
        instance.SetTipo("");
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);

    }
    
}
