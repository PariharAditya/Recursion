public class Handshake {
    public static void main(String[] args) {
        System.out.println(count(4)); 
    }

    static int count(int N) {
        if (N==0) {
            return 1;
        }

        int total = 0;

        for (int i = 2; i <= N; i+=2) {
            int left = count(i-2); // Since P1 meet Pn so for P2 total number of person i-2
            int right = count(N-i);

            total += left*right; 
        }
        return total;    
    }
}
