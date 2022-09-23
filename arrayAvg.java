public class arrayAvg {
    public static double getAvg(int[] x) {
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        avg = sum/x.length;
        return avg;
    }
}
