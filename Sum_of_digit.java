public class Sum_of_digit {

    public static void main(String[] args) {
        System.out.println(helper(12345));
        // System.out.println(calculator(12345));
        // System.out.println(calculator(45632));
    }

    // static int calculator(int n) {
    //     int sum = 0;
    //     return helper(sum, n/10);
    // }

    private static int helper(int n) {
        
        if (n == 0) {
            return 0;
        }

        // sum+= n%10;

        return (n%10+helper(n/10));
    }

}