package Modulke14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShotestPath {
    static void shortestPath(ArrayList<ArrayList<Integer>> graph, int start, int vertices) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : graph.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        for (int i = 0; i < vertices; i++) {
            System.out.println("Distance from " + start + " to " + i + " = " + dist[i]);
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
        graph.get(3).add(4);

        shortestPath(graph, 0, vertices);
    }
}
