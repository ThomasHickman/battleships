package Battleships;

public abstract class Board {
	protected Ship[] ships;
	
	public boolean hasShipsLeft(){
		return ships.length != 0;
	}
	
	protected abstract boolean isInBounds(Coord coord);
	
	public boolean tryHit(Coord move){
		return true;
	}
	
	public boolean tryInsertShip(Ship ship){
		for(Coord pos: ship.getPositions()){
			if(!isInBounds(pos)){
				return false;
			}
		}
		return true;
	}
}
