import java.io.*;
import  java.util.*;
class UserMainCode
{
public int findStringCode(String input1){
    String[] words = input1.split(" ");
    StringBuilder resultStr = new StringBuilder();
    for (String word : words) {
        int left = 0;
        int right = word.length() - 1;
        int wordSum = 0;
        while (left < right) {
            char c1 = Character.toUpperCase(word.charAt(left));
            char c2 = Character.toUpperCase(word.charAt(right));
            int diff = Math.abs((c1 - 'A' + 1) - (c2 - 'A' + 1));
            wordSum += diff;
            left++;
            right--;
        }
        if (left == right) {
            char mid = Character.toUpperCase(word.charAt(left));
            wordSum += (mid - 'A' + 1);
        }
        resultStr.append(wordSum);
    }
    return Integer.parseInt(resultStr.toString());
}
}