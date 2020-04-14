import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SevenTwoZero {

    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> helper = new HashSet();
        String ans = "";
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == 1 || helper.contains(words[i].substring(0, words[i].length() - 1))) {
                ans = words[i].length() > ans.length() ? words[i]: ans;
                helper.add(words[i]);
            }
        }
        return ans;
    }

}
