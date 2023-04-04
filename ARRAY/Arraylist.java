package ARRAY;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;

class Arraylist {
    // function for swapping
    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(12);
        int indx1 = 1, indx2 = 3;
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        list.add(2, 3);
        // list size
        int size = list.size();
        System.out.println(size);
        // set element
        list.set(4, 14);
        System.out.println(list);
        // remove
        list.remove(3);
        System.out.println(list);
        // boolean
        System.out.println(list.contains(3));
        // sort list ascending order
        Collections.sort(list);
        System.out.println(list);
        // sort list decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // print list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        // list reverse
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        // find max element
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (MAX < list.get(i)) {
                MAX = list.get(i);
            }

        }
        System.out.println("Max element is:" + MAX);
        System.out.println(list);
        swap(list, indx1, indx2);
    }

}