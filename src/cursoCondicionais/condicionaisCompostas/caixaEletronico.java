package cursoCondicionais.condicionaisCompostas;

public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        }else
            System.out.println("Saldo insuficiente!");
    }
}
