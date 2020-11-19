/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections.exercici;

import java.util.List;

/**
 *
 * @author Arnau
 */
public class MatcherImpl implements Matcher {

    Persona persona;
    List<Persona> candidatos;

    //Politica
    public boolean politica(Persona can, Persona per) {
        boolean resu = false;

        if (can.getOrientacionPolitica() == OrientacionPolitica.CENTRO && ((per.getOrientacionPolitica() == OrientacionPolitica.DERECHA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.CENTRO)
                || (per.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA))) {

            resu = true;

        } else if (can.getOrientacionPolitica() == OrientacionPolitica.DERECHA && ((per.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.DERECHA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.CENTRO))) {

            resu = true;

        } else if (can.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && ((per.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.CENTRO))) {

            resu = true;

        } else if (can.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && ((per.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.DERECHA))) {

            resu = true;

        } else if (can.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && ((per.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA)
                || (per.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA))) {

            resu = true;
        }

        return resu;
    }

    //Orientacio sexual
    public boolean sexualitat(Persona can, Persona per) {

        boolean resu = false;

        if ((can.getSexo() == Sexo.HOMBRE && can.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL )
                && (per.getSexo() == Sexo.MUJER && per.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL)) {

            resu = true;

        } else if ((can.getSexo() == Sexo.MUJER && can.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL  )
                && (per.getSexo() == Sexo.HOMBRE && per.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL )) {
            
            resu = true;
        
        } else if ((can.getOrientacionSexual() == OrientacionSexual.BISEXUAL && can.getSexo() == Sexo.MUJER)
                && ((per.getOrientacionSexual() == OrientacionSexual.LESBIANA || per.getOrientacionSexual() == OrientacionSexual.BISEXUAL)
                && per.getSexo() == Sexo.MUJER)) {
        
            resu = true;
        
        } else if ((can.getOrientacionSexual() == OrientacionSexual.BISEXUAL && can.getSexo() == Sexo.HOMBRE)
                && ((per.getOrientacionSexual() == OrientacionSexual.GAY || per.getOrientacionSexual() == OrientacionSexual.BISEXUAL)
                && per.getSexo() == Sexo.HOMBRE)) {
        
            resu = true;
        
        } else if ((can.getOrientacionSexual() == OrientacionSexual.BISEXUAL && can.getSexo() == Sexo.HOMBRE)
                && (per.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL && per.getSexo() == Sexo.MUJER)) {
        
            resu = true;
        
        } else if ((can.getOrientacionSexual() == OrientacionSexual.BISEXUAL && can.getSexo() == Sexo.MUJER)
                && (per.getOrientacionSexual() == OrientacionSexual.HETEROSEXUAL && per.getSexo() == Sexo.HOMBRE)) {
        
            resu = true;
        
        } else if (can.getOrientacionSexual() == OrientacionSexual.GAY && per.getOrientacionSexual() == OrientacionSexual.GAY) {
        
            resu = true;
        
        } else if (can.getOrientacionSexual() == OrientacionSexual.LESBIANA && per.getOrientacionSexual() == OrientacionSexual.LESBIANA) {
        
            resu = true;
        }

        return resu;
    }

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {

        Persona aux = null;
        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i).getEdad() <= persona.getEdad() - 4) {
                if (candidatos.get(i).isFumador() == true && persona.isFumador() == true) {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }

                    }
                } else if (candidatos.get(i).isFumador() == false && persona.isFumador() == false) {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }
                    }
                } else {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }
                    }
                }
            } else {
                if (candidatos.get(i).isFumador() == true && persona.isFumador() == true) {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }

                    }
                } else if (candidatos.get(i).isFumador() == false && persona.isFumador() == false) {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }
                    }
                } else {
                    if (sexualitat(candidatos.get(i), persona) == true) {
                        if (politica(candidatos.get(i), persona) == true) {
                            aux = candidatos.get(i);
                        } else {
                            aux = candidatos.get(i);
                        }
                    }
                }
            }
        }

        return aux;

    }

    public MatcherImpl(Persona persona, List<Persona> candidatos) {
        this.persona = persona;
        this.candidatos = candidatos;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Persona> getCandidatos() {
        return candidatos;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setCandidatos(List<Persona> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public String toString() {
        return "MatcherImpl{" + "persona=" + persona + ", candidatos=" + candidatos + '}';
    }

}
