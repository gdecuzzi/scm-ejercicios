public class IdiomaES implements Idioma{
    @Override
    public String hola(String quien, Saludador saludador) {
        return "Hola "+ quien + " ¿Todo bien?";
    }
}
