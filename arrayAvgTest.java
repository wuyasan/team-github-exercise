import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class arrayAvgTest {
    @Test
    public void testSort() {
        int[] x = {1,2,3};
        int expected = 2;
        double result = arrayAvg.getAvg(x);
        assertEquals(expected,result,1e-8);
    }
}