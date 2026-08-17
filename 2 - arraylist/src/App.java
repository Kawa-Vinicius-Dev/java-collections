//Escreva um programa em Java para
//iterar por todos os elementos de uma lista (array list).

import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("purple");
        list.add("orange");

        list.forEach(System.out::println);
        System.out.println("=========");
        System.out.println("Outro modo: ");

        for (String s : list) { //string s = 0; list.syze(); s++
            System.out.println(s);
        }

    }
}
