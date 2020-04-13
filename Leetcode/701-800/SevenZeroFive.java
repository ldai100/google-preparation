import java.util.Arrays;

public class SevenZeroFive {

    // Naive approach targeted constraints;
    boolean[] set;
    /** Initialize your data structure here. */
    public SevenZeroFive() {
        set = new boolean[10000001];
        Arrays.fill(set, false);
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key];
    }

}
