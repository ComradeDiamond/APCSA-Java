import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Make two lists
        ArrayList<Integer> list1 = randomIntegerList(10, 100);
        ArrayList<Integer> list2 = randomIntegerList(10, 100);
        // sort them - (yes... we have a sort we can use from java.util.Collections)
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Two lists to be merged iteratively: ");
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged Lists: ");
        System.out.println(mergedList);
        list1 = randomIntegerList(10, 100);
        list2 = randomIntegerList(10, 100);
        // sort them - (yes... we have a sort we can use from java.util.Collections)
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Two lists to be merged recursively: ");
        System.out.println(list1);
        System.out.println(list2);
        mergedList = recursiveMergeSortedLists(list1, list2, null);
        System.out.println("Merged Lists: ");
        System.out.println(mergedList);

    }

    /**
     * mergeSortedLists Precondition: both lists are sorted and non-empty returns a
     * sorted list created from both lists.
     */
    public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> retList = new ArrayList<Integer>();
        // get the first element of each list and insert the minimum.
        // Continue unitl all elements from both lists are in the return list
        boolean leftOverflow = false;
        boolean rightOverflow = false;
        for (int l = 0, r = 0; !leftOverflow || !rightOverflow;) {
            if (leftOverflow) {
                retList.add(list2.get(r));
                r++;
            } else if (rightOverflow || list1.get(l) < list2.get(r)) {
                retList.add(list1.get(l));
                l++;
            } else {
                retList.add(list2.get(r));
                r++;
            }

            leftOverflow = l >= list1.size();
            rightOverflow = r >= list2.size();
        }
        return retList;
    }

    /**
     * recursvieMergeSortedLists Precondition: both lists are sorted and non-empty
     * returns a sorted list created from both lists.
     */
    public static ArrayList<Integer> recursiveMergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2,
            ArrayList<Integer> retList) {
        if (retList == null) {
            retList = new ArrayList<Integer>();
        }
        // get the first element of each list and insert the minimum.
        Integer yeeeeet;
        if (list1.size() == 0) {
            yeeeeet = list2.remove(0);
        } else if (list2.size() == 0 || list1.get(0) < list2.get(0)) {
            yeeeeet = list1.remove(0);
        } else {
            yeeeeet = list2.remove(0);
        }
        retList.add(yeeeeet);

        // Continue unitl all elements from both lists are in the return list
        if (list1.size() != 0 || list2.size() != 0) {
            recursiveMergeSortedLists(list1, list2, retList);
        }

        return retList;
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
            Integer tempVal = (int) (Math.random() * (maxVal + 1));
            retAL.add(tempVal);
        }
        return retAL;
    }
}