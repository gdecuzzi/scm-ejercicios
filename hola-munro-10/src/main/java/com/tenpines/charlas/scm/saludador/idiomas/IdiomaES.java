package com.tenpines.charlas.scm.saludador.idiomas;

import com.tenpines.charlas.scm.saludador.Idioma;
import com.tenpines.charlas.scm.saludador.Saludador;

public class IdiomaES implements Idioma {
    @Override
    public String hola(String quien, Saludador saludador) {
        return "Hola "+ quien + " ¿Todo bien?";
    }
}
