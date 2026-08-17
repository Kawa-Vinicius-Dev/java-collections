//Escreva um programa em Java para
//atualizar um elemento de um array com o elemento fornecido.
import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("orange");
        list.add("purple");
        list.add("yellow");

        System.out.println(list);
        list.set(2,"white");
        System.out.println(list);
    }

}
