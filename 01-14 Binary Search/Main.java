import java.util.*;

class Main {
    public static void main(String[] args) {
        Double[] doubleArray = { 0.0101, 0.01008, 0.03, 0.0302, 0.03008, 0.04009, 0.07, 0.0703, 0.09, 0.1104, 0.191,
                0.2, 0.322, 0.33, 0.4, 0.5 };
        ArrayList<Double> doubleAL = new ArrayList<>(Arrays.asList(doubleArray));
        // use a binary search to find the index of 0.191 (should get 10)
        // - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
        System.out.println(binarySearchDouble(0.191, doubleAL, 0.001));
        // use a binary search find the index of 0.02 (should get -1)
        // - we'll say the tolerance is 0.001 ('close enough' is less than 0.001)
        System.out.println(binarySearchDouble(0.02, doubleAL, 0.001));
    }

    public static int binarySearchDouble(double target, ArrayList<Double> doubleAL, double tolerance) {
        for (int lower = 0, upper = doubleAL.size() - 1, i = (lower + upper) / 2; 
                upper < doubleAL.size() && lower >= 0
                && upper >= lower; i = (lower + upper) / 2
            ) 
        {
            double num = doubleAL.get(i);
            // System.out.println(num);
            if (Math.abs(num - target) <= tolerance) {
                return i;
            } else if (num < target) {
                lower = i + 1;
            } else if (num > target) {
                upper = i - 1;
            }
        }
        return -1;
    }
}