import java.io.*;
import java.util.*;

class UserMainCode
{
    public int mostFrequentlyOccurringDigit(int[] input1, int input2){
        int[] freq = new int[10];
        int maxCount = 0;
        int result = 0;
        for(int i = 0; i < input2; i++){
            int num = input1[i];
            while(num > 0){
                int digit = num % 10;
                freq[digit]++;
                num = num / 10;
            }
        }
        for(int d = 9; d >= 0; d--){
            if(freq[d] > maxCount){
                maxCount = freq[d];
                result = d;
            }
        }
        return result;
    }
}
