package Sorting;
import java.util.Arrays;

public class Merge 
{
public static void main(String[] args) {
    int[] array = {9,5,8,12,4,0};
    int[] aditya = sorting(array);
    System.out.println(Arrays.toString(aditya));    
}   
static int[] sorting(int[] array) {
    
    //Base condition
    if (array.length == 1) return array;

    int mid = array.length/2;

    int[] left = sorting(Arrays.copyOfRange(array, 0, mid));
    int[] right = sorting(Arrays.copyOfRange(array, mid, array.length));

    return merge(left,right);
    
}
private static int[] merge(int[] arrayOne, int[] arrayTwo) {
    int[] result = new int[arrayOne.length + arrayTwo.length];
    
    int i = 0;
    int j = 0;
    int k = 0;

    while (i<arrayOne.length && j<arrayTwo.length) {
        if (arrayOne[i]< arrayTwo[j]) {
            result[k] = arrayOne[i];
            i++;
        } else {
            result[k] = arrayTwo[j];
            j++;
        }
        k++;
    }

    while (i<arrayOne.length) {
        result[k] = arrayOne[i];
        i++;
        k++; 
    }

    while (j<arrayTwo.length) {
        result[k] = arrayTwo[j];
        j++;
        k++; 
    }    
    return result;
}
}
