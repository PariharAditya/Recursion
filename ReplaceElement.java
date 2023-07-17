import java.util.Arrays;

public class ReplaceElement {
    public static void main(String[] args) {
        int[] nums = { 17, 18, 5, 4, 6, 1 };
        System.out.println(Arrays.toString(replaceElements(nums)));
    }

    static int[] replaceElements(int[] A) {
        for (int i = A.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(A[i], A[i] = mx);
        return A;
    }
}
