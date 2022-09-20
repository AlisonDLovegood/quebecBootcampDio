package cursoRepeticao.estruturaFor;

public class BreakContinue {
    public static void main(String[] args) {
        for (int n=1; n<=5; n++){
            if (n==3)
                break;
            System.out.println(n);
        }
        for (int n=1; n<=5; n++){
            if (n==3)
                //vai mudar o fluxo e pular as etapas logo abaixo dele, voltando a linha do for
                continue;
            System.out.println(n);
        }
    }
}
