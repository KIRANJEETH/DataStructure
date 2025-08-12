package nonlinear;

import java.util.*;

public class BreathFirstSearch {
    public static void main(String[] args) {
        char[] nodes = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int n = nodes.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(nodes[i], i);
        int[][] matrix = new int[n][n];
        addEdge(matrix, map, 'a', 'b');
        addEdge(matrix, map, 'a', 'c');
        addEdge(matrix, map, 'b', 'e');
        addEdge(matrix, map, 'b', 'd');
        addEdge(matrix, map, 'd', 'f');
        addEdge(matrix, map, 'e', 'g');
        System.out.println("Adjacency Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("\nBFS Traversal from 'a':");
        bfs(matrix, map.get('a'), nodes);
    }
    static void addEdge(int[][] mat, Map<Character, Integer> map, char src, char dest) {
        mat[map.get(src)][map.get(dest)] = 1;
    }
    static void bfs(int[][] matrix, int start, char[] nodes) {
        boolean[] visited = new boolean[nodes.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(nodes[node] + " ");           
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
