package primeiroDesafio;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código da peça:");
        int cod1 = leitor.nextInt();
        System.out.println("Agora a quantidade de peças:");
        int n1 = leitor.nextInt();
        System.out.println("O valor da unidade:");
        double valor1 = leitor.nextDouble();
//        System.out.print(cod1 + " " + n1 + " " + valor1);

        System.out.println("\nDigite o código da peça:");
        int cod2 = leitor.nextInt();
        System.out.println("Agora a quantidade de peças:");
        int n2 = leitor.nextInt();
        System.out.println("O valor da unidade:");
        double valor2 = leitor.nextDouble();
//        System.out.print(cod2 + " " + n2 + " " + valor2);

        double total = (valor1*n1) + (valor2*n2);
        System.out.printf("\nVALOR A PAGAR: R$ %.2f%n", total);

    }
}

