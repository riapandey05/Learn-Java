package Regex;

public class First {
    public static void main(String[] args) {

        // -------- Example 1: Normal strings (NOT character classes) --------
        String testString = "Anyone can Learn abc's, 123's, and any regular 123 expression";
        String replacement = "(-)";

        String[] patterns = {
                "ab|bc",   // either ab or bc
                "123",   // matches the exact word "123"
                "[A-Z0-9]*$"      // matches capital A
        };

        for (String pattern : patterns) {
//            replacefirst replaces only first occurence of the pattern
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern: " + pattern + " => " + output);
        }

        System.out.println(); // just for spacing in output

        // -------- Example 2: Character classes --------
        String testString2 = "AAAnyone any can Learn abc's, 123's, and any regular 123 expressionAA";
        String replacement2 = "(-)";

        String[] patterns2 = {
                "[abc]", // matches ANY ONE of: a OR b OR c
                "[123]",// matches ANY ONE of: 1 OR 2 OR 3
            "[0-9]+",
//                replaces 1 or more occurence
                "[A]{2}$",// same as "A" , 2ocurences replaces
                "^[A]",
                "[aA]ny\\b"
        };

        for (String pattern2 : patterns2) {
            String output2 = testString2.replaceFirst(pattern2, replacement2);
            System.out.println("Pattern: " + pattern2 + " => " + output2);
        }
    }
}
