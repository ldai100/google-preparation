import java.util.ArrayList;
import java.util.List;

public class FourOneTwo {

    // Initial solution;
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList();
        for(int i = 1; i <= n; i++) {
            String input;
            if(i % 5 == 0 && i % 3 == 0) {
                input = "FizzBuzz";
            }
            else if(i % 5 == 0) {
                input = "Buzz";
            }
            else if(i % 3 == 0) {
                input = "Fizz";
            }
            else {
                input = Integer.toString(i);
            }
            ans.add(input);
        }
        return ans;
    }
}
