import java.util.Stack;

public class NineForSix {


    public boolean validateStackSequences(int[] pu, int[] po) {
        if(pu.length == 0) return true;
        int pushIdx = 0;
        int popIdx = 0;
        Stack<Integer> helper = new Stack();
        while(pushIdx < pu.length || popIdx < po.length) {
            if(helper.isEmpty() || helper.peek() != po[popIdx]) {
                if(pushIdx >= pu.length) return false;
                helper.push(pu[pushIdx]);
                pushIdx++;
            }
            else {
                helper.pop();
                popIdx++;
            }
        }
        return true;
    }
}
