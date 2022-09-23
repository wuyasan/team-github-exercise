public class arrayRev {

    /* this method reverses the input array by swapping elements starting with the first and last elements,
    and by making use of a 'temp' variable that holds the element currently being swapped so its value isn't lost
     */
    public static int[] getRev(int[] y){
        int temp;
        int size = y.length;
        for(int i = 0; i < size/2; i++){
            temp = y[i];
            y[i] = y[size-i-1];
            y[size-i-1] = temp;
        }
        return y;
    }
}
