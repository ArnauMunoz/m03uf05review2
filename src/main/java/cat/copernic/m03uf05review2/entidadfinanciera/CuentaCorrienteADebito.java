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
public class CuentaCorrienteADebito extends CuentaCorrienteImpl {
    
    public CuentaCorrienteADebito(double saldo, String titular) {
        super(saldo, titular);
    }

    /*
    
    Solamente se da un abono si hay saldo sino se lanza una exception.
    
    @param abono
     */
    @Override
    public void abona(double abono) {
        double saldo = getSaldo();
        
        if (abono <= 0) {
            try {
                throw new Exception("Has de abonar una cifra superior a 0.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (abono > saldo) {
            try {
                throw new Exception("Insuficientes fondos.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }            
        } else {
            setSaldo(saldo - abono);
        }
    }
    
}
