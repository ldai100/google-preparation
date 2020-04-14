public class FiveFiveOne {

    // Initial Solution;
    public boolean checkRecord(String s) {
        int abs = 0;
        int countL = 0;
        int maxL = 0;
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if(cur == 'A') {
                abs++;
                countL = 0;
            }
            else if(cur == 'L') {
                countL++;
                maxL = Math.max(maxL, countL);
            }
            else {
                countL = 0;
            }
        }
        return abs <= 1 && maxL <= 2;
    }
}
