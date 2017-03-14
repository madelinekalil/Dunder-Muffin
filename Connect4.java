
/**
 * Write a description of class Connect4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Connect4
{
    Scanner scan = new Scanner(System.in);
    String[][] c4 = new String[6][7];
    
    public void main() {
        makeBoard();
        for(int play = 0; play < 42; play++) {
            setLocation();
            makeBoard();
        }
    }
    
    public void makeBoard() {
        for(int i = 0; i < 7; i++) {
            System.out.print(c4[0][i] + "/t");
        }
    }
    
    public void setLocation() {
        
    }
    
    public boolean win() {
        return true;
    }
}
