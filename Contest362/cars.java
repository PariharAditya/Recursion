package Contest362;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cars {
    public static void main(String[] args) {
        List<List<Integer>> nums = List.of(
                List.of(1, 3),
                List.of(2, 5),
                List.of(4, 7));

        int result = numberOfPoints(nums);
        System.out.println(result);

        System.out.println(numberOfPoints(nums));
    }

    static public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> points = new HashSet<>();

        for (List<Integer> list : nums) {
            int start = list.get(0);
            int end = list.get(1);

            for (int i = start; i <= end; i++) {
                points.add(i);

            }
        }

        return points.size();
    }
}
