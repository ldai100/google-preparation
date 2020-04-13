import java.util.HashSet;
import java.util.Set;

public class ThreeFourNine {

    // Two sets O(n);
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> helper = new HashSet();
        Set<Integer> ans = new HashSet();
        for(int i = 0; i < nums1.length; i++ ) {
            helper.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++ ) {
            if(helper.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }

}
