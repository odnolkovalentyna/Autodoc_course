package lessons;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class PracticeCodewars {
    public static void main(String[] args) {
//        PracticeCodewars pc = new PracticeCodewars();
//        System.out.println(pc.toJadenCase("How can mirrors be real if our eyes aren't real"));
//        System.out.println(validatePin("523456"));
//
//        ArrayList<int[]> list = new ArrayList<int[]>();
//        list.add(new int[]{10, 0});
//        list.add(new int[]{3, 5});
//        list.add(new int[]{2, 5});
//        System.out.println(countPassengers(list));
//        System.out.println(paperWork(0, 5));
//        System.out.println(Past(0, 1, 1));


    }


    /**
     * Clock shows h hours, m minutes and s seconds after midnight.
     * Your task is to write a function which returns the time since midnight in milliseconds.
     */
    public static int Past(int h, int m, int s) {
        return ((((h * 60) + m) * 60) + s) * 1000;
    }

    /**
     * Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
     * Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
     */

    public static int paperWork(int n, int m) {
        int allPages = n * m;
        if (n <= 0 || m <= 0) {
            allPages = 0;
        } else {
            allPages = n * m;
        }
        return allPages;

    }


    /**
     * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
     * If the function is passed a valid PIN string, return true, else return false.
     * Examples (Input --> Output)
     * "1234"   -->  true
     * "12345"  -->  false
     * "a234"   -->  false
     */
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    /**
     * For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
     * Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
     * Example:
     * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
     * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
     * Note that the Java version expects a return value of null for an empty string or null.
     */
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

    /**
     * There is a bus moving in the city which takes and drops some people at each bus stop.
     * You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.
     * Your task is to return the number of people who are still on the bus after the last bus stop (after the last array). Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D
     * Take a look on the test cases.
     * Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the returned integer can't be negative.
     * The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
     */


    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int i = 0; i < stops.size(); i++) {
            for (int j = 0; j < stops.get(i).length; j++) {
                switch (j) {
                    case 0 -> result += stops.get(i)[j];
                    case 1 -> result -= stops.get(i)[j];
                }
            }
        }
        return result;
    }


}
