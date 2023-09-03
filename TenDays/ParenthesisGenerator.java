package TenDays;

import java.util.ArrayList;

public class ParenthesisGenerator {
    public static void main(String[] args) {
        
    }
    public static ArrayList<String> validParenthesis(int n){
        ArrayList<String> result = new ArrayList<>();
        combicombination(result, 0, 0, n, "");
        return result;
    } 
    static void combicombination(ArrayList<String> ans,  int left, int right, int n, String generator) {
        if (generator.length() == 2*n) {
            ans.add(generator);
            return ;
        }

        if (left < n) {
            combicombination(ans, left+1, right, n, generator+'(');
        }

        if (right < left) {
            combicombination(ans, left, right+1, n, generator+')');
        }
    }
}
