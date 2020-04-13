import java.util.HashMap;
import java.util.Map;

public class OneSixNine {

    // Initial solution;
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> helper = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            helper.put(nums[i], helper.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: helper.entrySet()) {
            if(entry.getValue() > nums.length/2) {
                return Integer.valueOf(entry.getKey());
            }
        }
        return -1;
    }

}
