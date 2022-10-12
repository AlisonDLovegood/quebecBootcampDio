package segundoDesafio;

import java.util.*;

public class Robo {
    public static void main(String[] args) {

        String movimentos = new Scanner(System.in).nextLine();
        int x = 0;
        int y = 0;

        for (int i = 0; i<movimentos.length(); i++){
            char ch = movimentos.charAt(i);
            switch (ch){
                case 'W':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'A':
                    y--;
                    break;
            }
        }
        if (x == 0 && y == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
