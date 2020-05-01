import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourFourTwo {

    // Initial solution with extra space;
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> helper = new HashSet();
        List<Integer> ans = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(helper.contains(nums[i])) {
                ans.add(nums[i]);
            }
            helper.add(nums[i]);
        }
        return ans;
    }
}
