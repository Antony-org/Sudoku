
import java.io.CharArrayWriter;
import java.util.*;
import java.util.*;

class Checker {

    public Boolean IsPossible(int x, int y, int num, int[][] grid) {
        if (num < 1 || num > 9) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][y] == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[x][i] == num) {
                return false;
            }
        }
        int tempx = (x / 3) * 3, tempy = (y / 3) * 3;
        for (int i = tempx; i < tempx + 3; i++) {
            for (int j = tempy; j < tempy + 3; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Grid extends Checker {

    private int[][] grid;

    public int[][] getGrid() {
        return grid;
    }

    public Grid() {
        grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = 0;
            }
        }
    }
    
    
    
           

    private boolean Fill() {
        ArrayList<Integer> random = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            random.add(i);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Collections.shuffle(random, new Random());
                boolean flag = false;
                for (int k = 0; k < 9; k++) {
                    if (IsPossible(i, j, random.get(k), grid)) {
                        grid[i][j] = random.get(k);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            grid[k][l] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void Filler() {
        while (true) {
            if (Fill()) {
                break;
            }
        }
    }

    public int PuzzleMaker(int difficulty) {
        ArrayList<Integer> xRandom = new ArrayList<>();
        ArrayList<Integer> yRandom = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            xRandom.add(i);
            yRandom.add(i);
        }
        int counter = 0;
        int x, y, deadEnd = 0;
        while (true) {
            if (difficulty == counter || deadEnd == 1000) {
                return counter;
            }
            Collections.shuffle(xRandom, new Random());
            Collections.shuffle(yRandom, new Random());
            x = xRandom.get(0);
            y = yRandom.get(0);
            if (grid[x][y] == 0) {
                deadEnd++;
                continue;
            } else {
                boolean flag = false;
                for (int i = 1; i < 10; i++) {
                    if (i == grid[x][y]) {
                        continue;
                    }
                    if (IsPossible(x, y, i, grid)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    deadEnd++;
                    continue;
                } else {
                    deadEnd = 0;
                    counter++;
                    grid[x][y] = 0;
                }
            }
        }
    }
}
class Solver extends Checker{
    private int grid[][];

    public int[][] getGrid() {
        return grid;
    }

    public Solver(int[][] grid){
        this.grid = new int[9][9];
        for (int i = 0; i < 9; i++){
            for(int j = 0 ; j < 9; j++){
                this.grid[i][j] = grid[i][j];
            }
        }
    }
    public boolean solve() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    boolean flag = false;
                    for (int k = 1; k < 10; k++) {
                        if (IsPossible(i, j, k, grid)) {
                            grid[i][j] = k;
                            flag = flag || solve();
                        }
                    }
                    if(!flag){
                        grid[i][j] = 0;
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
class Display {

    public void DisplayGrid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}

 class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Display d = new Display();
        Grid p = new Grid();
        p.Filler();
        d.DisplayGrid(p.getGrid());
        p.PuzzleMaker(81);
        d.DisplayGrid(p.getGrid());
    }
}
