package segundoDesafio;

import java.util.*;

public class ReduzindoAZero {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int etapas = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                etapas++;
            } else {
                num -= 1;
                etapas++;
            }
        }
        System.out.println(etapas);
    }
}