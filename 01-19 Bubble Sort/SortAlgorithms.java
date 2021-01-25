import java.util.ArrayList;

/**
 * Handy Utility class for all things sorting in Java.
 * @author Justin
 * @since 1/19/21
 */
public class SortAlgorithms 
{
    /**
     * Performs a bubble sort
     * @param al The arrayList to sort
     */
    public static void bubbleSort(ArrayList<Integer> al)
    {
        //While the ArrayList is not sorted
        while (!SortUtil.isSorted(al))
        {
            //Use a for loop to step through the arraylist
            for (int i=0; i<al.size() - 1; i++)
            {
                //If two consecutive integers of the array are out of order
                SortUtil.incrementCompares(); //Compares i to i+1 idx
                if (al.get(i) > al.get(i + 1))
                {
                    SortUtil.swap(al, i, i+1);
                    SortUtil.incrementSwaps(); //actual swapping
                }
            }
        }
    }

    /**
     * Performs a selection sort
     * @param al The arrayList to sort
     */
    public static void selectionSort(ArrayList<Integer> al)
    {
        //For every item in the array, except the last one because that would have been sorted already
        for (int i=0; i<al.size() ; i++)
        {
            //Find the minimum index and then compare it with the current index.
            int minIdx = SortUtil.getMinIndex(al, i);
            SortUtil.swap(al, i, minIdx);
            SortUtil.incrementSwaps();
        }
    }

    /**
     * Performs a merge sort
     * @param al The arrayList to sort
     */
    public static void mergeSort(ArrayList<Integer> al)
    {
        
    }

    /**
     * Performs a insertion sort
     * @param al The arrayList to sort
     */
    public static void insertionSort(ArrayList<Integer> al)
    {
        for (int i=0; i < al.size(); i++)
        {
            //Remove the value
            Integer value = al.remove(i);

            //Inserts the value at the minimum position
            //When i=0, the insertValue for loop would not run, causing the integer to be inserted back at 0
            SortUtil.insertValue2(value, i, al);
        }
    }
}
