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

class SaludadorEnJaponesTest {
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

class SaludadorEnInglesTest {
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

class SaludadorEnEspaniolTest {
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