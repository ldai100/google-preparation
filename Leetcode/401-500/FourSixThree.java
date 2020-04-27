public class FourSixThree {

    // It could be optimized since knowing there's only 1 island, we might not have to traverse all elements;
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    ans += countSide(grid, i, j);
                }
            }
        }
        return ans;
    }

    private int countSide(int[][] grid, int r, int c) {
        int total = 0;
        if(r - 1 < 0 || grid[r-1][c] == 0) total++;
        if(c - 1 < 0 || grid[r][c-1] == 0) total++;
        if(r + 1 >= grid.length || grid[r+1][c] == 0) total++;
        if(c + 1 >= grid[r].length || grid[r][c+1] == 0) total++;
        return total;
    }
}
