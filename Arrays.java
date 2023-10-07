public class Arrays {
    public static void printsub(int arr[]){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(arr[j2]+" ");
                    
                }total++;
            }System.out.println();
        }
        System.out.println("total:"+total);
    }
    public static void reverse(int arr[]){
        int s=0,e=arr.length-1;
        while (s<=e) {
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }

    public static int binarysearch(int arr[],int target){
        int s=0,e=arr.length-1;
        while (s<=e) {
            int mid=(s+e)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid+1;
            }
            else{
                s=mid+1;
            }
        }return -1;

    }
    public static int linearsearch(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
            
        }
        return -1;
    }
    public static int line(int ind,int arr[],int target,int n){
        
        if(arr[ind]==target)
        return ind;
        if(ind>n-1){
        return -1;
    }
        return line(ind+1,arr,target,n);
        
    }
    public static int larget(int arr[]){
        int largest=Integer.MIN_VALUE;
        System.out.println(largest);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }return largest;
    }
    public static void pairs(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            int current=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + current +"," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,9};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        pairs(arr);
        printsub(arr);
        // int good=line(0, arr, 7,arr.length);
        // System.out.println(good);
        // System.out.println("the largest in the array:"+larget(arr));
        // int hello=binarysearch(arr, 9);
        // System.out.println(hello);
        // int d=linearsearch(arr, 66);
        // if(d==-1)
        // System.out.println("it is not present");
        // else
        // System.out.println("it is present at index "+d);

    }
}
