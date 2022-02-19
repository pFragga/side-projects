/**
 * A couple of exercises I found on the internet one day to practice my coding in Java.
 *  
 * AUTHOR: Petros Frangatzis
 */

package my_apps;

/**
 * App
 */
public class App {

    /**
     * Search a list of integers for the given one.
     * @param n : the integer you are looking for
     * @param list
     * @return -1 if n is not in list, else the index of n
     */
    public static int search(int n, int[] list) {

        for (int i = 0; i < list.length; i++) {
            if (list[i] == n) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Reverses given string.
     * @param s
     * @return s reversed.
     */
    public static String reverseStr(String s) {

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(s.length() - i - 1);
        }
        return temp;
    }

    /**
     * Find the largest integer in in a list.
     * @param list
     * @return largest integer
     */
    public static int maximum(int[] list) {

        int max = list[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        } // enhanced for loop
        return max;
    }

    /**
     * Find the average in a list of integers.
     * @param list
     * @return average
     */
    public static double average(int[] list) {

        double avg = 0;
        for (int i : list) {
            avg += i;
        }

        return avg / list.length;
    }

    /**
     * Get the n-th odd element in a list of integers.
     * @param list
     * @param n
     * @return n-th odd element
     */
    public static int getOddElement(int[] list, int n) {

        if (n > list.length) {
            return -1;
        }

        int index = 0;
        for (Integer integer : list) {
            if (integer != 0 && integer % 2 != 0) {
                if (index < n) {
                    index++;
                }

                if (index == n) {
                    return integer;
                }
            }
        }

        return 0;
    }

    /**
     * 
     * @param i
     * @return
     */
    public static String fizzBuzz(Integer i) {

        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return i.toString();
        }
    }

    /**
     * 
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {

        if (n == 2 || n == 3) {
            return true;
        }

        if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i*i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}