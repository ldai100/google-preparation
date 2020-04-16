import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoNineNine {

    // Other's solution. Analyzed and learned;
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] helper = new int[10];

        for(int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g) bulls++;
            else {
                if(helper[s - '0']++ < 0) cows++;
                if(helper[g - '0']-- > 0) cows++;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
