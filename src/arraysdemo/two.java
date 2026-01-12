package arraysdemo;
import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

public class two {
    public static void main(String[] args){
        int[] firstarray = getRandomArray(10);
        System.out.println(Arrays.toString(firstarray));
        Arrays.sort(firstarray);
        System.out.println(Arrays.toString(firstarray));

//      default value by which array gets filled in java is 0
        int [] secondarray = new int[10];
        System.out.println((Arrays.toString(secondarray)));
        Arrays.fill(secondarray,5);
        System.out.println(Arrays.toString(secondarray));

        int [] thirdarray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdarray));

        int [] fourtharray = Arrays.copyOf(thirdarray,thirdarray.length);
        System.out.println(Arrays.toString(fourtharray));
        Arrays.sort(fourtharray);
        System.out.println(Arrays.toString(fourtharray));
        System.out.println(Arrays.toString(thirdarray));

        int [] largerarray = Arrays.copyOf(thirdarray,15);
        System.out.println(Arrays.toString(largerarray));

    }
    private static int[] getRandomArray(int len){
//        this generates random numbers
        Random random = new Random();
        int [] newInt = new int[len];
        for(int i=0;i<len;i++){
//            random numbers being generated are under 100
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
