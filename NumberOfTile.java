import java.util.HashSet;
import java.util.Set;

public class NumberOfTile {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));

    }

    static int numTilePossibilities(String tiles) {
       Set<String> temp = new HashSet<>();
       boolean[] array = new boolean[tiles.length()];
       backtrack("", temp, array, tiles, tiles.length());

       return temp.size()-1;
    }

    static void backtrack(String ans, Set<String> tempList, boolean[] visited, String tiles, int len) {
        tempList.add(ans);
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(ans+tiles.charAt(i), tempList, visited, tiles, len);
                visited[i] = false;
            }
        }
    }
}
