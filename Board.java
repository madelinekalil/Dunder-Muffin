
/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Board 
{
    Scanner scan = new Scanner(System.in);
    String[][]board;
    public int rows;
    public int columns;
    public Board(int rows, int columns)
    {
       String[][]board = new String[this.rows][this.columns];
    }
    
    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(board[i][j]);
                System.out.println("\t");
            }
            System.out.println();
    
        }
    }
}
