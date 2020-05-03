public class ThreeSixThree {

    // Initial solution after learning the dp technical;
    public int maxSumSubmatrix(int[][] matrix, int e) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i-1][j-1];
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int l = 1; l <= m; l++) {
            for(int k = 1; k <= n; k++) {
                for(int i = 1; i <= l; i++) {
                    for(int j = 1; j <= k; j++) {
                        int sum = dp[l][k] - dp[l-i][k] - dp[l][k-j] + dp[l-i][k-j];
                        if(sum <= e) {
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
