/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Arnau
 */
public class ExpresionesRegularesMain {

    /**
     * Expresión regular que valide NIF
     */
    public static boolean ValidateNif(String nif) {
        Pattern p = Pattern.compile("[0-9]{8}[A-Z&&[^AEIOU]");
        Matcher mat = p.matcher(nif);
        return mat.matches();

    }

    /**
     * Expresión regular que valide NIE
     */
    public static boolean ValidateNie(String nie) {
        Pattern p = Pattern.compile("[A-Z]\\d{7}[A-Z]");
        Matcher mat = p.matcher(nie);
        return mat.matches();
    }

    /**
     * Expresión regular que valide un telefono de movil
     */
    public static boolean ValidateNum(String numero) {
        Pattern p = Pattern.compile("(6|9)\\d{8}");
        Matcher mat = p.matcher(numero);
        return mat.matches();
    }

    /**
     * Expresión regular que valide un telefono de España
     */
    public static boolean ValidateNumEsp(String numeroesp) {
        Pattern p = Pattern.compile("(\\+346|\\+349)\\d{8}");
        Matcher mat = p.matcher(numeroesp);
        return mat.matches();
    }

    /**
     * Expresión regular que valide una matricula
     */
    public static boolean ValidateMat(String matricula) {
        Pattern p = Pattern.compile("\\d{4}[A-Z&&[^AEIOU]]{3}");
        Matcher mat = p.matcher(matricula);
        return mat.matches();
    }
    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    public static boolean ValidateFecha(String fecha) {
        Pattern p = Pattern.compile("^[1-31]\\/[1-12]\\/\\d{4}$");
        Matcher mat = p.matcher(fecha);
        return mat.matches();
    }
    
    /**
     * Expresión regular que valide un email
     */
    public static boolean ValidateEmail(String email) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher mat = p.matcher(email);
        return mat.matches();
    }
    public static void main(String[] args) {
        System.out.println(
                Pattern
                        .compile("(\\d\\d)\\1")
                        .matcher("1212")
                        .matches());
    }
}
