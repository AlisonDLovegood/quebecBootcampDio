package cursoCondicionais.condicionaisSimples;

public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
//caso o valor solicitado seja maior do que o valor de saldo, não entra na condicional
        if (valorSolicitado < saldo)
            saldo -= valorSolicitado;
        System.out.println(saldo);
    }
}
