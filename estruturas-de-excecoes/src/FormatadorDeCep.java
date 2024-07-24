public class FormatadorDeCep {
    public static void main(String[] args) {
        
    }

    static String formatarCep(String cep) throws CepInvalidoExcecao{
        if (cep.length() != 8) {
            throw new CepInvalidoExcecao();

            return "23.765-064";
        }
    }
}
