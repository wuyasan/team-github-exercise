import java.util.Arrays;
public class arraySort {

    // Sort Ascending
    public static int[] getSortAsc(int[] x) {
        Arrays.sort(x);
        return x;
    }

    // Sort Descending
    public static int[] getSortDesc(int[] x) {
        Arrays.sort(x);
        x = arrayRev.getRev(x);
        return x;
    }
}
