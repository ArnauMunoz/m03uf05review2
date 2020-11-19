/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections.exercici;

/**
 *
 * @author Arnau
 */
public class Persona{

    private int id;
    private Sexo sexo;
    private int edad;
    private boolean fumador;
    private OrientacionSexual orientacionSexual;
    private Formacion formacion;
    private OrientacionPolitica orientacionPolitica;

    public Persona(int id, Sexo sexo, int edad, boolean fumador, OrientacionSexual orientacionSexual, Formacion formacion, OrientacionPolitica orientacionPolitica) {
        this.id = id;
        this.sexo = sexo;
        this.edad = edad;
        this.fumador = fumador;
        this.orientacionSexual = orientacionSexual;
        this.formacion = formacion;
        this.orientacionPolitica = orientacionPolitica;
    }

    
    public int getId() {
        return id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isFumador() {
        return fumador;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public OrientacionPolitica getOrientacionPolitica() {
        return orientacionPolitica;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }

    public void setOrientacionSexual(OrientacionSexual orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public void setFormacion(Formacion formacion) {
        this.formacion = formacion;
    }

    public void setOrientacionPolitica(OrientacionPolitica orientacionPolitica) {
        this.orientacionPolitica = orientacionPolitica;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", sexo=" + sexo + ", edad=" + edad + ", fumador=" + fumador + ", orientacionSexual=" + orientacionSexual + ", formacion=" + formacion + ", orientacionPolitica=" + orientacionPolitica + '}';
    }

}
