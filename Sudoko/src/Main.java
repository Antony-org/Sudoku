import java.util.*;
public class Main {
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
