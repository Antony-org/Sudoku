public class Display {
    public void DisplayGrid(int[][] grid){
        for (int i = 0; i < 9; i++){
            for(int j = 0 ; j < 9; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
