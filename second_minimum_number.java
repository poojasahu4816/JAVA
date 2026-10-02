import java.util.*;
public class second_largest_ele {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int second_min = arr[1];

        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                second_min = min;
                min = arr[i];
            }
            else if(arr[i] < second_min && arr[i] != min ){
                second_min = arr[i];
                }
            }
        
        System.out.println(+second_min);
    }
}
