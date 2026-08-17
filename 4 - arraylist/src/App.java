//Escreva um programa em Java para
// recuperar um elemento (em um índice específico) de uma lista de arrays.

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
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
