import java.util.HashMap;
import java.util.Map;

public class NineOneFour {

    // Initial solution with gcd;
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2) return false;
        Map<Integer, Integer> helper = new HashMap();
        for(int i = 0; i < deck.length; i++) {
            helper.put(deck[i], helper.getOrDefault(deck[i], 0) + 1);
        }
        int gcd = -1;
        for(Integer key: helper.keySet()) {
            if(gcd == -1) {
                gcd = helper.get(key);
            }
            else {
                gcd = gcd(gcd, helper.get(key));
            }
        }
        return gcd > 1;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y: gcd(y%x, x);
    }
}
