package TenDays;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    public static void main(String[] args) {
        // List<List<Integer>> answer = new ArrayList<>();
        System.out.println(solution(1, 1, 3, 2)); 
        

    }

    static List<List<Integer>> solution(int n, int source, int target, int auxiliary) {
        List<List<Integer>> moves = new ArrayList<>();
        if (n == 1) {
            List<Integer> move = new ArrayList<>();
            move.add(source);
            move.add(target);
            moves.add(move);
            return moves;
        }
        
        // Move n-1 disks from source to auxiliary using target as auxiliary
        moves.addAll(solution(n - 1, source, auxiliary, target));
        
        // Move the nth disk from source to target
        List<Integer> move = new ArrayList<>();
        move.add(source);
        move.add(target);
        moves.add(move);
        
        // Move the n-1 disks from auxiliary to target using source as auxiliary
        moves.addAll(solution(n - 1, auxiliary, target, source));
        
        return moves;
    }
}
