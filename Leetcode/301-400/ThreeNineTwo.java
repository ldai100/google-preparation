public class ThreeNineTwo {

    // Initial Solution;
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int ptr1 = 0, ptr2 = 0;

        while(ptr1 < s.length()) {
            while(ptr2 < t.length() && s.charAt(ptr1) != t.charAt(ptr2)) {
                ptr2++;
            }
            if(ptr2 == t.length() && ptr1 < s.length()) {
                return false;
            }
            ptr1++;
            ptr2++;
        }
        return ptr1 == s.length();
    }
}
