package Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6,3,7,1,9,13};
        sorting(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));
    }
    static void sorting(int[] array, int low, int high) {
        
        //Base Condition
        if (low>=high) return;
        
        //start and end for Swapping
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;

        int pivot = array[mid];

        while (start<=end) {
            
            while (array[start]<pivot) start++;
            
            while (array[end]>pivot) end--;

            if (start<=end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                
                start++;
                end--;
            }
            
            sorting(array, low, end);
            sorting(array, start, high);            
        }
        
    }
}
