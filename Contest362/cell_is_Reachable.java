package Contest362;

public class cell_is_Reachable {
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(2, 4, 7, 7, 6));
    }

    static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (t < 0) {
            return false;
        }

        if (sx == fx && sy == fy) {
            return true;
        }

        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < 8; i++) {
            int newX = sx + dx[i];
            int newy = sy + dy[i];

            if (isReachableAtTime(newX, newy, fx, fy, t-1)) {
                return true;
            }
        }
        return false;
    }
    static boolean mathWay(int sx, int sy, int fx, int fy, int t) {
        /* For min step to reach des we can go diagonally & then vertical or horizotal 
        for going diagonally = Math.min(xDiff, yDiff) 
        for going horizontal or vertical =  Math.abs(xDiff-yDiff) 
        */        
        int xDiff = Math.abs(sx - fx), yDiff = Math.abs(sy - fy);

        if(xDiff == 0 && yDiff == 0 && t == 1) return false;

        return Math.min(xDiff, yDiff) + Math.abs(xDiff-yDiff) <= t;
    }
}
