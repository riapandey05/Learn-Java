package Arrays;
import java.util.Random;

public class two {
    public static void main(String[] args){
        int[] firstarray = getRandomArray(10);
        System.out.println(Arrays.toString(firstarray));
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int [] newInt = new int[len];
        for(int i=0;i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
