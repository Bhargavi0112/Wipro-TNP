import java.io.*;
import java.util.*;
class UserMainCode
{
    public int cyclicOrder(int input1)
    {
        String numStr = String.valueOf(input1);
        int len = numStr.length();
        long totalSum = 0;
        for(int start = 0; start < len; start++){
            int roundSum = 0;
            for(int j = start; j <len;j++){
                roundSum += numStr.charAt(j) - '0';
            }
            totalSum += roundSum;
        }
        return (int)totalSum;
    }
}