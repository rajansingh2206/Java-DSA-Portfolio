class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=m-1;
        List<Integer> ans=new ArrayList<>();
        while(sr<=er && sc<=ec){

            //top
            for(int j=sc;j<=ec;j++)
                ans.add(matrix[sr][j]);

            //right
            for(int i=sr+1;i<=er;i++)
                ans.add(matrix[i][ec]);

            //bottom
            for(int j=ec-1;j>=sc;j--)
            {
                if(sr==er)
                    break;
                ans.add(matrix[er][j]);   
            }

            //left
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)
                    break;
                ans.add(matrix[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return ans;
    }
}