import java.util.HashMap;
import java.util.Map;

public class ThreeTwoFive {

    // Brute Force
    public int maxSubArrayLen(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    // Linear Time
    public int maxSubArrayLen2(int[] nums, int k) {
        Map<Integer, Integer> helper = new HashMap();
        int sum = 0;
        int ans = 0;
        helper.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, i - helper.getOrDefault(sum - k, i));
            helper.putIfAbsent(sum, i);
        }
        return ans;
    }

}
