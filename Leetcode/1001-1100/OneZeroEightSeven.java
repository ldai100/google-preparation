import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneZeroEightSeven {

    List<String> tmpAns;

    // Initial solution without any hints;
    public String[] expand(String S) {
        List<String[]> helper = new ArrayList();
        tmpAns = new ArrayList();
        // pre-process;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '{') {
                int k = i;
                while(S.charAt(k) != '}') {
                    k++;
                }
                String [] tmp = S.substring(i + 1, k).split(",");
                Arrays.sort(tmp);
                helper.add(tmp);
                i = k;
            }
            else {
                helper.add(new String[] {Character.toString(S.charAt(i))});
            }
        }

        StringBuilder builder = new StringBuilder();
        backtrack(builder, helper, 0);

        return tmpAns.toArray(new String[0]);
    }

    private void backtrack(StringBuilder builder, List<String[]> helper, int index) {
        if(builder.length() == helper.size()) {
            tmpAns.add(builder.toString());
            return;
        }
        for(String cur: helper.get(index)) {
            builder.append(cur);
            backtrack(builder, helper, index + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
