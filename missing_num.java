import java.util.*;
public class missing_find {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enetr array element: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int expected_sum = n*(n+1)/2;
        int actual_sum = 0;
        for(int i=0; i<arr.length; i++){
            actual_sum = actual_sum + arr[i];
        }
        int missing = expected_sum - actual_sum;
        System.out.println("Missing number is: " +missing);
    }
}
