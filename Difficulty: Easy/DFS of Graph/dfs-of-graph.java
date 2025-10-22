import java.util.*;

class Solution {
  
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfsHelper(0, adj, visited, result);
        return result;
    }
    
    private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj,
                           boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node); // ✅ Add the node when visiting
        
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) { // ✅ Use the correct variable name
                dfsHelper(neighbour, adj, visited, result);
            }
        }
    }
}
