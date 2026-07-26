import java.io.*;
import java.util.*;

class UserMainCode
{
    public class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }
    public Result findOriginalFirstAndSum(int[] input1, int input2) {
    int n = input2;
    int[] original = new int[n];
    original[n - 1] = input1[n - 1];
    
    for (int i = n - 2; i >= 0; i--) {
        original[i] = input1[i] - original[i + 1];
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += original[i];
    }
    return new Result(original[0], sum);
    }
}
