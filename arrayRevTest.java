import org.junit.Test;

import static org.junit.Assert.*;

public class arrayRevTest {

    @Test
    public void testGetRev() {
        int[] testArray = {7, 5, 2, 1, 8, 4, 5, 6};
        int[] expected = {6, 5, 4, 8, 1, 2, 5, 7};
        int[] result = arrayRev.getRev(testArray);
        assertArrayEquals(expected, result);
    }
}