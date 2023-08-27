package StringQuestion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));        
    }
    static String getPermutation(int n, int k) {
            int fact = 1;
            List<Integer> num = new ArrayList<>();
    
            for(int i = 1; i < n; i++) {
                fact*=i;
                num.add(i);
            }
            num.add(n);
            String ans = "";
            k = k-1;
            while(true) {
                ans+= num.get(k/fact);
                num.remove(k/fact);
    
                if(num.size() == 0) {
                    break;
                }
                k%=fact;
                fact/=num.size();
            }
            return ans;
        }
    
}
