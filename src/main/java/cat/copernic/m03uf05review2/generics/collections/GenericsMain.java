/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Arnau
 */
public class GenericsMain {

    /**
     * ---1---
     * Escribe un metodo que retorne el ultimo elemento de una lista.
     */
    public static <T> T ultimo(List<T> lista) {

        return lista.get(lista.size() - 1);
    }

    /**
     * ---2---
     * Escribe un metodo que retorne la media de una lista de doubles.
     */
    public static double media(List<Double> lista) {

        double media = 0;

        for (int i = 0; i < lista.size(); i++) {
            media += lista.get(i);

        }
        return media / lista.size();
    }

    /**
     * ---3---
     * Escribe un metodo que retorne la cadena mas larga de una lista de
     * cadenas.
     */
    public static String cadenaMasLarga(List<String> lista) {
        String masGrande = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).length() > masGrande.length()) {
                masGrande = lista.get(i);
            }
        }

        return masGrande;
    }

    /**
     * ---4---
     * Escribe un metodo que retorne el maximo de una lista de enteros.
     */
    public static Integer numMasGrande(List<Integer> lista) {
        int num = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > num) {
                num = lista.get(i);
            }
        }
        
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1
        List<String> lista1 = new ArrayList<>();

        lista1.add("Marta");
        lista1.add("Eva");
        lista1.add("Joan");
        lista1.add("Carles");
        lista1.add("Pep");

        System.out.println(ultimo(lista1));

        //2
        List<Double> lista2 = new ArrayList();

        lista2.add(100.0);
        lista2.add(100.0);
        lista2.add(50.0);
        lista2.add(50.0);

        System.out.println(media(lista2));

        //3
        List<String> lista3 = new ArrayList();

        lista3.add("aaa");
        lista3.add("aaaa");
        lista3.add("aaaaa");
        lista3.add("aaaaaazz");

        System.out.println(cadenaMasLarga(lista3));

        //4
        List<Integer> lista4 = new ArrayList();

        lista4.add(6);
        lista4.add(66);
        lista4.add(666);
        lista4.add(665);

        System.out.println(numMasGrande(lista4));

        //Dice si esta vacia
        if (lista1.isEmpty()) {
            System.out.println("Lista vacia");

        } else {
            System.out.println("La lista te " + lista1.size() + "elements.");
        }

        //Recorre Lista
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }

        //Recorer con Iterator
        for (Iterator<String> it = lista1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        //SubsString 
        List<String> ls = lista1.subList(0, lista1.size() / 2);

    }

}
