

    import java.text.NumberFormat;
    import java.util.Locale;
    import java.util.Scanner;

    public class six {
        
        public static void main(String[] args)
        {
            Scanner keyin = new Scanner(System.in);
            double a;
            a = keyin.nextDouble();
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(a));
            System.out.print(NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(a));
            keyin.close(); 

        }
    }
