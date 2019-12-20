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
public class SerieTest {
    
    public SerieTest() {
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
     * Test of setCapitulo method, of class Serie.
     */
    @Test
    public void testSetCapitulo() {
        System.out.println("setCapitulo");
        Capitulo capitulo = null;
        Serie instance = new Serie();
        instance.setCapitulo(capitulo);
        
    }

    /**
     * Test of setCantidad method, of class Serie.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Serie instance = new Serie();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getCantidadcap method, of class Serie.
     */
    @Test
    public void testGetCantidadcap() {
        System.out.println("getCantidadcap");
        Serie instance = new Serie();
        int expResult = 0;
        int result = instance.getCantidadcap();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetProductor method, of class Serie.
     */
    @Test
    public void testSetProductor() {
        System.out.println("SetProductor");
        String productor = "";
        Serie instance = new Serie();
        instance.SetProductor(productor);
    }

    /**
     * Test of getProductor method, of class Serie.
     */
    @Test
    public void testGetProductor() {
        System.out.println("getProductor");
        Serie instance = new Serie();
        instance.SetProductor("");
        String expResult = "";
        String result = instance.getProductor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenero method, of class Serie.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Serie instance = new Serie();
        instance.setGenero(genero);
    }

    /**
     * Test of getGenero method, of class Serie.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Serie instance = new Serie();
        instance.setGenero("");
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDirector method, of class Serie.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Serie instance = new Serie();
        instance.setDirector(director);
    }

    /**
     * Test of getDirector method, of class Serie.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Serie instance = new Serie();
        instance.setDirector("");
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class Serie.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Serie instance = new Serie();
        instance.setPrecio(precio);
    }

    /**
     * Test of getPrecio method, of class Serie.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Serie instance = new Serie();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of SetNombre method, of class Serie.
     */
    @Test
    public void testSetNombre() {
        System.out.println("SetNombre");
        String nombre = "";
        Serie instance = new Serie();
        instance.SetNombre(nombre);
    }

    /**
     * Test of getNombre method, of class Serie.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Serie instance = new Serie();
        instance.SetNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetTipo method, of class Serie.
     */
    @Test
    public void testSetTipo() {
        System.out.println("SetTipo");
        Serie instance = new Serie();
        instance.SetTipo();
    }

    /**
     * Test of getTipo method, of class Serie.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Serie instance = new Serie();
        String expResult = "Serie";
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }    
}
