//Escreva um programa em Java para inserir um elemento na primeira
// posição de uma lista (array list).

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
        System.out.println(list.toString());
        list.addFirst("white");
        System.out.println(list.toString());
    }
}
