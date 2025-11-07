class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 0)
            return res;
        if (n == 1) {
            res.add(0);
            return res;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int src = e[0];
            int dest = e[1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }

        int degree[] = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            degree[i] = adj.get(i).size();
            if (degree[i] == 1)
                q.offer(i);
        }

        int remaining = n;
        while (remaining > 2) {
            int size = q.size();
            remaining = remaining - size;
            for (int i = 0; i < size; i++) {
                int leaf = q.poll();
                for (int neighbor : adj.get(leaf)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1)
                        q.offer(neighbor);
                }
            }
        }

        while (!q.isEmpty()) {
            res.add(q.poll());
        }
        return res;

    }
}