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
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoPlatinum(double saldo, String titular) {
        super(saldo, titular);
    }

    /*
    Esta cuenta permite un descubierto de hasta 5000 € si es más lanza una exception
     */
    @Override
    public void abona(double abono){
        double saldo = getSaldo();
        final int GOLD_MAX = 5000;
        double saldoDescubierto = getSaldo() + GOLD_MAX;

        if (abono <= 0) {
            try{
                throw new Exception("Has de abonar una cifra superior a 0.");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        } else if (saldoDescubierto >= abono) {
            setSaldo(saldo - abono);
        } else {
            try {
                throw new Exception("Has pasado el descubierto de " + GOLD_MAX + "€.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
