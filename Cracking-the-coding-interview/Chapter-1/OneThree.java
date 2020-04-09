import java.util.Arrays;

public class OneThree {

    public String urlify(char[] input) {

        int alength = input.length - 1;
        int blength = input.length - 1;
        while(input[alength] == ' ') alength--;

        for(int i = alength; i >= 0; i--) {
            if(input[i] == ' ') {
                input[blength] = '0';
                input[blength-1] = '2';
                input[blength-2]= '%';
                blength -= 3;
            }
            else {
                input[blength] = input[i];
                blength--;
            }

        }
        return new String(input);
    }
}
