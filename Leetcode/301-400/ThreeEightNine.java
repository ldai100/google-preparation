import java.util.HashMap;
import java.util.Map;

public class ThreeEightNine {

    // Initial solution with 2 maps;
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> SH = new HashMap();
        Map<Character, Integer> TH = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            SH.put(s.charAt(i), SH.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int j = 0; j < t.length(); j++) {
            TH.put(t.charAt(j), TH.getOrDefault(t.charAt(j), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            if(SH.get(t.charAt(i)) != TH.get(t.charAt(i))) {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
