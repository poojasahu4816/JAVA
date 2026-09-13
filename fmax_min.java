import java.util.*;
public class fmax_min{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] arr = {04, 24, 21, 11, 89};

       int max = arr[0];
       for(int i=1; i<arr.length; i++){
         if(arr[i] > max){
            max = arr[i];
         }
       }
       System.out.println("Maximum element = " +max);
      
       int min = arr[0];
       for(int i=1; i<arr.length; i++){
         if(arr[i] < min){
            min = arr[i];
         }
       }
        System.out.println("Minimum element  = " +min);
       sc.close();
       
    }
}
