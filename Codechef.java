import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t>0) {
         float a=sc.nextInt();
         float commission=(a*20)/100f;
         System.out.println(commission);
         float result=100/commission;
         
         t=t-1;
         System.out.println(result);
        }
    }
}
