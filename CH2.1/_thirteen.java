import java.util.Scanner;

public class _thirteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        a = a.replace("I", "i");
        a = a.replaceAll("hate", "Love");
        
        for(int i = 0;i<=a.length()-4;i++)
        {
            if(a.substring(i, i+4).equalsIgnoreCase("java"))
            {
                a = a.replaceAll(a.substring(i, i+4),"JAVA");
            }
        }
        a = a.replace(" ", "");
        System.out.print("***" + a + "***");
        keyin.close();
    }
}
