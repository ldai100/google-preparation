import java.util.HashSet;
import java.util.Set;

public class NineFourNine {

    // Initial dumb solution;
    public String largestTimeFromDigits(int[] A) {
        int ans = -1;

        Set<Integer> helper = new HashSet();
        // Choose different indices i, j, k, l as a permutation of 0, 1, 2, 3
        for (int i = 0; i < 4; ++i) {
            helper.add(i);
            for (int j = 0; j < 4; ++j) {
                if(!helper.contains(j)) {
                    helper.add(j);
                    for (int k = 0; k < 4; ++k) {
                        if(!helper.contains(k)) {
                            helper.add(k);
                            for(int l = 0; l < 4; l++) {
                                if(!helper.contains(l)) {
                                    int hours = 10 * A[i] + A[j];
                                    int mins = 10 * A[k] + A[l];
                                    if (hours < 24 && mins < 60)
                                        ans = Math.max(ans, hours * 60 + mins);
                                }
                            }
                            helper.remove(k);
                        }
                    }
                    helper.remove(j);
                }
            }
            helper.remove(i);
        }
        return ans >= 0 ? String.format("%02d:%02d", ans / 60, ans % 60) : "";
    }
}
