public class SixSeven {

    // My verbose.
    public String addBinary(String a, String b) {
        int aL = a.length() - 1, bL = b.length() - 1;
        StringBuilder builder = new StringBuilder();
        boolean carry = false;
        while(aL >= 0 && bL >= 0) {
            int an = a.charAt(aL) - '0';
            int bn = b.charAt(bL) - '0';
            int cn = an + bn + (carry ? 1:0);
            if(cn == 0 || cn == 2) {
                builder.append('0');
            }
            else{
                builder.append('1');
            }
            carry = cn == 2 || cn == 3 ? true:false;
            aL--;
            bL--;
        }

        while(aL >= 0) {
            int an = a.charAt(aL) - '0';
            int cn = an + (carry ? 1:0);
            if(cn == 0 || cn == 2) {
                builder.append('0');
            }
            else{
                builder.append('1');
            }
            carry = cn == 2 || cn == 3 ? true:false;
            aL--;
        }

        while(bL >= 0) {
            int bn = b.charAt(bL) - '0';
            int cn = bn + (carry ? 1:0);
            if(cn == 0 || cn == 2) {
                builder.append('0');
            }
            else{
                builder.append('1');
            }
            carry = cn == 2 || cn == 3 ? true:false;
            bL--;
        }

        if(carry) builder.append('1');
        return builder.reverse().toString();
    }
}
