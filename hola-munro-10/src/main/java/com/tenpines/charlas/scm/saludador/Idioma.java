package com.tenpines.charlas.scm.saludador;

import com.tenpines.charlas.scm.saludador.idiomas.IdiomaEN;
import com.tenpines.charlas.scm.saludador.idiomas.IdiomaES;
import com.tenpines.charlas.scm.saludador.idiomas.IdiomaJA;

public interface Idioma {
    public static Idioma es(){
        return new IdiomaES();
    }
    public static Idioma en(){
        return new IdiomaEN();
    }
    public static Idioma ja(){
        return new IdiomaJA();
    }
    public String hola(String saludado, Saludador saludador);

}
