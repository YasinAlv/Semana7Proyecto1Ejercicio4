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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        instance.setNombre("prueba");
        String expResult = "prueba";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido method, of class Cliente.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Cliente instance = new Cliente();
        instance.setApellido(apellido);
       
    }

    /**
     * Test of getApellido method, of class Cliente.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Cliente instance = new Cliente();
        instance.setApellido("prueba");
        String expResult = "prueba";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Cliente instance = new Cliente();
        instance.setEdad(edad);
        
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSexo method, of class Cliente.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Cliente instance = new Cliente();
        instance.setSexo(sexo);
        
    }

    /**
     * Test of getSexo method, of class Cliente.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Cliente instance = new Cliente();
        instance.setSexo("M");
        String expResult = "M";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTotal method, of class Cliente.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        Cliente instance = new Cliente();
        instance.setTotal(total);
    }

    /**
     * Test of getTotal method, of class Cliente.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAlquiladas method, of class Cliente.
     */
    @Test
    public void testSetAlquiladas() {
        System.out.println("setAlquiladas");
        String alquilada = "";
        Cliente instance = new Cliente();
        instance.setAlquiladas(alquilada);
    }

    /**
     * Test of setCantidad method, of class Cliente.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Cliente instance = new Cliente();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getCantidad method, of class Cliente.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarLista method, of class Cliente.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("mostrarLista");
        Cliente instance = new Cliente();
        instance.mostrarLista();
    }
    
}
