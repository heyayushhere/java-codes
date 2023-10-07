import java.util.Scanner;

public class Learn {
    public static int prime(int x){
        for (int i = 2; i <x; i++) {
            if(x%i==0)
            return 0;

        }
        return 1;
    }
    public static int[] sumofint(int x){
        int evensum=0;
        int oddsum=0;
        if(x%2==0){
            evensum=evensum+x;
        }
        else{
            oddsum=oddsum+x;
        }
        int[] result={evensum,oddsum};
        return result;
    }
    public static void main(String[] args) {
        // int s=prime(37);
        // if(s==0){
        //     System.out.println("Not Prime");
        // }
        // else{
        //     System.out.println("Prime");
        // }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
