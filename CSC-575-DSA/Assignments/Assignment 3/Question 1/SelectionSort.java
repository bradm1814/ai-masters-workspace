
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println(Arrays.toString(array));
            int minIndex = i;
            for (int j=i+1; j< array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        
        }
    
    }
    public static void main(String[] args) {
        int[] myArray = {64,25,12,22,11};
        selectionSort(myArray);
    }
}
