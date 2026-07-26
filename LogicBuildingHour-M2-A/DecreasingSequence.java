import java.io.*;
import  java.util.*;
class UserMainCode
{
    public class Result{
        public final int output1;
        public final int output2;
        public Result(int output1, int output2){
            this.output1 = output1;
            this.output2 = output2;
        }
    }
    public static Result getDecreasingSeq(int[] input1,int  input2){
        int count = 0;
        int maxLen = 0;
        int i = 0;
        while(i < input2 - 1)
            if(input1[i] > input1[i+1]){
                int countLen = 1;
                while(i < input2 - 1 && input1[i] > input1[i+1]){
                    countLen++;
                    i++;
                }
                count++;
                if(countLen > maxLen){
                    maxCount = count;
                }
            } else {
                i++;
            }
        }
        if(count == 0){
            maxLen = 0;
            return new Result(count, maxLen);
        }
}