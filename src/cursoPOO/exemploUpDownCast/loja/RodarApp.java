package cursoPOO.exemploUpDownCast.loja;

public class RodarApp {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
//        proximas 3 linhas de upcasts implicitos
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
//        downcast, ele dará erro por haver valores no objeto e n na classe q esta tentando ser encaixado, downcasts devem ser evitados
        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}
