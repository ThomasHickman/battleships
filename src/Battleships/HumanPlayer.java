package Battleships;
import static java.lang.System.out;
import java.lang.System;
import java.util.Scanner;
import Ships;


public class HumanPlayer implements Player {
	private MarkeredBoard markeredBoard = new MarkeredBoard();
	Ship ships;
	
	public HumanPlayer(){
		ships[0] = Ships.Battleship;
	}
	
	private void printBoard(){
		
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
	public BattleshipsBoard getBoard() {
		for(int i = 0;i < 9;i++){
			printBoard();
			out.print("Enter the position of the first ship >>>");
			Coord shipPos = askForCoord();
			if(markeredBoard.tryInsertShip(shipPos)){
				
			}
		}
		return null;
	}

	@Override
	public Coord makeMove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onTryHit(boolean isMe, Coord moveTried, boolean hasHit) {
		// TODO Auto-generated method stub
		
	}
}
