public class OneFour {

    // Initial solution;
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1) return "";
        StringBuilder builder = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        int ptr1 = 0;

        search:
        while(ptr1 < minLength) {
            char cur = strs[0].charAt(ptr1);
            for(int i = 1; i < strs.length; i++) {
                if(strs[i].charAt(ptr1) != cur) {
                    break search;
                }
            }
            builder.append(cur);
            ptr1++;
        }
        return builder.toString();
    }
}
