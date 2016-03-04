package Battleships;
import static java.lang.System.out;
import java.lang.System;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Ships;
import Ships.Battleship;
import Ships.Cruiser;
import com.sun.java.util.jar.pack.Package;


public class HumanPlayer implements Player {
	private MarkeredBoard markeredBoard = new MarkeredBoard();
	Ship ships;
    private String playerName;
	
	public HumanPlayer(String playerName){
        this.playerName = playerName;
	}
	
	private void printBoard(){
		out.println(markeredBoard);
	}
	
	private Coord askForCoord(){
		Scanner reader = new Scanner(System.in);
		String[] strCoords = reader.nextLine().split(",");
		
		return new Coord(
			Integer.parseInt(strCoords[0].trim()),
			Integer.parseInt(strCoords[0].trim())
		);
	}

	@Override
	public BattleshipsBoard getInitalBoard() {
        for(Class<Ship> ShipClass: Ship.getShips()){
            while(true){
                try{
                    Ship currShip = ShipClass.newInstance();
                    printBoard();
                    out.print("Enter the position of the " + currShip.getName() + " >>>");
                    Coord shipPos = askForCoord();
                    if(markeredBoard.tryInsertShip(ShipClass.newInstance())) {
                        break;
                    }
                    else{
                        out.println("Incorrect ship position");
                    }
                }
                catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
		}
		return markeredBoard;
	}

	@Override
	public Coord makeMove() {
		printBoard();
        out.print("Enter the position you would like to hit >>>");
        return askForCoord();
	}

	@Override
	public void onTryHit(boolean isMe, Coord moveTried, boolean hasHit) {
		if(!isMe){
            markeredBoard.makeHit(moveTried, hasHit);
        }
	}

	@Override
	public void onWin() {
		out.println(this.playerName + " won");
	}

	@Override
	public void onLose() {
        out.println(this.playerName + " lost");
	}
}
