package Modulke14;

import java.util.ArrayList;

public class GrapAdList {
    public static void main(String[] args) {
        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);

        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }
}


