import java.util.*;
public class zero_remove{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter sorted array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        } 

        int i = 0;
        for(int j=0; j<arr.length; j++){
         if(arr[j] != 0){
            arr[i] = arr[j];
            i++;
           }
        }
        for(   ; i<arr.length; i++){
                arr[i] = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}