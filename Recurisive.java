public class Recurisive {
    public static double hello(double a,double n){
        return Math.pow(a, n);
    }
    public static void intial(int a,int n){
        
    }
    public static void main(String[] args) {
        double nooo=hello(3, 4);
        System.out.println(nooo);
        int d=sumofN(10);
        System.out.println(d);
        int[] a={1,2,3,4,5};
        f(0, a, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }
    }   
    public static int sumofN(int n){
        if(n==0)
        return 0;
        return n+sumofN(n-1);
    } 
    public static void swap(int x,int y){
        int z=y;
        y=x;
        x=z;
    }
    public static void f(int i,int[] a,int n){
        if(i>=(n/2)){
            return;
        }
        int z=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=z;

        f(i+1, a, n);

    }
}
