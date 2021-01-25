import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for managing the sorting algorithms of the AP Java A course
 */
public class SortUtil {
    /**
     * Keeps track of the number of swaps
     */
    private static int swaps;
    /**
     * Keeps track of the number comparisons
     */
    private static int compares;

    /**
     * Gets the number of swaps
     * @return number of swaps
     */
    public static int getSwaps()
    {
        return swaps;
    }

    /**
     * Gets the number of comparisons
     * @return number of compares
     */
    public static int getCompares()
    {
        return compares;
    }

    /**
     * Adds 1 to the number of swaps
     */
    public static void incrementSwaps()
    {
        swaps++;
    }

    /**
     * Adds 1 to the number of compares
     */
    public static void incrementCompares()
    {
        compares++;
    }

    /**
     * Swap the two values at index i and j
     * 
     * @param al is ArrayList of type Integer
     * @param i  is an index of the ArrayList
     * @param j  is an index of the ArrayList
     */
    public static void swap(ArrayList<Integer> al, int i, int j) {
        int temp = al.get(i);
        al.set(i, al.get(j));
        al.set(j, temp);
    }

    /**
     * Checks to see that the order of the ArrayList al is non-descending
     * 
     * @param al is an ArrayList of type Integer
     * @return true if the Integers are in non-descending order false otherwise
     */
    public static boolean isSorted(ArrayList<Integer> al) {
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) > al.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Creates an ArrayList of type Integer of length arrayLength with the range
     * 0.0..maxVal
     * 
     * @param listLength the number of elements of the array
     * @param maxVal     each element of the ArrayList has a value in the range
     *                   0..maxVal
     * @return an ArrayList of type Integer of length arrayLength
     */
    public static ArrayList<Integer> randomIntegerList(int listLength, Integer maxVal) {
        ArrayList<Integer> retAL = new ArrayList<>();

        for (int i = 0; i < listLength; i++) {
            int randInt = (int) (Math.random() * (maxVal + 1));
            retAL.add(randInt);
        }

        return retAL;
    }

    /**
     * Checks that the ArrayLists have the same sum (it's a simple way to check if
     * our sort is working correctly)
     * 
     * @param a an ArrayList of type Integer
     * @param b an ArrayList of type Integer
     * @return true if they have the same sum false otherwise Precondition: a and b
     *         have the same length
     */
    public static boolean sameSum(ArrayList<Integer> a, ArrayList<Integer> b) {
        int sumA = 0;
        int sumB = 0;

        for (int num : a) {
            sumA += num;
        }

        for (int num : b) {
            sumB += num;
        }

        return sumA == sumB;
    }

    /**
     * Finds the index of the minimum, starting at index startInd.
     * Precondition: startIdx < a.size();
     * @param a the arraylist to look through
     * @param startIdx the index to start searching
     * @return the index of the minimum value in the array
     */
    public static int getMinIndex(ArrayList<Integer> a, int startIdx)
    {
        int min = a.get(startIdx);
        int minIdx = startIdx;

        for (int i=minIdx; i < a.size(); i++)
        {
            incrementCompares();
            if (a.get(i) < min)
            {
                minIdx = i;
                min = a.get(i);
            }
        }

        return minIdx;
    }

    /**
     * Copy an ArrayList of type Integer. To be used for checking the correctness
     * sort
     * 
     * @param al an ArrayList of type Integer
     * @return an ArryList of type Integer that is a copy of al
     */
    public static ArrayList<Integer> copyIntegerList(ArrayList<Integer> al) {
        ArrayList<Integer> newAL = new ArrayList<>(al);
        return newAL;
    }

    /**
     * Inserts the integer value into the list al. Assume the first stopIndex elements are sorted.
     * @param value - the value to be inserted
     * @param stopIdx - the first stopIndex elements are sorted
     * @param al the ArrayList of values. Assume the values are sorted up to stopIndex
     */
    public static void insertValue(Integer value, int stopIdx, ArrayList<Integer> al)
    {
        for (int i=0; i < stopIdx; i++)
        {
            if (value < al.get(i))
            {
                al.add(i, value);
                return; //this is a way to exit a method of type void
            }
        }
        //If value is bigger than anything in the list
        al.add(stopIdx, value);
    }

    /**
     * Optimized insertValye using binary search :P
     * @param value - the value to be inserted
     * @param stopIdx - the first stopIndex elements are sorted
     * @param al the ArrayList of values. Assume the values are sorted up to stopIndex
     */
    public static void insertValue2(Integer value, int stopIdx, ArrayList<Integer> al)
    {
        int min = 0;
        int max = stopIdx - 1;

        /*The overall behavior for the binary search is that when min > max,
        the min value and the max value are 1 digit away. The min value seems to
        always be the position where the value should be inserted
        (because after all, that's the position where the thing oofed)
        
        I'm bad at explaining, use this link:
        https://docs.google.com/document/d/1YJbnt5bxGjCzSPhijHhX5Tqyx_YVK_auDzxRC1UnIqo/edit?usp=sharing*/
        while (min <= max)
        {
            int mid = (min + max) / 2;
            incrementCompares();
            incrementCompares();
            incrementCompares();
            if (al.get(mid) > value)
            {
                max = mid - 1;
            }
            else if (al.get(mid) < value)
            {
                min = mid + 1;
            }
            else
            {
                //Because we're going to value into the min index, might as well
                //be a lazy potato and set min to mid
                min = mid;
                break;
            }
        }
        incrementSwaps();
        al.add(min, value);
    }

    public static void main(String[] args) {
        int[] dataChart = {100,
            200,
            300,
            400,
            500,
            600,
            700,
            800,
            900,
            1000,
            2000,
            3000,
            4000,
            5000,
            10000,
            20000,
            25000,
            30000
        };

        ArrayList<Double> millis = new ArrayList<>();
        ArrayList<Integer> swaps = new ArrayList<>();
        ArrayList<Integer> compares = new ArrayList<>();

        for (int num : dataChart)
        {
            ArrayList<Integer> testAL = new ArrayList<>();

            for (int i=num; i > 0; i--)
            {
                testAL.add(i);
            }
            
            double startTime = System.nanoTime();
            SortAlgorithms.selectionSort(testAL);
            double endTime = System.nanoTime();

            millis.add((endTime - startTime) / 1000000);
            swaps.add(getSwaps());
            compares.add(getCompares());

            SortUtil.swaps = 0;
            SortUtil.compares = 0;
        }

        System.out.println("Time: " + millis);
        System.out.println("Swaps: " + swaps);
        System.out.println("Compares: " + compares);
    }
}