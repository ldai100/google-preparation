import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneZeroSevenNine {

    // initial dumb solution;
    private int ans;
    public int numTilePossibilities(String tiles) {
        StringBuilder builder = new StringBuilder();
        List<Character> h = new ArrayList();
        for(int i = 0; i < tiles.length(); i++) {
            h.add(tiles.charAt(i));
        }

        Set<String> helper = new HashSet();
        ans = 0;
        backtrack(builder, h, helper);
        return ans;
    }

    private void backtrack(StringBuilder builder, List<Character> s, Set<String> helper) {
        if(s.isEmpty()) return;

        for(int i = 0; i < s.size(); i++) {
            List<Character> tmp = new ArrayList(s);
            tmp.remove(i);
            builder.append(s.get(i));
            if(!helper.contains(builder.toString())){
                ans++;
            }
            helper.add(builder.toString());
            backtrack(builder, tmp, helper);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
