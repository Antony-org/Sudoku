import java.util.*;

public class Checker {
    public Boolean IsPossible(int x, int y, int num, int[][] grid)
    {
        for (int i = 0; i < 9; i++)
        {
            if(grid[i][y] == num)
                return false;
        }
        for (int i = 0; i < 9; i++)
        {
            if(grid[x][i] == num)
                return false;
        }
        int tempx = (x/3)*3, tempy = (y/3)*3;
        for (int i = tempx; i < tempx+3; i++)
        {
            for (int j = tempy; j < tempy+3; j++)
            {
                if(grid[i][j] == num)
                    return false;
            }
        }
        return true;
    }
}