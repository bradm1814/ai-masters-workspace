import java.util.Arrays;

public class ShellSortExample {
    public static void shellSort(int[] arr) {
        //This area sets an efficient "Shell" number based on the length of the array being sorted
        // this is called the Knuths Increment Sequence
        //for the test array it determines a gap number of 4
        int n = arr.length;
        int gap = 1;
        while (gap < n/3) {
            gap = 3 * gap + 1;
        }
        //The next part of the code processes the shell sort at the given gap then decrements the gap down by 1 until it reaches 0
        while (gap > 0) {
            for (int i = gap; i < n; i++){
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap = (gap - 1) / 3;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {9,4,7,3,6,1,8,2,5};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        shellSort(numbers);
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }
}
