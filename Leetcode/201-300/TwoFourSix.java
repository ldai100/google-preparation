import java.util.HashMap;
import java.util.Map;

public class TwoFourSix {

    // Initial solution;
    public boolean isStrobogrammatic(String num) {
        if(num.length() == 0) return true;
        Map<Character, Character> helper = new HashMap();
        helper.put('0', '0');
        helper.put('1', '1');
        helper.put('6', '9');
        helper.put('9', '6');
        helper.put('8', '8');

        StringBuilder builder = new StringBuilder();
        for(int i = num.length() - 1; i >= 0; i--) {
            char cur = num.charAt(i);
            if(!helper.containsKey(cur)) return false;
            builder.append(helper.get(cur));
        }
        return builder.toString().equals(num);
    }
}
