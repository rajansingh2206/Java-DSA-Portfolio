class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int total=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(grid,vis,i,j,m,n);
                    total++;
                }
            }
        }
        return total;
    }
    private void dfs(char[][] grid,boolean vis[][],int i,int j,int m,int n){

        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j]!='1')
            return;

        vis[i][j]=true;
        dfs(grid,vis,i-1,j,m,n);
        dfs(grid,vis,i+1,j,m,n);
        dfs(grid,vis,i,j-1,m,n);
        dfs(grid,vis,i,j+1,m,n);
    }
}