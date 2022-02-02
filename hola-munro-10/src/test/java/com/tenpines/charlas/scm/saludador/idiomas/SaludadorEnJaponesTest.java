package com.tenpines.charlas.scm.saludador.idiomas;

import com.tenpines.charlas.scm.saludador.Idioma;
import com.tenpines.charlas.scm.saludador.Saludador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaludadorEnJaponesTest {
    private Saludador saludador;

    @BeforeEach
    public void setUp(){
        this.saludador = new Saludador(Idioma.ja());
    }

    @Test
    public void saludoInicialTrataDeSan(){
        String saludo = this.saludador.teSaluda("Mako");
        assertTrue(saludo.endsWith("さん"),"El saludo no esta terminando en san");
    }

    @Test
    public void saludarVariasVecesTrataDeKun(){
        this.saludador.teSaluda("Mako");
        String saludo = this.saludador.teSaluda("Mako");
        assertTrue(saludo.endsWith("君"), "El saludo no esta terminando en kun");
    }
}
