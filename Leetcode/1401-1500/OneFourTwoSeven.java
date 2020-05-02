public class OneFourTwoSeven {

    public String stringShift(String s, int[][] shift) {
        char[] shifted = s.toCharArray();
        int left = 0;
        int right = 0;
        for(int i = 0; i < shift.length; i++) {
            if(shift[i][0] == 0) {
                left += shift[i][1];
            }
            else {
                right += shift[i][1];
            }
        }
        shift(shifted, right - left);
        return new String(shifted);
    }

    private void shift(char[] nums, int k) {
        while(k < 0) {
            k = nums.length + k;
        }
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            char prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                char temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
