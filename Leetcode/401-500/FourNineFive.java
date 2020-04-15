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
}
