package CH1;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String first;
        String last;
        first = keyin.next();
        last = keyin.next();
        String f_h ;
        String l_h ;
        f_h = first.substring(0,1).toLowerCase() ;
        l_h = last.substring(0,1).toLowerCase();
        String f_s ;
        String l_s ;
        f_s = first.substring(1,2).toUpperCase() ;
        l_s = last.substring(1,2).toUpperCase() ;

        System.out.println( f_s + first.substring(2) + f_h + "ay " + l_s + last.substring(2) + l_h + "ay");
    }
}
