package CH3;

import java.util.Scanner;

public class four
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.next();
        switch (a) {
            case "1": case "2": case "3": case "4": case "5":
                System.out.print("day");
                break;
            case "6":
                System.out.print("night");
                break;
            case "7":
                System.out.print("rest");
                break;
            default:
                System.out.print("Input Error");
                break;
        }
        keyin.close();
    }    
}
