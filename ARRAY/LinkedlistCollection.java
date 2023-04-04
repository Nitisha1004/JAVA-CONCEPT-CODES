package ARRAY;
import java.util.*;
public class LinkedlistCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        for(int i =0; i<list.size(); i++){
            if(list.get(i)==6){
                list.remove(i);

            }
        }
        System.out.println(list);
        list.addLast(6);
        System.out.println(list);
        
    }
    
}
