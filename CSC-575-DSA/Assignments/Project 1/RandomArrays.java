//import random module
import java.util.Random;

//import Arrays Method
import java.util.Arrays;


public class RandomArrays{
    public static void main(String[] args) {

        //Generate array1 of 5000 random elements
        int[] arr1 = RandomArrayGenerator(5000);

        //Start timer
        long startTime1 = System.currentTimeMillis();

        //call insertion sort
        insertionSort(arr1);

        //End Timer
        long endTime1 = System.currentTimeMillis();
        
        //save elapsed time1
        long elapsedTime1 = endTime1 - startTime1;

        //Generate array2 of 5000 random elements
        int[] arr2 = RandomArrayGenerator(5000);

        //start Timer
        long startTime2 = System.currentTimeMillis();

        //call primitive (double-pivot) array sorting
        Arrays.sort(arr2);

        //save run time
        long endTime2 = System.currentTimeMillis();

        //save elapsed time2
        long elapsedTime2 = endTime2 - startTime2;

        //Generate array3 of 5000 random elements
        int[] arr3 = RandomArrayGenerator(5000);

        //start Timer
        long startTime3 = System.currentTimeMillis();

        //call parralel array sorting
        Arrays.parallelSort(arr3);

        //save run time
        long endTime3 = System.currentTimeMillis();

        //save elapsed time2
        long elapsedTime3 = endTime3 - startTime3;

        //print message
        System.out.println("Insertion Sort time = " + elapsedTime1+"ms");
        System.out.println("Primitive Sort time = "+ elapsedTime2+"ms");
        System.out.println("Parallel Sort time = "+ elapsedTime3+"ms");
    }
    public static int[] RandomArrayGenerator(int n) 
  {
    int[] Array = new int[n];
    Random r = new Random();
    for(int i=0;i<n;i++)
    {
      Array[i] = r.nextInt(1000);
    }
    return Array;
  }

  /**
   * Function Name: Insertion Sort
   * 
   * @param array
   * 
   * Inside The Function:
   * 1. Loops through array comparing each value to the value at the previous index
   * 2. inserts current value into proper index when it meets a value at a previosu index that is less
   * 
   */
  public static void insertionSort(int[] array){
    //loop through the array starting at the second index
    for (int i=1; i<array.length; i++){
        //temp variable to store value at index
        int temp = array[i];
        //variable to access value store at indeces before i starting at the index i-1
        int j = i-1;

        //start while loop to move value towards front of array until j gets to beginning and the value is less than the previous value
        while (j> -1 && temp < array[j]){
            // set previous = to current
           array[j+1] = array[j]; 
           //set current = previous
           array[j] = temp;
           //increment j
           j--;

        }
    }
  }

}