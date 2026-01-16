package JavaCollectionFramework;

import java.util.ArrayList;

public class arraylist {
    public static void main() {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);
        System.out.println(list.get(2));
        for(int i : list){
           System.out.println(i);
        }
        System.out.println(list.contains(2));
        list.remove(2);
        for(int i : list){
            System.out.println(i);
        }
        list.add(2,80);
        for(int i : list){
            System.out.println(i);
        }
        list.set(2,50);
//        2nd index replace hojaega 50 se
        System.out.println(list);

        ArrayList<Integer>list2 = new ArrayList<>(list);
        System.out.println(list2);

        ArrayList<Integer>list3 = new ArrayList<>(list);
        System.out.println(list3);

        list.add(3);
        list.add(12);
        list.add(549);
        list.add(300);
        System.out.println(list);
//        comparator is passed as null so it is sorted in increasing order
        list.sort(null);
        System.out.println(list);

    }
}
