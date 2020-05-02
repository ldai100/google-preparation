import java.util.HashSet;
import java.util.Set;

public class SevenSevenOne {

    // Initial solution;
    public int numJewelsInStones(String J, String S) {
        Set<Character> helper = new HashSet();
        for(int i = 0; i < J.length(); i++) {
            helper.add(J.charAt(i));
        }
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
            if(helper.contains(S.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
