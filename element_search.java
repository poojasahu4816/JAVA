import java.util.*;
public class element_search {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int given_num = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == given_num){
               System.out.println("Element found found" );
               return;
            }
            
        }
        System.out.println("Element not found ");

        sc.close();
     }
}
