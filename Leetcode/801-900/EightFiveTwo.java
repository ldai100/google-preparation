public class EightFiveTwo {

    // Linear Solution, O(n)
    public int peakIndexInMountainArray(int[] A) {
        int ans = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i] <= A[i-1]) {
                return ans = i-1;
            }
        }
        return A[A.length - 1];
    }

    // Binary Search, O(log n)
    public int peakIndexInMountainArray2(int[] A) {
        int left = 0, right = A.length - 1;
        while(left < right) {
            int mid = (left + right) >> 1;
            if(A[mid] < A[mid+1]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

}
