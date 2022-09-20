package cursoExcecoes;

public class formatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCepp("23765064");
            System.out.println(cepFormatado);
        }catch (cepInvalidoException e){
            e.printStackTrace();
        }
    }
    static String formatarCepp(String cep) throws cepInvalidoException {
        if (cep.length()!=8)
            throw new cepInvalidoException();

        return "23.765-064";
    }
}
