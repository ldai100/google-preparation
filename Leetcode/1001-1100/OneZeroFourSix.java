import java.util.Collections;
import java.util.PriorityQueue;

public class OneZeroFourSix {
    // Initial solution;
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> helper = new PriorityQueue(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++) {
            helper.add(stones[i]);
        }

        while(helper.size() > 1) {
            int first = helper.poll();
            int second = helper.poll();
            if( (first^second) != 0) {
                helper.add(first - second);
            }
        }
        return helper.size() == 0 ? 0:helper.poll();
    }
}
