package ARRAY;
import java.util.Scanner;
public class Maxsum {
    static void sumSub(int [] a, int n ,int s){
        int count=0;
        for(int i=0; i<n; i++){
            count = a[i];
            if(count==s){
                System.out.println("found at index:" +i);
                return;

            }
            else{
                for(int j=i+1; j<n; j++){
                    count += a[j];
                    if(count==s){
                        System.out.println("found at index" +i +"&" +j);
                        return;
                    }
                }
            }
        }
        System.out.println("array not found");
        return;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0 ; i<n; i++){
        a[i]= sc.nextInt();
        }
        int s = sc.nextInt();
        sumSub(a, n, s);
        
    }
    
}
