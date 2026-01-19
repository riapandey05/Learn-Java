package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamexamples {
//    Filter operation in stream
    public static void main(String[] args){
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,533,0,9,7,6);
    List<Integer>filteredlist = list.stream().filter(x->x%2==0).collect(Collectors.toList());
    System.out.println(filteredlist);
//    filter is used to select elements based on a condition
//    we filter using lambda expression. The collect part is used to convert the output type (which by default we get as stream)
//    to some other type, here we are converting it to list.


//      Map
        List<Integer> squares = filteredlist.stream().map(n -> n /2).collect(Collectors.toList());
        System.out.println(squares);
//      map() is an intermediate stream operation that transforms each element of a stream into another form and returns a new stream.
//      in the output we see numbers are repeating so we can use distinct():
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,533,0,9,7,6);
        List<Integer>newlist = list2.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(5)
                .skip(1)
                .collect(Collectors.toList());
//        sorted sort krega by default ascending me...agar comparator daldia to descending me krega
//        limit(5) starting ke 5 element dega
//         skip() starting se kitne element skip krne hai vo decide krta
        System.out.println(newlist);


        //another example
        List<Integer>collect = Stream.iterate(0,x->x+1).limit(101).skip(1).collect(Collectors.toList());
        System.out.println(collect);

    } }
