package დავალებები;

public class Problem4 {
/*
მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები
არის თუ არა მათემატიკურად სწორად დასმული.
 */
    Boolean isProperly (String sequence) {
        int counter = 0;

        if (sequence.substring(0, 1).equals(")")) {
            return false;
        }
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.substring(i - 1, i).equals("(")) {
                counter++;
            }
            if (sequence.substring(i - 1, i).equals(")")) {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        if (counter != 0) {
            return false;
        }
        return true;
    }
}
