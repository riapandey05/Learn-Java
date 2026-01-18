package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Mycomparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return 01-02;
    }
}
class Mystringcomparator implements  Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
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


//        a comparator is used to compare 2 objects of the same type
        list.sort(new Mycomparator());
        System.out.println(list);

        List<String> words = Arrays.asList("Ramesh","SUresh","Amitesh");
        words.sort(new Mystringcomparator());
        System.out.println(words);
    }
}
