import java.util.HashSet;
import java.util.Set;

public class Saludador {
    private Idioma idioma;
    private Set<String> conocidos;
    private int saludos;

    public Saludador(Idioma idioma){
        this.idioma = idioma == null? Idioma.es() : idioma;
        this.conocidos = new HashSet<>();
        this.saludos = 0;
    }

    public String teSaluda( String quien) {
        String saludo = idioma.hola(quien, this);
        this.conocidos.add(quien);
        this.saludos = saludos + 1;
        return saludo;
    }

    public boolean conoces(String quien) {
        return conocidos.contains(quien);
    }
}
