public class SevenTwoFour {

    // Initial solution. Perhaps we can get rid of the second helper?
    public int pivotIndex(int[] nums) {
        if(nums.length < 1) return -1;
        int[] helper = new int[nums.length + 1];
        int[] helper2 = new int[nums.length + 1];
        helper[0] = 0;
        for(int i = 1; i <= nums.length; i++) {
            helper[i] = helper[i-1] + nums[i - 1];
        }
        helper2[helper2.length - 1] = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            helper2[i] = helper2[i+1] + nums[i];
        }
        for(int i = 1; i < helper.length; i++) {
            if(helper[i - 1] == helper2[i]) {
                return i - 1;
            }
        }
        return -1;
    }
}
