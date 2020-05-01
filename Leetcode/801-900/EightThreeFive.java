public class EightThreeFive {

    // Initial solution. The idea is simple, but implementation could be tricky;
    public int largestOverlap(int[][] A, int[][] B) {
        int max = 0;
        for(int i = A.length - 1; i >= 0; i--) {
            for(int j = B.length -1; j >= 0; j--) {
                int sum1 = 0, sum2 = 0;
                for(int k = 0; i + k < A.length; k++) {
                    for(int l = 0; l + j < A.length; l++) {
                        sum1 += A[i+k][l+j] & B[k][l];
                        sum2 += B[i+k][l+j] & A[k][l];
                    }
                }
                max = Math.max(max,Math.max(sum1, sum2));
            }
        }
        return max;
    }
}
