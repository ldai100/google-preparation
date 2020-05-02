public class OneTwoNineTwo {

    // After 2 hours of debugging, finally came out a solution that's not very fast. :(
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i+1][j+1] = dp[i+1][j] + dp[i][j+1] - dp[i][j] + mat[i][j];
            }
        }
        for(int k = Math.min(m, n) - 1; k > 0; k--){
            for(int i = 1; i + k <= m; i++) {
                for(int j = 1; j + k <= n; j++) {
                    if(dp[i+k][j+k] - dp[i+k][j-1] - dp[i-1][j+k] + dp[i-1][j-1] <= threshold) {
                        return k + 1;
                    }
                }
            }
        }
        return 0;
    }
}
