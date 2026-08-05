using System;

public class UserMainCode
{
    public int AddSub(int input1, int input2)
    {
        int result = 0;

        if (input2 == 1)
        {
            // N - (N-1) + (N-2) - ...
            int sign = 1;
            for (int i = input1; i >= 1; i--)
            {
                result += sign * i;
                sign = -sign;
            }
        }
        else
        {
            // N + (N-1) - (N-2) + (N-3) - ...
            for (int i = input1; i >= 1; i--)
            {
                int pos = input1 - i;

                if (pos == 0 || pos == 1)
                    result += i;
                else if (pos % 2 == 0)
                    result -= i;
                else
                    result += i;
            }
        }

        return result;
    }
}