package cursoMetodos.thirdExercise;

public class Quadrilatero {
    //sobrecarga é utilizada mantendo-se o nome do método e alterando sua lista de parâmetros)
    public static double area(double lado){
        return lado * lado;
    }
    //assinatura = nome e paramêtro
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor)*altura)/2;
    }
}
