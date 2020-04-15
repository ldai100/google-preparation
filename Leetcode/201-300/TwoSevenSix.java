public class TwoSevenSix {

    // Dynamic programming solution;
    public int numWays(int n, int k) {
        if (n == 0) return 0;
        if (n == 1) return k;
        if (n == 2) return k*k;

        int table[] = new int[n];
        table[0] = k;
        table[1] = k*k;
        for (int i = 2; i < n; i++) {
            table[i] = (table[i-1] + table[i-2]) * (k-1);
        }
        return table[n - 1];
    }
}
