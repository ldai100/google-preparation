import java.util.LinkedList;
import java.util.Queue;

public class ThreeSixTwo {

    Queue<Integer> helper;
    /** Initialize your data structure here. */

    // This is a initial solution that does not save space at all;
    public ThreeSixTwo() {
        helper = new LinkedList();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        helper.add(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while(!helper.isEmpty() && timestamp - 300 >= helper.peek()) {
            helper.poll();
        }
        return helper.size();
    }
}
