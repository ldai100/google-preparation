public class TwoThreeEight {

    // help with extra space;
    public int[] productExceptSelf(int[] nums) {
        int[] le = new int[nums.length + 1];
        int[] ri = new int[nums.length + 1];
        le[0] = ri[ri.length - 1] = 1;
        for(int i = 1; i < le.length; i++) {
            le[i] = le[i-1]*nums[i-1];
            ri[ri.length - i - 1] = ri[ri.length - i]*nums[nums.length - i];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = le[i] * ri[i+1];
        }
        return nums;
    }
}
