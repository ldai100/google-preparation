import java.util.Arrays;

public class OneOneSevenZero {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] q = new int[queries.length];
        int[] w = new int[words.length];

        for(int i = 0; i < q.length; i++) {
            char[] temp = queries[i].toCharArray();
            Arrays.sort(temp);
            int min = 1;
            for(int j = 1; j < temp.length; j++) {
                if(temp[j] != temp[j-1]) break;
                min++;
            }
            q[i] = min;
        }

        for(int i = 0; i < w.length; i++) {
            char[] temp = words[i].toCharArray();
            Arrays.sort(temp);
            int min = 1;
            for(int j = 1; j < temp.length; j++) {
                if(temp[j] != temp[j-1]) break;
                min++;
            }
            w[i] = min;
        }
        Arrays.fill(ans, 0);
        for(int i = 0; i < q.length; i++) {
            for(int j = 0; j < w.length; j++) {
                if(q[i] < w[j]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

}
