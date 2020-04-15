public class ThreeSevenFour {

    public int myNumber = 5;
    private int guess(int n) {
        if(n == myNumber) return 0;
        if(n > myNumber) return 1;
        return -1;
    }


    // Initial solution;
    public int guessNumber(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = (left + right) >>> 1;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}
