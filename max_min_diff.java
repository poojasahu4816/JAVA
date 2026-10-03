import java.util.*;
public class max_min_diff {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter array element: ");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int min = arr[0];
 
    for(int i=0; i<arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }
    for(int i=0; i<arr.length; i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }

        int diff = (max - min);

        System.out.println("Difference between max element and min element: " +max+ " - " +min+ " = " +diff);
    }
}