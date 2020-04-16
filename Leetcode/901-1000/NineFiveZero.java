import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NineFiveZero {

    // Solution inspired by discussion;
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> helper = new LinkedList();

        for(int i = 0; i < deck.length; i++) {
            helper.add(i);
        }
        int [] ans = new int[deck.length];
        for(int i = 0; i < deck.length; i++) {
            ans[helper.poll()] = deck[i];
            if(!helper.isEmpty()) {
                helper.add(helper.poll());
            }
        }
        return ans;
    }
}
