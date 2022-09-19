package cursoRepeticao.estruturaWhile;
import java.util.concurrent.ThreadLocalRandom;
public class mesada {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada>0) {
            double valorDoce = valorAleatorio();
            //verificando p dar um "desconto" na compra do ultimo doce e nao obter um valor negativo
            if (valorDoce>mesada){
                valorDoce=mesada;
            }
                System.out.println("Doce do valor: "+valorDoce+" Adicionando no carrinho");
                mesada -= valorDoce;

            System.out.println("mesada: "+mesada);
            System.out.println("joaozinho gastou toda a sua mesada em doces");
        }
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
