package დავალებები;

import java.util.Scanner;

public class Problem5 {
    /*
    გვაქვს n საფეხურიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ ფუნქცია რომელიც დათვლის n
    სართულზე ასვლის ვარიანტების რაოდენობას.
     */
    static int countVariants(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return (countVariants(num - 2) + countVariants(num - 1));
        }
    }
}