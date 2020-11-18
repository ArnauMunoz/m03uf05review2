/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

/**
 *
 * @author Arnau
 */
public class CuentaCorrienteMain {
    public static void main(String[] args) throws Exception {
        
        CuentaCorrienteACreditoGold cuenta1 = new CuentaCorrienteACreditoGold(5000.00, "Carlos");
        cuenta1.ingresa(5000.00);
        System.out.println(cuenta1.toString());
        cuenta1.abona(15000.00);
        System.out.println(cuenta1.toString());
        
        CuentaCorrienteACreditoPlatinum cuenta2 = new CuentaCorrienteACreditoPlatinum(100.00, "Marta");
        cuenta2.ingresa(100.00);
        System.out.println(cuenta2.toString());
        cuenta2.abona(5200);
        System.out.println(cuenta2.toString());
        
        CuentaCorrienteADebito cuenta3 = new CuentaCorrienteADebito(10000.00, "Sara");
        cuenta3.ingresa(10000.00);
        System.out.println(cuenta3.toString());
        cuenta3.abona(20000.00);
        System.out.println(cuenta3.toString());
        
        
        
        
        
    }
    
}
