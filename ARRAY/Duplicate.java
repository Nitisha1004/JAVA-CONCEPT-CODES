package ARRAY;

public class Duplicate {
    public static int FindDuplicate(int [] num){
        int s= num[0];
        int f = num[0];
        do{
             s= num[s];
             f = num[num[f]];
        }while(s!=f);
        f = num[0];
        while(s!=f){
            s=num[s];
            f=num[f];
        }
        return s;
    }
    public static void main(String args[]){
        int [] num = {2, 5,9,6,9,3,8,9,7,1};
        FindDuplicate(num);

    }
    
}
