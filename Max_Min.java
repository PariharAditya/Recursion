public class Max_Min {
    public static void main(String[] args) {
        int[] array = {12,1,2,323,-13};
        System.out.println(min(array, 0));
        System.out.println(Max(array, 0));
    }

    static int min(int[] array, int index) {
        if (index == array.length - 1) {
            return array[0];
        }

        return Math.min(array[index + 1], min(array, index + 1));
    }

    static int Max(int[] array, int index) {
        if (index == array.length-1) {
            return array[0];
        }

        return Math.max(array[index+1], Max(array, index+1));
    }
}
