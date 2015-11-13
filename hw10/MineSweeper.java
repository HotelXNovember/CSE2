//Loren Railsback
//CSE 002
//Eric Fouh
//The purpose of this program is to prompt the user for a board size and number of mineVar and create a mineVarweeper board.
import java.util.Scanner;
public class MineSweeper
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int numberMines = 0;
    int sizeBoard = 0;    
    	while (!(sizeBoard >= 2 && sizeBoard <= 30))
    	{
    		System.out.println("Choose what size game you would like (Between 0 and 30).");
    		sizeBoard = keyboard.nextInt();
    	}
    	while (!(numberMines > 0 && numberMines <= (sizeBoard*sizeBoard)))
    	{
    		System.out.println("Enter the amount of mineVar you would like in your game.");
    		numberMines = keyboard.nextInt();
    	}
    	String[][] boardGame = new String[sizeBoard][sizeBoard];
    	creator(sizeBoard, numberMines, boardGame);
    	printer(sizeBoard, boardGame);
    	}   
    public static void updater(String[][] gameboard, int i, int j)
    {
        switch (gameboard[i][j])
        {
            case "0 ":
                gameboard[i][j] = "1 ";
                break;
            case "1 ":
                gameboard[i][j] = "2 ";
                break;
            case "2 ":
                gameboard[i][j] = "3 ";
                break;
            case "3 ":
                gameboard[i][j] = "4 ";
                break;
            case "4 ":
                gameboard[i][j] = "5 ";
                break;
            case "5 ":
                gameboard[i][j] = "6 ";
                break;
            case "6 ":
                gameboard[i][j] = "7 ";
                break;
            case "7 ":
                gameboard[i][j] = "8 ";
                break;
            default:
                break;
        	}
    		} 
    public static void creator(int n, int m, String[][] boardGame)
    {
        int mineVar = 0;              
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                boardGame[i][j] = "0 ";
            }
        }      
        while (mineVar < m)
        {
            int i = (int)(Math.random()*n);
            int j = (int)(Math.random()*n);
            if (boardGame[i][j] != "M ")
            {
                boardGame[i][j] = "M ";
                mineVar++;
            }
        }                        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (boardGame[i][j] == "M ")
                {
                    try {
                    updater(boardGame, i-1, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i-1, j);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i-1, j+1);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i, j+1);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i+1, j-1);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i+1, j);
                    } catch(Exception e) {}
                    try {
                    updater(boardGame, i+1, j+1);
                    } catch(Exception e) {}           
                }
            	}
        	}
    	}    
    public static void printer(int n, String[][] gameboard)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(gameboard[i][j]);
            }
            System.out.println();
        }
    }
}