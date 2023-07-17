import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // System.out.println(fib(10));
        
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking number of testcases    
        int t = sc.nextInt();
        while (t-- > 0) {
            //taking n(number of elements) and r(range) as input
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(Geekonacci(A,B,C,N));           
        }
        sc.close();
    }

    static int fib(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
    static long Geekonacci(int A, int B, int C, int N) {
        if (N == 1)
            return A;
        
        if (N == 2)
            return B;
        
        if (N == 3)
            return C;

        return Geekonacci(A,B,C,N - 1) + Geekonacci(A,B,C,N - 2) +Geekonacci(A,B,C,N - 3);
    }
}
