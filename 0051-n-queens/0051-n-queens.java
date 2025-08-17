class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String> board=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<n;i++)
            board.add(".".repeat(n));
        backtracking(n,0,board,res);
        return res;
    }
    private void backtracking(int n,int rowNo,List<String> board,List<List<String>> res)
    {
        if(rowNo==n)
        {
            res.add(new ArrayList<>(board));
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(n,board,rowNo,j))
            {
                StringBuffer sb=new StringBuffer(board.get(rowNo));
                sb.setCharAt(j,'Q');
                board.set(rowNo,sb.toString());
                backtracking(n,rowNo+1,board,res);
                sb.setCharAt(j,'.');
                board.set(rowNo,sb.toString());
            }
        }
        
    }
    private boolean isSafe(int n,List<String> board,int row,int col)
    {
        for(int j=row-1;j>=0;j--)
        {
            if(board.get(j).charAt(col)=='Q')
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board.get(i).charAt(j)=='Q')
                return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++)
        {
            if(board.get(i).charAt(j)=='Q')
                return false;
        }
        return true;
    }
}