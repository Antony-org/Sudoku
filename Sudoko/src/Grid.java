import java.io.CharArrayWriter;
import java.util.*;
public class Grid extends Checker{
    private int[][] grid;

    public int[][] getGrid() {
        return grid;
    }
    public Grid(){
        grid = new int[9][9];
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                grid[i][j] = 0;
            }
        }
    }
    private boolean Fill(){
        ArrayList<Integer> random = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            random.add(i);
        }
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                Collections.shuffle(random, new Random());
                boolean flag = false;
                for (int k = 0; k < 9; k++){
                    if(IsPossible(i, j, random.get(k), grid)){
                        grid[i][j] = random.get(k);
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    for (int k = 0; k < 9; k++){
                        for(int l = 0; l < 9; l++){
                            grid[k][l] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void Filler(){
        while (true){
            if(Fill())
                break;
        }
    }
    public void PuzzleMaker(int difficulty){
        ArrayList<Integer> xRandom = new ArrayList<>();
        ArrayList<Integer> yRandom = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            xRandom.add(i);
            yRandom.add(i);
        }
        int x, y, deadEnd = 0;
        while (true) {
            if(difficulty == 0 || deadEnd == 1000)
                break;
            Collections.shuffle(xRandom, new Random());
            Collections.shuffle(yRandom, new Random());
            x = xRandom.get(0);
            y = yRandom.get(0);
            if(grid[x][y] == 0) {
                deadEnd++;
                continue;
            }
            else{
                boolean flag = false;
                for (int i = 1; i < 10; i++){
                    if(i == grid[x][y])
                        continue;
                    if(IsPossible(x, y, i, grid)){
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    deadEnd++;
                    continue;
                }
                else{
                    deadEnd = 0;
                    difficulty--;
                    grid[x][y] = 0;
                }
            }
        }
    }
}
