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
public class DocumentalTest {
    
    public DocumentalTest() {
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
     * Test of SetDuracion method, of class Documental.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("SetDuracion");
        String duracion = "";
        Documental instance = new Documental();
        instance.SetDuracion(duracion);
        
    }

    /**
     * Test of getDuracion method, of class Documental.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Documental instance = new Documental();
        instance.SetDuracion("");
        String expResult = "";
        String result = instance.getDuracion();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of SetPais method, of class Documental.
     */
    @Test
    public void testSetPais() {
        System.out.println("SetPais");
        String pais = "";
        Documental instance = new Documental();
        instance.SetPais(pais);
        
    }

    /**
     * Test of getPais method, of class Documental.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Documental instance = new Documental();
        instance.SetPais("");
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of SetProductor method, of class Documental.
     */
    @Test
    public void testSetProductor() {
        System.out.println("SetProductor");
        String productor = "";
        Documental instance = new Documental();
        instance.SetProductor(productor);
      
    }

    /**
     * Test of getProductor method, of class Documental.
     */
    @Test
    public void testGetProductor() {
        System.out.println("getProductor");
        Documental instance = new Documental();
        instance.SetProductor("");
        String expResult = "";
        String result = instance.getProductor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGenero method, of class Documental.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Documental instance = new Documental();
        instance.setGenero(genero);
        
    }

    /**
     * Test of getGenero method, of class Documental.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Documental instance = new Documental();
        instance.setGenero("");
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDirector method, of class Documental.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Documental instance = new Documental();
        instance.setDirector(director);
        
    }

    /**
     * Test of getDirector method, of class Documental.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Documental instance = new Documental();
        instance.setDirector("");
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPrecio method, of class Documental.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Documental instance = new Documental();
        instance.setPrecio(precio);
        
    }

    /**
     * Test of getPrecio method, of class Documental.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Documental instance = new Documental();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of SetNombre method, of class Documental.
     */
    @Test
    public void testSetNombre() {
        System.out.println("SetNombre");
        String nombre = "";
        Documental instance = new Documental();
        instance.SetNombre(nombre);
       
    }

    /**
     * Test of getNombre method, of class Documental.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Documental instance = new Documental();
        instance.SetNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Settipo method, of class Documental.
     */
    @Test
    public void testSettipo() {
        System.out.println("Settipo");
        Documental instance = new Documental();
        instance.Settipo();
        
    }

    /**
     * Test of getTipo method, of class Documental.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Documental instance = new Documental();
        String expResult = "Documental";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        
    }
    
}
