import java.util.*;
public class print_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int avg = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
            avg = (sum/2);
             System.out.print("Average of array = " +avg);  

        sc.close();
     }
}
