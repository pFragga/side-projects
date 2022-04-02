package my_apps;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) {
        
        int[] arr = {45, 23, 12, 13, 11, 24, 90};
        App.InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}