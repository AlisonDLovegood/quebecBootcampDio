package cursoCollections.ordenacaoElementos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos  meses do ano e armazene-as em uma lista.
Após isto, calcule a média das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExerciciosPropostos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //adicinar com mensagem de erro as temperaturas
        System.out.println("------------------------------------------");
        int count = 0;
        while (true) {
            if (count == 12)
                break;

            try {
                System.out.println("Digite a temperatura: ");
                double temp = scan.nextDouble();
                temperaturas.add(temp);
                count++;
            } catch (Exception e) {
                System.err.println("informação deve ser numerica e fracionada por virgulas, "+e.getMessage());
                break;
            }
        }

        //exibir as temperaturas
        System.out.println("------------------------------------------");
        System.out.println("Temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t+""));

        //calcular a media, api da stream utilizando o average que serve para retornar media de um conjunto
        System.out.println("------------------------------------------");
        double media =temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.println("Media das temperaturas: "+media);

        //exibir as temperaturas que tiverem valor acima do valor da media
        System.out.println("------------------------------------------");
        System.out.println("Temperaturas acima da media: ");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f, ", t));

        //exibir o mes das temperaturas que forem acima da media
        System.out.println("\n------------------------------------------");

        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    case (6):
                        System.out.printf("7 - julho: %.1f\n ", temp);
                        break;
                    case (7):
                        System.out.printf("8 - agosto: %.1f\n", temp);
                        break;
                    case (8):
                        System.out.printf("9 - setembro: %.1f\n", temp);
                        break;
                    case (9):
                        System.out.printf("10 - outubro: %.1f\n", temp);
                        break;
                    case (10):
                        System.out.printf("11 - novembro: %.1f\n", temp);
                        break;
                    case (11):
                        System.out.printf("12 - dezembro: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
