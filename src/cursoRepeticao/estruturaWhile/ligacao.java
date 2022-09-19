package cursoRepeticao.estruturaWhile;
import java.util.Random;
public class ligacao {
    public static void main(String[] args) {
        System.out.println("discando...");
        do {
            System.out.println("telefone tocando");
        }while (tocando());
        System.out.println("Alo!!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?"+atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
