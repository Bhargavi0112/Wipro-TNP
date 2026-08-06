public string moveRobot(int input1, int input2, string input3, string input4)
{
    string[] startParts = input3.Split('-');
    int x = int.Parse(startParts[0]);
    int y = int.Parse(startParts[1]);
    char direction = startParts[2][0];
    
    string[] directions = { "N", "E", "S", "W" };
    int dirIndex = Array.IndexOf(directions, direction.ToString());
    
    string[] instructions = input4.Split(' ');
    bool error = false;
    
    foreach (string instr in instructions)
    {
        if (instr == "L")
        {
            dirIndex = (dirIndex - 1 + 4) % 4;
        }
        else if (instr == "R")
        {
            dirIndex = (dirIndex + 1) % 4;
        }
        else if(instr == "M"){
                int newX = x;
                int newY = y;
                if (newX < 0 || newY < 0 || newY > input2){
                    error = true;
                    break;
            }
            x = newX;
            y = newY;     
            if (directions[dirIndex] == "N") newY = y + 1;
            else if (directions[dirIndex] == "S") newY = y - 1;
            else if (directions[dirIndex] == "E") newX = x + 1;
            else if (directions[dirIndex] == "W") newX = x - 1;
            
            if (newX < 0 || newX > input1 || newY < 0 || newY > input2)
            {
                error = true;
                break;
            }
            
            x = newX;
            y = newY;
        }
    }
    
    string result = x + "-" + y + "-" + directions[dirIndex];
    if (error)
    {
        result += "-ER";
    }
    
    return result;
}