package cursoCollections.map.exerciciosMap;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExerciciosPropostos1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>(){{
            put("RN", 3409000);
            put("PE", 9278000);
            put("CE", 8843000);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("\n------------------------------------------");
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("\n------------------------------------------");
        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        if (!populacaoEstadosNE.containsKey("PB")) {
            populacaoEstadosNE.put("PB", 4039277);
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("\n------------------------------------------");
        System.out.println("Exiba a população do estado PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("\n------------------------------------------");
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNE1 = new LinkedHashMap<>(){{
            put("RN", 3409000);
            put("PE", 9278000);
            put("CE", 8843000);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE1);

        System.out.println("\n------------------------------------------");
        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE2 = new TreeMap<>(populacaoEstadosNE1);
        System.out.println(populacaoEstadosNE2);

        Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }

        System.out.println("\n------------------------------------------");
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", estadoMenorPopulacao, Collections.min(populacao));


        System.out.println("\n------------------------------------------");
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", estadoMaiorPopulacao, Collections.max(populacao));


        System.out.println("\n------------------------------------------");
        System.out.println("Exiba a soma da população desses estados: ");
        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        /*
            também pode ser feito sem o iterator
            for (Integer integer : populacaoEstadosNE.values()) {
            soma += integer;
        }*/
        System.out.println(soma);

        System.out.println("\n------------------------------------------");
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacaoEstadosNE.size()));

        System.out.println("\n------------------------------------------");
        System.out.println("Remova os estados com a população menor que 6.000.000: ");
        populacaoEstadosNE.values().removeIf(integer -> integer < 6000000);
        /*
            feito com iterator:
            Iterator<Integer> iterator2 = populacaoEstadosNE.values().iterator();
            while (iterator2.hasNext()){
                if (iterator2.next() <- 6000000) iterator2.remove();
            }
        }*/
        System.out.println(populacaoEstadosNE);

        System.out.println("\n------------------------------------------");
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("\n------------------------------------------");
        System.out.println("Confira se a lista está vazia: " + populacaoEstadosNE.isEmpty());

    }
}
