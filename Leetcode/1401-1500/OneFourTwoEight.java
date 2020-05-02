import java.util.ArrayList;
import java.util.List;

public class OneFourTwoEight {

    // I only added this so I don't have to see red errors...
    class BinaryMatrix {
        public List<Integer> dimensions() {
            return new ArrayList();
        }

        public int get(int r, int c){
            return 0;
        }

    }

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
