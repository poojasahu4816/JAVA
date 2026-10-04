import java.util.*;
public class copy_num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[arr1.length];

        System.out.print("Enter arr1 elements: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.print("copied array: ");
        for(int i=0; i<arr2.length; i++){
        System.out.print(+arr2[i]+ " ");
        }
    }
}
