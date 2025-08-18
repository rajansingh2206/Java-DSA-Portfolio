class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid, grid.length, 0, 0, 0);
    }

    private boolean isValid(int[][] grid, int n, int row, int col, int expVal) {
        if (row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != expVal)
            return false;

        if (grid[row][col] == n * n - 1)
            return true;

        boolean ans1 = isValid(grid, n, row - 2, col + 1, expVal + 1);
        boolean ans2 = isValid(grid, n, row - 1, col + 2, expVal + 1);
        boolean ans3 = isValid(grid, n, row + 1, col + 2, expVal + 1);
        boolean ans4 = isValid(grid, n, row + 2, col + 1, expVal + 1);
        boolean ans5 = isValid(grid, n, row + 2, col - 1, expVal + 1);
        boolean ans6 = isValid(grid, n, row + 1, col - 2, expVal + 1);
        boolean ans7 = isValid(grid, n, row - 1, col - 2, expVal + 1);
        boolean ans8 = isValid(grid, n, row - 2, col - 1, expVal + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
}