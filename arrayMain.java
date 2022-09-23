import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println("Original Array: " + Arrays.toString(y));
        System.out.println("Reversed Array: " + Arrays.toString(arrayRev.getRev(y)));
        System.out.println("Sorted Asc Array: " + Arrays.toString(arraySort.getSortAsc(y)));
        System.out.println("Sorted Desc Array: " + Arrays.toString(arraySort.getSortDesc(y)));
        in.close();
    }
}
