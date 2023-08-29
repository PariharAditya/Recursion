package TenDays;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = {9,5,8,12,4,0};
        sorting(array);
        System.out.println(Arrays.toString(array));    

    }

    static void sorting(int[] array) {

        // Base condition
        if (array.length == 1)
            return ;

        int mid = array.length / 2;

        int[] left =  Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        sorting(left);
        sorting(right);

        merge(array,left, right);

    }

    private static void merge(int[] result ,int[] arrayOne, int[] arrayTwo) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                result[k] = arrayOne[i];
                i++;
            } else {
                result[k] = arrayTwo[j];
                j++;
            }
            k++;
        }

        while (i < arrayOne.length) {
            result[k] = arrayOne[i];
            i++;
            k++;
        }

        while (j < arrayTwo.length) {
            result[k] = arrayTwo[j];
            j++;
            k++;
        }
    }

}
