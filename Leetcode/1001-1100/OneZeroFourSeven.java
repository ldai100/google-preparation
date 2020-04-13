import java.util.Stack;

public class OneZeroFourSeven {

    // Stack solution;
    public String removeDuplicates(String S) {
        if(S.length() == 0 || S.length() == 1) return S;
        Stack<Character> helper = new Stack();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char cur = S.charAt(i);
            if(!helper.isEmpty() && helper.peek() == cur) {
                while(!helper.isEmpty() && helper.peek() == cur) {
                    helper.pop();
                }
            }
            else {
                helper.push(cur);
            }
        }
        for(Character i : helper) {
            builder.append(i);
        }
        return builder.toString();
    }
}
