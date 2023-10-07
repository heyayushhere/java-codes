public class Patterns {
    public static void learning(int n){
        
        for (int i = 1; i <=n; i++) {
            int c=1;
            int d=4;
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    c=i;
                    c=c+d;
                    d=d-1;
                    
                    System.out.print(c);
                }
                else{
                System.out.print(i);
                }
            }System.out.println();
        }
    }
    public static void butterfly(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
                for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void triangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void floyd(int n){
        int c=1;
        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <=i; j++) {
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // floyd(5);
        // triangle(5);
        butterfly(4);
        learning(4);
        // int n=6;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int h = 1; h <=i; h++) {
        //         System.out.print(i+" ");
                
        //     }

        //     for (int k = 1; k <=n-i; k++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n; j++) {
        //         if(i==1 || i==n || j==1 || j==n)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = i; k >=1; k--) {
        //         System.out.print(k+" ");
        //     }
        //     for (int k = 2; k <=i; k++) {
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        // }
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=n; j++) {
        //         System.out.print("*");
        //     }
        // }
        // System.out.println();
    }
    
}
