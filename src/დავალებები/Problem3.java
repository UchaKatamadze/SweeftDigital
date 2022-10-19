package დავალებები;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    /*
    მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი და აბრუნებს
    მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
     */
    int notContains(Integer[] array) {
        Integer[] a = array;
// Checking the size of an array
        int lengthOfArray = a.length;
// Defining the minimal positive number we ar looking for
        int positive = 0;
// Sorting the array
        Arrays.sort(a);
// Take all positive numbers from the sorted array
        for (int i = 0; i < lengthOfArray; i++) {
            if (a[i] > 0) {
                positive = i;
                break;
            } else {
                continue;
            }
        }
        Integer[] positiveArr = Arrays.copyOfRange(a, positive, lengthOfArray);
        int arrayLength = positiveArr.length;

        for(int i=1; i<positiveArr.length; i++){
            if(positiveArr[i]-positiveArr[i-1] > 1){
                return positiveArr[i-1] +1;
            }
        }return positiveArr[positiveArr.length -1] +1;
    }
}