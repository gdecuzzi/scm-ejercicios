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
