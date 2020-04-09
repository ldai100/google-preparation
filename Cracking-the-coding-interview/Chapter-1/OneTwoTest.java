import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneTwoTest {

    String[][] testCase = new String[][]{
            new String[] {"asdfghj", "jhgfdsa"},
            new String[] {"", ""},
            new String[] {"asd", "as"},
            new String[] {"oiweur", "oqewnkg"},
    };

    @Test
    void isPermutation1() {
        OneTwo test = new OneTwo();
        Assert.assertTrue(test.isPermutation1(testCase[0][0], testCase[0][1]));
        Assert.assertTrue(test.isPermutation1(testCase[1][0], testCase[1][1]));
        Assert.assertFalse(test.isPermutation1(testCase[2][0], testCase[2][1]));
        Assert.assertFalse(test.isPermutation1(testCase[3][0], testCase[3][1]));
    }

    @Test
    void isPermutation2() {
        OneTwo test = new OneTwo();
        Assert.assertTrue(test.isPermutation2(testCase[0][0], testCase[0][1]));
        Assert.assertTrue(test.isPermutation2(testCase[1][0], testCase[1][1]));
        Assert.assertFalse(test.isPermutation2(testCase[2][0], testCase[2][1]));
        Assert.assertFalse(test.isPermutation2(testCase[3][0], testCase[3][1]));
    }
}