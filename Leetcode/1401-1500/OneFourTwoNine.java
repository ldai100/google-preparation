import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class OneFourTwoNine {

    Map<Integer, Integer> uniques = new HashMap();
    Queue<Integer> lastU = new LinkedList();

    public OneFourTwoNine(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            uniques.put(nums[i], uniques.getOrDefault(nums[i], 0) + 1);
            lastU.add(nums[i]);
        }
    }

    public int showFirstUnique() {
        while(!lastU.isEmpty() && uniques.get(lastU.peek()) != 1 ) {
            lastU.poll();
        }
        return lastU.isEmpty() ? -1:lastU.peek();
    }

    public void add(int value) {
        uniques.put(value, uniques.getOrDefault(value, 0) + 1);
        lastU.add(value);
    }
}
