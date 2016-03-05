package Battleships;

import java.util.Arrays;
import java.util.Objects;

public class MarkeredBoard extends BattleshipsBoard{
	private int[] myAttempts;
	private int[] oppAttemps;

	public void makeHit(Coord position, boolean isSuccesful){

    }

    private char getSquareChar(Coord pos){
        if(!isInBounds(pos)){
            return ' ';
        }
        for(Ship ship: ships){
            String shipCoordInfo = ship.getShipCoordInfo(pos);
            if(Objects.equals(shipCoordInfo, "HIT")){
                return 'x';
            }
            else if (!Objects.equals(shipCoordInfo, "EMPTY")) {
                return ship.getCharRepr();
            }
        }
        return '.';
    }
	
	public String toString(){
		String [] boardLines = new String[maxDimensions[1] + 2];
        for(int i = 0;i < maxDimensions[1] + 2;i++){
            StringBuilder currLine = new StringBuilder(maxDimensions[0] + 2);
            for(int j = 0; j < maxDimensions[0] + 2;j++){
                Coord currCoord = new Coord(i, j);
                currLine.append(getSquareChar(currCoord));
            }
            boardLines[i] = currLine.toString();
        }
        return String.join("\n", Arrays.asList(boardLines));
	}
}
