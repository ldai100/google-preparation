import java.util.Arrays;

public class OneTwoNineSix {

    // The solution is the same as the other one problem 846;
    public boolean isPossibleDivide(int[] hand, int W) {
        if(hand.length % W != 0) return false;
        Arrays.sort(hand);
        for(int i = 0; i < hand.length; i++) {
            int cur = hand[i];
            if(cur == -1) continue;
            int count = 1;
            int ptr = i + 1;
            while(count < W && ptr < hand.length) {
                if(hand[ptr] == cur + count) {
                    hand[ptr] = -1;
                    count++;
                }
                ptr++;
            }
            if(count != W) return false;
        }
        return true;
    }
}
