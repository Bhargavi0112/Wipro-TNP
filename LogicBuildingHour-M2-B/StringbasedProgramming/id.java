imort java.io.*;
import java.util.*;
class UserMainCode {
public String userIdGeneration(String input1, String input2, int input3, int input4) {
    String pin = String.valueOf(input3);
    String smaller;
    String longer;
    
    if (input1.length() < input2.length()) {
        smaller = input1;
        longer = input2;
    } else if (input2.length() < input1.length()) {
        smaller = input2;
        longer = input1;
    } else {
        if (input1.compareTo(input2) < 0) {
            smaller = input1;
            longer = input2;
        } else {
            smaller = input2;
            longer = input1;
        }
    }
    
    char lastLetterOfSmaller = smaller.charAt(smaller.length() - 1);
    int n = input4;
    char digitLeftToRight = pin.charAt(n - 1);
    char digitRightToLeft = pin.charAt(pin.length() - n);
    
    String userId = lastLetterOfSmaller + longer + digitLeftToRight + digitRightToLeft;
    
    StringBuilder toggled = new StringBuilder();
    for (int i = 0; i < userId.length(); i++) {
        char c = userId.charAt(i);
        if (Character.isUpperCase(c)) {
            toggled.append(Character.toLowerCase(c));
        } else if (Character.isLowerCase(c)) {
            toggled.append(Character.toUpperCase(c));
        } else {
            toggled.append(c);
        }
    }
    
    return toggled.toString();
}