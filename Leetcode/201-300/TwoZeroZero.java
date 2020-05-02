public class TwoZeroZero {

    // initial solution;
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    close(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void close(char[][] grid, int r, int c) {
        if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0 || grid[r][c] == '0') return;
        grid[r][c] = '0';

        close(grid, r-1, c  );
        close(grid, r+1, c);
        close(grid, r  , c-1);
        close(grid, r  , c+1);
    }
}
