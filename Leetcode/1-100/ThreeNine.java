import java.util.ArrayList;
import java.util.List;

public class ThreeNine {

    // Typical backtrack solution;
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList();
        backtrack(0, 0, candidates, new ArrayList(), target);
        return ans;
    }

    private void backtrack(int index, int sum,int[] c, List<Integer> tmp, int target) {
        if(index >= c.length || sum > target) {
            return;
        }
        if(sum == target) {
            ans.add(new ArrayList(tmp));
            return;
        }
        for(int i = index; i < c.length; i++) {
            sum += c[i];
            tmp.add(c[i]);
            backtrack(i, sum, c, tmp, target);
            tmp.remove(tmp.size() - 1);
            sum -= c[i];
        }
    }
}
