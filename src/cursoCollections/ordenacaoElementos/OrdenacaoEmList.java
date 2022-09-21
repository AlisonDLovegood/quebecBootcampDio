package cursoCollections.ordenacaoElementos;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoEmList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(Comparator.comparing(Gato::getNome));

        //a list sempre condiciona na ordem de inserção
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        //nao existe dentro da class list mesmo, mas existe na classe colections
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //como na class double foi utilizado o comparable, em outra situação, nesse caso também será usado mas os
        //gatos serao comparados pelos nomes {adiciona o comparable<gato> na class gato}
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //como vamos utilizar o comparator, conseguimos passar o sort com a lista, sem usar o collection
        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    //construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //por estar private precisa utilizar o get
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //se nao sobrescrever o tostring, sera impresso o endereço de memoria ao inves dos nomes
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //metodo implementado para completar o comparable que me obriga a escrever o compareto
    @Override
    //retorna um int e é isso que organizará a ordem
    public int compareTo(Gato gato) {
        //para trabalhar na comparacao de string utiliza o ignosecase que retorna um int de forma a ser organizado
        //se baseia em comparar duas coisas """"ordem natural"""""""
        //0 = sao strings iguais, 1 = é maior, então fica depois, -1 = é menor, então fica antes
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    //me obriga a implementar o metodo compare e informar o que estou comparando, nesse caso os gatos
    @Override
    public int compare(Gato g1, Gato g2) {
        //fazendo a comparacao com integer, forma semelhando de como foi feito com string mais acima do codigo
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}
