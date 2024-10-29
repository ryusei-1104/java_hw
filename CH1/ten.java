package CH1;
import java.util.Scanner;
import java.math.BigInteger;

public class ten {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        BigInteger  n;  
        n = keyin.nextBigInteger();  
        BigInteger  ans = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        BigInteger o = BigInteger.ONE;
        while (n.compareTo(c) > 0 ) {
            ans = ans.multiply(n);
            n = n.subtract(o);
        }
        System.out.println(ans.toString());      
    }
}