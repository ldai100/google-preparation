import java.util.HashMap;
import java.util.Map;

public class FourNineSix {

    // Initial solution without hint;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> helper = new HashMap();
        for(int i = 0; i < nums2.length; i++) {
            helper.put(nums2[i], i);
        }
        for(int i = 0; i < nums1.length; i++) {
            int res = -1;
            if(helper.containsKey(nums1[i])) {
                int j = helper.get(nums1[i]);
                int cur = nums2[j];
                while(j < nums2.length) {
                    if(nums2[j] > cur) {
                        res = nums2[j];
                        break;
                    }
                    j++;
                }
            }
            nums1[i] = res;
        }
        return nums1;
    }
}
