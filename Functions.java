import java.lang.Math;
public class Functions {
    public static int sumofdigits(int n){
        int result=0;
        while(n>0){
            int d=n%10;
            result+=d;
            n=n/10;
        }
        return result;
    }
    public static int reverse(int x){
        int r=0;
        while(x>0){
            int d=x%10;
            r=r*10+d;
            x=x/10;
        }
        return r;
    }

   
    public static boolean palindrome(int r){
        int reverse=reverse(r);
        if(r==reverse)
        return true;
        else
        return false;
    }

    public static int binarytoDecimal(int n){
        int r=1;
        int result=0;
        while (n>0) {
            int d=n%10;
            result=result+r*d;
            r=r*2;
            n=n/10;
        }
    return result;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
            return false;
            }
        }
        return true;

    }
    public static void printPrime(int a,int b)
    {
        for (int i = a; i <=b; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        // printPrime(2, 10);
        int r=binarytoDecimal(101);
        System.out.println("Binary to decimal: "+ r);
        reverse(123);
        boolean pali=palindrome(129);
        if(pali)
        System.out.println("yes it is palindorome");
        else
        System.out.println("not palindrome");
        int dd=sumofdigits(1234);
        System.out.println(dd);
    }
}
