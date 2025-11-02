class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int ans=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2 && !vis[i][j]){
                    q.add(new int[]{i,j,0});
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp=q.remove();
            int i=temp[0];
            int j=temp[1];
            int time=temp[2];
            ans=Math.max(ans,time);
            int row[]={-1,1,0,0};
            int col[]={0,0,-1,1};
            for(int k=0;k<4;k++){
                int nrow=i+row[k];
                int ncol=j+col[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    if(!vis[nrow][ncol] && grid[nrow][ncol]==1){
                        vis[nrow][ncol]=true;
                        q.add(new int[]{nrow,ncol,time+1});
                    }
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    return -1;
                }
            }
        }
        return ans;
    }
}