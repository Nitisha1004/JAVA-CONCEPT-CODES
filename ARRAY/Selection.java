package ARRAY;
import java.util.Scanner;
public class Selection {
   

 public static void Arraylist(int a[]){
    for(int i=0; i<a.length; i++){
        System.out.print(a[i] + " ");
    }

 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n ; i++){
            a[i] =  sc.nextInt();

        }
    // SELECTION SORT
        for(int i=0; i<a.length-1; i++){
            int smallest = i;
             for(int j=0+i; j<a.length; j++){
                if(a[smallest]>a[j]){
                    smallest = j;
                }

             }
             int temp = a[smallest];
             a[smallest] = a[i];
             a[i] = temp;

        }
        Arraylist(a);
    }
}
    
