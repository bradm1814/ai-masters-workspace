import java.util.Arrays;


public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length +array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

       while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]){
                combined[index] = array1[i];
                System.out.println(combined[index] + " Sorted");
                index++;
                i++;
            }else {
                combined[index] = array2[j];
                System.out.println(combined[index] + " Sorted");
                index++;
                j++;
            }
        }
        while (i < array1.length){
            combined[index] = array1[i];
            System.out.println(combined[index] + " Sorted");
            index++;
            i++;
        }
        while (j < array2.length){
            combined[index] = array2[j];
            System.out.println(combined[index] + " Sorted");
            index++;
            j++;
        }
    return combined;
    }
    public static int[] mergeSort(int[] array){
        if(array.length ==1){
            System.out.println("Single Array Reached: " + Arrays.toString(array));
            return array;
        }
        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        int [] new_array = merge(left, right);
        System.out.println("Newest Sort: " + Arrays.toString(new_array));
        return new_array;
    }
    public static void main(String[] args) {
        int [] originalArray = {12,8,9,3,11,5,4};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println("Final Outcome: " + Arrays.toString(sortedArray));
    }
}
    

