class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        int[][] pos = new int[n * n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pos[grid[i][j]] = new int[] { i, j };
            }
        }

        if (pos[0][0] != 0 || pos[0][1] != 0)
            return false;

        for (int i = 1; i < n * n; i++) {
            int r1 = pos[i - 1][0], c1 = pos[i - 1][1];
            int r2 = pos[i][0], c2 = pos[i][1];

            int rowDiff = Math.abs(r1 - r2), colDiff = Math.abs(c1 - c2);

            if (!((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)))
                return false;
        }
        return true;
    }
}