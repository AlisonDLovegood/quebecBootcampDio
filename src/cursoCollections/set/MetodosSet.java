package cursoCollections.set;

import java.util.*;

public class MetodosSet {
    public static void main(String[] args) {
//
//      Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/
        System.out.println("------------------------------------------");
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//        p visualização, pode-se passar com toString ou só com a set notas, passando pelo hashset, nao fica na ordem
//        totalmente aleatorio, e os elementos repetidos so entram uma vez
        System.out.println(notas.toString());

//        ao trabalhar com o set, nao consegue-se pesquisar de acordo com a posicao, principalmente num hashset, não há
//        um metodo indexof para realizar:
//        System.out.println("Exiba a posição da nota 5.0: ");
//        da mesma forma, nao consigo trabalhar com posicao dentro de um set para realizar os exercicios:
//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        System.out.println("Exiba a terceira nota adicionada: ");

//        há o metodo contains na interface set, e os metodos min e max recebem colection
        System.out.println("------------------------------------------");
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("------------------------------------------");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("------------------------------------------");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("------------------------------------------");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("------------------------------------------");
//        para fazer a divisao da soma pela quantidade de objetos dentro da lista, usa-se o metodo size
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("------------------------------------------");
//        da para remover por nao se tratar da posicao
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("------------------------------------------");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("------------------------------------------");
//        para saber a ordem que foi formada, eu n posso trabalhar com implementacao rashset, devo trabalhar com a link
//        edhashset, que pode ser feito das duas proximas formas:
//        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("------------------------------------------");
//        tenho que utilizar a tree pq ela organiza de acordo com a ordem natural dos elementos, e como o double puxa de
//        comparable, se caso nao tivesse o comparable e eu nao passasse um comparator, nao daria certo
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("------------------------------------------");
        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("------------------------------------------");
        System.out.println("Confira se o conjunto 1 está vazio: " + notas.isEmpty());
        System.out.println("------------------------------------------");
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("------------------------------------------");
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }
}