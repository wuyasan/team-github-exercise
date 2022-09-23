import org.junit.Test;

import static org.junit.Assert.*;

public class arraySortTest {
    @Test
    public void testAscSort() {
        int[] x = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        int[] result = arraySort.getSortAsc(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDescSort() {
        int[] x = { 1, 2, 3, 4, 5 };
        int[] expected = { 5, 4, 3, 2, 1 };
        int[] result = arraySort.getSortDesc(x);
        assertEquals(expected, result);
    }
}
