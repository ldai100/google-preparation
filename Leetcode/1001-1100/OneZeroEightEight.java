import java.util.HashMap;
import java.util.Map;

public class OneZeroEightEight {

    // {0, 1, 6, 8, 9}
    private Map<Integer, Integer> helper = new HashMap();
    private int ans = 0;

    // initial solution. This solution uses long to take care of edge cases which might not be ideal.
    public int confusingNumberII(int N) {
        helper.put(0, 0);
        helper.put(1, 1);
        helper.put(6, 9);
        helper.put(8, 8);
        helper.put(9, 6);

        for(Integer i : helper.keySet()) {
            if( i != 0) {
                backtrack(i, helper, N);
            }
        }
        return ans;
    }

    private void backtrack(long i, Map<Integer, Integer> helper, int N) {
        if(i <= N && isConfusing(i)) {
            ans++;
        }
        else if(i > N || i == 0){
            return;
        }
        for(Integer j: helper.keySet()) {
            if(i*10 + j > N) break;
            backtrack(i*10 + j, helper, N);
        }
    }

    private boolean isConfusing(long input) {
        long res = 0;
        long dup = input;
        while(input != 0) {
            long cur = input % 10;
            res *= 10;
            if(!helper.containsKey((int) cur)) {
                return false;
            }
            res += helper.get((int)cur);
            input /= 10;
        }
        return res != dup;
    }
}
