package ARRAY;
public class SelectionSort {
        public static void main(String args[]) {
            int [] a = {2,6,7,3,1};
            for(int i =0; i<a.length-1; i++) {
                int min =i;
                for(int j=0+i; j<a.length; j++) {
                    if(a[min]>a[j]) {
                     min =j;
                    }
                }
                    int temp = a[min];
                    a[min] = a[i];
                    a[i]=temp;
            
        }
        for(int i =0; i<a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    }
    

