package cursoRepeticao.estruturaFor;

public class dentroArray {
    public static void main(String[] args) {
        String alunos[] = {"jony", "lucas", "deda"};

        for (int i=0; i< alunos.length; i++){
            System.out.println("O aluno no indice i="+ i +" é: "+alunos[i]);
        }

        //forma abreviada:
        for (String aluno : alunos){
            System.out.println("O aluno é: "+aluno);
        }
    }
}
