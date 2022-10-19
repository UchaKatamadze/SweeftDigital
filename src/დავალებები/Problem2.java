package დავალებები;

import java.util.Scanner;

public class Problem2 {
/*
გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა(თეთრებში) და აბრუნებს მონეტების
მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდავოთ.
 */
        public int minSplit(int amount) {
            int a = amount;
            int b = 0;

            int c = a%50;
            int d = b/20;

            int e = b%20;
            int f = b/10;

            int g = b%10;
            int h = b/5;

            return(h+f+d+c);
        }
}