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
    
    private CuentaCorrienteImpl cuenta;

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
        cuenta = new CuentaCorrienteADebito(5000.00, "Sara");
    }

    @After
    public void tearDown() {
        cuenta = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() {
        System.out.println("abona");

        cuenta.abona(4999);
        assertEquals(1, cuenta.getSaldo(), 2);

    }
    
    @Test
    public void testAbonaError1() {
        System.out.println("abona error1");

        cuenta.abona(-5000.00);
        assertNotEquals(-5000.00, cuenta.getSaldo(), 2);

    }

    @Test
    public void testAbonaError2() {
        System.out.println("abona error3");

        cuenta.abona(0.00);
        assertNotEquals(0.00, cuenta.getSaldo(), 2);

    }

    /**
     * Test of ingresa method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    public void testIngresa() {
        System.out.println("ingresa");

        cuenta.ingresa(2000.00);
        assertEquals(7000.00, cuenta.getSaldo(), 2);

    }

    @Test
    public void testIngresaError1() {
        System.out.println("ingresa error1");

        cuenta.ingresa(-2000.00);
        assertNotEquals(3000.00, cuenta.getSaldo(), 2);

    }

    @Test
    public void testIngresaError2() {
        System.out.println("ingresa error2");

        cuenta.ingresa(0.00);
        assertNotEquals(0.00, cuenta.getSaldo(), 2);

    }

}
