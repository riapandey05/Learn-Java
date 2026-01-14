package WithoutGenerics;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);
//      You have to manually typecase
        String str = (String) list.get(0);
//      Besides it is not type safe because at compile time if ure casting,then even if ure trying to acess
//        a diff datatype it won't show error.
//       At runtime it will show classcastexception
        String str1 = (String) list.get(1);

    }
}
// Above code has 3 major issues
//No Type safety
//Manual casting
//No Compile Time checking
//These issues can be solved by Generics