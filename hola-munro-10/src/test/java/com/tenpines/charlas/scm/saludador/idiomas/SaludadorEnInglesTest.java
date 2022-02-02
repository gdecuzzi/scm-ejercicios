package com.tenpines.charlas.scm.saludador.idiomas;

import com.tenpines.charlas.scm.saludador.Idioma;
import com.tenpines.charlas.scm.saludador.Saludador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaludadorEnInglesTest {
    private Saludador saludador;

    @BeforeEach
    public void setUp(){
        this.saludador = new Saludador(Idioma.en());
    }

    @Test
    public void elSaludoEsSeco(){
        String saludo = this.saludador.teSaluda("Mako");
        assertEquals("Hi!", saludo);
    }
}
