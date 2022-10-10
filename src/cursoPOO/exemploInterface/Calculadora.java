package cursoPOO.exemploInterface;

class Calculadora implements OperacaoMatematica {
//  caso nao se implemente todos os métodos gera-se um erro na aplicação, é obrigado que todos estejam implementados
    @Override
    public void soma(double num1, double num2) {
        System.out.println("Soma: " + num1 + num2);
    }

    @Override
    public void subtracao(double num1, double num2) {
        System.out.println("Subtracao: " + (num1 - num2));
    }

    @Override
    public void multiplicacao(double num1, double num2) {
        System.out.println("multiplicacao: " + num1 * num2);
    }

    @Override
    public void divisao(double num1, double num2) {
       System.out.println("multiplicacao: " + num1 / num2);
    }

}