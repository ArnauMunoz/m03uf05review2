/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arnau
 */
public class CuentaCorrienteADebitoTest {
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Test starts.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Test ends.");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() {
        System.out.println("abona");
        
        CuentaCorrienteImpl cuenta = new CuentaCorrienteACreditoPlatinum(5000, "Sara");
        cuenta.abona(4999);
        assertEquals(1, cuenta.getSaldo(), 2);
        
    }
    
}
