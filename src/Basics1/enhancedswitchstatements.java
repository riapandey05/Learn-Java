package Basics;

public class enhancedswitchstatements {

    public static String getQuarter(String month) {
        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> "Invalid month";
        };
    }

    public static void main(String[] args) {
        System.out.println(getQuarter("JAN"));
    }
}
