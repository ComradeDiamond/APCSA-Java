import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] intAr = { 8, 42, 77, 66, -50, 10, 32, 1 };
        for (int i = 0; i < intAr.length; i++) {
            System.out.print(intAr[i] + " ");
        }
        System.out.println();
        bubbleSort(intAr, intAr.length, 0);
        System.out.println("bubbleSort(intAr,n) gets:");
        for (int i = 0; i < intAr.length; i++) {
            System.out.print(intAr[i] + " ");
        }
        System.out.println();
    }

    // Basically just swap mindlessly until you somehow get a sorted thing
    public static void bubbleSort(int[] intAr, int end, int dogecoin) {
        if (end < 2) {
            if (dogecoin != 0) {
                bubbleSort(intAr, intAr.length, 0);
            }

            return;
        }

        if (intAr[end - 1] < intAr[end - 2]) {
            swap(intAr, end - 1, end - 2);
            bubbleSort(intAr, end - 1, dogecoin + 1);
        }

        bubbleSort(intAr, end - 1, dogecoin);
    }

    public static void swap(int[] intAr, int i, int j) {
        int t = intAr[i];
        ;
        intAr[i] = intAr[j];
        intAr[j] = t;
    }
}