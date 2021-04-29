import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      ArrayList<Integer> al = randomIntegerList(10, 20);
      System.out.println("Unsorted al = " + al);
      System.out.println("running non-recursive selection sort:");
      selectionSort(al);
      System.out.println("Sorted al = " + al);
      al = randomIntegerList(10, 20);
      System.out.println("---");
      System.out.println("Unsorted al = " + al);
      System.out.println("running recursive selection sort:");
      recursiveSelectionSort(al, 0);
      System.out.println("Sorted al = " + al);
   }

   /**
    * recursiveSelection sort of an ArrayList of Integers and n the length of the
    * list - Find the minimum integer of the remaining n-i integers Swap the
    * minimum with the element at index i recursively repeat for n-1 in the second
    * parameter
    */
   public static void recursiveSelectionSort(ArrayList<Integer> al, int n) {
      if (n >= al.size())
      {
         return;
      }

      swap(al, n, getMin(al, n));
      recursiveSelectionSort(al, n + 1);
   }

   public static int getMin(ArrayList<Integer> al, int n) {
      if (n == al.size())
      {
         return al.size() - 1;
      }

      int probMin = getMin(al, n + 1);
      return al.get(probMin) < al.get(n) ? probMin : n;
   }

   /**
    * selectionSort of an ArrayList of Integers: For each index i of the ArrayList
    * of size n { Find the minimum integer of the remaining n-i integers Swap the
    * minimum with the element at index i }
    */
   public static void selectionSort(ArrayList<Integer> al) {
      for (int i = 0; i < al.size(); i++) {
         int minInd = getMinIndex(al, i);
         swap(al, i, minInd);
      }
   }

   /**
    * Find the index of minimum value starting at the index index
    * 
    * @param index starting index of the search for the min
    * @param al    an ArrayList of type Integer
    */
   public static int getMinIndex(ArrayList<Integer> al, int startInd) {
      int minInd = startInd;
      Integer minVal = al.get(minInd);
      for (int i = startInd + 1; i < al.size(); i++) {
         if (al.get(i) < minVal) {
            minVal = al.get(i);
            minInd = i;
         }
      }
      return minInd;
   }

   /**
    * Swap the two values at index i and j
    * 
    * @param al is ArrayList of type Integer
    * @param i  is an index of the ArrayList
    * @param j  is an index of the ArrayList
    */
   public static void swap(ArrayList<Integer> al, int i, int j) {
      Integer temp = al.get(i);
      al.set(i, al.get(j));
      al.set(j, temp);
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