public class TwoOneNine {

    // Brute Force solution;
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
