public class RecursiveDigitSum 
{
public static void main(String[] args) 
{
    System.out.println(superDigit("9875", 4));
}
static int superDigit(String n, int k) 
{
    int finalAns = 0;
    for (int i = 0; i < n.length(); i++) 
    {
      finalAns += (n.charAt(i)-'0')*k;
    }
    return reduction(finalAns);
}
static int reduction(int n)
{
    while (Math.floor(Math.log10(n)) + 1 != 1) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n = n / 10;
        }
        n = res;
    }
    return Math.toIntExact(n);
}
}
