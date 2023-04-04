// Single dimensional of array
package ARRAY;
import java.util.Scanner;
public class Array {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of Array:");
        for(int i=0; i<n ; i++){
            A[i] = sc.nextInt();

        }
        System.out.println("Enter element to be search");
        int search = sc.nextInt();
        for(int i=0; i<n ; i++){
            if(A[i]==search){
            System.out.println("Element found at index:"  +i);
        }
    
    }
}}
