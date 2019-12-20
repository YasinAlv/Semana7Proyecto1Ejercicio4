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
public class CapituloTest {
    
    public CapituloTest() {
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
     * Test of SetNombre method, of class Capitulo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("SetNombre");
        String nombreCap = "";
        Capitulo instance = new Capitulo();
        instance.SetNombre(nombreCap);
        
    }

    /**
     * Test of getNombre method, of class Capitulo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Capitulo instance = new Capitulo();
        instance.SetNombre("prueba");
        String expResult = "prueba";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SetDuracion method, of class Capitulo.
     */
    @Test
    public void testSetDuracion() {
        System.out.println("SetDuracion");
        String duracionCap = "";
        Capitulo instance = new Capitulo();
        instance.SetDuracion(duracionCap);
        
    }

    /**
     * Test of getDuracion method, of class Capitulo.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Capitulo instance = new Capitulo();
        instance.SetDuracion("prueba");
        String expResult = "prueba";
        String result = instance.getDuracion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescripcion method, of class Capitulo.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Capitulo instance = new Capitulo();
        instance.setDescripcion(descripcion);
        
    }

    /**
     * Test of getDescripcion method, of class Capitulo.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Capitulo instance = new Capitulo();
        instance.setDescripcion("Prueba");
        String expResult = "Prueba";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        
    }
    
}
