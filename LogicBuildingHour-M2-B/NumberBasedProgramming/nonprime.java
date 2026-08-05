using System;

public class UserMainCode
{
    public int sumOfNonPrimeIndexValues(int[] input1, int input2)
    {
        int sum = 0;

        for (int i = 0; i < input2; i++)
        {
            if (!IsPrime(i))
            {
                sum += input1[i];
            }
        }

        return sum;
    }

    private bool IsPrime(int n)
    {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}