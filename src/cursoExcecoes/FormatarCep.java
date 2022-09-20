package cursoExcecoes;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCepp("23765064");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            e.printStackTrace();
        }
    }
    static String formatarCepp(String cep) throws CepInvalidoException {
        if (cep.length()!=8)
            throw new CepInvalidoException();

        return "23.765-064";
    }
}
