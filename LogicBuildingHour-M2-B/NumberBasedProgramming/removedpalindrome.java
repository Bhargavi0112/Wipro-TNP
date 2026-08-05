using System;

public class UserMainCode
{
    public int digitRemove_Palin(int input1)
    {
        string s = input1.ToString();

        if (IsPalindrome(s))
            return -1;

        for (int i = 0; i < s.Length; i++)
        {
            string t = s.Substring(0, i) + s.Substring(i + 1);

            if (IsPalindrome(t))
            {
                if (i > 0 && s[i] == s[i - 1])
                    continue;

                return s[i] - '0';
            }
        }

        return -1;
    }

    private bool IsPalindrome(string s)
    {
        int l = 0, r = s.Length - 1;

        while (l < r)
        {
            if (s[l] != s[r])
                return false;
            l++;
            r--;
        }

        return true;
    }
}