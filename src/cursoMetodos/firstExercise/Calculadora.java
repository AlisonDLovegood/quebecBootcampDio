package cursoMetodos.firstExercise;

public class Calculadora {
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma dos números "+ numero1 + " e " + numero2 + "é: " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração dos números "+ numero1 + " e " + numero2 + "é: " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisao dos números "+ numero1 + " e " + numero2 + "é: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicacao dos números "+ numero1 + " e " + numero2 + "é: " + resultado);
    }
}
