import java.util.Arrays;

public class ArrayManipulator {
    private int[] list;

    //Constructor: create a reference to a new array of the
    //specified length, with each element initialized to 0
    public ArrayManipulator(int numElements) {
        this.list = new int[numElements];
    }
    //returns the index of the middle index in list
    //if the length is even, getMiddleIndex() should return //the index of the earlier middle element
    public int getMiddleIndex() {
        return (this.list.length-1) / 2; //Java rounds down for the even idx
    }

    //returns the average of the first middle and last 
    //elements of the list 
    //The middle element should be the element returned by
    //getMiddleIndex()
    //Precondition: list.length >= 3 
    public double getAvg() {
        int first = this.list[0];
        int last = this.list[this.list.length - 1];
        int middle = this.list[this.getMiddleIndex()];

        return (first + last + middle)/3;
    }

}