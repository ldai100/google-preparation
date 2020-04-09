import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OneTwo {

    // Without data structure;
    public boolean isPermutation1(String input1, String input2) {
        if(input1.length() != input2.length()) return false;
        char[] i1 = input1.toCharArray();
        char[] i2 = input2.toCharArray();
        Arrays.sort(i1);
        Arrays.sort(i2);
        for(int i = 0; i < i1.length; i++) {
            if(i1[i] != i2[i]) return false;
        }
        return true;
    }

    // With data structure;
    public boolean isPermutation2(String input1, String input2) {
        if(input1.length() != input2.length()) return false;
        int[] helper = new int[26];
        for(int i = 0; i < input1.length(); i++) {
            helper[input1.charAt(i) - 'a']++;
            helper[input2.charAt(i) - 'a']--;
        }
        // everything is 0; The code is shorter, however, it's faster if we write 2 loops and return false right away
        // at the second loop;
        return Arrays.stream(helper).allMatch(s -> s == 0);
    }

}
