package cursoPOO.exemploUpDownCast.familia;

public class RodarApp {

    public static void main(String[] args) {

        Mom[] classes = new Mom[]{new Son(), new Daughter(), new Mom()};

        for (Mom classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (Mom classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

//        sobrescrita pura
        Daughter Daughter = new Daughter();
        Daughter.metodo2();

    }
}