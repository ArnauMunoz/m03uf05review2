/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

/**
 *
 * @author Arnau
 */
public class CalculadoraDeFracciones {

    private Fraccion op1;

    private Fraccion op2;

    public CalculadoraDeFracciones(Fraccion op1, Fraccion op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    /*
    SUMA -> a/b + c/d = (ad)+(bc) / (bd)
     */
    public Fraccion suma() {
        return new Fraccion(op1.getNumerador() * op2.getDenominador()
                + op1.getDenominador() * op2.getNumerador(),
                op1.getDenominador() * op2.getDenominador());
    }

     /*
    RESTA -> a/b - c/d = (ad)-(bc) / (bd)
     */
    public Fraccion resta() {
        return new Fraccion(op1.getNumerador() * op2.getDenominador()
                - op1.getDenominador() * op2.getNumerador(),
                op1.getDenominador() * op2.getDenominador());
    }
     /*
    DIVIDIR 
     */
    public Fraccion dividir() {
        return new Fraccion(op1.getNumerador() * op2.getDenominador(), 
                            op1.getDenominador() * op2.getNumerador());
    }
     /*
    DIVIDIR 
     */
    public Fraccion multiplicar() {
        return new Fraccion(op1.getNumerador() * op2.getNumerador(), 
                            op1.getDenominador() * op2.getDenominador());
    }
    /*
    MÍNIMO COMÚN DIVISOR
     */
    private double mcd(double num1, double num2) {
         if (num2==0){
             return num1;
         }else{
            return mcd(num2,num1%num2); 
         }
         
    }

}
