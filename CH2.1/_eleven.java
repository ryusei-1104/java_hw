import java.util.Scanner;

public class _eleven {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        if(a.length() == 10 &&(a.substring(0, 1).compareTo("z")<=0 && a.substring(0, 1).compareTo("A")>=0) &&(a.substring(1, 2).equals("1") || a.substring(1, 2).equals("2") ))
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
        keyin.close();
    }
}
