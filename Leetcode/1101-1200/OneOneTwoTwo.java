import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class OneOneTwoTwo {

    // Not optimized initial solution;
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> helper = new HashMap();
        PriorityQueue<Integer> notUsed = new PriorityQueue();
        for(int i = 0; i < arr2.length; i++) {
            helper.put(arr2[i], 0);
        }
        for(int i = 0; i < arr1.length; i++) {
            if(!helper.containsKey(arr1[i])) {
                notUsed.add(arr1[i]);
            }
            else {
                helper.put(arr1[i], helper.get(arr1[i]) + 1);
            }
        }
        int index = 0;
        for(int i = 0; i < arr2.length; i++) {
            while(helper.get(arr2[i]) != 0) {
                arr1[index] = arr2[i];
                index++;
                helper.put(arr2[i], helper.get(arr2[i]) - 1);
            }
        }
        while(index < arr1.length) {
            arr1[index] = notUsed.poll();
            index++;
        }
        return arr1;
    }
}
