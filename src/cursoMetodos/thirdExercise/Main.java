package cursoMetodos.thirdExercise;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício de retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrilátero: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3, 4);
        System.out.println("Área do quadrilátero: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3, 4, 5);
        System.out.println("Área do quadrilátero: " + areaTrapezio);
    }
}
