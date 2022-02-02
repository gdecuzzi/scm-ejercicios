package com.tenpines.charlas.scm.saludador.idiomas;

import com.tenpines.charlas.scm.saludador.Idioma;
import com.tenpines.charlas.scm.saludador.Saludador;

public class IdiomaJA implements Idioma {
    @Override
    public String hola(String quien, Saludador saludador) {

        String saludoInicial = "こんにちは "+quien+"-";
        if(saludador.conoces(quien))
            return saludoInicial + "君";
        return "さん";
    }
}
