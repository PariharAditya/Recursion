public class Recursion_1 {

    public static void main(String[] args) {
        // System.out.println(rvs(124));
        // System.out.println(isOrNot(124));
        // System.out.println(countZero(5050));
        System.out.println(countZero(14));
        System.out.println(count(10, 0));

    }

    static int rvs(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    //reversing
    static int helper(int n, int digit) {
        if (n % 10 == 0)
            return n;

        int rem = n % 10;

        return (int) (rem * Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }
    
    //Palindrome
    static boolean isOrNot(int n) {
        return n==rvs(n);
    }

    //counting
    static int countZero(int n){
        return countReduce(n, 0);

    }

    static int count(int n, int zero)
    {
        if(n==0) return zero;
        
        int rem = n%10;
        if (rem == 0) return count(n/10, zero+1);           
        
        return count(n/10, zero);
    }

    static int countReduce(int n, int zero)
    {
        if(n==0) return zero;
        
        if (n%2==0) 
        {
         return countReduce(n/2, zero+1);    
        }
        return countReduce(n-1, zero+1);
    }

}