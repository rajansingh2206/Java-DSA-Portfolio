class Solution {
    boolean vis[];
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
        int n=edges.length;
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int []edge:edges){
            int src=edge[0];
            int dest=edge[1];
            vis=new boolean[n+1];
            if(dfs(src,dest,-1,adjList)){
                return edge;
            }
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
        return new int[0];
    }
    private boolean dfs(int src,int dest,int parent,List<List<Integer>> adjList){

        if(src==dest)
            return true;
        vis[src]=true;
        for(int neighbor:adjList.get(src)){
            if(!vis[neighbor])
                if(dfs(neighbor,dest,src,adjList))
                    return true;
        }

        return false;
    }
}