public class FirstBadVersion {

    // this is dummy so I don't get errors in my code;
    private boolean isBadVersion(int v) {
        return false;
    }

    // Initial binary search solution;
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while(lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if(isBadVersion(mi)) {
                hi = mi;
            }
            else {
                lo = mi + 1;
            }
        }
        return isBadVersion(lo) ? lo:hi;
    }
}
