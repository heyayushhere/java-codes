public class Functionsbasics {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
    int fact=factorial(5);
    System.out.println(fact);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
  public static int factorial(int a){
    if(a==0 || a==1)
    {
        return a;
    }
    return a*factorial(a-1);
  }
}