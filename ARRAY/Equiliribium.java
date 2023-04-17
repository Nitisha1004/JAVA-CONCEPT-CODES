package ARRAY;
public class Equiliribium {
    public static void main(String[] args){
        int a[] = {2,3,4,1,5,1,3};
        int rsum=0, lsum=0;
        for(int i=0; i<a.length; i++){
            rsum+=a[i];
        }
        for(int i=0; i<a.length; i++){
            rsum-=a[i];
            if(rsum==lsum){
                System.out.println(i);
            }
            lsum+=a[i];
        }
    }

    
}
