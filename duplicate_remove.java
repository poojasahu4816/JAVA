import java.util.*;
public class duplicate_remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter sorted array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print(arr[0]+ " ");
        for(int i=1; i<arr.length; i++){
           if(arr[i] != arr[i-1]){
            System.out.print(+arr[i]+ " ");
           }
        }
    }
}
