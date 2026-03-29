package Modulke14;

import java.util.ArrayList;

public class TraverseGrap {
    static void traverse(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                traverse(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        boolean[] visited = new boolean[vertices];
        int startNode = 0;

        System.out.print("Traversal from node " + startNode + ": ");
        traverse(graph, startNode, visited);
    }

}
