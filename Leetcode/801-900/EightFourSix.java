import java.util.Arrays;

public class EightFourSix {

    // This is a O(1) space solution;
    // It's more efficient if we use data structure. :)
    public boolean isNStraightHand(int[] hand, int W) {
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
