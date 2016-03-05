package Ships;

import Battleships.Coord;
import Battleships.Ship;

public class Battleship extends Ship{
	public Battleship(Coord position, Orientation orinataion) {
		super(position, orinataion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getCharRepr() {
		return 'B';
	}

	@Override
	public String getName() {
		return "Battleship";
	}

	@Override
	protected Coord[] getOffsets() {
		// TODO Auto-generated method stub
		return new Coord[]{
			new Coord(0, 0),
			new Coord(0, 1),
			new Coord(0, 2),
			new Coord(0, 3)
		};
	}
}
