public class TwoZeroOne {

    // hinted solution. Original solution timed out. :(
    public int rangeBitwiseAnd(int m, int n) {
        int shifts = 0;
        while(m != n) {
            m = m >> 1;
            n = n >> 1;
            shifts++;
        }
        while(shifts > 0) {
            m = m << 1;
            shifts--;
        }
        return m;
    }
}
