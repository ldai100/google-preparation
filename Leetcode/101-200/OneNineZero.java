public class OneNineZero {

    // initial solution;
    public int reverseBits(int n) {
        boolean negative = n < 0;
        int ans = 0;
        for(int i = 0; i < 31; i++) {
            if((n & 1) == 1){
                ans++;
            }
            ans = ans << 1;
            n = n >> 1;
        }
        return ans = negative ? ans+1: ans;
    }
}
