import java.util.ArrayList;
import java.util.List;

public class OneSixThree {

    // This problem isn't hard, but very tedious to make our code pretty because of the edge cases;
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ans = new ArrayList();
        for(int i: nums) {
            if(i > lower) {
                ans.add(lower + ((i - 1 > lower) ? "->" + (i-1) : ""));
            }
            if(i == upper) {
                return ans;
            }
            lower = i + 1;
        }
        if(lower <= upper) {
            ans.add(lower + ((upper > lower) ? "->" + upper: ""));
        }
        return ans;
    }
}
