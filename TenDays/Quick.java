package TenDays;

import java.util.List;

public class Quick {
    public static void main(String[] args) {
        
    }
    static List<Integer> quickSort(List<Integer> arr){
        return sorting(arr, 0, arr.size()-1);
    }

    static List<Integer> sorting(List<Integer> array, int low, int high) {
        
        //Base Condition
        if (low>=high) return array;
        
        //start and end for Swapping
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;

        int pivot = array.get(mid);

        while (start<=end) {
            
            while (array.get(start)<pivot) start++;
            
            while (array.get(end)>pivot) end--;

            if (start<=end) {
                int temp = array.get(start);
                array.set(start, array.get(end));  // Use 'set' method to update list elements
                array.set(end, temp);
                
                start++;
                end--;
            }
            
            sorting(array, low, end);
            sorting(array, start, high);            
        }
        return array;
        
    }
}
