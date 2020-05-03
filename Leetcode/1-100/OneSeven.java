import java.util.*;

public class OneSeven {

    // Initial solution using backtrack template;
    private List<String> ans;
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList();
        if(digits.length() == 0) return ans;
        Map<Character, List<Character>> helper = new HashMap();
        helper.put('2', Arrays.asList('a','b','c'));
        helper.put('3', Arrays.asList('d','e','f'));
        helper.put('4', Arrays.asList('g','h','i'));
        helper.put('5', Arrays.asList('j','k','l'));
        helper.put('6', Arrays.asList('m','n','o'));
        helper.put('7', Arrays.asList('p','q','r','s'));
        helper.put('8', Arrays.asList('t','u','v'));
        helper.put('9', Arrays.asList('w','x','y','z'));

        StringBuilder builder = new StringBuilder();
        backtrack(builder, helper, 0, digits);
        return ans;
    }

    private void backtrack(StringBuilder builder, Map<Character, List<Character>> helper, int index, String d) {
        if(builder.length() == d.length()) {
            ans.add(builder.toString());
            return;
        }

        for(Character cur: helper.get(d.charAt(index))) {
            builder.append(cur);
            backtrack(builder, helper, index + 1, d);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
