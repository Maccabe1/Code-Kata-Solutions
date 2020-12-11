import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthPowerKataTest {

    @Test
    public void basicTests() {
        assertEquals(-1, NthPowerKata.nthPower(new int[] {1,2}, 2));
        assertEquals(8, NthPowerKata.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, NthPowerKata.nthPower(new int[] {3,1,2}, 2));
    }
}