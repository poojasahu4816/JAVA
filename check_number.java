import java.util.*;
public class print_array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;


        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
               zero++;
            }
            else if(arr[i]%2 == 0){
                positive++;
            }
            else{
                negative++;
            }
        }
      
        System.out.println("positive number is " +positive);
        System.out.println("negative number is " +negative);
        System.out.println("zero number is " +zero);

        sc.close();
     }
}
