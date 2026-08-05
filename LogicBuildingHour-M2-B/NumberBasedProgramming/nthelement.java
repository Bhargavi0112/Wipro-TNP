using System;

public class UserMainCode
{
    public int seriesN(int input1, int input2, int input3, int input4)
    {
        int a = input1;
        int b = input2;
        int c = input3;
        int N = input4;

        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;

        int d1 = b - a;
        int d2 = c - b;

        int current = c;

        for (int i = 4; i <= N; i++)
        {
            if (i % 2 == 0)
                current = current + d1;
            else
                current = current + d2;
        }

        return current;
    }
}