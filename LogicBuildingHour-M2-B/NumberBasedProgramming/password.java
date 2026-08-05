using System;
using System.Collections.Generic;

public class UserMainCode
{
    public int findPassword(int input1, int input2, int input3, int input4, int input5)
    {
        int[] arr = { input1, input2, input3, input4, input5 };
        int stableSum = 0;
        int unstableSum = 0;

        foreach (int n in arr)
        {
            Dictionary<int, int> freq = new Dictionary<int, int>();
            int num = n;

            while (num > 0)
            {
                int d = num % 10;

                if (freq.ContainsKey(d))
                    freq[d]++;
                else
                    freq[d] = 1;

                num /= 10;
            }

            bool stable = true;
            int count = -1;

            foreach (int v in freq.Values)
            {
                if (count == -1)
                    count = v;
                else if (count != v)
                {
                    stable = false;
                    break;
                }
            }

            if (stable)
                stableSum += n;
            else
                unstableSum += n;
        }

        return stableSum - unstableSum;
    }
}