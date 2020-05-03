public class FiveTwoSix {

    // Initial solution;
    private int ans;
    public int countArrangement(int N) {
        ans = 0;
        boolean[] helper = new boolean[N+1];
        backtrack(helper, 1, N);
        return ans;
    }

    private void backtrack(boolean[] helper, int index, int N) {
        if(index == N+1) {
            ans++;
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(!helper[i] && (index % i == 0 || i % index == 0)) {
                helper[i] = true;
                backtrack(helper, index+1, N);
                helper[i] = false;
            }
        }

    }
}
