package Modulke14;

import java.util.ArrayList;

public class PrintNigbors {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(0).add(3);

        int node = 0;

        System.out.println("Neighbors of node " + node + ":");
        for (int neighbor : graph.get(node)) {
            System.out.print(neighbor + " ");
        }
    }
}

