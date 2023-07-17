public class PrintingN {
    public static void main(String[] args) {
        fxn(5);
    }
    static void fxn(int N)
    {
     if (N==0) {
        return;
     }
     fxn(N-1);
     System.out.print(N+" ");
    }
}
