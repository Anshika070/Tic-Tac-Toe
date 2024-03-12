import java.util.Scanner;

import board.Board;
import game.Game;
import player.Player;

public class App{
    public App(){
    }
    public static void main(String[] args) {
        System.out.println("First Project -> Tic Tac Toe");

        Board b=new Board(3, '-');
        b.printBoardConfig();
        // Scanner scn=new Scanner(System.in);
        // System.out.println("Please enter name of the player");
        // String name=scn.nextLine();
        // System.out.println("please enter symbol of player");
        // char symbol=scn.nextLine().charAt(0);    
        Player p1=new Player();
        p1.setPlayerNameAndSymbol("Ravi", 'X');
        p1.getPlayerNameAndSymbol();
        Player p2=new Player();
        p2.setPlayerNameAndSymbol("Aman", '0');
        p2.getPlayerNameAndSymbol();
        Game game=new Game(new Player[] {p1,p2}, b);
        game.play();
    }
}