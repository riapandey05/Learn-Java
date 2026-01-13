package arraysdemo4;

import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class threechallenge {
    public static void main(String[] args) {
        Integer[] myarray = getRandomArray(10);
        Arrays.sort(myarray, Collections.reverseOrder());
        System.out.println(Arrays.toString(myarray));
    }
    private static Integer[] getRandomArray(int len){
//        this generates random numbers
        Random random = new Random();
        Integer [] newInt = new Integer[len];
        for(int i=0;i<len;i++){
//            random numbers being generated are under 100
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
