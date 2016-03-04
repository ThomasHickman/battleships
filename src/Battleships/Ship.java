package Battleships;

public abstract class Ship {
	private int x;
	private int y;

	private Oriantation oriantation;
	
	public boolean tryHit(int x, int y){
		return false;
	}
	
	public boolean isSunk(){
		return true;
	}
	
	public Coord[] getPositions(){
		return null;
	}
	
	protected abstract Coord[] getOffsets();
	
	protected Ship(Coord position, Oriantation orinataion){
		
	}
}