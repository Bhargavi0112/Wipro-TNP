import java.io.*;
import java.util.*;

class UserMainCode {
    public String identifyPossibleWords(String input1, String input2) {
        String pattern = input1.toUpperCase().replace("_", "[A-Z]");
        String[] words = input2.split(":");
        
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.toUpperCase().matches(pattern)) {
                if (result.length() > 0) {
                    result.append(":");
                }
                result.append(word.toUpperCase());
            }
        }
        
        if (result.length() == 0) {
            return "ERROR-009";
        }
        
        return result.toString();
    }
}