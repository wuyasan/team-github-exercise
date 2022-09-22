public class arrayVar {
    public static double getVar(int[] x) {
        double avg = arrayAvg.getAvg(x);
        double var = 0;
        double squarDiff = 0;

        for (int i = 0; i < x.length; i++) {
            squarDiff += Math.pow(x[i] - avg, 2);
        }

        var = squarDiff / x.length;

        return var;
    }
}