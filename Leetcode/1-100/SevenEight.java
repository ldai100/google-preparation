import java.util.ArrayList;
import java.util.List;

public class SevenEight {

    // optimized backtrack solution;
    List<List<Integer>> ans = new ArrayList();
    private int length;

    public List<List<Integer>> subsets(int[] nums) {
        for(length = 0; length <= nums.length; length++) {
            backtrack(nums, 0, new ArrayList());
        }
        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> tmp) {
        if(tmp.size() == length) {
            ans.add(new ArrayList(tmp));
            return;
        }

        for(int i = index; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtrack(nums, i+1, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
