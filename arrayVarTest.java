import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class arrayVarTest {
    @Test
    public void testSort() {
        int[] x = { 1, 2, 3, 4, 5 };
        double expected = 2.0;
        double result = arrayVar.getVar(x);
        assertEquals(expected, result, 1e-8);
    }
}