import java.util.Scanner;

public class _twelve {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        a = keyin.next();
        b = keyin.next();
        System.out.print(a.substring(1,2).toUpperCase() + a.substring(2) + a.substring(0,1).toLowerCase() + "ay ");
        System.out.print(b.substring(b.length()-1,b.length()).toUpperCase()  + b.substring(0,b.length()-1).toLowerCase() + "er");
        keyin.close();
    }
}
