import java.util.ArrayList;
import java.util.List;

public class OneOneEight {

    // Initial solution using dynamic programming;
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        if(numRows == 0) return ans;

        // build base case;
        List<Integer> firstRow = new ArrayList();
        firstRow.add(1);
        ans.add(firstRow);

        for(int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList();
            List<Integer> prev = ans.get(i-1);

            // add to first item;
            row.add(1);
            // build everything in between;
            for(int j = 1; j < prev.size(); j++) {
                row.add(prev.get(j) + prev.get(j-1));
            }
            // add to last item;
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}
