import java.util.HashMap;
import java.util.Map;

public class OneZeroFiveSix {

    // Initial solution;
    public boolean confusingNumber(int N) {
        Map<Integer, Integer> helper = new HashMap();
        helper.put(0,0);
        helper.put(1,1);
        helper.put(6,9);
        helper.put(8,8);
        helper.put(9,6);

        int n = N;
        int newN = 0;
        // attemp to convert;
        while(n != 0) {
            int digit = n % 10;
            if(!helper.containsKey(digit)) return false;
            n = n/10;
            newN = newN * 10;
            newN += helper.get(digit);
        }
        return newN != N;
    }
}
