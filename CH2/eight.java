import java.util.Scanner;

public class eight {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a_name,b_name,c_name;
        int a_num,b_num,c_num,a_pr,b_pr,c_pr;
        a_name = keyin.next();
        a_num = keyin.nextInt();
        a_pr = keyin.nextInt();
        b_name = keyin.next();
        b_num = keyin.nextInt();
        b_pr = keyin.nextInt();
        c_name = keyin.next();
        c_num = keyin.nextInt();
        c_pr = keyin.nextInt();
        System.out.println(a_name+ " " + a_num + " " + a_pr + " " + a_num*a_pr);
        System.out.println(b_name+ " " + b_num + " " + b_pr + " " + b_num*b_pr);
        System.out.println(c_name+ " " + c_num + " " + c_pr + " " + c_num*c_pr);
        System.out.print("sum " + (a_num*a_pr+ b_num*b_pr+ c_num*c_pr));
        
        
        keyin.close(); 
    }
}
