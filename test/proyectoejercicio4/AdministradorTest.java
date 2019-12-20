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
public class AdministradorTest {
    
    public AdministradorTest() {
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
     * Test of setNombre method, of class Administrador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Administrador instance = new Administrador();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getNombre method, of class Administrador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Administrador instance = new Administrador();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido method, of class Administrador.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Administrador instance = new Administrador();
        instance.setApellido(apellido);
        
    }

    /**
     * Test of getApellido method, of class Administrador.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Administrador instance = new Administrador();
        instance.setApellido("");
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUsuario method, of class Administrador.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Administrador instance = new Administrador();
        instance.setNombre("prueba");
        instance.setApellido("apellido");
        instance.setUsuario();
        
    }

    /**
     * Test of getUsuario method, of class Administrador.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Administrador instance = new Administrador();
        instance.setNombre("prueba");
        instance.setApellido("apellido");
        instance.setUsuario();
        String expResult = "papellido";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPass method, of class Administrador.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Administrador instance = new Administrador();
        instance.setPass(pass);
       
    }

    /**
     * Test of getPass method, of class Administrador.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Administrador instance = new Administrador();
        instance.setPass("");
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insertar method, of class Administrador.
     */

    /**
     * Test of setEmpleado method, of class Administrador.
     */
    @Test
    public void testSetEmpleado() {
        System.out.println("setEmpleado");
        Empleado empleado = null;
        Administrador instance = new Administrador();
        instance.setEmpleado(empleado);
       
    }

    /**
     * Test of mostrar method, of class Administrador.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Administrador instance = new Administrador();
        instance.mostrar();
        
    }

    /**
     * Test of buscar method, of class Administrador.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nombre = "";
        Administrador instance = new Administrador();
        instance.buscar(nombre);
        
    }

    /**
     * Test of Eliminar method, of class Administrador.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String nombre = "";
        Administrador instance = new Administrador();
        instance.Eliminar(nombre);
       
    }

    /**
     * Test of actualizar method, of class Administrador.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String nombre = "";
        Administrador instance = new Administrador();
        instance.actualizar(nombre);
       
    }
    
}
