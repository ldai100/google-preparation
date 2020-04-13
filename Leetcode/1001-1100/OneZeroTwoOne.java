import java.util.Stack;

public class OneZeroTwoOne {

    // Initial on top of my head solution;
    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> helper = new Stack();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                helper.push('(');
            }
            else {
                helper.pop();
            }
            if(S.charAt(i) == '(' && helper.size() == 1 || S.charAt(i) == ')' && helper.size() == 0) {
                continue;
            }
            builder.append(S.charAt(i));
        }
        return builder.toString();
    }
}
