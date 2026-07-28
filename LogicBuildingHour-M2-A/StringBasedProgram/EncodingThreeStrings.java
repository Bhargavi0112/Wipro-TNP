public Result encodeThreeStrings(String input1, String input2, String input3)
{
    String[] s1 = splitString(input1);
    String[] s2 = splitString(input2);
    String[] s3 = splitString(input3);

    String output1 = s1[0] + s2[0] + s3[0];
    String output2 = s1[1] + s2[1] + s3[1];
    String output3 = s1[2] + s2[2] + s3[2];

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < output3.length(); i++)
    {
        char ch = output3.charAt(i);

        if(Character.isUpperCase(ch))
            sb.append(Character.toLowerCase(ch));
        else
            sb.append(Character.toUpperCase(ch));
    }

    return new Result(output1, output2, sb.toString());
}

private String[] splitString(String str)
{
    int len = str.length();
    int part = len / 3;
    int rem = len % 3;

    String front = "";
    String middle = "";
    String end = "";

    if(rem == 0)
    {
        front = str.substring(0, part);
        middle = str.substring(part, 2 * part);
        end = str.substring(2 * part);
    }
    else if(rem == 1)
    {
        front = str.substring(0, part);
        middle = str.substring(part, 2 * part + 1);
        end = str.substring(2 * part + 1);
    }
    else if(rem == 2){
        front = str.substring(0, part + 1);
        middle = str.substring(part + 1, 2 * part + 1);
        end = str.substring(2 * part + 1);
    }

    return new String[]{front, middle, end};
}
