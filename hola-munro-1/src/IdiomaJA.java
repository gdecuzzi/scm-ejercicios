public class IdiomaJA implements Idioma{
    @Override
    public String hola(String quien, Saludador saludador) {

        String saludoInicial = "こんにちは "+quien+"-";
        if(saludador.conoces(quien))
            return saludoInicial + "君";
        return "さん";
    }
}
