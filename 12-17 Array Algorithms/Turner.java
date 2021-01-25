public class Turner {

    public static void sort(int[] array)
    {
        for (int i = 0; i <array.length; i++) 
        {     
            for (int c = i+1; c <array.length; c++) 
            {   
                if (array[i] > array[c])
                {
                    int throwaway = array[c];
                    array[c] = array[i];
                    array[i] = throwaway;
                }
            }                
        } 
    }

    public static int binarySearch(int[] array, int number)
    {
        //The essence of the binary search is to split stuff up into 2
        //Sort the array to make your life easier
        Turner.sort(array);
        //Use a while loop, we're going to be doing this until the item is found
        int i = array.length / 2; int max = array.length - 1; int min = 0; //Java rounds down

        for (int j = 0; j<10; j++) 
        {
            //There's 3 scenarios
            if (array[i] == number)
            {
                return i; //Short circuit the while loop and return it
            }
            else if (array[i] > number)
            {
                //Set the max index to i, because since it's a sorted array, 
                //the target value must now be < the current index to stop it from going even more
                max = i;
                i = (min + max) / 2;
            }
            else if (array[i] < number)
            {
                //Sets the min index to i, because since the array is sorted, 
                //the target value must be > the current index here to stop it from being even less
                min = i;
                i = (min + max) / 2;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] x = {3, 2, 1, 4, 3, 5, 2, 6, 7};
        System.out.println(binarySearch(x, 6));
    }
}