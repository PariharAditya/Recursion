package Array;
public class RecursionArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 0 };
        System.out.println(sorted(array, 0));
        System.out.println(linearSearch(array, 0, 9));
    }

    // sorted array
    static boolean sorted(int[] array, int index) {
        if (index == array.length - 1)
            return true;

        return array[index] < array[index + 1] && sorted(array, index + 1);
    }

    static boolean linearSearch(int[] array, int index, int search)
    {
        if(index == array.length) return false;

        if(array[index] == search) return true;

        return  linearSearch(array, index+1, search);
    }

}
