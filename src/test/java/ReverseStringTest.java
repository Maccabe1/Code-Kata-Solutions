import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseStringTest() {
        assertEquals("dlrow", ReverseString.reverseString("world"));
    }
}