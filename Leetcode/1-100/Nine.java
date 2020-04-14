public class Nine {

    // Initial solution;
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int newX = x;
        int revert = 0;
        while(newX != 0) {
            int digit = newX % 10;
            newX /= 10;
            revert *= 10;
            revert += digit;
        }
        return revert == x;
    }
}
