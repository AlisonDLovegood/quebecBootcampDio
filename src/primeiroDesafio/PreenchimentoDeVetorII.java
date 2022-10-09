package primeiroDesafio;

import java.util.Scanner;

public class PreenchimentoDeVetorII {

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro: ");
        Scanner leitor = new Scanner(System.in);

        int t = leitor.nextInt();
        int[] N = new int[10];

        for (int i = 0; i<N.length; i++){
            N[i] = i%t;
        }

        for (int i = 0; i<N.length; i++){
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}