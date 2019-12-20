/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio4;

import java.util.List;
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
public class ColeccionAlquilerTest {
    
    public ColeccionAlquilerTest() {
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
     * Test of setProduccion method, of class ColeccionAlquiler.
     */
    @Test
    public void testSetProduccion() {
        System.out.println("setProduccion");
        Produccion produccion = new Pelicula();  
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.setProduccion(produccion);
      
    }

    /**
     * Test of insertar method, of class ColeccionAlquiler.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.insertar(nombre);
      
    }

    /**
     * Test of mostrar method, of class ColeccionAlquiler.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.mostrar();
    
    }

    /**
     * Test of buscar method, of class ColeccionAlquiler.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.buscar(nombre);
  
    }

    /**
     * Test of actualizar method, of class ColeccionAlquiler.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.actualizar(nombre);

    }

    /**
     * Test of Eliminar method, of class ColeccionAlquiler.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        instance.Eliminar(nombre);

    }

    /**
     * Test of validarProduccion method, of class ColeccionAlquiler.
     */
    @Test
    public void testValidarProduccion() {
        System.out.println("validarProduccion");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        boolean expResult = false;
        boolean result = instance.validarProduccion(nombre);
        assertEquals(expResult, result);

    }

    /**
     * Test of getProduccion method, of class ColeccionAlquiler.
     */
    @Test
    public void testGetProduccion() {
        System.out.println("getProduccion");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        String expResult = "";
        String result = instance.getProduccion(nombre);
        assertEquals(expResult, result);

    }

    /**
     * Test of consultarPrecio method, of class ColeccionAlquiler.
     */
    @Test
    public void testConsultarPrecio() {
        System.out.println("consultarPrecio");
        String nombre = "";
        ColeccionAlquiler instance = new ColeccionAlquiler();
        double expResult = 0.0;
        double result = instance.consultarPrecio(nombre);
        assertEquals(expResult, result, 0.0);
 
    }
    
}
