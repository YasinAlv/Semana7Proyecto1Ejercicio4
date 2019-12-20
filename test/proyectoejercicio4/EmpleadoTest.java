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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido method, of class Empleado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Empleado instance = new Empleado();
        instance.setApellido(apellido);
        
    }

    /**
     * Test of getApellido method, of class Empleado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Empleado instance = new Empleado();
        instance.setApellido("");
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuario method, of class Empleado.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Empleado instance = new Empleado();
        instance.setNombre("nombre");
        instance.setApellido("apellido");
        instance.setUsuario();
        
    }

    /**
     * Test of getUsuario method, of class Empleado.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Empleado instance = new Empleado();
        instance.setNombre("prueba");
        instance.setApellido("apellido");
        instance.setUsuario();
        String expResult = "papellido";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPass method, of class Empleado.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Empleado instance = new Empleado();
        instance.setPass(pass);
        
    }

    /**
     * Test of getPass method, of class Empleado.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Empleado instance = new Empleado();
        instance.setPass("");
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
       
    }
    /**
     * Test of setCliente method, of class Empleado.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Empleado instance = new Empleado();
        instance.setCliente(cliente);
        
    }

    /**
     * Test of mostrar method, of class Empleado.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Empleado instance = new Empleado();
        instance.mostrar();
       
    }

    /**
     * Test of buscar method, of class Empleado.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.buscar(nombre);
        
    }

    /**
     * Test of Eliminar method, of class Empleado.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.Eliminar(nombre);
        
    }

    /**
     * Test of actualizar method, of class Empleado.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.actualizar(nombre);
        
    }

    /**
     * Test of validacionCliente method, of class Empleado.
     */
    @Test
    public void testValidacionCliente() {
        System.out.println("validacionCliente");
        String nombre = "";
        Empleado instance = new Empleado();
        boolean expResult = false;
        boolean result = instance.validacionCliente(nombre);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of asignarProduccion method, of class Empleado.
     */
    @Test
    public void testAsignarProduccion() {
        System.out.println("asignarProduccion");
        String nombre = "";
        String produccion = "";
        Empleado instance = new Empleado();
        instance.asignarProduccion(nombre, produccion);
      
    }

    /**
     * Test of asignarTotal method, of class Empleado.
     */
    @Test
    public void testAsignarTotal() {
        System.out.println("asignarTotal");
        String nombre = "";
        double total = 0.0;
        int cantidad = 0;
        Empleado instance = new Empleado();
        instance.asignarTotal(nombre, total, cantidad);
    }
}
