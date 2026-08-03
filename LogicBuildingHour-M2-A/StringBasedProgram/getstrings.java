import java.io.*;
import java.util.*;

class UserMainCode {
    public int getCodeThroughStrings(String input1) {
        String[] words = input1.trim().split("\\s+");
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        while (totalLength >= 10) {
            int sum = 0;
            int temp = totalLength;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            totalLength = sum;
        }

        return totalLength;
    }
}