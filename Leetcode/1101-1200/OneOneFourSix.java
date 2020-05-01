import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OneOneFourSix {


    // Initial solution;
    Map<Integer, TreeMap<Integer, Integer>> content;
    int snapC;

    public OneOneFourSix(int length) {
        snapC = 0;
        content = new HashMap();
        for(int i = 0; i < length; i++) {
            TreeMap<Integer, Integer> shot = new TreeMap();
            shot.put(snapC, 0);
            content.put(i, shot);
        }
    }

    public void set(int index, int val) {
        content.get(index).put(snapC, val);
    }

    public int snap() {
        return snapC++;
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> cur = content.get(index);
        if(!cur.containsKey(snap_id)) {
            return cur.get(cur.floorKey(snap_id));
        }
        return cur.get(snap_id);
    }
}
