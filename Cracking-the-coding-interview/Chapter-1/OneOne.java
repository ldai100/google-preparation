import java.util.HashSet;
import java.util.Set;

public class OneOne {

    // test all characters are unique
    public boolean solution1(String input) {
        Set<Character> helper = new HashSet<>();
        for(int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            if(helper.contains(cur)) {
                return false;
            }
            helper.add(cur);
        }
        return true;
    }

    // without data structure
    public boolean solution2(String input) {
        for(int i = 0; i < input.length() - 1; i ++) {
            for(int j = i; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)) return false;
            }
        }
        return true;
    }

}
