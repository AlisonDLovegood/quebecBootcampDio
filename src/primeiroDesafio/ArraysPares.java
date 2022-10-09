package primeiroDesafio;

public class ArraysPares {
    public static void main(String[] args) {

// TODO: Crie um Array de números inteiros:
        int[] valors = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int i = 0; i < valors.length; i++) {
            if (valors[i]%2 == 0){
                System.out.println(valors[i]);
            }
        }
    }
}