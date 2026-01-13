package arraysdemo4;
import java.util.Arrays;
import java.util.Random;

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

//        binary search
        String [] sarray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sarray);
//        Binary search only works in sorted arrays.
        System.out.println(Arrays.toString(sarray));
        if(Arrays.binarySearch(sarray,"Mark")>=0){
            System.out.println("FOund Mark in the list");
        }

//        are two arrays equal check
        int [] s1 = {1,2,3,4,5};
        int [] s2 = {1,2,3,4,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }


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
