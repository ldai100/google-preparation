public class FourNineFive {

    // a very stupid brute force way;
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1; i < s.length()/2 + 1; i++) {
            String sub = s.substring(0, i);
            String ans = sub;
            while(ans.length() < s.length()) {
                ans += sub;
            }
            if(ans.equals(s)) {
                return true;
            }
        }
        return false;
    }

    // second version after using modulo and string builder. speed went up 90%;
    public boolean repeatedSubstringPattern2(String s) {
        for(int i = 1; i < s.length()/2 + 1; i++) {
            String sub = s.substring(0, i);
            StringBuilder builder = new StringBuilder();
            builder.append(sub);
            while(s.length() % i == 0 && builder.length() < s.length()) {
                builder.append(sub);
            }
            if(builder.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
