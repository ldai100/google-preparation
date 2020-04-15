public class SixZeroFour {
    String compressed;
    int index;
    int curCount;
    char i;

    // Initial solution;
    public SixZeroFour(String compressedString) {
        compressed = compressedString;
        curCount = 0;
        index = 0;
        i = ' ';
    }

    public char next() {
        if(!hasNext()) {
            return ' ';
        }
        if(curCount == 0) {
            i = compressed.charAt(index++);
            while(index < compressed.length() && Character.isDigit(compressed.charAt(index))) {
                curCount = curCount * 10 + compressed.charAt(index++) - '0';
            }
        }
        curCount--;
        return i;
    }

    public boolean hasNext() {
        return index < compressed.length() || curCount > 0;
    }
}
