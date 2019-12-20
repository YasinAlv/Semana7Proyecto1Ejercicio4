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
public class CRUDTest {
    
    public CRUDTest() {
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
     * Test of mostrar method, of class CRUD.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        CRUD instance = new CRUDImpl();
        instance.mostrar();
        
    }

    /**
     * Test of actualizar method, of class CRUD.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String nombre = "";
        CRUD instance = new CRUDImpl();
        instance.actualizar(nombre);
        
    }

    /**
     * Test of buscar method, of class CRUD.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String nombre = "";
        CRUD instance = new CRUDImpl();
        instance.buscar(nombre);
        
    }

    /**
     * Test of Eliminar method, of class CRUD.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String nombre = "";
        CRUD instance = new CRUDImpl();
        instance.Eliminar(nombre);
        
    }

    /**
     * Test of insertar method, of class CRUD.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String nombre = "";
        CRUD instance = new CRUDImpl();
        instance.insertar(nombre);
        
    }

    public class CRUDImpl implements CRUD {

        public void mostrar() {
        }

        public void actualizar(String nombre) {
        }

        public void buscar(String nombre) {
        }

        public void Eliminar(String nombre) {
        }

        public void insertar(String nombre) {
        }
    }
    
}
