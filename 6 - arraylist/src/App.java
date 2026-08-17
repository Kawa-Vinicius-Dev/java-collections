import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList <String> lista_1 = new ArrayList();
        ArrayList <String> lista_2 = new ArrayList();

        lista_1.add("red");
        lista_1.add("green");
        lista_1.add("blue");
        lista_2.add("red");
        lista_2.add("green");

        ArrayList <String> lista_3_comparacao = new ArrayList();
        for (String e :  lista_1) {
            lista_3_comparacao.add(lista_2.contains(e) ? "Yes" : "No");        }
        System.out.println(lista_3_comparacao);
    }
}
