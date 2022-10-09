package cursoCollections.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// cada questão tem o desenvolvimento de melhoria e simplificação de codigo datada pelos comentários seguidos

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("------------------------------------------");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /*
        Fazendo sem o lambda:
        numerosAleatorios.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
        */
        /*
        Fazendo com o lambda:
        numerosAleatorios.stream().forEach(s -> System.out::println(s));
        OU
        numerosAleatorios.forEach(s -> System.out::println(s));
        */
//        fazendo com reference method
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\n------------------------------------------");
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet()).forEach(System.out::println);
        /*
            caso eu queira apenas colocar dentro de uma variável
            Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        */

        System.out.println("\n------------------------------------------");
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
//        esse map nao tem nada haver com o map de collections, ele recebe uma interface function, esse vai
//        transformar minha list de string em uma lista de numeros inteiros
        /*
        numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });
        */
        /*
        numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s));
        */
        /*
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        */
//        colocando dentro de uma variável:
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("\n------------------------------------------");
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        /*
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i%2 == 0 && i>2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        */
//        colocando na variável
        /*
        List<Integer> ListParesM2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i%2 == 0 && i>2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        */

        List<Integer> ListParesM2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i%2 == 0 && i>2))
                .collect(Collectors.toList());
        System.out.println(ListParesM2);

        System.out.println("\n------------------------------------------");
        System.out.println("Mostre a média dos números: ");
//        usando o map to int pq quero realizar manipulações com cada elemento, e avarage p pegar a media
        /*
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s));
        */
//        pelo avarege me retorna um optional, devo utilizar uma f dele p n retornar n null dentro do if
        /*
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
        */
        /*
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(v -> System.out.println(v));
        */

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\n------------------------------------------");
        System.out.println("Remova os valores ímpares: ");
        numerosAleatoriosInteger.removeIf(i->(i%2 != 0));
        System.out.println(numerosAleatoriosInteger);

//        Para você
/*        System.out.println("------------------------------------------");
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("------------------------------------------");
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("------------------------------------------");
        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------------");
        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
        ;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("------------------------------------------");
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("------------------------------------------");
        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("------------------------------------------");
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);*/
    }
}