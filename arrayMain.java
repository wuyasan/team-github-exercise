import java.util.Scanner;

public class arrayMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] y = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number for array: ");
            y[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("The average is: " + arrayAvg.getAvg(y));
        System.out.println("The variance is: " + arrayVar.getVar(y));
        // additional methods to be created by team
        in.close();
    }
}
