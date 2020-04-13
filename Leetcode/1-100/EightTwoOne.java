import java.util.ArrayList;
import java.util.List;

public class EightTwoOne {

    // Initial solution;
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        List<Integer> helper = new ArrayList();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == C) {
                helper.add(i);
            }
        }
        for(int i = 0; i < S.length(); i++) {
            int min = Integer.MAX_VALUE;
            for(Integer j: helper) {
                min = Math.min(min, Math.abs(i - j));
            }
            ans[i] = min;
        }
        return ans;
    }
}
