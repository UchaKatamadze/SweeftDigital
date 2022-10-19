package დავალებები;

import java.util.Scanner;

public class Problem1 {
//დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი და აბრუნებს პალინდრომია თუ არა.
    public boolean isPalindrome(String text){
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        StringBuilder reverseString = new StringBuilder(sb.toString());
        if(text.equals(reverseString)) {
            return true;
        } else{
            return false;
        }
    }
}
