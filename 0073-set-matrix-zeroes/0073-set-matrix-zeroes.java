class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix,i,m);
                    markCol(matrix,j,n);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==-214748)
                    matrix[i][j] = 0;
                }
            }
        }
        private void markRow(int[][] matrix,int i,int m)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]!=0)
                    matrix[i][j]=-214748;
            }
        }
        private void markCol(int[][] matrix,int j,int n)
        {
            for(int i=0;i<n;i++)
            {
                if(matrix[i][j]!=0)
                    matrix[i][j]=-214748;
            }
        }
}