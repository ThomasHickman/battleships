package Battleships;

public class Coord {
	public int x;
	public int y;
	
	public boolean isInSquare(Coord topLeft, Coord bottomRight){
		return x >= topLeft.x
			&& x <= bottomRight.x 
			&& y <= topLeft.y
			&& y >= bottomRight.y;
	}
	
	public Coord(int x, int y){
		this.x = x;
		this.y = y;
	}
}
