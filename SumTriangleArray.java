import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        // Recursive function that will print answer
        FunctionMain(x);
        System.out.println(Arrays.toString(x));
    }

    static void FunctionMain(int[] n) {

        if (n.length == 1) {
            return;
        }

        int[] temp = new int[n.length - 1];

        helperFunction(temp, n, 0);
        FunctionMain(temp);

        System.out.println(Arrays.toString(temp));
    }

    private static int[] helperFunction(int[] array, int[] n, int index) {
        if (index == n.length - 1) {
            return array;
        }
        array[index] = n[index] + n[index + 1];

        return helperFunction(array, n, index + 1);
    }
}
