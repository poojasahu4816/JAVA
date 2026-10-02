import java.util.*;
public class second_largest_ele {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int second_largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(largest < arr[i]){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] != largest ){
                second_largest = arr[i];
                }
            }
        
        System.out.println(+second_largest);
    }
}
