import java.io.*;
import java.util.*;
class UserMainCode {
    public int nnGenerator(String input1) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = input1.length();
        
        while (i < n) {
            int startParity = (input1.charAt(i) - '0') % 2;
            int sum = 0;
            int j = i;
            
            while (true) {
                sum += (input1.charAt(j) - '0');
                j++;
                
                if (j == n) {
                    break;
                }
                if (sum % 2 != startParity) {
                    break;
                }
            }
            
            result.append(sum);   // ← STRING laga concatenate cheyali, add kaadu
            i = j;
        }
        
        return Integer.parseInt(result.toString());
    }
}

