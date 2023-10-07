import java.util.Scanner;

public class Basicpatters {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int row=sc.nextInt();
    //     char ch='A';
    //     for (int i = 1; i <= row; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(ch+" ");
    //             ch++;
    //         }System.out.print("\n");
    //     }
    //     sc.close();
    // }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || i==4 || j==0 || j==4) {
                    System.out.print("*");
                    
                }
                else{
                System.out.print(" ");
                }
               
            }System.out.println();
            
        }
    }
}
