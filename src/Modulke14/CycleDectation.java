package Modulke14;

import java.util.ArrayList;

public class CycleDectation {
    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, visited, node)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(1);
        graph.get(1).add(3);

        boolean[] visited = new boolean[vertices];
        boolean hasCycle = false;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(graph, i, visited, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle)
            System.out.println("Graph has cycle");
        else
            System.out.println("Graph has no cycle");
    }
}

