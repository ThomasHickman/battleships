package Battleships;

public class BattleshipsBoard extends Board{

	@Override
	protected boolean isInBounds(Coord coord) {
		return coord.isInSquare(new Coord(1, 1), new Coord(6, 12))
			|| coord.isInSquare(new Coord(7, 7), new Coord(12, 12));
	}
	
}
