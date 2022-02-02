package com.tenpines.charlas.scm.saludador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaludadorTest {

    private Saludador saludador;

    @BeforeEach
    public void setUp(){
        this.saludador = new Saludador(null);
    }

    @Test
    public void sinSaludarAntesNoConoce(){
        boolean esConocida = saludador.conoces("Denna");
        assertFalse(esConocida, "Nunca saludo, no deberia conocerla");
    }

    @Test
    public void habiendoSaludoConoce(){
        saludador.teSaluda("Denna");
        boolean esConocida = saludador.conoces("Denna");
        assertTrue(esConocida, "Ya lo saludo, deberia recordarla");
    }
}