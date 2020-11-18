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
public abstract class CuentaCorrienteImpl implements CuentaCorriente {

    private double saldo;
    private String titular;

    public CuentaCorrienteImpl(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    @Override
    public void ingresa(double ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
        } else {
            try {
                throw new Exception("Has d'ingrear un numero major que 0.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaCorrienteImpl{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }

}
