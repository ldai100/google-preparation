import java.util.ArrayList;
import java.util.List;

public class SevenEightFour {

    // initial solution;
    private List<String> ans;
    public List<String> letterCasePermutation(String S) {
        ans = new ArrayList();
        StringBuilder builder = new StringBuilder();
        backtrack(builder, S, 0);
        return ans;
    }

    private void backtrack(StringBuilder builder, String S, int index) {
        if(builder.length() == S.length()) {
            ans.add(builder.toString());
            return;
        }
        char cur = S.charAt(index);
        if(Character.isDigit(cur)) {
            builder.append(cur);
            backtrack(builder, S, index+1);
        }
        else {
            builder.append(Character.toLowerCase(cur));
            backtrack(builder, S, index+1);
            builder.deleteCharAt(builder.length() - 1);
            builder.append(Character.toUpperCase(cur));
            backtrack(builder, S, index+1);
        }
        builder.deleteCharAt(builder.length() - 1);
    }
}
