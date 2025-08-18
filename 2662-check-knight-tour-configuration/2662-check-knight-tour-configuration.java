class Solution {
    public boolean checkValidGrid(int[][] grid) {
        // return isValid(grid, grid.length, 0, 0, 0);
        int n=grid.length;
        int pos[][]=new int[n*n][2];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                pos[grid[i][j]]=new int[]{ i , j};
            }
        }
        if(pos[0][0]!=0 || pos[0][1]!=0)
            return false;
        
        for(int i=1;i<n*n;i++)
        {
            int r1=pos[i-1][0], c1=pos[i-1][1];
            int r2=pos[i][0], c2=pos[i][1];

            int rowDiff=Math.abs(r1-r2), colDiff=Math.abs(c1-c2);

            if( !((rowDiff==2 && colDiff==1) || (rowDiff==1 && colDiff==2)) )
                return false;
        }
        return true;
    }

    // private boolean isValid(int[][] grid, int n, int row, int col, int expVal) {
    //     if (row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != expVal)
    //         return false;

    //     if (grid[row][col] == n * n - 1)
    //         return true;

    //     boolean ans1 = isValid(grid, n, row - 2, col + 1, expVal + 1);
    //     boolean ans2 = isValid(grid, n, row - 1, col + 2, expVal + 1);
    //     boolean ans3 = isValid(grid, n, row + 1, col + 2, expVal + 1);
    //     boolean ans4 = isValid(grid, n, row + 2, col + 1, expVal + 1);
    //     boolean ans5 = isValid(grid, n, row + 2, col - 1, expVal + 1);
    //     boolean ans6 = isValid(grid, n, row + 1, col - 2, expVal + 1);
    //     boolean ans7 = isValid(grid, n, row - 1, col - 2, expVal + 1);
    //     boolean ans8 = isValid(grid, n, row - 2, col - 1, expVal + 1);

    //     return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    // }
}