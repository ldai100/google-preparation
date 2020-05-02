import java.util.Arrays;

public class OneFourTwoSix {

    public int countElements(int[] arr) {
        int ans = 0, temp = 0, tempC = 0;
        Arrays.sort(arr);
        if(arr.length > 0) {
            temp = arr[0];
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == temp) {
                tempC++;
            }
            else {
                if(arr[i] == temp+1) {
                    ans += tempC;
                }
                tempC = 1;
                temp = arr[i];
            }

        }
        return ans;
    }
}
