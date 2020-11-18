/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



/**
 *
 * @author Arnau
 */
public class RegExprMainTest {
    
    public RegExprMainTest() {
    }
    /*
    Abans de tots els tests
    */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciant tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant tests");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ValidateNif method, of class RegExprMain.
     */
    @ParameterizedTest
    @ValueSource(strings={"47741562A", "455455414Q"})
    void testValidateNifTrue(String nif){
        assertTrue(RegExprMain.ValidateNif(nif));
    }
    
    @ParameterizedTest
    @ValueSource(strings={"47741562", "455455414a"})
    void testValidateNifFalse(String nif){
        assertTrue(RegExprMain.ValidateNif(nif));
    }
    
    @Test
    public void testValidateNif() {
        assertTrue(RegExprMain.ValidateNif("47741562W"));
        assertTrue(RegExprMain.ValidateNif("86121641G"));
        assertTrue(RegExprMain.ValidateNif("66492108M"));
        assertTrue(RegExprMain.ValidateNif("50150011Y"));
        assertFalse(RegExprMain.ValidateNif("98721293"));
        assertFalse(RegExprMain.ValidateNif("06671231n"));
        assertFalse(RegExprMain.ValidateNif("n98721293"));
        assertFalse(RegExprMain.ValidateNif("N06671231n"));
        
  
    }

    /**
     * Test of ValidateNie method, of class RegExprMain.
     */
    @Test
    public void testValidateNie() {
        assertTrue(RegExprMain.ValidateNie("Z1967322E"));
        assertTrue(RegExprMain.ValidateNie("X6353024X"));
        assertTrue(RegExprMain.ValidateNie("Z8825153N"));
        assertTrue(RegExprMain.ValidateNie("Z7750333M"));
        assertFalse(RegExprMain.ValidateNie("x9271996Y"));
        assertFalse(RegExprMain.ValidateNie("Y9271996x"));
        assertFalse(RegExprMain.ValidateNie("9271996Y"));
        assertFalse(RegExprMain.ValidateNie("x9271996"));
    }

    /**
     * Test of ValidateNum method, of class RegExprMain.
     */
    @Test
    
    public void testValidateNum() {
        assertTrue(RegExprMain.ValidateNum("647263735"));
        assertTrue(RegExprMain.ValidateNum("656823594"));
        assertTrue(RegExprMain.ValidateNum("947263735"));
        assertTrue(RegExprMain.ValidateNum("956384123"));
        assertFalse(RegExprMain.ValidateNum("16384123"));
        assertFalse(RegExprMain.ValidateNum("26384123"));
        assertFalse(RegExprMain.ValidateNum("263123"));
        assertFalse(RegExprMain.ValidateNum("384123"));
    }

    /**
     * Test of ValidateNumEsp method, of class RegExprMain.
     */
    @Test
    
    public void testValidateNumEsp() {
        assertTrue(RegExprMain.ValidateNumEsp("+34612345678"));
        assertTrue(RegExprMain.ValidateNumEsp("+34657346981"));
        assertTrue(RegExprMain.ValidateNumEsp("+34912345678"));
        assertTrue(RegExprMain.ValidateNumEsp("+34912345678"));
        assertFalse(RegExprMain.ValidateNumEsp("+34612345"));
        assertFalse(RegExprMain.ValidateNumEsp("34612345678"));
        assertFalse(RegExprMain.ValidateNumEsp("+349123"));
        assertFalse(RegExprMain.ValidateNumEsp("3491235656"));
        
    }

    /**
     * Test of ValidateMat method, of class RegExprMain.
     */
    @Test
    
    public void testValidateMat() {
        assertTrue(RegExprMain.ValidateMat("6666BSN"));
        assertTrue(RegExprMain.ValidateMat("1234XJN"));
        assertTrue(RegExprMain.ValidateMat("6234QWV"));
        assertTrue(RegExprMain.ValidateMat("0019KYZ"));
        assertFalse(RegExprMain.ValidateMat("0000AAA"));
        assertFalse(RegExprMain.ValidateMat("0234bsn"));
        assertFalse(RegExprMain.ValidateMat("000000KLA"));
        assertFalse(RegExprMain.ValidateMat("0234BkJ"));
        
    }

    /**
     * Test of ValidateFecha method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateFecha() {
        assertTrue(RegExprMain.ValidateFecha("1/1/1999"));
        assertFalse(RegExprMain.ValidateFecha("255/33/19"));
    }

    /**
     * Test of ValidateEmail method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testValidateEmail() {
        assertTrue(RegExprMain.ValidateEmail("arnau@gmail.com"));
        assertFalse(RegExprMain.ValidateEmail("arnaugmailcom"));
      
    }

    

    
}
