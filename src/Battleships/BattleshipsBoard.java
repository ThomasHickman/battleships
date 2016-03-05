package Battleships;

public class BattleshipsBoard extends Board{
    protected final int[] maxDimensions = new int[]{12, 12};

	protected Coord[][] getBoundingSquares(){
        return new Coord[][]{
                new Coord[]{new Coord(1, 1), new Coord(6, 12)},
                new Coord[]{new Coord(7, 7), new Coord(12, 12)}
        };
    }

	@Override
	protected boolean isInBounds(Coord coord) {
        for(Coord[] sq: getBoundingSquares()){
            if(coord.isInSquare(sq[0], sq[1]))
                return true;
        }
        return false;
	}
	
}
