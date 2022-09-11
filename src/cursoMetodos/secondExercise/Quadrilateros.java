package cursoMetodos.secondExercise;

public class Quadrilateros {
    //sobrecarga é utilizada mantendo-se o nome do método e alterando sua lista de parâmetros)
    public static void area(double lado){
        System.out.println("Área do quadrado é de: " + lado*lado);
    }
    //assinatura = nome e paramêtro
    public static void area(double lado1, double lado2){
        System.out.println("Área do retangulo é de: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio é de: " + (baseMaior + baseMenor)*altura/2);
    }
}
