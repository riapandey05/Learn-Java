package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamexamples2 {


    public static void main(String[] args) {
//       Peek in streams
       List<Integer>collect = Stream.iterate(0,x->x+1)
               .limit(101)
               .skip(1)
               .filter(x->x%2==0)
               .map(x->x/10)
               .distinct()
               .sorted()
               .peek(x->System.out.println(x))
               .collect(Collectors.toList());


//       Min , Max and Count (Terminal operations)
       Integer collect2 = Stream.iterate(0, x->x+1)
               .limit(101)
               .map(x->x/10)
               .distinct()
               .peek(System.out::println)
               .max((a,b)->a-b)
               .get();
       System.out.println("Max integer is" + " "+collect2);

//      Count returns long
        Long collect3 = Stream.iterate(0, x->x+1)
                .limit(101)
                .map(x->x/10)
                .distinct()
                .count();
        System.out.println("count is" + " "+collect3);


    }
}
