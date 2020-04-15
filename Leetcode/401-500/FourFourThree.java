import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FourFourThree {

    // Initial Solution;
    public int compress(char[] chars) {
        int ptr1 = 0;
        char[] copy = chars.clone();
        Queue<Character> helper = new LinkedList();

        for(int i = 0; i < chars.length; i++) {
            helper.add(chars[i]);
        }

        while(!helper.isEmpty() && ptr1 < chars.length) {
            int count = 1;
            chars[ptr1] = helper.poll();
            while(!helper.isEmpty() && helper.peek() == chars[ptr1]) {
                count++;
                helper.poll();
            }
            Stack<Character> c = new Stack();
            while(count > 0) {
                int curC = count % 10;
                c.push((char) (curC + '0'));
                count /= 10;
            }
            int size = c.size();
            int i = ptr1 + 1;
            while(i < chars.length && !c.isEmpty()) {
                if(size == 1 && c.peek() == '1') {
                    ptr1--;
                    break;
                }
                chars[i++] = c.pop();
            }
            ptr1 = ptr1 + 1 + size;
        }
        if(!helper.isEmpty() || ptr1 >= chars.length) {
            chars = copy;
            return chars.length;
        }
        return ptr1;
    }
}
