public class FiveFive {

    // After giving up to debug my backtracking method, I got this one even better. It made me feel really good;
    // The idea is to keep tracking the last reaching point 'end'. If itr pointer goes beyond end, we can stop early;
    // At the end, check whether or not the end pointer goes beyond the length of the array;
    public boolean canJump(int[] nums) {
        int itr = 0, end = nums[0];
        while(itr < nums.length && itr <= end) {
            end = Math.max(end, itr + nums[itr]);
            itr++;
        }
        return end >= nums.length-1;
    }
}
