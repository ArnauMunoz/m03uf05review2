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
public class CuentaCorrienteACreditoGoldTest {

    public CuentaCorrienteACreditoGoldTest() {
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
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    public void testAbona() {
        System.out.println("abona");

        CuentaCorrienteImpl cuenta = new CuentaCorrienteACreditoGold(5000, "Sara");
        cuenta.abona(8000);
        assertEquals(-3000, cuenta.getSaldo(), 2);

    }
    
   

}
