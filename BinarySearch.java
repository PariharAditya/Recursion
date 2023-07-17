public class BinarySearch {
    public static void main(String[] args) {

    }
    static int binarySearch(int[] array, int target) {
        return search(array, target, 0, array.length - 1);
    }

    static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end-start) / 2;

        if (array[mid] == target) {
            return mid;
        }

        if (array[mid] > target) {
            return search(array, target, start, mid - 1);
        }

        return search(array, target, mid + 1, end);
    }

}
