class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, int row, int col) {
        if (idx == word.length())
            return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx))
            return false;

        char temp = board[row][col];
        board[row][col] = '#';
        boolean found = dfs(board, word, idx + 1, row + 1, col) ||
                dfs(board, word, idx + 1, row - 1, col) ||
                dfs(board, word, idx + 1, row, col + 1) ||
                dfs(board, word, idx + 1, row, col - 1);
        board[row][col] = temp;
        return found;
    }
}