public class RecursiveSum{
    public static void main(String[] args) {

        int[] numbers = {11,22,33,44,55,66,77}; // Define array

        int sum = recursiveSum(numbers, 0); // Call Recursive Function starting at the beginning of the array

        System.out.println("The total of the array is: " + sum);//Print output
        
    }
    /**
     * Function Name: recursiveSum
     * 
     * @param array
     * @param index
     * @return
     * 
     * Inside the function:
     * 1. establishes base case for recursion, returning 0 when all indeces have been gone through
     * 2. recursive call to sum all integers. Moves to next index in recursion
     * 
     */
    public static int recursiveSum(int[]array, int index){
        if (index == array.length){
            return 0;
        }
        return array[index] + recursiveSum(array, index+1);
    }
}