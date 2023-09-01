package TenDays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        int k = 5; // Finding the 5th element

        int result = findKthElement(arr1, arr2, k);
        System.out.println("Kth element: " + result);
    }

    static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        merge(ans, arr1, arr2);

        return ans.get(k-1);
    }

    static void merge(ArrayList<Integer> ans, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i = 0;
        int j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                ans.add(arr1.get(i));
                i++;
            } else {
                ans.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            ans.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            ans.add(arr2.get(j));
            j++;
        }
    }
}
