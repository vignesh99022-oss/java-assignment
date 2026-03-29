package Modulke14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartedGrap {
    static boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int vertices) {
        int[] color = new int[vertices];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    for (int neighbor : graph.get(node)) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            q.add(neighbor);
                        } else if (color[neighbor] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
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

        graph.get(3).add(0);
        graph.get(0).add(3);

        if (isBipartite(graph, vertices))
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is Not Bipartite");
    }

}
