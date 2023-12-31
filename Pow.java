public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.000, 10));
        System.out.println(recursiveWay(2.000, 10));        
    }
    static double myPow(double x,int n) {
        double ans = 1.0;
        long nn = n;

        // handling edge case 
        if (nn < 0) nn = -1*nn;

        /*if power to raised is even we would multiply x*x and n/2   
         * else subtract the power-1 and multiply the ans with X 
        */
        while (nn>0) {
            if (nn%2 == 1) {
                ans = ans*x;
                nn = nn-1;
            } else {
                x = x*x;
                nn = nn/2;
            }
        }

        if (n < 0) {
            ans = 1.0/(ans);
        }

        return ans;
    }
    
    static double recursiveWay(double x, int n) {
        if (n==0) {
            return 1.0;
        }

        if (n%2==0) {
            double ans = myPow(x, n/2);
            return ans*ans;
        } else {
            double ans = myPow(x, (n-1)/2);
            return x*ans*ans;
        }
    }

}
