/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

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
public class CalculadoraDeFraccionesTest {

    public CalculadoraDeFraccionesTest() {
    }

    private CalculadoraDeFracciones ins;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Tests starts");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tests ends");
    }

    @Before
    public void setUp() {
        Fraccion fr1 = new Fraccion(2, 3);
        Fraccion fr2 = new Fraccion(2, 3);
        ins = new CalculadoraDeFracciones(fr1, fr2);
    }

    @After
    public void tearDown() {
        ins = null;
    }

    /**
     * Test of suma method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");

        assertEquals(new Fraccion(12.0, 9.0), ins.suma());
        assertEquals(12.0, ins.suma().getNumerador(), 0.001);
        assertEquals(9.0, ins.suma().getDenominador(), 1.0E-3); // 1.0 ^ -3 -> 1 / 1000

    }

    /**
     * Test of resta method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testResta() {
        System.out.println("resta");

        assertEquals(0.0, ins.resta().getNumerador(), 0.001);
        assertEquals(9.0, ins.resta().getDenominador(), 1.0E-3);

    }

    /**
     * Test of dividir method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");

        assertEquals(new Fraccion(6.0, 6.0), ins.dividir());
    }

    /**
     * Test of multiplicar method, of class CalculadoraDeFracciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");

        assertEquals(new Fraccion(4.0, 9.0), ins.multiplicar());
        assertEquals(4.0, ins.multiplicar().getNumerador(), 0.001);
        assertEquals(9.0, ins.multiplicar().getDenominador(), 1.0E-3);

    }

}
