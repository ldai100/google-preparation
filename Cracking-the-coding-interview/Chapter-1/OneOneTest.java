import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneOneTest {

    private OneOne test = new OneOne();

    @Test
    void solution1() {
        Assert.assertTrue(test.solution1("asdfgh"));
        Assert.assertFalse(test.solution1("aaaaa"));
        Assert.assertTrue(test.solution1(""));
    }

    @Test
    void solution2() {
        Assert.assertTrue(test.solution1("asdfgh"));
        Assert.assertFalse(test.solution1("aaaaa"));
        Assert.assertTrue(test.solution1(""));
    }
}