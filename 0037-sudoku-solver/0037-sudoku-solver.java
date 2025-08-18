class Solution {
    public void solveSudoku(char[][] board) {
        recursion(board, 0, 0);
    }

    private boolean recursion(char[][] board, int row, int col) {
        if (row == 9)
            return true;

        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.')
            return recursion(board, nextRow, nextCol);

        for (char dig = '1'; dig <= '9'; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;
                if (recursion(board, nextRow, nextCol))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char digit) {
        //check for row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit)
                return false;
        }

        //check for col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit)
                return false;
        }

        //check for grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i <= startRow + 2; i++) {
            for (int j = startCol; j <= startCol + 2; j++) {
                if (board[i][j] == digit)
                    return false;
            }
        }
        return true;
    }
}