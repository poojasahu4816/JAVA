import java.util.*;
public class frequency_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                count++;
            }
        }
            System.out.println("frequency is "+count);
    }
}
