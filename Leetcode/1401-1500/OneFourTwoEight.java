import java.util.List;

public class OneFourTwoEight {

    public int leftMostColumnWithOne(BinaryMatrix b) {
        List<Integer> dimensions = b.dimensions();
        int row = dimensions.get(0);
        int col = dimensions.get(1);
        int r = 0;
        int c = col - 1;
        int ans = Integer.MAX_VALUE;
        while(r < row && c >= 0 ) {
            int cur = b.get(r, c);
            if(cur == 0) {
                r++;
            }
            else {
                ans = Math.min(ans, c);
                c--;
            }
        }
        return ans == Integer.MAX_VALUE ? -1:ans;
    }
}
