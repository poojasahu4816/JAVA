import java.util.*;
public class shorted_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array element: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
              count++;
            }

        }
           if(count == 0){
            System.out.println("Array is sorted.");
           }
           else{
            System.out.println("Array is not sorted.");
           }
    }
}
