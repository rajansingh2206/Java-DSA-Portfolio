class Solution {
    boolean vis[][];

    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private void bfs(int row,int col,char[][] grid,int n,int m){
        vis[row][col]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty()){
        Pair pair=q.remove();
        int newRow=pair.first;
        int newCol=pair.second;
            for(int k=0;k<4;k++){
                int nRow=newRow+dr[k];
                int nCol=newCol+dc[k];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && vis[nRow][nCol]==false && grid[nRow][nCol]=='1'){
                    q.add(new Pair(nRow,nCol));
                    vis[nRow][nCol]=true;
                }
            }
    }
       
}

    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    count++;
                    bfs(i,j,grid,n,m);
                }
            }
        }
        return count;
    }
}