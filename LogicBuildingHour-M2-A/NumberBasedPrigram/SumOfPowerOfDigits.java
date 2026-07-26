import java.io.*;
import java.util.*;
class UserMainCode
{
    public int sumOfPowerOfDigits(int input1)
    {
    String numStr = String.valueOf(input1);
    int len = numStr.length();
    long sum = 0;
    for(int i=0; i<len; i++)
    {
        int digit = numStr.charAt(i) - '0';
        int power;
        if(i==len-1){
            power = 0;
        }else{
            power = numStr.charAt(i+1) - '0';
        }
        sum += Math.pow(digit, power);
    }
    return (int)sum;
    }
}