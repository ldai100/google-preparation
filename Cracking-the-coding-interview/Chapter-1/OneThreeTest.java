import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneThreeTest {

    char[] testCases1 = new char[] {
            'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '
    };

    @Test
    void urlify() {
        OneThree test = new OneThree();
        Assert.assertEquals("Mr%20John%20Smith", test.urlify(testCases1));
    }
}