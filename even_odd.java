import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] arr = {04, 24, 21, 11, 89};

       int evenCount = 0;
       int oddCount = 0;

       for(int i=0; i<arr.length; i++){
         if(arr[i] % 2 == 0){
             evenCount++;
         }
         else{
            oddCount++;
         }
       }
    
       System.out.println("total even numbers = " +evenCount);
       System.out.println("total odd numbers = " +oddCount);

       sc.close();
       
    }
}
