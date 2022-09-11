package cursoMetodos.firstExercise;

public class Main {
    public static void main(String[] args) {
        //calculadora
        System.out.println("Exercício da calculadora");
        Calculadora.soma(6, 8);
        Calculadora.subtracao(9, 10);
        Calculadora.divisao(7, 9);
        Calculadora.multiplicacao(3, 10);

        //mensagem
        System.out.println("Exercício de mensagens");
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(24);

        //emprestimo
        System.out.println("Exercício do empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
