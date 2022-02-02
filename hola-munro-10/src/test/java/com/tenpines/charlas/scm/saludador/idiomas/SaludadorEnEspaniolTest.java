package com.tenpines.charlas.scm.saludador.idiomas;

import com.tenpines.charlas.scm.saludador.Idioma;
import com.tenpines.charlas.scm.saludador.Saludador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaludadorEnEspaniolTest {
    private Saludador saludador;

    @BeforeEach
    public void setUp(){
        this.saludador = new Saludador(Idioma.es());
    }

    @Test
    public void elSaludoIncluyeElNombre(){
        String saludo = this.saludador.teSaluda("Mako");
        assertTrue(saludo.contains(" Mako "));
    }
}
